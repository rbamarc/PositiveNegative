
package netbeans.positivenegative;
import java.util.Scanner;

/**
 *
 * @author halfrikan
 */
public class PositiveNegative {

    public static void main(String[] args) {
        //initialize variables used
        int number = 0;
        String stringValue = "";
        
        //initialize a scanner object to get the users input
        Scanner inputReader = new Scanner(System.in);
        
        //ask for the users input
        System.out.println("Enter a number");
        
        //get the input and convert it to a data type that is usable 
        stringValue = inputReader.nextLine();
        number = Integer.parseInt(stringValue);
        
       //if-else statement to determine the output 
       //if the value is positive then print that, if not, print negative
        if (number >= 0) {
            System.out.println("the number is positive");
        } else {
            System.out.println("the number is negative");
        }
            
    }
}
