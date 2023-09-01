package exampleprogrm;

import java.util.Scanner;

public class operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//inputs which you are going to get from user is adhar(validate it should 16 char)
		//age>18
		//age should be<30
		//country should be india
                                  
	Scanner sc=new Scanner(System.in);

	System.out.println("enter adhar num");
    String adhar= sc.next();
    System.out.println("enter age ");
    int age= sc.nextInt();
    System.out.println("enter your country");
    String country= sc.next();
    
    
    
if(adhar.length()==16&&(age>=18&&age<30)&&(country.equalsIgnoreCase("india")))
{
System.out.println("valid user");
}

else
{
	System.out.println("invalid user");
}
	}
}

