package allconceptsofoops;

import java.util.Scanner;

public class Dmart {
public void name() {
	//here in runner class we will use obeject and class concept
	System.out.println("enter the name");
	Scanner sc=new Scanner(System.in);
	String name= sc.next();
}
//polymorshism concept:same method name with different aruguement
public void productnum(int a,int b)
{
	System.out.println("the updated product"+a);
	System.out.println("the updated product"+b);
	
}
public void productnum(int a,int b,int c)
{
	System.out.println("the updated product"+a);
	System.out.println("the updated product"+b);
	System.out.println("the updated product"+c);
}

//abstraction

}


