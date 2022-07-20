
public class Method {
	public static void main(String[] args) {
		int a = 4;
		int b = 8;
		int c = FindingMax(a,b);
		System.out.println("Maximum Value is " + c);
	}
	public static int FindingMax(int c,int d) {
		int Max;
		if(c>d) {
			Max = c;
		}
		else
		{
			Max = d;
		}
		return Max;
	}
}
