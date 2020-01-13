interface rbi
{
	void Atm();
}
class Bank implements rbi
{
	public void Atm()
	{
		System.out.println("withdrawal");
		System.out.println("printing statment");
	}
	public static void main(String args[])
	{
		Bank obj = new Bank();
		obj.Atm();
 	}
}