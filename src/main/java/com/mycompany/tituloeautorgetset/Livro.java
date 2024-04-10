package com.mycompany.tituloeautorgetset;

import java.util.Scanner;

public class Livro {
    
private String titulo;
    private String autor;
    private int edicao;
    private double preco;
    
    // Construtor
    public Livro (String t, String a, int e, double p){
        this.titulo = t;
        this.autor = a;
        this.edicao = e;
        this.preco = p;
    }
    
    // Métodos Get
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getEdicao(){
        return edicao;
    }
    public double getPreco(){
        return preco;
    }
    
    // Métodos Set
    public void setTitulo(String t){
        this.titulo = t;
    }
    public void setAutor(String a){
        this.autor = a;
    }
    public void setEdicao(int e){
        this.edicao = e;
    }
    public void setPreco(double p){
        this.preco = p;
}
}
