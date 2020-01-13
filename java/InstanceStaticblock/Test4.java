class InstanceBlock
{
    int method() { 
 	 System.out.println("Method invoked") ; 
	 return 10;  }

  {
   System.out.println("First instance block  ");
  }

 int m = method();

  {
   System.out.println("Second instance block "+m);
  }
InstanceBlock() {
   System.out.println("Cons");
                  }
}


class Test4
{
 public static void main(String[] args)
 {
  InstanceBlock c = new InstanceBlock();
 }

}