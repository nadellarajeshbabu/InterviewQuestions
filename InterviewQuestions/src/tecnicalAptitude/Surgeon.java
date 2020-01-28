package tecnicalAptitude;

public class Surgeon extends Doctor {

	Surgeon(String val)
	{
		specialisation =val;
	}
	String specialisation;
	String getSpecialisation()
	{
		return specialisation;
	}
}
