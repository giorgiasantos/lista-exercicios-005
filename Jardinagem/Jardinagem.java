package Jardinagem;
public class Jardinagem {
    String nomeJardim;
    Double qtdeMetros;
    Integer qtdePlantas;
    Double qtdeMetrosGrama;
    Double gramaAdubo;
    Double valorAdubo;
    Double valorMetroGrama;
    Double valorConteGrama;

    public Double usarAdubo(){
        Double quantoAduboUsar = (qtdeMetrosGrama / 2) * gramaAdubo;
        return quantoAduboUsar;
    }
    public void precoAdubo() {
        Double calculoPrecoAdubo = usarAdubo() * valorAdubo;
        System.out.println("O VALOR DO ADUBO SERÁ R$ " + calculoPrecoAdubo);
    }
    public void precoCorteGrama() {
        valorConteGrama = qtdeMetrosGrama * valorMetroGrama;
        System.out.println("O PREÇO DO CORTE DE GRAMA É R$ " + valorConteGrama);
    }

    public void mostrarInformacoes() {
        System.out.println("INFORMAÇÕES DO SEU JARDIM");
        System.out.println("-------------------------------");
        System.out.println("NOME DO JARDIM: " + nomeJardim);
        System.out.println("QUANTIDADE DE PLANTAS " +qtdePlantas);
        System.out.println("QUANTIDADE DE METROS: " + qtdeMetros);
        System.out.println("-------------------------------");

    }

    public Jardinagem(Double valorAdubo, Double valorMetroGrama){
        this.valorAdubo = valorAdubo;
        this.valorMetroGrama = valorMetroGrama;
        this.valorConteGrama = 0.0;
        this.gramaAdubo = 0.1;
    }




}
