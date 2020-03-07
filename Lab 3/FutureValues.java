/*this program calls two methods: one method that computes and returns the future value of an account based on the
 * present value of the account, the interest rate, and the number of years; and one method that computes and returns
 * the future value of an annuity based on the payment per year, the interest rate, and the number of years.
 * For each method, the main method should obtain input from the user, call the method with the input values, save the
 * result of the method in a local variable, and print the inputs and the result.*/
import java.util.*;
import java.text.*;

public class FutureValues {
  public static final Scanner CONSOLE = new Scanner(System.in);
  
  /* obtain input from the user, call the method with input values, save the result of the method in a local
  * variable, and print the inputs and the result */
  public static void main(String[] args) {
    System.out.println("Lab 3 written by Megan Rodriguez");
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
    
    //future value based on present value
    System.out.println("Enter the present value of account: ");
    double p = CONSOLE.nextDouble();
    System.out.println("Enter the interest rate of account: ");
    double r = CONSOLE.nextDouble();
    System.out.println("Enter the number of years: ");
    double y = CONSOLE.nextDouble();
    double futureValue = account(p, r, y);
    System.out.println("The future value of the account is " + currencyFormatter.format(futureValue));
    
    //future value of annuity
    System.out.println("Enter the yearly payment: ");
    double yp = CONSOLE.nextDouble();
    System.out.println("Enter the interest rate: ");
    double ir = CONSOLE.nextDouble();
    System.out.println("Enter the number of years: ");
    double yrs = CONSOLE.nextDouble();
    double annuityAmount = annuity(yp, ir, yrs);
    System.out.println("The annuity for the account is " + currencyFormatter.format(annuityAmount));
  }
  
  /*compute and return the future value of an account based on the present value of the account, the interest rate,
  * and the number of years.*/
  public static double account(double p, double r, double y) {
     double futureValue = p * Math.pow((1 + r / 100), y);
     return futureValue;
  }
  
  /* compute and return the future value of an annuity based on the payment per year, the interest rate, and the number
  * of years */
  public static double annuity(double yp, double ir, double yrs) {
    double futureValue = yp * ((Math.pow(1 + (ir / 100), yrs) -1) / (ir / 100));
    return futureValue;
  }
}
