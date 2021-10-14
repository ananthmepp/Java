package Faculty;

class OfficeStaff extends Faculty{
    private String designation;
    public OfficeStaff(String name, float basicSalary, String designation){
        super(name, basicSalary);
        this.designation = designation;
   }
    public String getDesignation(){
        return designation;
    }
    public void setDesignation(String designation){
          this.designation= designation;
    }
   public double calculateSalary(){
       if(designation.equals("Accountant")){
            return getBasicSalary()+10000.0;
        }
       else if(designation.equals("Clerk")){
           return getBasicSalary()+7000.0;
       }
       else if(designation.equals("Peon")){
           return getBasicSalary()+4500.0;
       }
       else{
        return 0;
       }
   }
}