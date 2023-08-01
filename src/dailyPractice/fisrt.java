package dailyPractice;

import java.util.Arrays;
import java.util.HashMap;

public class fisrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n1 =34;
//		int n2=65;
//		int temp=0;
//		temp=n1;
//		n1=n2;
//		n2=temp;
//		System.out.println(n1);
//		System.out.println(n2);
//
//
//
//		int a=34;
//		int b=78;
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a);
//		System.out.println(b);
//
//
//
//		int n1=56;
//		int n2=78;
//		int n3=89;
//		int grt=0;
//		if(n1>n2){
//		grt=n1;
//		if(n1>n3){
//		grt=n1;
//		}
//		else{
//		grt=n3;
//		}
//		}
//		else{
//		if(n2>n3){
//		grt=n2;
//		}
//		else{
//		grt=n3;
//		}
//		}
//		System.out.println(grt);
//
//
//
//		int num=5;
//		int fact=1;
//		for(int i=1;i<=num;i++){
//		fact=fact*i;
//		}
//		System.out.println(fact);
//
//
//
//		int num=456;
//		int og=num;
//		int rem;
//		int rev=0;
//		while(num!=0){
//		rem=num%10;
//		rev=rev*10+rem;
//		num=num/10;
//		}
//		System.out.println(rev);
//		if(og==rev){
//		System.out.println("palindrome");
//		}
//		else{
//		System.out.println("not palindrome");
//		}
//
//
//		int n=153;
//		int og=n;
//		int rem;
//		int arm=0;
//		while(n!=0){
//		rem=n%10;
//		arm=arm+rem*rem*rem;
//		n=n/10;
//		}
//		if(arm==og){
//		System.out.println("armstrong");
//		}
//		else{
//		System.out.println("not armstrong");
//		}
//
//
//
//		int num=1;
//		boolean prime=true;
//		if(num==1){
//		System.out.println("niether prime nor composite");
//		}
//		else{
//		for(int i=2;i<num;i++){
//		if(num%i==0){
//		prime=false;
//		}
//		}
//		System.out.println(prime);
//		}
//
//
//
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
//
//
//
//
//
//		for(int i=1;i<=5;i++){
//		for(int j=i;j<=5;j++){
//		System.out.print(j);
//		}
//		System.out.println();
//		}
//
//
//
//
//
//		for(int i=1;i<=5;i++){
//		for(int j=1;j<=i;j++){
//		System.out.print(j);
//		}
//		System.out.println();
//		}
//
//
//
//
//		for(int i=1;i<=5;i++){
//		for(int j=i;j<=5;j++){
//		System.out.print(" ");
//		}
//		for(int k=1;k<=i;k++){
//		System.out.print("* ");
//		}
//		System.out.println();
//		}
//
//
//
//
//
//		int [] arr={34,66,45,8,23,98};
//		int max=arr[1];
//		for(int i=0;i<arr.length;i++){
//		if(arr[i]>max){
//		max=arr[i];
//		}
//		}
//		System.out.println(max);
//
//
//
//
//		int [] arr={34,6,34,87,23,78,6};
//		for(int i=0;i<arr.length;i++){
//		for(int j=i+1;j<arr.length;j++){
//		if(arr[i]==arr[j]){
//		System.out.println(arr[i]);
//		}
//		}
//		}
//
//
//
//		int [] arr={34,6,78,34,2,67,90};
//		int tmp=0;
//		for(int i=0;i<arr.length/2;i++){
//		tmp=arr[i];
//		arr[i]=arr[arr.length-1-i];
//		arr[arr.length-1-i]=tmp;
//		}
//		System.out.println(Arrays.toString(arr));
//
//
//
//
//		int [] arr={54,342,44,21,66};
//		int tmp=0;
//		for(int i=0;i<arr.length;i++){
//		for(int j=i+1;j<arr.length;j++){
//		if(arr[i]>arr[j]){
//		tmp=arr[i];
//		arr[i]=arr[j];
//		arr[j]=tmp;
//		}
//		}
//		}
//		System.out.println(Arrays.toString(arr));
//
//
//
//
//		String name ="abh  i shek ";
//		name=name.replace(" ","");
//		System.out.println(name);
//
//
//		String name="abhishek";
//		String rev="";
//		for(int i=0;i<name.length();i++){
//		rev=name.charAt(i)+rev;
//		}
//		System.out.println(rev);
//
//
//
//		String name="apple is apple banana is banana";
//		String [] arr=name.split(" ");
//		String rev="";
//		String revName="";
//		for(int i=0;i<arr.length;i++){
//		for(int j=0;j<arr[i].length();j++){
//		rev=arr[i].charAt(j)+rev;
//		}
//		revName=revName.concat(rev).concat(" ");
//		rev="";
//		}
//		System.out.println(revName);
//
//
//
//		String name="apple is apple banana is banana";
//		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
//		for(int i=0;i<name.length();i++){
//		if(!hm.containsKey(i)){
//		hm.put(name.charAt(i),1);
//		}
//		else{
//		hm.replace(name.charAt(i),hm.get(name.charAt(i))+1);
//		}
//		}
//		System.out.println(hm);
	}

}
