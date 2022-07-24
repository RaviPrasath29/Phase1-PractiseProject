package AssistedProjects2;

class MyExceptionhandling extends Exception
{
	   String s;
	   MyExceptionhandling(String s2) {
		s=s2;
	   }
	   public String toString(){ 
		return ("Exception Occurred: " + s) ;
	   }
	}


public class ExceptionHandling {
	
	public static void main(String args[]){
		try{
			System.out.println("Try block Begins");
			throw new MyExceptionhandling("Error Occured");
		}
		catch(MyExceptionhandling exp){
			System.out.println("Catch Block Run Successfully") ;
			System.out.println(exp) ;
		}
	   }

}
