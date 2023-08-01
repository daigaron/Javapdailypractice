package basicjavaPractice;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int num1=67;
//		int num2=454;
//		int num3=56;
//		int greatest;
//		if(num1>num2) {
//			greatest=num1;
//			if(num1>num3) {
//				greatest=num1;
//			}
//			else {
//				greatest=num3;
//			}
//		}
//		else {
//			if(num2>num3) {
//				greatest=num2;
//			}
//			else {
//				greatest=num3;
//			}
//		}
//		System.out.println(greatest);
		
		
//		int num=6;
//		int fact=1;
//		for(int i=1;i<num;i++) {
//			fact=fact*i;
//		}
//		System.out.println(fact);
		
//		int num1=0;
//		int num2=1;
//		int total;
//		for(int i=1;i<7;i++) {
//			total=num1+num2;
//			num1=num2;
//			num2=total;
//			
//			System.out.println(total);
		
		
//		int num=15;
//		boolean prime=true;
//		for(int i=2;i<num;i++) {
//			if(num%i==0) {
//				prime=false;
//			}
//		}
//		System.out.println(prime);
//		
		
//		boolean prime=true;
//		for(int i=2;i<=100;i++) {
//			for(int j=2;j<i;j++) {
//				if(i%j==0) {
//					prime=false;
//				}
//			}
//			if(prime==true) {
//				System.out.println(i);
//			}
//			else {
//				prime=true;
//			}
//		}
		
//		int num=56456;
//		int rev=0;
//		int rem;
//		while(num!=0) {
//			rem=num%10;
//			rev=rev*10+rem;
//			num=num/10;
//		}
//		System.out.println(rev);
		
		
		int num=153;
		int arm=0;
		int rem;
		while(num!=0) {
			rem=num%10;
			arm=rem*rem*rem;
			num=num/10;
		}
		System.out.println(arm);
		
	}

}
