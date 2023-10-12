
import java.util.Scanner;


public class Practice4 {
    public static void main(String args [] ) throws Practice4Exception {
          
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if( number > 100) { 
            throw new Practice4Exception(number);
        }
        
    }
   
        
      
    }
            

