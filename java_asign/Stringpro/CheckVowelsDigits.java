import java.util.Scanner;
class CheckVowelsDigits
{
	public static void main(String[] args)
	{
		int count=0;int count1 =0,Totalcount=0;
		System.out.println("enter the string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='A' || s.charAt(i)=='e' ||  s.charAt(i)=='E' ||  s.charAt(i)=='i' ||  s.charAt(i)=='I' ||  s.charAt(i)=='o' || s.charAt(i)=='O' || s.charAt(i)=='u' || s.charAt(i)=='U')
			{
				count++;	
			}
			
			if(s.charAt(i)=='0' || s.charAt(i)=='1' || s.charAt(i)=='2' ||  s.charAt(i)=='3' ||  s.charAt(i)=='4' ||  s.charAt(i)=='5' ||  s.charAt(i)=='6' || s.charAt(i)=='7' || s.charAt(i)=='8' || s.charAt(i)=='9')
			{
				count1++;
	
			}
		Totalcount++;
		}

		double d = (count*100)/Totalcount;
		double d1 = (count1*100)/Totalcount;

		System.out.print(count+" ");
		//System.out.print(d);
		System.out.printf("%.2f",d);
		System.out.println("%");
		System.out.print(count1+" ");
		//System.out.print(d1);
		System.out.printf("%.2f", d1);
		System.out.println("%");
	}
}