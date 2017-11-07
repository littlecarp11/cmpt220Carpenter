
public class SavingsAccount extends eleven3{

	protected double OVERDRAFT_LIMIT = 0;

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (mBalance - amount >= OVERDRAFT_LIMIT) {
            super.withdraw(amount);
        }
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "mBalance=" + mBalance +
                '}';
    }
}