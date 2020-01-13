class Methods5
{ 
	static boolean isPrime (int n) 
	{ 
		int i; boolean flag=true; 
		for (i=2; i<=Math.sqrt (n) ;i++) 
		{ 
			if(n%i==0) 
			{ 
				flag=false; 
				break; 
			} 
			
		}
		return flag; 
	} 
// isPrime 
public static void main (String[] args) 
	{ 
		int i=3,j; 
		while(i<500) 
		{ 	
			j =i; 
			i=i+2; 
			if(isPrime(j) && isPrime(i))
			System.out. printf ("%5d %5d\n", j, i);
		} 
	} //main 
} //class