package lang;

public class EqualsEx2 {

	public static void main(String[] args) {
		Person p1 = new Person(1, "이영환");
		Person p2 = new Person(1, "이영환");
		System.out.println(p1 + ", " + p2);
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode() + ", " + p2.hashCode());
	}

}

class Person{
	private long id;
	private String name;
	
	Person(long id, String name){
		this.id = id;
		this.name = name;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Person p = (Person)obj;
		return (this.id == p.id) && (this.name.equals(p.name));
	}



	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
