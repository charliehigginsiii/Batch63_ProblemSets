package ProblemSet_8;


class Lion implements Vertebrate, Mammal{
	public Lion(){
		this.hasBackbone();
		this.hasHair();
		this.hasMilk();
	}
}
public class MultipleInheritance extends Lion {
	public static void main(String[]args) {
		Lion lion=new Lion();
		
	}

}
