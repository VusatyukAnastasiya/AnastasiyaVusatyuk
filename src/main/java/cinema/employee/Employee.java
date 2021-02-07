package cinema.employee;

abstract public class Employee {

    private int id;
    private String fullName;
    private int age;
    private EmployeePosition employeePosition;
    private String phoneNumber;
    private int salary;

    public Employee(int id, String fullName, int age, EmployeePosition employeePosition, String phoneNumber, int salary) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.employeePosition = employeePosition;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public EmployeePosition getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(EmployeePosition employeePosition) {
        this.employeePosition = employeePosition;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
