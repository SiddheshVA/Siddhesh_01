package loops;

import java.util.Scanner;

public class pattern12 {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		System.out.print("the number is :");
		int n=scanner.nextInt();
		
		for(int j=0;j<n;j++)
		{
			for(int i=0;i<n;i++)
			{
				if(i==0 || i==n-1 ||i==j && j<=(n-1)/2 || i+j==n-1 && j<=(n-1)/2)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
