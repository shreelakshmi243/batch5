package assignment;
import java.util.ArrayList;
import java.util.Collections;

public class Collection {
  public static void main(String[] args) {
    ArrayList<Integer> numbers=new ArrayList<Integer>();
    System.out.println( "The empty arraylist "+numbers);
    System.out.println("Printing in descending order");
    for(int i=15;i>0;i--)
	{
    	numbers.add(i);
    	System.out.println(i);
    }
	Collections.reverse(numbers);
	System.out.println("Using collections class to print in reverse order");
	System.out.println(numbers);
  }
}  
