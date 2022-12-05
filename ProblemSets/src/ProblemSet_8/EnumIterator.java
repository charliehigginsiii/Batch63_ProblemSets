package ProblemSet_8;

enum Countries{
	UnitedStatesOfAmerica, Nigeria, India, Ethiopia, Brazil, DRC, Germany, Poland, Russia, China
	
}
public class EnumIterator {
	public static void main(String[]args) {
		for(Countries country: Countries.values()) {
			System.out.println(country);
		}
	}
	

}
