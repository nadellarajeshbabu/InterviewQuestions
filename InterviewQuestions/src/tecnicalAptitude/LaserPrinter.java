package tecnicalAptitude;

public class LaserPrinter extends Printer 
{
	int pagespermin=100;

	public static void main(String[] args)
	{
		//subclass obj is upcasted to superclass...
		Printer lp=new LaserPrinter();
		
		//superclass obj is downcasted to sub class....
		LaserPrinter p=(LaserPrinter)lp;
		System.out.println(p.pagespermin);
		System.out.println(p.inklevel);
		System.out.println(lp.inklevel);
		
		
		///below stmt indicates Compilation error....
		//System.out.println(lp.inklevel+" "+lp.pagespermin);
		
		

	}

}
