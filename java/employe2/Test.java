import java.util.Scanner;
class Test
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 5 subject marks");
		int n = sc.nextInt();
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		System.out.println("enter the serial no");
		int sno = sc.nextInt();
		System.out.println("enter the name");
		String name = sc.next();

		Employe e = new Employe(n,n1,n2,n3,n4,sno,name);
		float p = e.result();
		System.out.println("the percentage is"+p);
		e.display();

	}
}