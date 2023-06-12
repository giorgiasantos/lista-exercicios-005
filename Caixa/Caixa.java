package Caixa;

public class Caixa {
    Double saldo;

    public Double entrarCredito (int valorLancamento) {
        saldo = saldo + valorLancamento;
        System.out.println("VOCÊ LANÇOU UM CRÉDITO DE R$ " + valorLancamento);
        System.out.println("SEU SALDO TOTAL É DE R$ " + saldo);
        return saldo;
    }

    public Double entrarDebito(int valorLancamento) {
        saldo = saldo - valorLancamento;
        System.out.println("VOCÊ LANÇOU UM DÉBITO DE R$ " + valorLancamento);
        System.out.println("SEU SALDO TOTAL É DE R$ " + saldo);
        return saldo;
    }
    public Caixa() {
         this.saldo = 1000.0;
    }
}
