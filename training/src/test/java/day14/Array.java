package day14;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// create aray and display with ids
		String [] studntarray= {"mahi","balu"};
		int  [] studentid= {1,2};
		for(String s:studntarray)
		{
		System.out.println("the string is" +s );
		
	}
for(int s1=0;s1<studntarray.length;s1++) {
	System.out.println(studntarray[s1]+studentid[s1]);

	}
}
}