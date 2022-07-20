
public class TypeCasting {

		public static void main(String[] args) {
			
			System.out.println("Implicit Type Casting");
			char ch ='J';
			System.out.println("Value of a: "+ch);
			
			int i=ch;
			System.out.println("Value of b: "+i);
			
			float f=ch;
			System.out.println("Value of c: "+f);
			
			long l=ch;
			System.out.println("Value of d: "+l);
			
			double d=ch;
			System.out.println("Value of e: "+d);
			
					
			System.out.println("\n");
			
			System.out.println("Explicit Type Casting");
			
			double x=18.9;
			int y=(int)x;
			System.out.println("Value of x: "+x);
			System.out.println("Value of y: "+y);
			
		}
	}


