package track.M02.M02_t01_st01_p01;

public class placement {
    public static void main(String[] args) {
        int marks = 72;
        int attendance = 80;
        boolean projectCompleted = true;

        boolean marksEligible = marks >= 60;
        boolean attendanceEligible = attendance >= 75;
        boolean academicEligible = marksEligible && attendanceEligible;
        boolean placementEligible = academicEligible && projectCompleted;

        System.out.println("Placement Eligible: " + placementEligible);
    }

}
