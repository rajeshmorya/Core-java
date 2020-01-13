class datahidding
{
	private int empno;
	private String empname;
	private double empsalary;
	
	public static void setempno(int empno)
	{
		this.empno = empno;
	}
	public static void setempname(String empname)
	{
		this.empname = empname	
	}
	public static void setempsalary(double empsalary)
	{
		this.empsalary = empsalary;
	}
	public int getempno()
	{
		return empno;
	}	
	public String getempname()
	{
		return empname;
	}
	public double getempsalary()
	{
		return empsalary;
	}

}
class Hiding
{
	public static void main(String[] args)
	{
		datahidding d = new datahidding();
		d.setempno(10);
		d.getempno();	
	}
}