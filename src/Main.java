import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);
        String selection;
        do {
            System.out.println("Programdom:\n\t1. Date now\n\t2. Time now\n\t3. exit");
            selection = scanner.next();
            switch (selection) {
                case "1" -> System.out.println("Date now: " + getDateNow());
                case "2" -> System.out.println("Time now: " + getTimeNow());
            }
        }while (!selection.equals("3"));
    }

    private static String getDateNow(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime currentDateTime = LocalDateTime.now();
        return dateTimeFormatter.format(currentDateTime);
    }

    private static String getTimeNow(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime currentDateTime = LocalDateTime.now();
        return dateTimeFormatter.format(currentDateTime);
    }

}