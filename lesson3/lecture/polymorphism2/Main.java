
package lesson3.lecture.polymorphism2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
//		StaffPerson p1 = new Faculty();
//		p1.setName("Redae");
//		System.out.println(p1);
//		StaffPerson p2 = new Secretary();
//		StaffPerson p3 = new Faculty();
//		StaffPerson p4 = new Secretary();
//		StaffPerson p5=new StaffPerson(); abstract classes can not instantiate- compiler error
//		List<StaffPerson> people = Arrays.asList(p1, p2, p3, p4);
//		List<StaffPerson> people= new ArrayList<>();
//		people.add(p1);
//		people.add(p2);
//		people.add(p3);
//		people.add(p4);
		StaffPerson[] people= {new Faculty(),new Secretary(),new Faculty(),new Secretary()}; 
		double sum = 0.0;
		//print average stipend
		for(StaffPerson p : people) {
			sum += p.computeStipend();
		}
//		System.out.println("Average stipend = " 
//				+ (people.isEmpty() ? 0.0 : sum/people.size()));
		System.out.println("Average stipend = "+sum/people.length);
				 
	}

}
