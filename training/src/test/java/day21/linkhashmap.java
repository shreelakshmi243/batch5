package day21;

import java.util.LinkedHashMap;

public class linkhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashMap<String,Integer> empname= new LinkedHashMap<String,Integer> ();
empname.put("navin",1 );
empname.put("shree",2 );
empname.put("lucky",4 );
empname.put("sunil",3 );
for(String e:empname.keySet())
{
	System.out.println("the emp"+e+"id"+empname.get(e));
}
	}

}
