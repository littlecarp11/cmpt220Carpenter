import java.util.ArrayList;
import java.util.Date;

public class eleven3 {

	public static void main(String[] args) {
		
	}
		 protected String mName;
		    protected int mId;
		    protected double mBalance;
		    protected double mAnnualInterestRate; // AnnualInterestRate is percentage.
		    protected Date mDateCreated;
		    protected ArrayList<Transaction> mTransactions;


		    public eleven3() {
		        mDateCreated = new Date();
		        mTransactions = new ArrayList<>();
		    }

		    public eleven3(int id, double balance) {
		        this();
		        mId = id;
		        mBalance = balance;
		    }

		    public eleven3(String name, int id, double balance) {
		        this(id, balance);
		        mName = name;

		    }

		    public int getId() {
		        return mId;
		    }

		    public void setId(int id) {
		        mId = id;
		    }

		    public double getBalance() {
		        return mBalance;
		    }

		    public void setBalance(double balance) {
		        mBalance = balance;
		    }

		    public double getAnnualInterestRate() {
		        return mAnnualInterestRate;
		    }

		    public void setAnnualInterestRate(double annualInterestRate) {
		        mAnnualInterestRate = annualInterestRate;
		    }

		    public Date getDateCreated() {
		        return mDateCreated;
		    }

		    public double getMonthlyInterestRate() {
		        return mBalance * (mAnnualInterestRate / 12) / 100;
		    }

		    public void withdraw(double amount) {
		        mTransactions.add(new Transaction('W', amount, mBalance, "withdraw"));
		        mBalance -= amount;
		    }

		    public void deposit(double amount) {
		        mTransactions.add(new Transaction('D', amount, mBalance, "deposit"));
		        mBalance += amount;
		    }

		    @Override
		    public String toString() {
		        return "Account name: " + mName + "\n" + "Interest rate: " + mAnnualInterestRate + "\n" + mTransactions;
		    }

		    public ArrayList<Transaction> getTransactions() {
		        return new ArrayList<>(mTransactions);
		    }

		}