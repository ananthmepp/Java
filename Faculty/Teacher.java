package Faculty;

class Teacher extends Faculty{
    //Implement your code here
    private String qualification;
    public Teacher(String name, float basicSalary, String qualification){
        super(name, basicSalary);
        this.qualification = qualification;
    }
    public String getQualification(){
        return qualification;
    }
    public void setQualification(String qualification){
          this.qualification= qualification;
    }
    public double calculateSalary(){
        if(qualification.equals("Doctoral")){
            return getBasicSalary()+20000.0;
        }
        else if(qualification.equals("Masters")){
            return getBasicSalary()+18000.0;
        }
        else if(qualification.equals("Bachelors")){
            return getBasicSalary()+15500.0;
        }
        else if(qualification.equals("Associate")){
            return getBasicSalary()+10000.0;
        }
        else{
            return 0.0;
        }
    }
}