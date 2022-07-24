package AssistedProjects2;

class Custexception extends Exception 
{ 
    public Custexception(String s) 
    { 
        super(s); 
    } 
}

public class CustomException {

	public static void main(String args[]) 
    { 
        try
        { 
            throw new Custexception(" Exception can be created "); 
        } 
        catch (Custexception e) 
        { 
            System.out.println(" Created Successfully "); 
            System.out.println(e.getMessage()); 
        } 
    } 
	
}
