public class Circle extends Shape
{
	private float radius;
	public Circle(float radius)
	{
		this.radius = radius;
	}
	public void setRadius(float radius)
	{
		this.radius = radius;
	}
	public float getRadius()
	{
		return radius;
	}
	public float diameter()
	{
		return 2*radius;
	}
	public float circumtence()
	{
		return 2*PI*radius;
	}
	public float area()
	{
		return PI*radius*radius;
	}

}

class Testcircle
{
	public static void main(String[] args)
	{
		Circle c = new Circle(2.0f);
		c.setBorderwidth(1);
		c.setColor("red");
		System.out.println("circle color:"+c.getColor());
		System.out.println("cicle Borderwidth :"+c.getBorderwidth());
		System.out.println("circle radius"+c.getRadius());
		System.out.println("cicle diameter"+c.diameter());
		System.out.println("circle circumtence"+c.circumtence());
		System.out.println("circle area"+c.area());

	}
}