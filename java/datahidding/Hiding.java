class datahidding
{
	private int empno;
	private String empname;
	private double empsalary;
	public datahidding(int empno,String empname,double empsalary)
	{
		this.empno = empno;
		this.empname = empname;		
		this.empsalary = empsalary;
	}
	public void setempno(int empno)
	{
		this.empno = empno;
	}
	public void setempname(String empname)
	{
		this.empname = empname;	
	}
	public void setempsalary(double empsalary)
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
		datahidding d = new datahidding(100,"xx",20.5);
		System.out.println(d.getempno());
		//d.setempno(10);
		//d.setempname("rajesh");
		//d.setempsalary(300.5);
		//System.out.println(d.getempno());
		//System.out.println(d.getempname());
		//System.out.println(d.getempsalary());	
	}
}