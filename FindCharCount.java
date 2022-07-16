package Week1.day2;

public class FindCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "cognizantc";
char ch1 = 'c';
int count = 0;
char[] ch =str.toCharArray();
for (int i = 0; i < ch.length; i++) {
	if (ch1 == ch[i]) 
	{
		count++;
		}
	
}
System.out.print(count);
	}

}
