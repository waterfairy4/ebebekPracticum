package FirstCase;

public class Employee {
  private String name ;
  private double salary;
  private int workHours;
  private int hireYear;
	public Employee(String name, double salary, int workHours, int hireYear) {
	super();
	this.name = name;
	this.salary = salary;
	this.workHours = workHours;
	this.hireYear = hireYear;
}
	
	public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public int getWorkHours() {
	return workHours;
}
public void setWorkHours(int workHours) {
	this.workHours = workHours;
}
public int getHireYear() {
	return hireYear;
}
public void setHireYear(int hireYear) {
	this.hireYear = hireYear;
}


public double tax() {
	if(salary<1000) 
		return 0;
	else 
	   return salary*3/100;
	
	
	
}

public double bonus() {
	if(workHours>40) {
		return (workHours-40)*30;
	}
	else
		return 0;
		
		
}


public double raiseSalary() {
	double raise;
	if(2021-hireYear<10) 
		raise=salary*5/100;
	
	else if(2021-hireYear>9 && 2021-hireYear<20) 
		raise = salary*10/100;
	
	else
		raise= salary*15/100;
	
	
	return raise;
		
	    
}

public double taxAndBonusSalary(){
	double salary = this.salary;
	 salary= salary- tax();
	 salary = salary + bonus();
	 
	 return salary;
	 
}

public double totalSalary() {
	double salary = this.salary;
	salary= taxAndBonusSalary() + raiseSalary();
	return salary;
	
}


public void raiseTheSalary() {
System.out.println("Old salary was " + salary);
  salary = totalSalary() ;
 
  System.out.println("New salary is " + salary);
}










@Override
public String toString() {
	return "Adi: " + name + "\nMaasi: " + salary + 
			"\nCalisma Saati: " + workHours + 
			"\nBaslangic Yili " + hireYear + "\nVergi: " + tax() +
			"\nBonus: " + bonus() + "\nMaas Artisi: "+ raiseSalary() + 
			"\nVergi ve Bonuslarla Birlikte Maas: " + taxAndBonusSalary() + "\nToplam Maas: "
			+ totalSalary(); 
			}
	public static void main(String[] args) {
		Employee employee = new Employee("Kemal", 2000, 45, 1985);
        System.out.println(employee);
        System.out.println("------------------");
        employee.raiseTheSalary();
	}

}
