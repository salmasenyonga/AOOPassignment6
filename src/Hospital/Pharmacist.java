package Hospital;

public class Pharmacist extends MedicalStaff {

    public Pharmacist(String employeeID, String department, int workingHours) {
        super(employeeID, department, workingHours);
    }

    @Override
    public void performDuties() {
        System.out.println("Responsibility: Dispensing medication and advising patients.");
    }
}
