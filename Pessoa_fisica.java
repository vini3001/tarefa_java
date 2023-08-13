public class Pessoa_fisica extends Pessoa{
    protected String cpf;

    public Pessoa_fisica(String nome, String telefone, String email, String endereco, double valor_desconto,
                         String cpf) {
        super(nome, telefone, email, endereco, valor_desconto);
        this.cpf = cpf;
    }

    @Override
    public void calcular(double percentual_desconto){
        double valor = valor_desconto * (percentual_desconto / 100);
        double valor_addVinte = (valor * 0.20) + valor;
        double resultado = valor_desconto - valor_addVinte;

        System.out.println("Valor final com desconto: " + resultado);
    }

    @Override
    public void imprime(){
        System.out.println("nome " + this.nome);
        System.out.println("email " + this.email);
        System.out.println("telefone " + this.telefone);
        System.out.println("endereço " + this.endereco);
        System.out.println("valor de desconto " + this.valor_desconto);
        System.out.println("CPF: " + this.cpf);
    }
}
