package encapsulation;

public class Encap1 {
	private String name;
	private int age;

	public void getter() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}

	public void setter(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
