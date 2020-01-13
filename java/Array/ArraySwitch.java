import java.util.Scanner;
class ArraySwitch
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		System.out.println("1. Binary converstion 2. octal converstion 3.Hexadecimal converstion");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1: System.out.println("the binary converstion is");
			conv(n,2);
			break;
		case 2: System.out.println("the octal converstion is");
			conv(n,8);
			break;
		case 3: System.out.println("the hexadecimal converstion is");
			conv(n,16);
			break;
		}	

	}
	static void conv(int num,int b)
	{
		int i=0, j ,rem; 
		int[] arr = new int[20]; 
		while(num>0) 
		{ 
			rem=num%b; 
			num/=b; 
			if(rem>9&&rem<16) 
				arr[i++]=rem-10+'A' ; 
			else 
				arr[i++]=rem+'0' ;
		}
		for(j=i-1;j>=0;j--) 
		System.out. printf( "%c", arr[j]);

	}
	
}