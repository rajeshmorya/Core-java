class Retrun_Array
{
	static int[] Arraylist()
	{
		int[] arr = {10,50,30,60};
		System.out.println("the array are");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);	
		}
		return arr;
	}
	public static void main(String[] args)
	{
		Retrun_Array r = new Retrun_Array();
		int[] a = r.Arraylist();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}	
	}
}