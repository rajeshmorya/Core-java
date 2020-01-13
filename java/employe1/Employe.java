class Employe
{
	int sub1,sub2,sub3,sub4,sub5;
	int sno;
	String name;
	Employe(int s1,int s2,int s3,int s4,int s5,int sno,String name1)
	{

		sub1 = s1;
		sub2 = s2;
		sub3 = s3;
		sub4 = s4;
		sub5 = s5;
		sno = sno;
		name = name1;
	}

	float result()
	{
		float per = (float)(sub1+sub2+sub3+sub4+sub5)/5;
		return per;	
	}
	void display()
	{
		System.out.println("the serial no. is" +sno);
		System.out.println("the name no. is" +name);
	}

}