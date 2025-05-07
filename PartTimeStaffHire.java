
/**
 * Write a description of class PartTimeStaffHire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PartTimeStaffHire extends StaffHire
{
    private int workingHour; 
    private double wagesPerHour;
    private String shifts; 
    private boolean terminated;
    /**
     * Constructor for objects of class PartTimeStaffHire
     */
    public PartTimeStaffHire(int vacancyNumber, String designation, String jobType, String staffName, String joiningDate,  String qualification,  String appointedBy, boolean joined, int workingHour, double wagesPerHour, String shifts) 
    {
        super(vacancyNumber, designation, jobType, staffName, joiningDate, qualification, appointedBy, joined);
        this.workingHour = workingHour;
        this. wagesPerHour =  wagesPerHour;
        this.shifts =  shifts;
        this.terminated = false;
    }

    // getter method (also known as accessor methods)
    public int getworkingHour() {
        return workingHour;
    }

    public double getwagesPerHour() {
        reuturn wagesPerHour;
    }

    public String getshift() {
        return shift;
    }

    public boolean getterminated () {
        return terminated;
    }

    public void setShift(String newshifts) {
        if (isJoined) { //isJoined is the getter method from StaffHire
            this.shifts = newshifts;
        }
    }
    public void terminateStaff() {
        if (terminated) {
            System.out.println("Staff is terminated.");
        }
        else {
            staffName = ("");
            joinDate = ("");
            qualification = ("");
            AppointedBy = ("");
            joined = ("false");
            terminated = ("true");
        }
    }
    public void display() {
        super.display(); //Calling display method from the StaffHire superclass 
        if (isJoined) {
            System.out.println("workingHour: " + workingHour);
            System.out.println("wagesPerHour: " + wagesPerHour);
            System.out.println("shifts: " + shifts);
            System.out.println("terminated: " + terminated);
        }
        
    } 
}
