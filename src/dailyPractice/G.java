package dailyPractice;

import java.util.Arrays;
import java.util.HashMap;

public class G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=45;
//		int b=56;
//		int temp=0;
//		temp=a;
//		a=b;
//		b=temp;
//		System.out.println(a);
//		System.out.println(b);
//
//
//
//
//		int a=78;
//		int b=34;
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a);
//		System.out.println(b);
//
//
//
//
//		int a=6;
//		int b=8;
//		int c=9;
//		int grt=0;
//		if(a>b){
//		grt=a;
//		if(a>c) {
//			grt=a;
//		}
//		else {
//			grt=c;
//		}
//		}
//		
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
//		int n=43;
//		int count=0;
//		for(int i=2;i<n;i++){
//		if(n==1){
//		System.out.println("niether prime nor composite");
//		break;
//		}
//		else{
//		if(n%i==0){
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
//		int n=456;
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
//		int a=45;
//		int b=78;
//		System.out.println(a>b?"A is greater":"B is greater");
//
//
//
//
//		int fact=1;
//		for(int i=1;i<=5;i++){
//		fact=fact*i;
//		}
//		System.out.println(fact);
//
//
//
//
//		int num=153;
//		int og=num;
//		int rem;
//		int arm=0;
//		while(num!=0){
//		rem=num%10;
//		arm=arm+rem*rem*rem;
//		num=num/10;
//		}
//		System.out.println(arm);
//		if(arm==og){
//		System.out.println("arm");
//		}
//		else{
//		System.out.println("not arm");
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
//		int n=1;
//		for(int i=1;i<=5;i++){
//		for(int j=1;j<=i;j++){
//		System.out.print(n);
//		n++;
//		}
//		System.out.println();
//		}
//
//
//
//
//		int a=0;
//		int b=1;
//		for(int i=1;i<=6;i++){
//		int total=a+b;
//		a=b;
//		b=total;
//		System.out.println(a);
//		}
//
//
//
//
//		int [] arr={34,56,3,6,4,67,56};
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
//		int [] arr={3,56,6,34,56,23,34};
//		for(int i=0;i<arr.length/2;i++){
//		int temp;
//		temp=arr[i];
//		arr[i]=arr[arr.length-1-i];
//		arr[arr.length-i-1]=temp;
//		}
//		System.out.println(Arrays.toString(arr));
//
//
//
//
//		int [] arr={23,35,56,3,23,45};
//		int min=arr[1];
//		int max=arr[1];
//		for(int i=0;i<arr.length;i++){
//		if(min>arr[i]){
//		min=arr[i];
//		}
//		if(max<arr[i]){
//		max=arr[i];
//		}
//		}
//		System.out.println(min);
//		System.out.println(max);
//
//
//
//
//		int [] arr={23,56,34,23,4,67};
//		for(int i=0;i<arr.length;i++){
//		for(int j=i+1;j<arr.length;j++){
//		if(arr[i]>arr[j]){
//		int temp=arr[i];
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
//		String name="Abhishek Yadav";
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
//
//		int upper=0;
//		int lower=0;
//		String name="Abhishek Yadav";
//		for(int i=0;i<name.length();i++){
//		if(Character.isUpperCase(name.charAt(i))){
//		upper++;
//		}
//		if(Character.isLowerCase(name.charAt(i))){
//		lower++;
//		}
//		}
//		System.out.println(upper);
//		System.out.println(lower);
//
//
//
//
//		String name="Abhishek Yadav";
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
