import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args){
        System.out.println("Hello world! " + getDateNow() + " " + getTimeNow());
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