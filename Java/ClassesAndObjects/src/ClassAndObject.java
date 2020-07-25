
class Infosys{
	
	String name;
	int jd;
	String date;
}

public class ClassAndObject {
	public static void main(String[] args) {
		
		Infosys Infy = new Infosys();
		Infy.name = "Aswathy Mahadevan";
		Infy.jd = 13-07-20;
		Infy.date = "Monday";
		
		Infosys Infy1 = new Infosys();
		Infy1.name = "Nirmala";
		Infy1.date = "Thursday";
		
		System.out.println(Infy.date);
		System.out.println(Infy1.date);
		System.out.println(Infy.name);
		System.out.println(Infy1.jd);
		
	}

}
