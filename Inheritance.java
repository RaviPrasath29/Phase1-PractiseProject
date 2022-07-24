package AssistedProjects2;

class Motorcycle  
{ 
    public int gear; 
    public int speed; 
    public Motorcycle(int gear, int speed) 
    { 
        this.gear = gear; 
        this.speed = speed; 
        System.out.println("The Motorcycle is Royal Enfield ");
    } 
    public void applyBrake(int brake) 
    { 
        speed -= brake; 
    } 
    public void speedUp(int accelerate) 
    { 
        speed += accelerate; 
    }  
    public String height()  
    { 
        return("No of gears are " + gear + "\n" + "Speed of Motorcycle is " + speed); 
    }  
} 
class MountBike extends Motorcycle  
{ 
    public int seatHeight; 
    public MountBike(int gear,int speed,int startHeight) 
    {  
        super(gear, speed); 
        seatHeight = startHeight; 
    }  
    public void setHeight(int height) 
    { 
        seatHeight = height; 
    } 
    public String height() 
    { 
        return (super.height()+ "\nSeat height in mm is "+ seatHeight); 
    } 
}

public class Inheritance {
	
	public static void main(String args[])  
    { 
        MountBike mb = new MountBike(5, 120, 50); 
        System.out.println(mb.height());
    } 

}
