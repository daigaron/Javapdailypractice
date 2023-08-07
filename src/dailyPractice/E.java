package dailyPractice;

import java.util.Arrays;
import java.util.HashMap;

public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		int num=89;
//		int num2=45;
//		int temp;
//		temp=num;
//		num=num2;
//		num2=temp;
//		System.out.println(num);
//		System.out.println(num2);
//
//
//
//
//
//
//
//
//		int a=34;
//		int b=67;
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
//
//		int num=56;
//		int count=0;
//		if(num==1){
//		System.out.println("niether prime not composite");
//		}
//		else{
//		for(int i=2;i<num;i++){
//		if(num%i==0){
//		count++;
//		}
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
//		if(rev==og){
//		System.out.println("palindrome");
//		}
//		else{
//		System.out.println("Not palindrome");
//		}
//
//
//
//
//
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
//		System.out.println(arm);
//		if(og==arm){
//		System.out.println("is arm");
//		}
//		else{
//		System.out.println("Not arm");
//		}
//
//
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
//
//
//		for(int i=1;i<=4;i++){
//		for(int j=1;j<=6;j++){
//		System.out.print("*");
//		}
//		System.out.println();
//
//		}
//
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
//
//
//		int [] arr={3,45,67,8,45,3,23};
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
//
//
//		

//
//
//
//
//
//
//
//		int [] arr={3,45,67,8,45,3,23};
//		int max=arr[1];
//		int min=arr[1];
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
//
//
//
//		int [] arr={3,45,67,8,45,3,23};
//		for(int i=0;i<arr.length;i++){
//		for(int j=i+1;j<arr.length;j++){
//		if(arr[j]<arr[i]){
//		int temp;
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
//
//
//		int [] arr={3,45,67,8,45,3,23};
//		for(int i=0;i<arr.length;i++){
//		for(int j=i+1;j<arr.length;j++){
//		if(arr[j]>arr[i]){
//		int temp;
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
//
//
//		String name="abhishek yadav";
//		name=name.replace(" ","");
//		System.out.println(name);
//
//
//
//
//
//
//		String name="Abhishek";
//		String rev="";
//		for(int i=0;i<name.length();i++){
//		rev=name.charAt(i)+rev;
//		}
//		System.out.println(rev);
//
//
//
//
//
//
//		String name="Abhishek Yadav";
//		int small_a='a';
//		int small_z='z';
//		int caps_A='A';
//		int caps_Z='Z';
//		int s_count=0;
//		int c_count=0;
//
//		for(int i=0;i<name.length();i++){
//		int temp=name.charAt(i);
//		if(temp>=small_a && temp<=small_z){
//		s_count++;
//		}
//		if(temp>=caps_A && temp<=caps_Z){
//		c_count++;
//		}
//		}
//		System.out.println(s_count);
//		System.out.println(c_count);
//
//
//
//
//
//
//		String name="apple is apple";
//		String [] arr=name.split(" ");
//		String revName="";
//		for(int i=0;i<arr.length;i++){
//		String rev="";
//		for(int j=0;j<arr[i].length();j++){
//		rev=arr[i].charAt(j)+rev;
//		}
//		revName=revName.concat(rev).concat(" ");
//		rev="";
//
//		}
//		System.out.println(revName);
//
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
//
//
//		String name="apple is apple banana is  banana";
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

		
//		int a=5;
//		int b=2;
//		System.out.println(a<b?a*a:b*b);



	}

}
