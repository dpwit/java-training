import java.util.Random;

public class EmployeeDemo {

    private enum EmployeeType {
        MANAGER,
        WORKER

    } // end enum

    public static void main(String[] args) {
        Employee[] employees = new  Employee[5];

        for(int i = 0; i < 5; i++) {
            EmployeeType et = getEmployeeType();
            Employee currentEmployee;

            if(et == EmployeeType.MANAGER) {
                currentEmployee = new Manager("Darren", "Whatford", 54);
            } else {
                currentEmployee = new Worker("Ed", "Whatford", 18);
            }

            employees[i] = currentEmployee;
        } // end of creating employees

        for (Employee employee : employees) {
            System.out.println("First name is " + employee.getFirstName());
            System.out.println("Last name is " + employee.getLastName());
            System.out.println("Age is " + employee.getAge());
            System.out.println("Employee says: " + employee.work());
            System.out.println(); // just adds an extra line space.
        }


    } // end main method

    public static EmployeeType getEmployeeType() {
        EmployeeType result;
            Random rand = new Random();
            final int UPPER_BOUND = 2; // only 2 values 0 Manager 1 Worker
            int whichOne = rand.nextInt(UPPER_BOUND);

            if(whichOne == 0) {
                result = EmployeeType.MANAGER;
            }
            else {
                result = EmployeeType.WORKER;
            }
        return result;
    }


} // end EmployeeDemo class
