public class Doctor extends Staff {
    private long doctor_id;
    private String specialization;

    public Doctor(){

    }
    public void  setDoctorId(long doctor_id){
        this.doctor_id = doctor_id;
    }
    public long getDoctorId(){
        return doctor_id;
    }
    public void  setSpecialization(String specialization){
        this.specialization = specialization;
    }
    public String getSpecialization(){
        return specialization;
    }
}
