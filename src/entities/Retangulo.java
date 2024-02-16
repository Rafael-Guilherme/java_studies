package entities;

public class Retangulo {
    
    public double largura;
    public double altura;

    public double area() {
        return largura * altura;
    }

    public double perimeter() {
        return (largura * 2) + (altura * 2);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(largura,2) + Math.pow(altura,2));
    }
}
