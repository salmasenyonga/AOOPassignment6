package Hospital;

public class Main {

    public static void main(String[] args) {

        MedicalStaff doctor = new Doctor("D001", "General Medicine", 40);

        MedicalStaff nurse = new Nurse("N001", "Nursing", 40);

        MedicalStaff pharmacist = new Pharmacist("P001", "Pharmacy", 35);

        MedicalStaff technician = new LabTechnician("L001", "Laboratory", 40);


        System.out.println("===== MUKONO HOSPITAL STAFF SYSTEM =====");

        System.out.println("\n--- DOCTOR ---");
        doctor.displayDetails();
        doctor.performDuties();

        System.out.println("\n--- NURSE ---");
        nurse.displayDetails();
        nurse.performDuties();

        System.out.println("\n--- PHARMACIST ---");
        pharmacist.displayDetails();
        pharmacist.performDuties();

        System.out.println("\n--- LABORATORY TECHNICIAN ---");
        technician.displayDetails();
        technician.performDuties();

    }
}