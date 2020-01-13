package profit;

public class Salary {
	public double salary;
	public double comisstion;
	
	public Salary(double salary, double comisstion) {
		this.salary = salary;
		this.comisstion = comisstion;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getComisstion() {
		return comisstion;
	}

	public void setComisstion(double comisstion) {
		this.comisstion = comisstion;
	}

	@Override
	public String toString() {
		return "Salary " +(salary+comisstion);
	}
	
}
