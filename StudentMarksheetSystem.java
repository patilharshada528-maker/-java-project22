import java.util.Scanner;
class marksheet
{
	public static void main(String args[])
	{
		String na;
		int n,m,h,e,mh,t;
		double pr;
		Scanner z= new Scanner(System.in);
		System.out.println("enter the of student");
		na=z.next();
		System.out.println("enter the roll number of student:");
		n=z.nextInt();
		System.out.println("marathi marks ");
		m=z.nextInt();
		System.out.println("english");
		e=z.nextInt();
		System.out.println("hindi");
		h=z.nextInt();
		System.out.println("math");
		mh=z.nextInt();
		t=m+h+e+mh;
		System.out.println("total marks:"+t);
		pr=t/4;
		System.out.println("total percentage"+pr);
		if(pr>=75)
		{
			System.out.println("Distinction");
			
		}
		else
			if((pr>=60&&pr<=75))
			{
				System.out.println("first class");
				
			}
			else
				if((pr>=45&&pr<=60))
				{
					System.out.println("second class");
				}
				else
					if((pr>=35&&pr<=45))
					{
						System.out.println("pass");
						
					}
					else{
						System.out.println("fail");
					}
		
			
		
				
	}
}