import bankTask.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class Main {
public static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        ServicesManager userService = new ServicesManager();

        ArrayList<User> userList = new ArrayList<User>();
        userList.add(new User("Alex"));
        userList.add(new User("Alah"));
        userList.add(new User("Bob"));
        userList.add(new User("Xxcxxccx"));
        userList.add(new User("Ffffff"));

        ArrayList<Account> accountArrayList = new ArrayList<Account>();
        accountArrayList.add(new CreditAccount(1,200));
        accountArrayList.add(new CreditAccount(2,4555));
        accountArrayList.add(new DebitAccount("3",4555));

        userService.addEntry(userList.get(0),accountArrayList.get(0));
        userService.addEntry(userList.get(0),accountArrayList.get(1));
        userService.addEntry(userList.get(0),accountArrayList.get(2));
        userService.addEntry(userList.get(1),accountArrayList.get(2));
        userService.addEntry(userList.get(2),accountArrayList.get(2));
        userService.addEntry(userList.get(3),accountArrayList.get(2));
        userService.addEntry(userList.get(4),accountArrayList.get(2));

        userService.showAllAccounts(userList.get(0));
        logger.info(userService.getTaxForUser(userList.get(0), accountArrayList.get(2)));
        userService.showAllUsersSorted();
    }
}
