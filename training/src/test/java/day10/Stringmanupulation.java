package day10;

public class Stringmanupulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hi how are you";
String s2="Hi How are you";         
String s1="hello how are you";
 int a= s.length();
//System.out.println(a);
//index srts from 0
int b=s.indexOf("h");
System.out.println(b);
//String c= s. replaceAll("h","s");
String c= s. substring(8,10);
// contains used to find the string present or not works like boolean
System.out.println(s.contains("are"));

System.out.println(c);
	Boolean ans=s.equals(s1);
	System.out.println(ans);
	Boolean ans1=s.equalsIgnoreCase(s2);
	System.out.println(ans1);
	int aa=10;
	int bb=20;
	String dd="1";
int cc=aa+Integer.parseInt(dd);
	System.out.println(cc);
	
	}

	
	
	}
	
