public class LargerThanN
{
	public static void largerThanN(int [] list, int n)
	{for(int i = 0; i<list.length; i++)
	   {   if(list[i]>n)
		   {System.out.println(list[i]);
	       }
	   }
	}
	 public static void main (String [] agrs)
	 { int [] x ={1, 5, 10, 2, 4, -3, 6};
	  int [] y ={10, 12, 15, 24};
	  largerThanN(x, 3);
	  largerThanN(y, 12);
	}
}