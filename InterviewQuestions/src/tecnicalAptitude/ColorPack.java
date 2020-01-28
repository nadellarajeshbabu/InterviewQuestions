package tecnicalAptitude;

public class ColorPack 
{
	static int shadeCount=12;
	int r=5;
	
	static int getShadeCount()
	{
		return shadeCount;
	}
	static int getCount()
	{
		ColorPack e=new ColorPack();
		
		//compilatipon error....
		return e.r;
	}
}
