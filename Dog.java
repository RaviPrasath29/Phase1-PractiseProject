package AssistedProjects2;

public class Dog {
	
	String dogname; 
    String dogbreed; 
    int dogage; 
    String color; 
    public Dog(String dogname, String dogbreed, int dogage, String color) 
    { 
        this.dogname = dogname; 
        this.dogbreed = dogbreed; 
        this.dogage = dogage; 
        this.color = color; 
    } 
    public String getName() 
    { 
        return dogname; 
    } 
    public String getBreed() 
    { 
        return dogbreed; 
    } 
    public int getAge() 
    { 
        return dogage; 
    } 
    public String getColor() 
    { 
        return color; 
    } 
    @Override
    public String toString() 
    { 
        return("My Name is "+ this.getName()+ ".\n My breed is " + this.getBreed() + "\nMy age is " + this.getAge() + " \n My Color is  "+ this.getColor() + "."); 
    } 
    public static void main(String[] args) 
    { 
        Dog tom = new Dog("Tom","German Shephard ", 5, " Black and Brown"); 
        System.out.println(tom.toString()); 
    } 

}
