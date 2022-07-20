import java.util.Scanner;
public class MethodCalling {
		
	 double pi = 3.14;
	 public float AreaOfCircle(int radii)
	 {
		 float a = (float) (pi*(radii*radii));
		 return a;
	 }
	 public static void main(String[] args) {
		System.out.println("Enter the Radius Value");
		Scanner s = new Scanner(System.in);
		int radii = s.nextInt();
		MethodCalling n = new MethodCalling();
		float c = n.AreaOfCircle(radii);
		System.out.println("Area of Circle is : " + c);
	}

}
