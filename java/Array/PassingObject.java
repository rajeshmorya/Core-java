class PassingObject
{
	int length;	
	int width;

	PassingObject(int l,int b)
	{			
		length = l;
		width = b;
	}

	void area(PassingObject p)
	{
		int areaofrectangle = r1.length*r1.width;
		System.out.println("area of rectangle is"+areaofrectangle);	
	}
}
class RectangleDemo
{
	public static void main(String[] args)
	{
		PassingObject r1 = new PassingObject(10,20);
		r1.RectangleDemo(r1);
	}
}