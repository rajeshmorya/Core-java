import java.util.ArrayList;
class M
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(9);
		list.add(0);
		list.add(90);
		list.add(19);
		list.add(81);
		list.add(80);
		list.add(18);
		list.add(83);
		System.out.println(list);
		list.set(2,"abc");
		System.out.println(list);
		System.out.println(list.contains(80));
		System.out.println(list.contains(89));
	}
}