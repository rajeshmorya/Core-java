import java.util.Scanner;
class ArrayOperation
{
	public static void main(String[] args)
	{
		int ar[];int choice = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		ar = new int[n];
		System.out.println("enter the array element");
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = sc.nextInt();
		}
		System.out.println("the array element are");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("the elements is"+ar[i]);
		}

		while(choice !=6 ){

		System.out.println("please enter the choice");
		System.out.println("1: sum of array element");
		System.out.println("2: minimum value of array element");
		System.out.println("3: maximum value of array element");
		System.out.println("4: search of array element");
		System.out.println("5: sort of array element");
		System.out.println("6: Exit");
		choice = sc.nextInt();
		
		switch (choice)
		{
			case 1:
				int sum = 0;
				for(int i=0;i<ar.length;i++)
				{
					sum = sum+ar[i];
				}
				System.out.println("the sum is"+sum);		
				break;
			case 2: 		
				int min = ar[0];
				for(int i=1;i<ar.length;i++)
				{
					if(min>ar[i])
					{
						min = ar[i];
						
					}
				}
				System.out.println("the minimum value is"+min);
				break;
			case 3: int max = ar[0];
				for(int i=1;i<ar.length;i++)
				{
					if(max<ar[i])
					{
						max = ar[i];
					}
				}
				System.out.println("the maximum value is"+max);
				break;
			case 4: boolean flag = true;
				System.out.println("enter the number you want to search in array");
					int s = sc.nextInt();
				for(int i=0;i<ar.length;i++)
				{
					if(ar[i] == s)
					{	
						flag = false;	
						
					}
				}
				if(flag)
				{
					System.out.println("the array element is not found");
					break;
				}else
				{
					System.out.println("found array element "+s);
					break;		
				} 
			case 5:	System.out.println("enter the choice for selection sort technique");
				System.out.println("1. selection sort");
				System.out.println("2. bubble sort");
				int choice1 = sc.nextInt();
				switch(choice1)
				{
				case 1: int temp;
				for(int i=0;i<ar.length;i++)
				{
					for(int j=i+1;j<ar.length;j++)
					{
						if(ar[i]>ar[j])
						{
							temp = ar[i];
							ar[i] = ar[j];	
							ar[j] = temp;
						}
					}
				}
				System.out.println("the sorted array is");
				for(int i=0;i<ar.length;i++)
				{
					System.out.println(ar[i]);
				}
				break;
				case 2:
					int temp1;
				for(int i=0;i<ar.length;i++)
				{
					for(int j=0;j<ar.length-1-i;j++)
					{
						if(ar[j]>ar[j+1])
						{
							temp1 = ar[j];
							ar[j] = ar[j+1];
							ar[j+1] = temp1;	
						}
					}
				}
				System.out.println("the sorted array is as");
				for(int i=0;i<ar.length;i++)
				{
					System.out.println(ar[i]);
				}
				
				}
				break;
				
			//default: System.out.println("ente the choice form 1 to 5 for continue, enter the choice 6 for exit");
			}
				
		}

	}
}