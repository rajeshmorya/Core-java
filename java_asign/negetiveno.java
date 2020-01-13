import java.util.Scanner;
class negetiveno
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the no.");
		int n = sc.nextInt();
		if(n<0)
		System.out.println("number is negetive");
		else
		System.out.println("number is positive");
	}
}