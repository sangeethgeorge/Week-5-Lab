package Week5;



public class StringReversal {

	public static void main(String[] args) {
		String test = "Blah";
		String a = reverseString(test);
	System.out.println(a);
	}
	
	private static String reverseString(String s){
		//String b = s.substring(s.length()-1);
		if (s.length()==0) {
			return s;
		}
		return reverseString(s.substring(1))+s.charAt(0);
		//return "test"+b.charAt(0);
	}

}
