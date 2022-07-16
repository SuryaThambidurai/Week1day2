package Week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "Do good and you will get good as return";
		int count = 0;
		String s = "good";
		String[] t = text.split(" ");
		for (int i = 0; i<s.length(); i++) {
			if (s.equals(t[i])) {
				count++;
				if (count ==1) {
					System.out.print(t[i]+" ");
					
				} else if(count>1) {
					t[i] ="";
					System.out.print(t[i]);

				}
				
			} else {
				System.out.print(t[i]+ " ");

			}
			
		}

	}

}
