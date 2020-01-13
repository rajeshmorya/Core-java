import java.util.Scanner;
class DecimalToBinary
{
	public static void main(String[] agrs)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int arr[] = new int[15];
		int i=0;
		while(n>0)
		{
			arr[i] = n%2;
			n = n/2;
			i++;
		}	
		for(int j=i-1;j>=0;j--)
		{	
			System.out.println(arr[j]);
		}
	}
}