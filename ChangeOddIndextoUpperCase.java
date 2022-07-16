package Week1.day2;

public class ChangeOddIndextoUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "london";
		char ch1;
		int x = 2;
		char[] str = test.toCharArray();
		for (int i = 0; i < str.length; i++) {
			if (i%x==0) {
				ch1 = Character.toUpperCase(str[i]);
				System.out.print(ch1);
			} else {
				System.out.print(str[i]);

			}
			
		}

	}

}
