package AssistedProjects4;
import java.util.*;
public class QueueProgram {
	
	public static void main(String[] args) 
	{
	        		Queue<String> locations = new LinkedList<>();
	                locations.add("Salem");
	        		locations.add("Chennai");
	        		locations.add("Coimbatore");
	        		locations.add("Bangalore");
	        		locations.add("Hyderabad");
	System.out.println("Queue is : " + locations);
	        		System.out.println("Head of Location is : " + locations.peek());
	        		locations.remove();
	        		System.out.println("After removing Head of Location : " + locations);
	        		System.out.println("Size of Queue is : " + locations.size());
	    	}

}
