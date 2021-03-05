
public class java_basics {

	public static void main(String[] args) {
		

		String s = " This is very big string with 998 -- 38ih:@(&";
	/*	System.out.println(s.charAt(8));
		System.out.println(s.indexOf("$"));
		System.out.println(s.toUpperCase());
		System.out.println(s.substring(3));
*/		
		System.out.println(s.charAt(2));
		System.out.println(s.substring(7, 25));
		System.out.println(s.trim());

		System.out.println(s.replaceAll("\\s",""));
		
		System.out.println(s.toUpperCase().trim().replaceAll("\\s", ""));
	
		
		
		
		
	}

}
