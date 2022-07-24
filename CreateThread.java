package AssistedProjects2;

public class CreateThread extends Thread {
	

 	public static void main( String args[] )
 	{
        CreateThread t = new CreateThread();
  		t.start();
 	}
	public void run()
 	{
  		System.out.println(" Thread Created");
}
}
