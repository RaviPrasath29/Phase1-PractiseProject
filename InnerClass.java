
public class InnerClass {

		 private String s="Welcome to Java"; 
		 
		 class Inner{  
		  void hello(){System.out.println(s+", Let us master in java ");}  
		 }  


		public static void main(String[] args) {

			InnerClass c=new InnerClass();
			InnerClass.Inner in=c.new Inner();  
			in.hello();  
		}
	}


	


