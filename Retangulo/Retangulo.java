package Retangulo;

import java.util.ArrayList;
import java.util.List;

public class Retangulo {
    Double comprimento;
    Double altura;

    public void mudarValoresLados(Double novoComprimento, Double novaAltura) {
        comprimento = novoComprimento;
        System.out.println("VOCÊ MUDOU OS VALORES DE COMPRIMENTO E ALTURA DO RETÂNGULO.");
        altura = novaAltura;

    }
    public Double calcularArea() {
        Double area = comprimento * altura;
        System.out.println("A ÁREA DO RETÂNGULO É = " + area);
        return area;
    }
    public Double calcularPerimetro() {
        Double perimetro = 2 * (comprimento + altura);
        System.out.println("O PERÍMETRO DO RETÂNGULO É = " + perimetro);
        return perimetro;
    }

    public List<Object> retornarLados() {
        List<Object> lista = new ArrayList<>();
        lista.add(this.altura);
        lista.add(this.comprimento);
        System.out.println("RETORNANDO OS VALORES DOS LADOS DO RETÂNGULO: " + lista.get(0) + " E " + lista.get(1));
        return lista;
    }

    public Retangulo(Double comprimento, Double altura) {
        this.comprimento = comprimento;
        this.altura = altura;
    }
}





