package SS;

import java.util.Scanner;

public class ComparingStringd {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String str1 = scanner.nextLine();
	String str2 = scanner.nextLine();
	boolean areEqual = compareStrings(str1, str2);
	if (areEqual) {
	System.out .println("The strings are equal.");
	} else {
	System.out.println ("The strings are not equal.");
	}
}
public static boolean compareStrings(String str1, String str2) {
	char arr1[]=str1.toCharArray();
	char arr2[]=str2.toCharArray();
	int count=0;
	if(arr1.length!=arr2.length) {
		return false;
	}
	else {
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==arr2[i]  || arr1[i]+32==arr2[i]||arr1[i]-32==arr2[i]) {
			count++;
			}
		}
	}
	if(count<arr1.length)
	return false;
	else
		return true;
}
}
