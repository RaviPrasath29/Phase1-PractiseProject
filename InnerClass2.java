
public class InnerClass2 {
	
	private String s = "java Fsd";
	void display()
	{
		class Inner
		{
			void message()
			{
				System.out.println(s);
			}
		}
		Inner I = new Inner();
		I.message();
	}
public static void main(String[] args) {
	InnerClass2 a = new InnerClass2();
	a.display();
}
}
