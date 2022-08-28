package bankTask;


import java.util.Map;

public interface UserService<T extends Account, User> {


    public void showAllUsersSorted();
    public void showAllAccounts(User user);
    public double getTaxForUser(User user, Account account);
}
