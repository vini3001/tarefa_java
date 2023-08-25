
public class Pessoa_juridica extends Pessoa{
    protected String cnpj;
    public Pessoa_juridica(String nome, String telefone, String email, String endereco,
                           double valor_desconto, String cnpj) {
        super(nome, telefone, email, endereco, valor_desconto);
        this.cnpj = cnpj;
    }

    @Override
    public void calcular(double percentual_desconto){
        double valor = valor_desconto * (percentual_desconto / 100);
        double valor_addDez = (valor * 0.10) + valor;
        double resultado = valor_desconto - valor_addDez;

        System.out.println("Valor final com desconto: " + resultado);
    }

    public void imprime(){
        System.out.println("nome " + this.nome);
        System.out.println("email " + this.email);
        System.out.println("telefone " + this.telefone);
        System.out.println("endereço " + this.endereco);
        System.out.println("valor de desconto " + this.valor_desconto);
        System.out.println("CNPJ: " + this.cnpj);
    }
}
