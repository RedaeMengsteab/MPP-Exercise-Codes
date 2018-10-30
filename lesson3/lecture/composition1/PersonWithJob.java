package lesson3.lecture.composition1;

public class PersonWithJob  {
	
	private Person person;
	private double salary;
	public String getName() {
		return person.getName();
	}
	public double getSalary() {
		return salary;
	}
	PersonWithJob(String n, double s) {
		person = new Person(n);
		salary = s;
	}
//	public static void main(String []args)
//	{
//	PersonWithJob b= new PersonWithJob("Redae",4000);
//	System.out.println(b);
//	}
//	@Override
//	public String toString() {
//		return "PersonWithJob [person=" + person + ", salary=" + salary + "]";
//	}
	


}
