package Abstract_Class;
        abstract class demo1{
			abstract int getRateOfInterest();
		}
		class Sbi extends demo1
		{
			public int getRateOfInterest()
			{
				return 0;
			}
		}
		class Pnb  extends demo1
		{
			public int getRateOfInterest()
			{
				return 0;
			}
		}

		public class RateOfInterest {
			public static void main(String args[])
			{
				
				demo1 a;
				a= new Sbi();
				System.out.println("Rate of interest :  " + a.getRateOfInterest() + "%");
				a= new Pnb();
				System.out.println("Rate of interest : "  + a.getRateOfInterest() + "%");
			}

		

	}


