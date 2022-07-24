package AssistedProjects2;

public class FinallyKeyword {
	
	public static void main(String[] args)
    {
        int a=50,b=0,res1=0;
        float f = 5.0f, g = 4.0f,res2 = 0;
        try
        {
            res1 = a / b;
            res2 = f / g; 
        }
        catch(ArithmeticException e)
        {
            System.out.print("\n\tError found : " + e.getMessage());
        }
        finally
        {
            System.out.print("\n\tThe Result is : " + res1);
            System.out.print("\n\tThe Result is : " + res2);
        }
    }

}
