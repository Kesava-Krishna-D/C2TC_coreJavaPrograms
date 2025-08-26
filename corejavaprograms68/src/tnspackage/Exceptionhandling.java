package tnspackage;

public class Exceptionhandling {

	public static void main(String[] args) {
		{
			try
			{
				int a[]=new int[5];
				a[0]=11;
				a[1]=12;
				System.out.println(a[2]);			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Exception:"+e.getMessage());
		}
		System.out.println("next line");

		}
	}
}

