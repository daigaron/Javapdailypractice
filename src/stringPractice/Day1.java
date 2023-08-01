package stringPractice;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String name="Abhishek Yadav";
//		String rev="";
//		
//		for(int i=0;i<name.length();i++) {
//			rev=name.charAt(i)+rev;
//			
//		}
//		System.out.println(rev);
		
//		String name="Abhishek Yadav";
//		String rev="";
//		String [] arr=name.split(" ");
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length();j++) {
//				rev=arr[i].charAt(j)+rev;
//			
//			}
//			arr[i]=rev;
//			rev="";
//		}
//		
//		for(int k=0;k<arr.length;k++) {
//			rev=rev.concat(arr[k]).concat(" ");
//		}
//		System.out.println(rev);
		
		String name=" sbskfb skdjkd abhi what happen ";
		name=name.replace(" ", "");
		System.out.println(name);
	}

}
