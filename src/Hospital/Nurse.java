package Hospital;

public class Nurse extends MedicalStaff {

    public Nurse(String employeeID, String department, int workingHours) {
        super(employeeID, department, workingHours);
    }

    @Override
    public void performDuties() {
        System.out.println("Responsibility: Providing patient care and monitoring recovery.");
    }
}
