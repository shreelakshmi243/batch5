package day6;

import java.util.Scanner;

public class FirstProgram {
public void add()
{

    Scanner sc=new Scanner(System.in);

    System.out.println("enter the 1st num");
    int a=sc.nextInt();
    System.out.println("enter the 2nd num");
    int b=sc.nextInt();
    int c=a+=b;
    System.out.println("the output of add"+c);
	 }
}
