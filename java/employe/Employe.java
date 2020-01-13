import java.util.Scanner;
class Employe
{
	int sub1,sub2,sub3,sub4,sub5;
	int sno;
	String name;
	
	void get_employe_data()
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the subject marks");
		sub1 = sc.nextInt();
		sub2 = sc.nextInt();
		sub3 = sc.nextInt();
		sub4 = sc.nextInt();
		sub5 = sc.nextInt();
		System.out.println("enter the serial no");
		sno = sc.nextInt();
		System.out.println("enter the name");
		name = sc.next();
	}
	float result()
	{
		float per = (float)(sub1+sub2+sub3+sub4+sub5)/5;
		return per;	
	}
	void display()
	{
		System.out.println("the serial no. is" +sno);
		System.out.println("the name no. is" +name);
	}
}