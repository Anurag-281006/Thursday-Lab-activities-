import java.util.Scanner;
public class SwapNumbers{
	int a,b;
	public void swapNum(SwapNumbers stn){
		int temp;
		temp=stn.a;
		stn.a=stn.b;
		stn.b=temp;
	}
	public static void main(String args[]){
		SwapNumbers sw=new SwapNumbers();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number:");
		sw.a=sc.nextInt();
		System.out.println("enter the second number:");
		sn.b=sc.nextInt();
		sw.swapNum(s);
		System.out.println("after swapping:a="+sw.a+"b="+sw.b);
	}
}	