package AssistedProjects2;

class Encapsulationtest 
{ 
    private String Name; 
    private int Roll; 
    private int Age;
    public int Age()  
    { 
      return Age; 
    } 
    public String Name()  
    { 
      return Name; 
    } 
    public int Roll()  
    { 
       return Roll; 
    } 
    public void Age( int newAge) 
    { 
      Age = newAge; 
    } 
    public void Name(String newName) 
    { 
      Name = newName; 
    } 
    public void Roll( int newRoll)  
    { 
      Roll = newRoll; 
    } 
}

public class Encapsulation{
	
	public static void main (String[] args)  
    { 
        Encapsulationtest e = new Encapsulationtest(); 
        e.Name("Ravi Prasath"); 
        e.Age(21); 
        e.Roll(25); 
        System.out.println("My name is: " + e.Name()); 
        System.out.println("My age is: " + e.Age()); 
        System.out.println("My roll no is: " + e.Roll());      
    }

	

}
