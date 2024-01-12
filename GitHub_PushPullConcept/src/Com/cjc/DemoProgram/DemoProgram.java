package Com.cjc.DemoProgram;

public class DemoProgram 
{
	
	public void m1()
	{
		System.out.println("M1----A");
	}
	public int m2( int a,int b)
	{
		int c=a+b;
		return  c;
	}

	public void m3()
       {
	    System.out.println("New Method of--m3");   
       }
		
	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		DemoProgram d=new DemoProgram();
		d.m1();
		int c=d.m2(90, 120);
		System.out.println(c);
		d.m3();
		
		
	}

}
