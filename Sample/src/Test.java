import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Test {
	
	public static void main(String[] args){
		Pattern p = Pattern.compile("([a-z]{2})([\\w#*]{1})\\s([\\d]{6,8})\\s([a-z]{2})([\\w#*]{1})\\s([\\d]{2})\\s([a-z]{2})([\\w#*]{1})\\s([\\d]{5})");
		  String text=" SI# 03810 OP# 009043 TE# 43 TR# 0524";
		  Matcher m = p.matcher(text.toLowerCase());

		  if (m.find()) {
		   System.out.println(m.group(4));
		  }else{
		   System.out.println("no matches");
		  }
		
	}

}
