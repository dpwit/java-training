public class EmployeeDemo {
    public static void main(String[] args) {
        Employee[] employees = new  Employee[5];

        employees[0] = new Manager("Darren", "Whatford", 55);
        employees[1] = new Worker("Kate", "Whatford", 17);
        employees[2] = new Manager("Jules", "Whatford", 54);
        employees[3] = new Worker("Daisy", "Whatford", 24);
        employees[4] = new Worker("Ed", "Thedog", 49);

        printEmployess(employees);

    } // end main method

    public static void printEmployess(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println("First name is " + employee.getFirstName());
            System.out.println("Last name is " + employee.getLastName());
            System.out.println("Age is " + employee.getAge());
            System.out.println("Employee says: " + employee.work());
            System.out.println(); // just adds an extra line space.
        }
    }
} // end EmployeeDemo class
