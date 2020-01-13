import java.util.Scanner;
class Variable1
{
	void sum(int... a)
	{
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}
	public static void main(String[] args)
	{
		Variable1 v = new Variable1();
		v.sum(10);
		v.sum(10,20);
		v.sum(10,20,30);
		v.sum(10,20,30,40);
	}
}