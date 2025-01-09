package SS;

import java.util.Scanner;

public class Frequency {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String to find frequency of the characters");
		String str1 = scanner.nextLine();
		String str=str1.toLowerCase();
		char[] arr=str.toCharArray();
	for(int i=97;i<=122;i++) {
		int count=0,j=0;
			for(j=0;j<arr.length;j++) {
				if( (char)i==arr[j]) {
					count++;
				}
			}
			if(count>=1)
			System.out.println("Character : "+(char)i+"  Frequency "+count);
		}
	}
}
