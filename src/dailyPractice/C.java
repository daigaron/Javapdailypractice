package dailyPractice;

import java.util.Arrays;
import java.util.HashMap;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String name="Apple is apple banana is banana";
//		String rev="";
//		for(int i=0;i<name.length();i++){
//		rev=name.charAt(i)+rev;
//		}
//		System.out.println(rev);
//
//
//
//
//		String name="apple is apple banana is banana";
//		String [] nr=name.split(" ");
//		
//		String rev="";
//		String nameRev="";
//		for(int i=0;i<nr.length;i++){
//		for(int j=0;j<nr[i].length();j++){
//		rev=nr[i].charAt(j)+rev;
//		}
//		nameRev=nameRev.concat(rev).concat(" ");
//		rev="";
//		}
//		System.out.println(nameRev);
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
//		String name="apple is apple banana is banana";
//		String [] arr=name.split(" ");
//		HashMap<String,Integer> hm=new HashMap<String,Integer>();
//		for(int i=0;i<arr.length;i++){
//		if(!hm.containsKey(arr[i])){
//		hm.put(arr[i],1);
//		}
//		else{
//		hm.replace(arr[i],hm.get(arr[i])+1);
//		}
//		for(int j=i+1;j<arr.length;j++){
//		if(arr[i]==arr[j]){
//		System.out.println(arr[i]);
//		}
//		}
//		}
//		System.out.println(hm);
//
//
//
//
//
//		int arr []={23,5,67,53,645,67,98};
//		for(int i=0;i<arr.length/2;i++){
//		int temp=arr[i];
//		arr[i]=arr[arr.length-1-i];
//		arr[arr.length-1-i]=temp;
//		}
//		System.out.println(Arrays.toString(arr));

//
//
//
//		int [] arr={34,45,34,765,744};
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
//		int [] arr={3,653,634,4,6,3,88};
//		int max=arr[0];
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
//
//		int [] arr={45,676,35,8,23};
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
//
//		int n1=45;
//		int n2=67;
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
//
//
//
//
//		int num=6;
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
//		int n1=0;
//		int n2=1;
//		for(int i=1;i<=7;i++){
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
//
//		int n=343;
//		int og=n;
//		int rem=0;
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
//		int n=153;
//		int og=n;
//		int arm=0;
//		int rem;
//		while(n!=0){
//		rem=n%10;
//		arm=arm+rem*rem*rem;
//		n=n/10;
//		}
//		System.out.println(arm);
//		if(arm==og){
//		System.out.println("armstrong");
//		}
//		else{
//		System.out.println("not armstrong");
//		}
//
//
//
//
//
//
//		int n=59;
//		int count=0;
//		for(int i=2;i<n;i++){
//		if(n%i==0){
//			count++;
//		}
//		}
//		if(count==0) {
//			System.out.println("prime");
//		}
//		else {
//			System.out.println("not prime");
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
//		for(int i=1;i<=5;i++){
//		for(int j=i;j<5;j++){
//		System.out.print(" ");
//		}
//		for(int k=1;k<=i;k++){
//		System.out.print("* ");
//		}
//		System.out.println();
//		}
		
	}

}
