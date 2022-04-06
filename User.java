class User{
    private long ID;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;


    public User (){
        // this.ID = id;
        // this.firstName = fName;
        // this.lastName = lName;
        // this.gender = gender;
        // // this.email = email;
        // long id, String fName, String lName, String gender, String email

    }

    public  void setID (long id){
        this.ID = id;
    }
    public long getID (){
        return this.ID;
    }
    public void setFirstName ( String fName){
         this.firstName = fName;
    }
     public String getFirstName() {
        return firstName;
    }
    public void setLastName ( String lName){
         this.firstName = lName;
    }
     public String getLastName() {
        return lastName;
    }
    public void setGender ( String gender){
         this.firstName = gender;
    }
     public String getGender() {
        return gender;
    }
    public void setEmail ( String email){
         this.firstName = gender;
    }
     public String getEmail() {
        return email;
    }


}