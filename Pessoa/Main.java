package Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Maria", 19,1.60);

        pessoa.adicionarPesoInicial(55.0);
        pessoa.crescer();
        pessoa.envelhecer();
        pessoa.engordar(4.0);
        pessoa.emagrecer(3.0);
        pessoa.envelhecer();
        pessoa.mostrarDados();




    }
}
