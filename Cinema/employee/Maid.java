package Cinema.employee;

import Cinema.hall.Hall;

import java.util.List;

public class Maid extends Employee{

    private List<Hall> hall;

    public Maid(int id, String fullName, int age, EmployeePosition employeePosition, String phoneNumber, int salary, List<Hall> hall) {
        super(id, fullName, age, employeePosition, phoneNumber, salary);
        this.hall = hall;
    }
}
