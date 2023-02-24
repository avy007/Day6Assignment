package Day6Assingment;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		 int n,count=0;
		System.out.println("enter no");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		
		for(int i=1; i<=n;i++) {
			
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("no is perfect no");
			
		}else {
			System.out.println("no is not perfect no");
		}
		
		

	}

}
