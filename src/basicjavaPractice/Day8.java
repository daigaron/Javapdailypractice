package basicjavaPractice;

public class Day8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a=56;
//		int b=78;
//		int temp=0;
//		temp=a;
//		a=b;
//		b=temp;
//		System.out.println(a);
//		System.out.println(b);
//
//		int n1=78;
//		int n2=89;
//		n1=n1+n2;
//		n2=n1-n2;
//		n1=n1-n2;
//		System.out.println(n1);
//		System.out.println(n2);
		
//		int num=5;
//		int fact=1;
//		for(int i=1;i<=num;i++){
//		fact=fact*i;
//		}
//		System.out.println(fact);
		
//		int a=567;
//		int b=676;
//		int c=78;
//		int greater=0;
//		if(a>b){
//		greater=a;
//		if(a>c){
//		greater=a;
//		}
//		else{
//		greater=c;
//		}
//		}
//		else{
//		if(b>c){
//		greater=b;
//		}
//		else{
//		greater=c;
//		}
//		}
//		System.out.println(greater);
		
//		int num=15;
//		boolean prime=true;
//		for(int i=2;i<num;i++){
//		if(num%i==0){
//		prime=false;
//		}
//		}
//		System.out.println(prime);
		
//		boolean prime=true;
//		for(int i=2;i<=100;i++){
//		for(int j=2;j<i;j++){
//		if(i%j==0){
//		prime=false;
//		}
//		}
//		if(prime==true){
//		System.out.println(i);
//		}
//		else{
//		prime=true;
//		}
//		}
		
//		int num=545;
//		int og=num;
//		int rem;
//		int rev=0;
//		while(num!=0){
//		rem=num%10;
//		rev=rev*10+rem;
//		num=num/10;
//		}
//		System.out.println(rev);
//		if(rev==og) {
//			System.out.println("palindrome");
//		}
//		else {
//			System.out.println("Not palindrome");
//		}
		
		
//		int num=153;
//		int og=num;
//		int rem;
//		int arm=0;
//		while(num!=0){
//		rem=num%10;
//		arm=arm+rem*rem*rem;
//		num=num/10;
//		}
//		if(arm==og){
//		System.out.println("armstrong");
//		}
//		else{
//		System.out.println("Not armstrong");
//		}
		
//		int n1=0;
//		int n2=1;
//		for(int i=1;i<=7;i++){
//		int total=n1+n2;
//		n1=n2;
//		n2=total;
//		System.out.println(total);
//		}
		
//		for(int i=1;i<=5;i++){
//			for(int j=1;j<=i;j++){
//			System.out.print("*");
//			}
//			System.out.println();
//			}
		for(int i=1;i<=5;i++){
			for(int j=i;j<=5;j++){
			System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
			System.out.print("* ");
			}
			System.out.println();
			}
		
	}

}
