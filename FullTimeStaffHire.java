
/**
 * Write a description of class FullTimeStaffHire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FullTimeStaffHire extends StaffHire
{
    // instance variables - replace the example below with your own
    private int weeklyFractionalHours;
    private double salary; 
    /**
     * Constructor for objects of class FullTimeStaffHire
     */
    public FullTimeStaffHire(int vacancyNumber, String designation, String jobType, String staffName, String joiningDate, String qualification, String appointedBy, boolean joined, double salary, int weeklyFractionalHours) {

        super(vacancyNumber, designation, jobType, staffName, joiningDate, qualification, appointedBy, joined);
        this.salary = salary;
        this.weeklyFractionalHours = weeklyFractionalHours;

    }
    public double getsalary() {
        return salary;
    }

    public int getweeklyFractionalHours() {
        return weeklyFractionalHours;
    }

    public void setsalary(double newsalary) {
        if (isjoined) {
            this.salary = newsalary;
        } 

        else { 
            System.out.println("No employees hired. It is not possible to set salary!");
        }
    }
    
    public void setweeklyFractionalHours(int newWorkingHours) {
        this.weeklyFractionalHours = newWorkingHours;
    }
    
    public void display() {
        super.display(); // Calls superclass display method
        if (isjoined) {
           System.out.println("salary: " + salary);
            System.out.println("weeklyFractionalHours: " + weeklyFractionalHours);
        }
    }
}
