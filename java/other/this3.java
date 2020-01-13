class this3
{
	void m(this3 obj)
	{
		System.out.println(obj);
		System.out.println("this is first methods");
	}
	void p()
	{	
		m(this);
		System.out.println("this is second methods");
	}
	public static void main(String[] args)
	{
		this3 t3 = new this3();
		t3.p();	
	}
}