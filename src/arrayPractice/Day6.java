package arrayPractice;

import java.util.Arrays;

public class Day6 {

	public static void main(String [] args){
//		int [] arr={43,45,5,67,78,34,7,89,677,45};
//		for(int i=0;i<arr.length;i++){
//		for(int j=i+1;j<arr.length;j++){
//		if(arr[i]==arr[j]){
//		System.out.println(arr[i]);
//		}
//		}
//		}
		
//		int [] arr={45,56,67,34,23};
//		int temp=0;
//		for(int i=0;i<arr.length/2;i++){
//		temp=arr[i];
//		arr[i]=arr[arr.length-i-1];
//		arr[arr.length-i-1]=temp;
//		}
//		System.out.println(Arrays.toString(arr));
		
//		int [] arr={34,34,56,67,7};
//		int [] arr2={78,78,67,6};
//		int [] temp ={};
//		temp=arr;
//		arr=arr2;
//		arr2=temp;
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(arr2));
		
//		int [] arr={34,67,78,89,5,67,89};
//		int max=arr[1];
//		for(int i=0;i<arr.length;i++){
//		if(arr[i]>max){
//		max=arr[i];
//		}
//		}
//		System.out.println(max);
		
//		int [] arr={34,56,5,3,23,56,23,45,23,2};
//		int temp=0;
//		for(int i=0;i<arr.length;i++){
//		for(int j=i+1;j<arr.length;j++){
//		if(arr[j]<arr[i]){
//		temp=arr[i];
//		arr[i]=arr[j];
//		arr[j]=temp;
//		}
//		}
//		}
//		System.out.println(Arrays.toString(arr));
		
		int [] arr={2,4,5,3,2,5};
		int total=0;
		for(int i=0;i<arr.length;i++){
		total=total+arr[i];
		}
		int avg=total/arr.length;
		System.out.println(avg);


		}
}
