package Bola;

public class Main {
    public static void main(String[] args) {
        Bola bola1 = new Bola(20.5, "Laranja", "Nike", "Borracha", 10.0);

        bola1.mostraCor();
        bola1.trocaCor("Branco");
        bola1.mostraCor();
        System.out.println("------------------------------------------------");

        Bola bola2 = new Bola(15.0,"Azul", "Adidas", "Nylon", 13.0);

        bola2.mostraCor();
        bola2.trocaCor("Vermelho");
        bola2.mostraCor();

    }
}
