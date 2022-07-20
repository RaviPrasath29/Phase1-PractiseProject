import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegularExpression {
	
	public static void main(String[] args) {
		String sequence = "[A-z]+";
		String check = "Regular Expressions";
		Pattern a = Pattern.compile(sequence);
		Matcher c = a.matcher(check);
		while(c.find())
			System.out.println(check.substring(c.start(),c.end()));
	}
	
	

}
