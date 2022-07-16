package Week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Madam";
		char[] c = str.toCharArray();
		String str1 = "";
		int a = c.length;
		System.out.println("The String is "+str);

		for (int i = a-1; i >=0; i--) {
			str1=str1+c[i];
			
		}
		System.out.println("the reverse string is "+str1);
		if (str.equalsIgnoreCase(str1)) {
			System.out.println("The string is Palindrome");
			
		} else {
			System.out.println("The String is not Palindrome");

		}
	}

}
