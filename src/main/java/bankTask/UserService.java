package bankTask;

public interface UserService<T extends Account, User> {

    public void showAllUsers();
    public void showAllAccounts();
    public int getTaxForUser();
}
