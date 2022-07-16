package Week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2;
		String s = "I am an automation Engineer";
		String[] t =s.split( " ");
		for (int i = 0; i < t.length; i++) {
			if (i%x==0) {
				System.out.print(t[i]);
				
			} else {
				char[] a =t[i].toCharArray();
				String rev="";
				int y = a.length;
				for (int j = y-1; j >=0; j--) {
					rev=rev+a[j];
				
					
				}
System.out.print(rev+" ");
			}
			
		}

	}

}
