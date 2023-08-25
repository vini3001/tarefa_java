package files.src.BankAccount;

public interface IConta {
    public void deposit(double value);
    public void sacar(double value);
    public void investiment();
    public void print(double balance, double afterOperation);
}
