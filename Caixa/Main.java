package Caixa;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Caixa meuCaixa = new Caixa();
        Scanner entrada = new Scanner(System.in);

        System.out.println("QUANTOS LANÇAMENTOS DESEJA FAZER?");
        int qtdeLancamentos = entrada.nextInt();

        for(int i = 0; i < qtdeLancamentos; i++){
            System.out.println("DIGITE O " + (i+1) + "º VALOR A SER LANÇADO: ");
                int valorLancamento = entrada.nextInt();

            System.out.println("DIGITE 'C' PARA CRÉDITO E 'D' PARA DÉBITO: ");
            String tipoLancamento = entrada.next();

            if(tipoLancamento.equalsIgnoreCase("C")) {
                meuCaixa.entrarCredito(valorLancamento);
            } else if(tipoLancamento.equalsIgnoreCase("D")){
                meuCaixa.entrarDebito(valorLancamento);
            } else {
                System.out.println("OPÇÃO INVÁLIDA.");
                break;
            }

        }


    }
}
