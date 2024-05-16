import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int packagePlan;
        int courses;
        int package1 = 10;
        int package2 = 12;
        int package3 = 15;
        int course1 = 6;
        int course2 = 4;
        int course3 = 3;

        System.out.println("What package would you like?");
        System.out.println("Package 1");
        System.out.println("$10/month, includes 2 courses per month.");
        System.out.println("Each additional course is $6");
        System.out.println("Package 2");
        System.out.println("$12/month, includes 4 courses per month.");
        System.out.println("Each additional course is $4");
        System.out.println("Package 3");
        System.out.println("$15/month, includes 6 courses per month.");
        System.out.println("Each additional course is $3");
        packagePlan = keyboard.nextInt();

        System.out.println("How many courses did you enroll in this month?");
        courses = keyboard.nextInt();

        if(packagePlan == 1 && courses <= 2) {
            System.out.println("Your total cost is " +  package1);
        }
        else if(packagePlan == 1 && courses > 2){
            System.out.println("Your total cost is " + (package1 + (course1 * (courses -2))));

        }
        else if(packagePlan == 2 && courses <= 4){
            System.out.println("Your total cost is " + package2);

        }
        else if(packagePlan == 2 && courses > 4){
            System.out.println("Your total cost is " + (package2 + (course2 * (courses -4))));

        }
        else if(packagePlan == 3 && courses <= 6){
            System.out.println("Your total cost is " + package3);

        }
        else if(packagePlan == 3 && courses > 6){
            System.out.println("Your total cost is " + (package3 + (course3 * (courses -6))));

        }
        else {
            System.out.println("Please try again and choose the right package and number of courses");
        } // end if else

    } //end main
}

// Total cost = package + course cost * number of courses
