package arrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// ================================28/05/2023
		
//		int [] arr= {34,56,6,78,5,34,23,5,45};
//		int max=arr[0];
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//		}
//		System.out.println(max);
		
//		int [] arr= {34,56,6,78,5,34,23,5,45};
		
//		int temp;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]<arr[j]) {
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
//		int [] arr= {34,56,6,78,5,34,23,5,45};
//		int temp;
//		for(int i=0;i<arr.length/2;i++) {
//			temp=arr[i];
//			arr[i]=arr[arr.length-1-i];
//			arr[arr.length-i-1]=temp;
//		}
//		System.out.println(Arrays.toString(arr));
		
//		int [] arr= {34,56,6,78,5,34,23,5,45};
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					System.out.println(arr[i]);
//				}
//			}
//		}
		
		int [] arr= {34,56,6,78,5,34,23,5,45};
		int [] arr2= {34,545,67,67,45,56};
		int [] temp= {};
		temp=arr;
		arr=arr2;
		arr2=temp;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}

}
