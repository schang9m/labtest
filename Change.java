package q1;
import java.util.Scanner;


/**
 * <p>This Class first would ask the user to enter 
 * the amount of money, this will be called
 * total  and stored as double.</p>
 * 
 * <p>it is stored in double because of decimal 
 * points, in order to make it an integer, 
 * the number entered is then times by hundred
 * next we divide the total by the amount, and 
 * make it stored as integer because we want a
 *  whole number.</p>
 * 
 * <p>Afterwards we use % to find the remainder after taking out the
 *  largest bill. This process continues untill we finished in
 *   pennies. </p>
 *
 * @author Sampson Chang
 * @version 1.0
 */
public class Change {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.*/
    public static void main(String[] args) {
        int amount;
        double total;
        final double two = 2;
        final double five = 5;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the money here:");
        total = scan.nextDouble();
        
        total = total * two * five * two * five;
        
        amount = (int) (total / (two * five * two * five * two * five));
        total = total % (two * five * two * five * two * five); 
        System.out.println(amount + " ten dollar bills");
        
        amount = (int) (total / (two * five * two * five * five));
        total = total % (two * five * two * five * five);
        System.out.println(amount + " five dollar bills");
        
        amount = (int) (total / (two * two * five * two * five));
        total = total % (two * two * five * two * five);
        System.out.println(amount + " two dollar coin ");
        
        amount = (int) (total / (two * five * two * five));
        total = total % (two * five * two * five);
        System.out.println(amount + " one dollar coin ");
        
        amount = (int) (total / (two * two * five + five));
        total = total % (two * two * five + five);
        System.out.println(amount + " quarters");
        
        amount = (int) (total / (two * five));
        total = total % (two * five);
        System.out.println(amount + " dimes");
        
        amount = (int) (total / five);
        total = total % five; 
        System.out.println(amount + " nickles");
        
        amount = (int) (total);
        System.out.println(amount + " pennies");
    }
}
