package Carro;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(4, "Celta", "Chevrolet");

        carro.ligarCarro();
        carro.desligarCarro();

        Carro carro2 = new Carro(2, "Uno", "Chevrolet", 75.0);

        carro2.ligarCarro();
        carro2.desligarCarro();


    }
}
