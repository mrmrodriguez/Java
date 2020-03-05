/*This program prints the first verse of "Mary Had a Little Lamb" and the first three verses of "This Old Man.
 * The main meethod should print Lab 1 written by YOURNAME and call two methods: one to print the first verse of "Mary 
 * Had a Little Lamb", and the other to print the the first verses of "This Old Man".
 * The method to print the first verse of "Mary Had a Little Lamb" should print the title of the poema nd call a method
 * for each line in the verse. One of these methods should be called twice.
 * The method to print the first three verses of "This Old Man" sould print the title of the poem and should call a
 * method for each verse. 
 * Each of these methods should call another method to print the refrain. */

public class Poems {
  public static void main(String[] args) {
    System.out.println("Lab 1 written by Megan Rodriguez");
    System.out.println();
    mary();
    oldMan();
  }
  
  //print "Mary Had a Little Lamb", print title and make four calls to three other methods (one for each line)
  public static void mary() {
    System.out.println("Mary Had a Little Lamb");
    System.out.println();
    first();
    second();
    first();
    fourth();
    System.out.println();
  }
  
  //print first line of "Mary Had a Little Lamb"
  public static void first() {
    System.out.println("Mary had a little lamb");
  }

  //print second line of "Mary Had a Little Lamb"
  public static void second() {
    System.out.println("Little lamb, little lamb");
  }
  
  //print fourth line of "Mary Had a Little Lamb"
  public static void fourth() {
    System.out.println("Its fleece was white as snow");
  }
  
  //print "This Old Man", print title and then make calls to three other methods (one for each verse)
  public static void oldMan() {
    System.out.println("This Old Man");
    System.out.println();
    one();
    two();
    three();
  }
  
  //print first verse of "This Old Man" and call method for the refrain
  public static void one() {
    System.out.println("This old man, he played one");
    System.out.println("He played knick-knack on my thumb");
    refrain();
  }
  
  //print second verse of "This Old Man" and call method for the refrain
  public static void two() {
    System.out.println("This old man, he played two");
    System.out.println("He played knick-knack on my shoe");
    refrain();
  }
  
  //print third verse of "This Old Man" and call method for the refrain
  public static void three() {
    System.out.println("This old man, he played three");
    System.out.println("He played knick-knack on my knee");
    refrain();
  }
  
  //print refrain for "This Old Man"
  public static void refrain() {
    System.out.println("With a knick-knack patty-whack, give a dog a bone");
    System.out.println("This old man came rolling home");
    System.out.println();
  }
} 
