package arrayPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		int [] num= {23,43,2,422,32,2,432,57};
//		int min=num[1];
//		for(int i=0;i<num.length;i++) {
//			if(min>num[i]) {
//				min=num[i];
//			}
//		}
//		System.out.println(min);
		
//		int [] num= {34,23,45,23,45,233,45,23,45,23};
//		int temp=0;
//		for(int i=0;i<num.length;i++) {
//			for(int j=i+1;j<num.length;j++) {
//				if(num[j]<num[i]) {
//					temp=num[i];
//					num[i]=num[j];
//					num[j]=temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(num));
		
//		int [] arr= {23,3,45,55,34,23,5,45,4,65};
//		int [] arr2= {45,67,45,67,78,6,45,5,45,432};
//		int [] arr3= {};
//		arr3=arr;
//		arr=arr2;
//		arr2=arr3;
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(arr2));
		
		
//		int [] arr= {34,45,34,323,45};
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					System.out.println(arr[j]);
//				}
//			}
//		}
		
//		String [] arr= {"abhi","ajay","amit","alok","shivam"};
//		String temp="";
//		for(int i=0;i<arr.length/2;i++) {
//			temp=arr[arr.length-1-i];
//			arr[arr.length-1-i]=arr[i];
//			arr[i]=temp;
//		}
//		System.out.println(Arrays.toString(arr));
		
		
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(34);
		l.add(54);
		l.add(23);
		l.add(12);
		l.add(89);
		l.sort(null);
		System.out.println(l);
		
	}

}
