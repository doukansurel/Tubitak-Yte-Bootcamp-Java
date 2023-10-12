// 50-60 arasında bir random sayı 
// double - long - int - short - float - char 
// sadece char type çevirilecek
import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.concurrent.ThreadLocalRandom;

public class Practice2 {
    public static void main(String[] args) {
        
        // double converter
        double firstDoubleVariable = ThreadLocalRandom.current().nextInt(50, 61);
        double secondDoubleVariable = ThreadLocalRandom.current().nextInt(50, 61);
        
        System.out.println("firstDoubleVariable : " +firstDoubleVariable );
        System.out.println("secondDoubleVariable" + secondDoubleVariable);
        System.out.println("********************************************");

        //long converter 
        
        long firstLongVariable = Math.round(firstDoubleVariable);
        long secondLongVariable = Math.round(secondDoubleVariable);

        System.out.println("firstLongVariable : " +firstLongVariable );
        System.out.println("secondLongVariable" + secondLongVariable);
        System.out.println("********************************************");

        
       //int converter
       
       int firstIntVariable = Math.round(firstLongVariable);
       int secondIntVariable = Math.round(secondLongVariable);
       
       System.out.println("firstIntVariable : " +firstIntVariable );
       System.out.println("secondIntVariable" + secondIntVariable);
       System.out.println("********************************************");

       
       //short converter
       
       short firstShortVariable = (short) Math.round(firstIntVariable);
       short secondShortVariable = (short) Math.round(secondIntVariable);
       
       System.out.println("firstShortVariable : " +firstShortVariable );
       System.out.println("secondShortVariable : " + secondShortVariable);
       System.out.println("********************************************");

       //float converter
       
       float firstFloatVariable = Math.round(firstShortVariable);
       float secondFloatVariable = Math.round(secondShortVariable);
       
       System.out.println("firstFloatVariable : " +firstFloatVariable );
       System.out.println("secondFloatVariable" + secondFloatVariable);
       
       System.out.println("********************************************");
       //char converter 
       char firstCharVariable = (char) Math.round(firstFloatVariable);
       char secondCharVariable = (char) Math.round(secondFloatVariable);
       
       
       System.out.println("firstCharVariable : " +firstCharVariable );
       System.out.println("secondCharVariable" + secondCharVariable);
    }
    
}
