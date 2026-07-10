package task1;

public class employee {

    int employeeId;
    String name;
    int salary;
    static int employeeCount = 0;
    employee(int employeeId, String name, int salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        employeeCount++;
    }

    
    void displayEmployee() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + name);
        System.out.println("Salary      : " + salary);
        System.out.println();
    }

    
    static void displayEmployeeCount() {
        System.out.println("Total Employees = " + employeeCount);
    }

    public static void main(String[] args) {

        employee e1 = new employee(101, "Naren", 30000);
        employee e2 = new employee(102, "Raj", 35000);

        e1.displayEmployee();
        e2.displayEmployee();

        employee.displayEmployeeCount();
    }
}
