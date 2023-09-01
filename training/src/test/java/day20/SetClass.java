package day20;

import java.util.HashSet;

public class SetClass {

	public static void main(String[] args) {
		// HASHset
		// hashset is a class which implements set interface ,it will not allow  duplicates,no insertion order mainted
		//no get method
		HashSet<String> student =new HashSet<String>();

		student.add("shree");
		student.add("shreelak");
		student.add("shreelaks");
		student.add("shree");
		System.out.println(student.size());
		for(String s:student)
		{
			System.out.println(s);
		}
		
	}

}
