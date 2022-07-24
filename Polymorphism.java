package AssistedProjects2;

public class Polymorphism {
	
	public int sum(int a, int b) 
    { 
        return (a + b); 
    } 
    public int sum(int a, int b, int c) 
    { 
        return (a + b - c); 
    } 
    public double sum(double x, double y) 
    { 
        return (x * y); 
    } 
    public static void main(String args[]) 
    { 
        Polymorphism s = new Polymorphism(); 
        System.out.println(s.sum(100, 20)); 
        System.out.println(s.sum(10, 50, 30)); 
        System.out.println(s.sum(121.5, 58.5)); 
    } 

}
