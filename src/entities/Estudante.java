package entities;

public class Estudante {
    
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    public String resultado;

    public double notaFinal() {
        return nota1 + nota2 + nota3;
    }

    public String calcularResultado() {
        if(notaFinal() >= 60.00) {
            return resultado = "Passou";
        } else {
            return resultado = "Não passou\n" + faltandoPontos();
        }
    }

    public String faltandoPontos() {
        double valorFaltando = 60.00 - notaFinal();

        return "Faltaram " + valorFaltando + " pontos";
    }
}
