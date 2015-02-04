import java.util.Scanner;
/**
 * TempConverterMain runs and tests the TempConverter class.
 * 
 * @author Brigitte
 * @version 2.0
 */
public class TempConverterMain{
    /**
     * main() reads two Fahrenheit temperatures and 
     * displays their Celsius and Kelvin equivalents
     */
   public static void main(String[] args){
       double inputTemp=0.0;
       Scanner keyInput = new Scanner (System.in);
       TempConverter tc1 = new TempConverter();
       TempConverter tc2;
       System.out.print("Enter a Fahrenheit temperature: ");
       inputTemp = keyInput.nextDouble();
       System.out.println("You entered "+ inputTemp + " degrees Fahrenheit");
       tc1.setTempF(inputTemp);
       System.out.println("which is " + tc1.getTempC() + " degrees Celsius.");
       System.out.println("and " + tc1.getTempK() + " degrees Kelvin.");
       System.out.print("Enter another Fahrenheit temperature: ");
       inputTemp = keyInput.nextDouble();
       System.out.println("You entered " +inputTemp + " degrees Fahrenheit");
       tc2 = new TempConverter(inputTemp);
       System.out.println("which is " + tc2.getTempC() + " degrees Celsius");
       System.out.println("and " + tc2.getTempK() + " degrees Kelvin.");
    }
}