package Week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a1 = {1,3,4,6,8};
		int [] a2 = {2,5,7,9,1};
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a2.length; j++) {
				if (a1[i]==a2[j]) {
					System.out.println(a1[i]);
					
				}
			}
		}

	}

}
