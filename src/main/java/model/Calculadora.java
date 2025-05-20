package model;

public class Calculadora {

    private double valorA;
    private double valorB;

    public Calculadora(double valorA, double valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }

    public Calculadora() {
    }

    public double getValorA() {
        return valorA;
    }

    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    public double getValorB() {
        return valorB;
    }

    public void setValorB(double valorB) {
        this.valorB = valorB;
    }

    public double getSoma() {
        return valorA + valorB;
    }

    public double getDiferenca() {
        return valorA - valorB;
    }

    public double getProduto() {
        return valorA * valorB;
    }

    public double getQuociente() {
        if (valorB == 0) {
            throw new ArithmeticException("Divisão por zero!");
        }
        return valorA / valorB;
    }

}
