package com.example.mvc.models;

 //https://github.com/ClaudioNunes/DemoMVC/blob/master/src/main/java/br/edu/fatec/mvcDemo/models/Aluno.java

public class Animais {

    private String nome;
    private String tipo;

    //private double p1;

    //private double p2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
/*
    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }
*/
    public Animais(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
}
