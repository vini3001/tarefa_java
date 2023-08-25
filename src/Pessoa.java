

public class Pessoa {

    protected String nome;

    protected String telefone;

    protected String email;

    protected String endereco;

    protected double valor_desconto;

    public Pessoa(String nome, String telefone, String email, String endereco, double valor_desconto){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.valor_desconto = valor_desconto;
    }

    public void calcular(double percentual_desconto){
        double valor = valor_desconto * (percentual_desconto / 100);
        double valorFinal = valor_desconto - valor;

        System.out.println("Valor final com desconto: " + valorFinal);
    }

    public void imprime(){
        System.out.println("nome " + this.nome);
        System.out.println("email " + this.email);
        System.out.println("telefone " + this.telefone);
        System.out.println("endereço " + this.endereco);
        System.out.println("valor de desconto " + this.valor_desconto);
    }
}
