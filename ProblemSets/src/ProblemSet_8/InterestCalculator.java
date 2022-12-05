package ProblemSet_8;

public class InterestCalculator {
	public double calculateSimpleInteres(double principle, double interestrate, double timeinyears) {
		double simpleInterest=0.0;
		simpleInterest=principle*(interestrate/100.0)*timeinyears;
		return simpleInterest;
		
	}
	public double calculateCompoundInterest(double principle, double interestrate, int numberoftimescompoundedperyear, double timeinyears) {
		double compoundInterest=0.0;
		compoundInterest=principle*Math.pow(1+((interestrate/100.0)/numberoftimescompoundedperyear),(numberoftimescompoundedperyear*timeinyears));
		return compoundInterest;
	}
	public static void main(String[]args) {
		System.out.println("Simple Interest: "+new InterestCalculator().calculateSimpleInteres(12000.0, 15, 5));
		System.out.println("Compound Interest: "+(new InterestCalculator().calculateCompoundInterest(12000, 15, 2, 5)/100.0)*100.0);
	}

}
