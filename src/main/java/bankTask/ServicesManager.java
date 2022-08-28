package bankTask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class ServicesManager implements UserService<Account, User> {

    public static final Logger LOGGER = LogManager.getLogger(ServicesManager.class);
    Map<User, ArrayList<Account>> userMap;

    public ServicesManager(){
        this.userMap = new HashMap<>();
    }

    public void addEntry(User user, Account account){
        if(!userMap.containsKey(user)) {
            userMap.put(user, new ArrayList<Account>());
            userMap.get(user).add(account);
        }
        else {
            userMap.get(user).add(account);
        }
    }

    public void showAllUsersSorted() {
        List<String> userNames = new ArrayList<>();
        for (Map.Entry<User, ArrayList<Account>> entry : userMap.entrySet()) {
            userNames.add(entry.getKey().getName());
        }
        Collections.sort(userNames);

        for (String name: userNames
             ) {
            LOGGER.info(name);
        }
    }

    public void showAllAccounts(User user) {
        for(Map.Entry<User, ArrayList<Account>> userEntry : userMap.entrySet()){
            if(userEntry.getKey().equals(user)){
                LOGGER.info("User " + user + "Has: " + userEntry.getValue());
            }
        }
    }

    public double getTaxForUser(User user, Account account) {
        int balance = 0;
        for(Map.Entry<User, ArrayList<Account>> userEntry : userMap.entrySet()){
            if(userEntry.getKey().equals(user)){
                for (Account userAcc: userEntry.getValue()
                     ) {
                    if(userAcc.equals(account)){
                        balance = userAcc.getBalance();
                    }
                }
            }
        }
        return balance * 0.5;
    }
}
