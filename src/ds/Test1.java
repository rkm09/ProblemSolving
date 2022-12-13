package ds;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;


public class Test1 {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyMMdd");
        String currentDate = LocalDate.now().format(dtf);
        System.out.println(currentDate);
        System.out.println(String.format("%06d", 1329));
        List<String> status = Arrays.asList("Open","InProgress","Closed");
        status.replaceAll(s-> s.equals("Open") ? s.toUpperCase() : s);
        status.forEach(System.out::println);
    }
}
