package com.mycompany.projetointerface;

public class Quadrado implements FiguraGeometrica{
    
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public String getNomeFigura() {
        return "Quadrado";
    }

    @Override
    public int getArea() {
        return lado * lado;
    }

    @Override
    public int getPerimetro() {
        return 4 * lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    

}
