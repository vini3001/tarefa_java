package BankAccount;

public class ContaCorrente extends Conta implements IConta {
    @Override
    public void deposit(double value){
        double addBalance = balance + value;

        print(balance, addBalance);

        balance = addBalance;
    };

    @Override
    public void sacar(double value){
        double takeBalance = balance - value;

        print(balance, takeBalance);

        balance = takeBalance;
    };

    @Override
    public void investiment(){
        double addBalance = balance + 0.03;

        print(balance, addBalance);

        balance = addBalance;
    };

    @Override
    public void print(double balance, double afterOperation){
        System.out.println("O seu saldo foi de " + balance + " para " + afterOperation);
    }
}
