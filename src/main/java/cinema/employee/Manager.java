package cinema.employee;

import java.util.List;

public class Manager extends Employee {

    private List<Employee> workers;

    public Manager(int id, String fullName, int age, EmployeePosition employeePosition, String phoneNumber, int salary, List<Employee> workers) {
        super(id, fullName, age, employeePosition, phoneNumber, salary);
        this.workers = workers;
    }

    //public boolean isCinemaOpened (String CurrentTime){
        //if()
        //return true;
        //if()
        //return false;
    //}

}
