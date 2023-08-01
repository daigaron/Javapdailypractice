package basicjavaPractice;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int num1=0;
//		int num2=1;
//		
//		int total=0;
//		for(int i=0;i<7;i++) {
//			total=num1+num2;
//			num1=num2;
//			num2=total;
//			System.out.println(num1);
//		}
		
//		int num=567;
//		int rev=0;
//		int rem;
//		while(num!=0) {
//			rem=num%10;
//			rev=rev*10+rem;
//			num=num/10;
//		}
//		System.out.println(rev);
		
		int num=152;
		int arm=0;
		int rem;
		
		while(num!=0) {
			rem=num%10;
			arm=rem*rem*rem+rem;
			num=num/10;
		}
		System.out.println(arm);
		
	}

}
