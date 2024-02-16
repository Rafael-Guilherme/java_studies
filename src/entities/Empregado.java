package entities;

public class Empregado {
    
    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public void aumentoSalarial(double percentual) {
        this.salarioBruto = salarioBruto + (salarioBruto * percentual) / 100;
    }
}
