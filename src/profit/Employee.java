package profit;

public class Employee {
	public String name;
	public String em_id;
	
	public Employee(String name, String em_id) {
		this.name = name;
		this.em_id = em_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEm_id() {
		return em_id;
	}

	public void setEm_id(String em_id) {
		this.em_id = em_id;
	}
	

	@Override
	public String toString() {
		return "Employee name = " + name + ", em_id = " + em_id + " ";
	}
	
	
}
