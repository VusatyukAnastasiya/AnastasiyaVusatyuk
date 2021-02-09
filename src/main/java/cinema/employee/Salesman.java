package cinema.employee;

import cinema.film.Ticket;
import java.util.List;

public class Salesman extends Employee {

    private List<Ticket> tickets;

    public Salesman(int id, String fullName, int age, EmployeePosition employeePosition, String phoneNumber, int salary, List<Ticket> tickets) {
        super(id, fullName, age, employeePosition, phoneNumber, salary);
        this.tickets = tickets;
    }
}
