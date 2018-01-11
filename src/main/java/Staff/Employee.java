package Staff;

public class Employee {

    public String name;
    private String niNumber;
    private int salary;

    public Employee(String name, String niNumber, int salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNiNumber() {
        return this.niNumber;
    }

    public int getSalary() {
        return this.salary;
    }

    public double raiseSalary(double amount) {
        if (amount > 0)
            return this.salary + amount;
        else
            return this.salary;
    }

    public double payBonus() {
        return this.salary * 0.01;
    }

    public void setName(String name) {
        if(name != null){
            this.name = name;
        }
    }
}
