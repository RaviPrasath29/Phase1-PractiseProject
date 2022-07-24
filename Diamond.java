package AssistedProjects2;

interface First 
{  
    default void show() 
    { 
        System.out.println("First is First"); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println("And then comes Second"); 
    } 
}  

public class Diamond implements First , Second{
	
	public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 
    public static void main(String args[]) 
    { 
        Diamond d = new Diamond(); 
        d.show(); 
    } 

}
