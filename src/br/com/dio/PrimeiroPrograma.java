package br.com.dio;

import br.com.dio.model.Cachorro;

import java.util.Scanner;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

      /* int a, b;

        System.out.print("Entre com o primeiro valor: ");
        a = input.nextInt();
        System.out.print("Entre com o segundo valor: ");
        b = input.nextInt();

        System.out.println("Hello World\n" + (a + b));*/

        Cachorro cachorro = new Cachorro("Sheik", "Preto", 2);
        System.out.println(cachorro);

    }
}
