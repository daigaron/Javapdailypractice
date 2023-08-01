package stringPractice;

import java.util.HashMap;

public class Day11 {
	
	//==========================04/06/23

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		String name="  s   d  g df ";
//		name=name.replace(" ","");
//		System.out.println(name);
		
//		String name="welcome to automation testing";
//		String rev="";
//		for(int i=0;i<name.length();i++){
//		rev=name.charAt(i)+rev;
//		}
//		System.out.println(rev);
		
//		String name="welcome to automation testing";
//		String [] arr=name.split(" ");
//		String rev="";
//		String nameRev="";
//		for(int i=0;i<arr.length;i++){
//		for(int j=0;j<arr[i].length();j++){
//		rev=arr[i].charAt(j)+rev;
//		}
//		nameRev=nameRev.concat(rev).concat(" ");
//		rev="";
//		}
//		System.out.println(nameRev);
		
//		String name="welcome to automation testing";
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
		
//		String name="apple is apple banana is banana";
//		String [] arr=name.split(" ");
//		for(int i=0;i<arr.length;i++){
//		for(int j=i+1;j<arr.length;j++){
//		if(arr[i].equals(arr[j])){
//		System.out.println(arr[i]);
//		}
//		}
//		}
		
		String name="apple is apple banana is banana";
		String arr []=name.split(" ");
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		for(int i=0;i<arr.length;i++){
		if(hm.containsKey(arr[i])){
		hm.replace(arr[i],hm.get(arr[i])+1);
		}
		else{
		hm.put(arr[i],1);
		}
		}
		System.out.println(hm);


	}

}
