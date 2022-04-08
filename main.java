public class main {
    public static void main(String[] args) {
    


        Patient patient_1 = new Patient();
        Doctor doctor_1 = new Doctor();
        
        patient_1.setInsured(true)
        
        patient_1.setFirstName("Kaputo");
        doctor_1.setFirstName("Zodo");
    
        System.out.println(patient_1.getFirstName());
        System.out.println(doctor_1.getFirstName());
    }
}
