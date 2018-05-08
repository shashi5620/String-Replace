package task1;

import java.util.Scanner;

public class StringReplace {

	 public static void main(String[] args) {
	       // String oldStr = "Hello, this is the string from which a substring will be deleted";
	        //String delStr = "substring a is be";
	        Scanner sc=new Scanner(System.in);
	        String oldStr=new String();
	        String delStr=new String();
	        String newStr;
	        System.out.println("Please enter main String:");
	        oldStr=sc.nextLine();
	        System.out.println("Please enter substring String to Delete:");
	        delStr=sc.nextLine();
	        
           newStr=replacestring(oldStr,delStr);
	       // newStr = oldStr.replace(delStr, "");
	        
            System.out.println(oldStr);
            System.out.println(newStr);
            sc.close();
	        
	 }

	private static String replacestring(String oldStr, String newStr) {
		
		String Str1=oldStr;
		String[] Str2=newStr.split(" ");
		//System.out.println(Str2.length);
		for(String Str:Str2) {
			//System.out.println(Str);
		Str1=Str1.replaceAll("\\b"+Str+"\\b", "");
		//Str1=Str1.format(Str1, Str);
		
		}
        return Str1;
	}
}
