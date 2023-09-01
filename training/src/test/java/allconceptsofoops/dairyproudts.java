package allconceptsofoops;

import allconceptsofoops.Dmart.rules;

// inhertance
public class dairyproudts extends Dmart
{


		public void available()
		{
			System.out.println("dairy products available");
		}
		public void details()
		{
			encapculation  ec=new encapculation ();
		    ec.setAccountnum(142587555L);
			ec.setPhonenum(8971421744L);
			System.out.println( "the dmart account num " +ec.getAccountnum());
			System.out.println("the phone num of user" +ec.getPhonenum());
		}
		}

	
