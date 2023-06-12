package Jardinagem;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Jardinagem jardim = new Jardinagem(7.0, 15.0);
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE O NOME DO JARDIM: ");
        jardim.nomeJardim = entrada.nextLine();
        System.out.println("QUANTOS METROS TEM O JARDIM? ");
        jardim.qtdeMetros = entrada.nextDouble();
        System.out.println("QUANTAS PLANTAS TEM NO JARDIM? ");
        jardim.qtdePlantas = entrada.nextInt();
        System.out.println("QUANTOS METROS DE GRAMA TEM NO JARDIM?");
        jardim.qtdeMetrosGrama = entrada.nextDouble();


        jardim.mostrarInformacoes();
        jardim.usarAdubo();
        jardim.precoAdubo();
        jardim.precoCorteGrama();

    }
}
