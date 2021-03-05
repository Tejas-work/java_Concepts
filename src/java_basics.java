
public class java_basics {

	public static void main(String[] args) {

		String s = "Test STRING DEMO demo big string ";
		/*
		 * System.out.println(s.charAt(8)); System.out.println(s.indexOf("$"));
		 * System.out.println(s.toUpperCase()); System.out.println(s.substring(3));
		 */
		System.out.println("Char at = " + s.charAt(5));
		System.out.println("Substring = " + s.substring(2, 25));
		System.out.println("Trim string = " + s.trim());
		System.out.println("Replace all remove space = " + s.replaceAll("\\s", ""));
		System.out.println("Upper case and remove all spaces = " + s.toUpperCase().trim().replaceAll("\\s", ""));

	}

}
