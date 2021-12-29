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

        Livro livro = new Livro("O problema dos 3 corpos", 300);
        System.out.println("Livro: " + livro);
    }
}

class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
