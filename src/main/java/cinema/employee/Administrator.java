package cinema.employee;

public class Administrator extends Employee {

    public Administrator(int id, String fullName, int age, EmployeePosition employeePosition, String phoneNumber, int salary) {
        super(id, fullName, age, employeePosition, phoneNumber, salary);
    }

    public void giveFine(Employee employee) {
        switch (employee.getEmployeePosition()) {
            case MANAGER:
                employee.setSalary(employee.getSalary() - 100);
                break;
            case ADMINISTRATOR:
                employee.setSalary(employee.getSalary() - 150);
                break;
            case SALESMAN:
                employee.setSalary(employee.getSalary() - 50);
                break;
        }
    }

}
