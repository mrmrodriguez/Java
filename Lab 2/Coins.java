/* This program calls two methods: one method that prints out the number of quarters, dimes, nickels, and pennies from
 * the user and then prints out the number of coins and total value in dollars.
 * The second method takes the number of cents from user input and in turn determines and prints out the number of
 * quarters, dimes, nickels, and pennies needed to add up to the number from the user. */
import java.util.*;
import java.text.*;

public class Coins {
  public static final Scanner CONSOLE = new Scanner(System.in);
  
  public static void main(String[] args) {
    System.out.println("Lab 2 written by Megan Rodriguez");
    coins();
    cents();
  }
 
  /* inputs the number of quarters, dimes, nickels, and pennies from the user and prints out the number of coins and 
   * total value in dollars */
  public static void coins() {
    System.out.println("Enter the number of quarters: ");
    int quarters = CONSOLE.nextInt();
    double quarterAmount = quarters * 0.25;
    System.out.println("Enter the number of dimes: ");
    int dimes = CONSOLE.nextInt();
    double dimeAmount = dimes * 0.10;
    System.out.println("Enter the number of nickels: ");
    int nickels = CONSOLE.nextInt();
    double nickelAmount = nickels * 0.05;
    System.out.println("Enter the number of pennies: ");
    int pennies = CONSOLE.nextInt();
    double penniesAmount = pennies * 0.01;
    double amount = quarterAmount + dimeAmount + nickelAmount + penniesAmount;
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
    System.out.println(quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + 
                       " pennies is " + currencyFormatter.format(amount) + ".");
  }
  
  /*inputs the number of cents from the user and determines and prints the number of quarters, dimes, nickels, and
   * pennies to add up to that number of cents */
  public static void cents() {
    System.out.println("Enter the number of cents");
    int cents = CONSOLE.nextInt();
    int quarters = cents / 25;
    int after = cents % 25;
    int dimes = after / 10;
    after = after % 10;
    int nickels = after / 5;
    after = after % 5;
    System.out.println(cents + " cents is equal to " + quarters + " quarter(s), " + dimes + " dime(s), " + nickels + 
                       " nickel(s), and " + after + " pennies.");
  }
}
