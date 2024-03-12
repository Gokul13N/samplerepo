package org.details;

public class Overridingg implements Employeee,employee2 {

	
	@Override
	public void tester() {
System.out.println("I'm a automation tester");		
	}
	@Override
	public void java() {
System.out.println("i'm a java developer");		
	}
	@Override
	public void testing() {
System.out.println("selenium testing");		
	}
	public static void main(String[] args) {
		Overridingg o = new Overridingg();
		o.java();
		o.tester();
		o.testing();
	}
}
