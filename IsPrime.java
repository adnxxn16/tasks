package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		
		int num=2;
		
		for(int i=2;i<=num;i++) {
			
		if(num%i==0) {
				System.out.println(i+"prime");
			}
			else {
				System.out.println(i+"not prime");
			}
			
		}

	}

}
