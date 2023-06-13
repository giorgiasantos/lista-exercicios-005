package Carro;

public class Carro {
    Integer qtdePortas;
    String modelo;
    String marca;
    Double potencia;

    public void ligarCarro() {
        System.out.println("VOCÊ LIGOU O CARRO. VRUM VRUMMMM!!!!");
    }

    public void desligarCarro() {
        System.out.println("VOCÊ DESLIGOU O CARRO. ATÉ MAIS!");
    }
    public Carro(Integer qtdePortas, String modelo, String marca) {
        this.qtdePortas = qtdePortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = 2.0;
    }

    public Carro(Integer qtdePortas, String modelo, String marca, Double potencia) {
        this.qtdePortas = qtdePortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = potencia;
    }
}


