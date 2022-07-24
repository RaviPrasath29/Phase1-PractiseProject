package AssistedProjects2;

public class Throw {
	
	public static void main(String[] args)
    {

        int a=10,b=0,res = 0;

        try
        {
            if(b==0)        
                throw(new ArithmeticException("Number if Divided By zero gives Infinity ... So Please Check the number given "));
            else
            {
                res = a / b;
                System.out.print("The result is : " + res);
            }
        }
        catch(ArithmeticException e)
        {
            System.out.print("Error Found : " + e.getMessage());
        }

        System.out.print("\n Calculation Done :) ");
    }


}
