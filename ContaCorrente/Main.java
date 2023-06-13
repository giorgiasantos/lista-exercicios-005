package ContaCorrente;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(451, "Maria da Silva");
        conta.saldo = 100.0;

        conta.exibirDados();
        conta.depositarContaCorrente(50.5);
        conta.sacarContaCorrente(20.0);
        conta.sacarContaCorrente(500.0);

        ContaCorrente conta2 = new ContaCorrente(451, "João da Silva", 150.32);

        conta2.exibirDados();
        conta2.depositarContaCorrente(30.5);
        conta2.sacarContaCorrente(40.0);
        conta2.sacarContaCorrente(550.0);

    }
}
