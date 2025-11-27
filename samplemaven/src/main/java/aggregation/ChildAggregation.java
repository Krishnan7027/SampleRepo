package aggregation;

public class ChildAggregation {

	String city;
	String state;
	ParentAggregation ref;
	
	public ChildAggregation(String city, String state, ParentAggregation ref) {
		this.ref = ref;
		this.city = city;
		this.state = state;
	}

	public void display() {
		System.out.println("Name: " + ref.name);
		System.out.println("Rollno: " + ref.rollno);
		System.out.println("Address: " + ref.address);
		System.out.println("City: " + city);
		System.out.println("State: " + state);
	}

	public static void main(String[] args) {
		ParentAggregation obj = new ParentAggregation("Hari", 27, "Thrissur");
		ChildAggregation obj2 = new ChildAggregation("Alappuzha", "Kerala", obj);
		obj2.display();
	}
}
