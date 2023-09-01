package day21;

import java.util.ArrayList;

public abstract class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> student=new ArrayList<String>();
		student.add("navin");
		student .add("shree");
		ArrayList<Integer> empid=new ArrayList<Integer>();
		empid.add(1);
		empid.add(2);
		for(int i=0;i<empid.size();i++)
		{
		System.out.println(" the id"+student.get(i)+empid.get(i));	
		}

		

}
}