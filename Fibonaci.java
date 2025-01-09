package SS;

import java.util.Scanner;

public class Fibonaci {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int a=0,b=1,c=0;
	//System.out.print(a+" ");
	//System.out.print(b+" ");
	for(int i=2;i<n;i++) {
	  c=a+b;
	  a=b;
	  b=c;
	  System.out.print(c+" " );
	}
	
}
}
