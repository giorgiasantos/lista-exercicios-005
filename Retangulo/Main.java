package Retangulo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(12.0, 8.0);
        retangulo.retornarLados();
        retangulo.mudarValoresLados(15.0, 10.0);
        retangulo.retornarLados();
        retangulo.calcularPerimetro();
        retangulo.calcularArea();

    }
}
