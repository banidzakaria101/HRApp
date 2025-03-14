public class Employee {
    private String name;
    private double salary;
    private String department;
    private int id;

    public Employee(String name, int salary, String department, int id) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.id = id;
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

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return " Employee's name: " + name + " salary: " + salary + " department: " + department + " id: " + id;
    }

}
