package Hospital;

public abstract class MedicalStaff {

    private String employeeID;
    private String department;
    private int workingHours;

    public MedicalStaff(String employeeID, String department, int workingHours) {
        this.employeeID = employeeID;
        this.department = department;
        this.workingHours = workingHours;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getDepartment() {
        return department;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Working Hours: " + workingHours);
    }

    public abstract void performDuties();
}
