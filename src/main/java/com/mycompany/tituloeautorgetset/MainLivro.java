package com.mycompany.tituloeautorgetset;
import java.util.Scanner;
public class MainLivro {
    
    public static void main(String[] args) {
        Scanner STRING = new Scanner(System.in);
        Scanner INT = new Scanner(System.in);
        Scanner DOUBLE = new Scanner(System.in);
        Livro L = new Livro ("", "", 0,0.0);
       
        System.out.print("Digite o título do livro escolhido: "); L.setTitulo(STRING.nextLine());
        System.out.print("Digite o nome do autor do livro: ");L.setAutor(STRING.nextLine());
        System.out.print("Digite o número da edição do livro: ");L.setEdicao(INT.nextInt());
        System.out.print("Digite o valor do livro: ");L.setPreco(DOUBLE.nextDouble());
        System.out.println("\nTítulo: " + L.getTitulo());
        System.out.println("Autor: " + L.getAutor());
        System.out.println("Edição: " + L.getEdicao() + "º");
        System.out.println("Valor: R$" + L.getPreco());
        
        STRING.close();
    }
    
}
