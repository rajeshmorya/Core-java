import java.util.Scanner;
class leapyear
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year");
		int n = sc.nextInt();
		if(n%400 == 0)
		System.out.println("this is leap year");
		else
		System.out.println("this is not leap year");
	}
}