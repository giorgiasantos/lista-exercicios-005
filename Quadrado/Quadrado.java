package Quadrado;
public class Quadrado {
    Double lado;
    public void mudarValorLado(Double novoValor) {
        System.out.println("Antigo valor do lado: " + lado);
        lado = novoValor;
        System.out.println("O novo valor do lado é: " + lado);
    }

    public Double retornarLado() {
        System.out.println("RETORNANDO O VALOR DO LADO DO QUADRADO: " +lado);
        return lado;

    }

    public Double calcularArea() {
        Double area = lado * lado;
        System.out.println("A área do quadrado é: " + area);
        return area;
    }

    public Quadrado(Double lado) {
        this.lado = lado;
    }
}
