import java.util.Objects;

public class Employee {
    private String name;
    private int employeeID;
    private double salary;

    public Employee(String name, int employeeID, double salary) throws EmployeeException {
        this.name = name;
        this.employeeID = employeeID;
        if(salary < 0){
            throw new EmployeeException("Negative Salary!");
        }
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeID == employee.employeeID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", salary=" + salary +
                '}';
    }
}
