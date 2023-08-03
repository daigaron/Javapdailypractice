package dailyPractice;

import java.util.Arrays;
import java.util.HashMap;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int n1=56;
//		int n2=67;
//		int temp;
//		temp=n1;
//		n1=n2;
//		n2=temp;
//		System.out.println(n1);
//		System.out.println(n2);
//
//
//
//
//
//		int n1=67;
//		int n2=34;
//		n1=n1+n2;
//		n2=n1-n2;
//		n1=n1-n2;
//		System.out.println(n1);
//		System.out.println(n2);
//
//
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
//
//
//		int a=34;
//		int b=56;
//		int c=78;
//		int grt;
//		if(a>b){
//		grt=a;
//		if(a>c){
//		grt=a;
//		}
//		else{
//		grt=c;
//		}
//		}
//		else{
//		if(b>c){
//		grt=b;
//		}
//		else{
//		grt=c;
//		}
//		}
//		System.out.println(grt);
//
//
//
//
//
//		int n=68;
//		int count=0;
//		for(int i=2;i<n;i++){
//		
//		if(n%i==0){
//		count++;
//		
//		}
//		}
//		if(count==0){
//		System.out.println("prime");
//		}
//		else{
//		System.out.println("not prime");
//		}
//
//
//
//
//		int count=0;
//		for(int i=2;i<=100;i++){
//		for(int j=2;j<i;j++){
//		if(i%j==0){
//		count++;
//		}
//		}
//		if(count==0){
//		System.out.println(i);
//		}
//		else{
//		count=0;
//		}
//		}
//
//
//
//
//
//		int n=454;
//		int og=n;
//		int rem;
//		int rev=0;
//		while(n!=0){
//		rem=n%10;
//		rev=rev*10+rem;
//		n=n/10;
//		}
//		System.out.println(rev);
//		if(rev==og){
//		System.out.println("palindrome");
//		}
//		else{
//		System.out.println("not palindrome");
//		}
//
//
//
//
//
//		for(int i=1;i<=5;i++){
//		for(int j=1;j<=i;j++){
//		System.out.print("*");
//		}
//		System.out.println();
//		}
//
//
//
//
//
//		for(int i=1;i<=5;i++){
//		for(int j=i;j<=5;j++){
//		System.out.print(" ");
//		}
//		for(int k=1;k<=i;k++){
//		System.out.print("*");
//		}
//		System.out.println();
//		}
//
//
//
//
//
//		int n1=0;
//		int n2=1;
//		for(int i=1;i<=6;i++){
//		int total=n1+n2;
//		n1=n2;
//		n2=total;
//		System.out.println(n1);
//		}
//
//
//
//
//
//		int [] num={23,45,5,32,65,23,56};
//		for(int i=0;i<num.length;i++){
//		for(int j=i+1;j<num.length;j++){
//		if(num[i]==num[j]){
//		System.out.println(num[i]);
//		}
//		}
//		}
//
//
//
//
//
//		int [] num={23,45,5,32,65,23,56};
//		for(int i=0;i<num.length/2;i++){
//		int temp=num[i];
//		num[i]=num[num.length-1-i];
//		num[num.length-1-i]=temp;
//		}
//		System.out.println(Arrays.toString(num));

//
//
//
//
//		int [] n={34,34,7,23,7,42,67,645,354};
//		int max=n[1];
//		for(int i=0;i<n.length;i++){
//		if(max<n[i]){
//		max=n[i];
//		}
//		}
//		System.out.println(max);
//
//
//
//
//
//		int [] n={34,34,7,23,7,42,67,645,354};
//		for(int i=0;i<n.length;i++){
//		for(int j=i+1;j<n.length;j++){
//		if(n[i]>n[j]){
//		int temp=n[i];
//		n[i]=n[j];
//		n[j]=temp;
//		}
//		}
//		}
//		System.out.println(Arrays.toString(n));
//
//
//
//
//
//		String name="Abh  ishek Yadav";
//		name=name.replace(" ","");
//		System.out.println(name);
//
//
//
//
//
//		String name="Abhishek Yadav";
//		name=name.toLowerCase();
//		String rev="";
//		for(int i=0;i<name.length();i++){
//		
//		rev=name.charAt(i)+rev;
//		}
//		System.out.println(rev);
//
//
//
//
//
//		String sent="apple is apple banana is banana";
//		String [] ar=sent.split(" ");
//		String rev="";
//		String revSent="";
//		for(int i=0;i<ar.length;i++){
//		for(int j=0;j<ar[i].length();j++){
//		
//		rev=ar[i].charAt(j)+rev;
//		}
//		revSent=revSent.concat(rev).concat(" ");
//		rev="";
//		}
//		System.out.println(revSent);
//
//
//
//
//
//		String name="apple is apple banana is banana";
//		String [] arr=name.split(" ");
//		for(int i=0;i<arr.length;i++){
//		for(int j=i+1;j<arr.length;j++){
//		if(arr[i].equals(arr[j])){
//		System.out.println(arr[i]);
//		}
//		}
//		}
//
//
//
//
//
//		String name="hello world";
//		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
//		for(int i=0;i<name.length();i++){
//		if(hm.containsKey(name.charAt(i))){
//		hm.replace(name.charAt(i),hm.get(name.charAt(i))+1);
//		}
//		else{
//		hm.put(name.charAt(i),1);
//		}
//		}
//		System.out.println(hm);
//
//
//
//
//
//		String name="apple is apple banana is banana";
//		String [] arr=name.split(" ");
//		HashMap<String,Integer> hm=new HashMap<String,Integer>();
//		for(int i=0;i<arr.length;i++){
//		if(hm.containsKey(arr[i])){
//		hm.replace(arr[i],hm.get(arr[i])+1);
//		}
//		else{
//		hm.put(arr[i],1);
//		}
//		}
//		System.out.println(hm);




		
	}

}
