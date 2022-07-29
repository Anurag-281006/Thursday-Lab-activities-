//write a program to diaplay the cube of the number upon given integer

package proj2;
import java.util.Scanner;

public class TestData2 {
	public static void main(String args[])
	{
		int i,n;
		
		System.out.println("Input number :");
		Scanner in= new Scanner (System.in);
		n=in.nextInt();
		
		for (i=1;i<=n;i++)
		{
			System.out.println("number is :"+i);
			System.out.println("Number of cube is :"+(i*i*i));
		}
	
	}
}
