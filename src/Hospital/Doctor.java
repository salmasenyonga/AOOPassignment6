package Hospital;

public class Doctor extends MedicalStaff {

    public Doctor(String employeeID, String department, int workingHours) {
        super(employeeID, department, workingHours);
    }

    @Override
    public void performDuties() {
        System.out.println("Responsibility: Diagnosing patients and prescribing treatment.");
    }
}
