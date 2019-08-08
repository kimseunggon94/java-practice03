package prob04;

public class StringUtil {
	public static String concatenate(String[] str) {
		String sum="";
		for(int i=0;i<str.length;i++) {
			sum+=str[i];
		}

		return sum;
	}
}
