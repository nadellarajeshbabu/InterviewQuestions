package tecnicalAptitude;

public class Hospital {

	public static void main(String[] args) {
		
		Surgeon s1=new Surgeon("liver");
		Surgeon s2=new Surgeon("Heart");
		s1.age=45;
		s2.age=55;
		System.out.println(s1.age+s2.getSpecialisation());
		System.out.println(s2.age+s1.getSpecialisation());

	}

}
