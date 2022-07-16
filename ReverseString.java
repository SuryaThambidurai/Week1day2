package Week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		char[] chars = str.toCharArray();
		System.out.println(chars);
		for (int i = chars.length-1; i >=0; i--) {
			System.out.print(chars [i]);
			
		}
		

	}

}
