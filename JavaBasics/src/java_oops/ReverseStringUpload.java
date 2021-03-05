package java_oops;

public class ReverseStringUpload {

	public static void main(String[] args) {

		System.out.println("------------First Way to reverse string--------------");
		
		String str = "Input String ^$*#697 is";
		String t = "";
		for (int i = str.length()- 1; i>= 0; i--) {
			t = t + str.charAt(i);
		}
		System.out.println(t);
/*		if (str.equalsIgnoreCase(t)) {
			System.out.println("String is polyndrom");
		} else {
			System.out.println("String is NOT polyndrom");
		}
*/
	
		System.out.println("------------Another way to reverse string--------------");
		
		 StringBuilder sb = new StringBuilder();
		 for(int i = str.length() - 1; i >= 0; i--) {
		 sb.append(str.charAt(i));
		 }
		 System.out.println("Reversed string is:");
		 System.out.println(sb.toString());
		 
		 
		 System.out.println("--------Third way to reverse string-----");
		 StringBuilder sb1 = new StringBuilder(str);
		 System.out.println(sb1.reverse().toString());
	
		 
		

	
	

	}

}
