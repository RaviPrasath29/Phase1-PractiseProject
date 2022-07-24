package AssistedProjects2;

abstract class Shape  
{ 
    String color; 
    abstract double area(); 
    public abstract String toString(); 
    public Shape(String color) 
    { 
        System.out.println(" Shape Constructor Is Called Successfully "); 
        this.color = color; 
    } 
    public String getColor() 
    { 
        return color; 
    } 
} 

class Circle extends Shape 
{ 
    double radius; 
    public Circle(String color,double radius) 
    { 
        super(color); 
        System.out.println("Circle constructor is called Successfully "); 
        this.radius = radius; 
    }
    double area() 
    { 
        return Math.PI * Math.pow(radius, 2); 
    } 
    public String toString() 
    { 
        return "Color of the circle is " + super.color + "  and the area is : " + area(); 
    } 
} 

class Rectangle extends Shape
{ 
    double length; 
    double width; 
    public Rectangle(String color,double length,double width) 
    { 
        super(color); 
        System.out.println("Rectangle constructor is called Successfully "); 
        this.length = length; 
        this.width = width; 
    } 
    double area() 
    { 
        return length*width; 
    } 
    public String toString() 
    { 
        return "Color of the Rectangle is " + super.color +  
                           " and the area is : " + area(); 
    } 
} 

public class Abstraction {
	
	public static void main(String[] args) 
    { 
        Shape s1 = new Circle(" Red ", 4); 
        Shape s2 = new Rectangle(" Yellow ", 4, 6);
        System.out.println(s1.toString()); 
        System.out.println(s2.toString()); 
    } 

}
