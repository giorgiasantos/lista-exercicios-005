package Pessoa;
public class Pessoa {
    String nome;
    Integer idade;
    Double peso;
    Double altura;

    public Double adicionarPesoInicial(Double pesoInicial) {
        peso = pesoInicial;
        System.out.println(" ");
        System.out.println("VOCÊ ESCOLHEU ADICIONAR SEU PESO. VOCÊ TEM " + peso + "KG");
        System.out.println(" ");
        return peso;
    }
    public Object envelhecer() {
        idade = idade + 1;
        System.out.println("PARABÉNS PELO SEU ANIVERSÁRIO! AGORA VOCÊ TEM " + idade + " ANOS");

        if (idade < 21) {
            altura = altura + 0.005;
            System.out.printf("VOCÊ CRESCEU 0.5CM! SUA ALTURA ATUAL É ");
            System.out.printf("%,.3f", altura);
            System.out.println(" ");
            System.out.println(" ");
            return altura;
        } else {
            System.out.println("VOCÊ NÃO GANHOU ALTURA.");
            System.out.println(" ");
        }
        return idade;
    }

    public Double engordar(Double quilosAMais){
        peso = peso + quilosAMais;
        System.out.println("VOCÊ ENGORDOU " + quilosAMais + "KG. SEU PESO ATUAL É " + peso);
        System.out.println(" ");
        return peso;
    }

    public Double emagrecer (Double quilosAMenos) {
        peso = peso - quilosAMenos;
        System.out.println("VOCÊ EMAGRECEU " + quilosAMenos + "KG. SEU PESO ATUAL É " + peso);
        System.out.println(" ");
        return peso;
    }

    public void crescer() {
        if (idade < 21) {
            System.out.println("VOCÊ PRECISA ENVELHECER PARA CRESCER. AGUARDE O SEU ANIVERSÁRIO");
            System.out.println(" ");
        } else {
            System.out.println("VOCÊ NÃO TEM MAIS IDADE PARA CRESCER :( ");
            System.out.println(" ");
        }
    }
    public void mostrarDados(){
        System.out.println("DADOS DA PESSOA");
        System.out.println("--------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + "kg");
        System.out.printf("Altura: ");
        System.out.printf("%,.3f", altura);
        System.out.println(" ");
        System.out.println("--------------------------");

    }
    public Pessoa(String nome, Integer idade, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        peso = 0.0;

    }
}
