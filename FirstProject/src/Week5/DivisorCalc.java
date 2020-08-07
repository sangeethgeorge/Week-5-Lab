package Week5;

public class DivisorCalc {

	public static void main(String[] args) {
			int num1 = 17;
			int num2 = 6;
			int blah = gcd (num1, num2);
			System.out.println(blah);
	}
	
	private static int gcd (int num1, int num2) {
		if (num2 <= num1 && num1%num2 == 0) {			
		return num2;
		} else {
			  if( num1 < num2) {
				 return gcd (num2,num1);
			  } else {
				  return gcd (num2, num1%num2);
			  }
	//return num1;
		}
		
	}
	}


