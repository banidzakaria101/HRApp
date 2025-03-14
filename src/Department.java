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
}
