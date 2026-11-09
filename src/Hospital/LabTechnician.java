package Hospital;

public class LabTechnician extends MedicalStaff {

    public LabTechnician(String employeeID, String department, int workingHours) {
        super(employeeID, department, workingHours);
    }

    @Override
    public void performDuties() {
        System.out.println("Responsibility: Conducting laboratory tests and analyzing samples.");
    }
}