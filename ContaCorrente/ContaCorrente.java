package ContaCorrente;

public class ContaCorrente {
    Integer contaCorrente;
    String correntista;
    Double saldo;

    public void exibirDados () {
        System.out.println("DADOS DA CONTA CORRENTE");
        System.out.println("------------------------------");
        System.out.println("Nome do correntista: " + correntista);
        System.out.println("Número da conta-corrente: " + contaCorrente);
        System.out.println("Saldo em conta: " + saldo);
        System.out.println("------------------------------");
    }
    public Double depositarContaCorrente(Double valorDeposito) {
        System.out.println("VOCÊ DEPOSITOU R$" + valorDeposito);
        saldo = saldo + valorDeposito;
        System.out.println("SEU SALDO ATUAL É R$ "+ saldo);
        System.out.println("------------------------------");
        return saldo;

    }
    public Double sacarContaCorrente(Double valorSaque) {
        if(saldo > valorSaque) {
            saldo = saldo - valorSaque;
            System.out.println("VOCÊ SACOU R$" + valorSaque);
            System.out.println("SALDO ATUAL: R$" + saldo);
            System.out.println("------------------------------");
            return saldo;
        } else {
            System.out.println("SALDO INSUFICIENTE PARA SAQUE.");
            System.out.println("SALDO ATUAL: R$" + saldo);
            System.out.println("------------------------------");
            return saldo;
        }
    }
    public ContaCorrente(Integer contaCorrente, String correntista) {
        this.contaCorrente = contaCorrente;
        this.correntista = correntista;
        this.saldo = 0.0;
    }

    public ContaCorrente(Integer contaCorrente, String correntista, Double saldo) {
        this.contaCorrente = contaCorrente;
        this.correntista = correntista;
        this.saldo = saldo;
    }
}
