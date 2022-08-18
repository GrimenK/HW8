import com.sun.tools.javac.util.List;
import enumTask.Months;
import enumTask.Seasons;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
public static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("1 task: ");
        logger.info(Months.checkMonthExist(handleUserInput()));

        logger.info("2 task: ");
        Months.printMonthsWithSeason(Seasons.SUMMER);

        logger.info("3 task: ");
        Months.printMonthsWithDays(30);

        logger.info("4 task: ");
        Months.printMonthsWithEvenDays();

        logger.info("5 task: ");
        Months.printMonthsWithOddDays();

        logger.info("6 task: ");
        logger.info(Months.isMonthEven(handleUserInput()));
    }

    public static String handleUserInput(){
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        return userInput;
    }
}
