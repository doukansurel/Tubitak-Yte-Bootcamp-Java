
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Practice3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Can you give me  your birthday date : ");
        
        String user_birthday = scanner.nextLine();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm" );
        LocalDateTime  birthday = LocalDateTime.parse(user_birthday,formatter);
                
        LocalDateTime time = LocalDateTime.now();
        
        if(birthday.getMonthValue()== time.getMonthValue() && birthday.getDayOfMonth()== time.getDayOfMonth()){
            System.out.println("Conguraulation !!!");  
        }
        else {
            long day = time.until(birthday,ChronoUnit.DAYS);
            long hour = time.until(birthday,ChronoUnit.HOURS);
            System.out.println(day +" days and "+ hour+ "hours left until your birthday");        }
        
        
         scanner.close();
         
        
    }
         
}
