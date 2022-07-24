package AssistedProjects2;

public class TryCatchExecution {
	
	public static void main(String args[]) 
    {
		try {
			int i = 20;
			int result = 0;
			result = i/0;
			System.out.println("The result is " + result);
		}catch(ArithmeticException s)
		{
			System.out.println("Error Found :  " + s.getMessage());
		}
		System.out.println("The Exception is Cleared !!!");
		
    }


}
