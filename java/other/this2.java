class this2
{
	void show()
	{
		System.out.println("this is show method");
	}
	void mark()
	{
		this.show();
		System.out.println("this is mark");
	}
	void display()
	{	
		mark();
		System.out.println("this is display method");
	}
	public static void main(String[] args)
	{
		this2 t = new this2();
		t.display();
	}
}