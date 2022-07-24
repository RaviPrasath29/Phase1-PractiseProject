package AssistedProjects2;

public class Throws {
	
	void Display() throws ArithmeticException
    {
        int a=45,b=4,result = 0;
        result = a / b;
        System.out.print("\n\tThe result is : " + result);
    }
     public static void main(String[] args)
    {
        Throws t = new Throws();
         try
        {
            t.Display();
        }
        catch(ArithmeticException e)
        {
            System.out.print("Error Found : " + e.getMessage());
        }
        System.out.print("\n\tStatus : Code Compiled Successfully  :) ");
    }

}
