package dailyPractice;

import java.util.Arrays;
import java.util.HashMap;

public class F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int n=45;
//		int n2=67;
//		int temp;
//		temp=n;
//		n=n2;
//		n2=temp;
//		System.out.println(n);
//		System.out.println(n2);
//
//
//
//
//
//
//		int a=4;
//		int b=7;
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a);
//		System.out.println(b);
//
//
//
//
//
//
//		int fact=1;
//		for(int i=1;i<=6;i++){
//		fact=fact*i;
//		}
//		System.out.println(fact);
//
//
//
//
//
//
//		int x=56;
//		int y=78;
//		int z=89;
//		int grt=0;
//		if(x>y){
//		grt=x;
//		if(x>z){
//		grt=x;
//		}
//		else{
//		grt=z;
//		}
//		}
//		else{
//		if(y>z){
//		grt=y;
//		}
//		else{
//		grt=z;
//		}
//		}
//		System.out.println(grt);
//
//
//
//
//
//
//		int n=53;
//		int count=0;
//		for(int i=2;i<n;i++){
//		if(n%i==0){
//		count++;
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
//
//		int n=353;
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
//		System.out.println("not palidrome");
//		}
//
//
//
//
//
//
//		int nm=153;
//		int og=nm;
//		int rem;
//		int arm=0;
//		while(nm!=0){
//		rem=nm%10;
//		arm=arm+rem*rem*rem;
//		nm=nm/10;
//		}
//		System.out.println(arm);
//		if(arm==og){
//		System.out.println("arm");
//		}
//		else{
//		System.out.println("Not arm");
//		}
//
//
//
//
//		for(int i=1;i<=4;i++){
//		for(int j=1;j<=6;j++){
//		System.out.print("*");
//		}
//		System.out.println();
//		}
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
//		int a=0;
//		int b=1;
//		for(int i=1;i<=7;i++){
//		int total=a+b;
//		a=b;
//		b=total;
//		System.out.println(a);
//		}
//
//
//
//
//		int [] arr={34,5,56,34,3,5};
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
//
//		int [] arr={32,4,56,6,34};
//		for(int i=0;i<arr.length/2;i++){
//		int temp=arr[i];
//		arr[i]=arr[arr.length-1-i];
//		arr[arr.length-1-i]=temp;
//		}
//		System.out.println(Arrays.toString(arr));

//
//
//
//		int [] arr={34,56,67,45,34,23};
//		int min=arr[1];
//		int max=arr[0];
//		for(int i=0;i<arr.length;i++){
//		if(arr[i]<min){
//		min=arr[i];
//		}
//		if(arr[i]>max){
//		max=arr[i];
//		}
//		}
//		System.out.println(min);
//		System.out.println(max);
//
//
//
//
//		int [] arr={34,6,78,45,234};
//		int temp;
//		for(int i=0;i<arr.length;i++){
//		for(int j=i+1;j<arr.length;j++){
//		if(arr[i]>arr[j]){
//		temp=arr[i];
//		arr[i]=arr[j];
//		arr[j]=temp;
//		}
//		}
//		}
//		System.out.println(Arrays.toString(arr));
//
//
//
//
//		String name="Abhishek Yadav";
//		name=name.replace(" ","");
//		System.out.println(name);
//
//
//
//
//		String name="Abhishek yadav";
//		String rev="";
//		for(int i=0;i<name.length();i++){
//		rev=name.charAt(i)+rev;
//		}
//		System.out.println(rev);
//
//
//
//
//		String name="Abhishek Yadav";
//		int lower=0;
//		int upper=0;
//		for(int i=0;i<name.length();i++){
//		if(Character.isLowerCase(name.charAt(i))){
//		lower++;
//		}
//		if(Character.isUpperCase(name.charAt(i))){
//		upper++;
//		}
//		}
//		System.out.println(lower);
//		System.out.println(upper);
//
//
//
//
//		String name="apple is apple banana is banana";
//		String revName="";
//		String rev="";
//		String [] arr=name.split(" ");
//		for(int i=0;i<arr.length;i++){
//		for(int j=0;j<arr[i].length();j++){
//		
//		rev=arr[i].charAt(j)+rev;
//		}
//		revName=revName.concat(rev).concat(" ");
//		rev="";
//		}
//		System.out.println(revName);
//
//
//
//
//		String name="apple is apple banana is banana";
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
//		String name="apple is apple banana is banana";
//		String [] arr=name.split(" ");
//		HashMap<String,Integer> hm= new HashMap<String,Integer>();
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
