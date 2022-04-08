public class Patient extends User{
    
    private long patient_id;
    private boolean insured;
    private HealthInsurancePlan insurancePlan;

    public Patient(){

    }
    public void  setStaffId(long patient_id){
        this.patient_id = patient_id;
    }
    public long getStaffId(){
        return patient_id;
    }
    public void  setInsured(boolean insured){
        this.insured = insured;
    }
    public boolean getInsured(){
        return insured;
    }
    public void  setHealthInsurancePlan(HealthInsurancePlan insurancePlan){
        this.insurancePlan = insurancePlan;
    }
    public HealthInsurancePlan getHealthInsurancePlan(){
        return insurancePlan;
    }
}


