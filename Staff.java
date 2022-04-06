public class Staff extends User{
    private long stuff_id;
    private int yearsOfExp;
    private String description;
    private Double salary;

    public Staff(){

    }
    public void  setStaffId(long stuff_id){
        this.stuff_id = stuff_id;
    }
    public long getStaffId(){
        return stuff_id;
    }
    public void  setYearsOfExp(int yearsOfExp){
        this.yearsOfExp = yearsOfExp;
    }
    public int getYearsOfExp(){
        return yearsOfExp;
    }
    public void  setDescription(String desc){
        this.description = desc;
    }
    public String getDescription(){
        return description;
    }
    public void  setSalary(Double salary){
        this.salary = salary;
    }
    public Double getSalary(){
        return salary;
    }
}
