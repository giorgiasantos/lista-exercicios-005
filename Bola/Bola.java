package Bola;

public class Bola {
    Double circunferencia;
    String cor;
    String marca;
    String material;
    Double velocidade;

    public void trocaCor(String novaCor) {
        cor = novaCor;
        System.out.println("A nova cor da bola é: " + novaCor);
    }

    public void mostraCor() {
        System.out.println("A cor da bola é: " + cor);
    }
    public Bola(Double circunferencia, String cor, String marca, String material, Double velocidade) {
        this.circunferencia = circunferencia;
        this.cor = cor;
        this.marca = marca;
        this.material = material;
        this.velocidade = velocidade;
    }
}
