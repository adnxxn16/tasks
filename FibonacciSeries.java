package classwork;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int range=8;
		int a=0;
		int b=1;
		for(int i=0;i<=range;i++) {
			if(i<range) {
				System.out.println(a);
			    int temp=a;
			    a=b;
			    b=temp+a;
			    
			}
			
		}

	}

}
