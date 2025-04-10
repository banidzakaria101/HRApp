public class Department {
    private String name;
    private final Employee[] employees = new Employee[10];
    private int departmentId;

    public void addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
            }else {
                System.out.println("you've reached the maximum number of employees");
            }
        }
    }

    public Employee[] getEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println();
            }
        }
        return employees;
    }

    public Employee getEmployeeById(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
    }
}
