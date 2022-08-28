package bankTask;

public abstract class Account<T> {
    protected T id;
    protected int balance;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                '}';
    }

    public int getBalance() {
        return balance;
    }
}
