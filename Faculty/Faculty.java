package Faculty;

class Faculty{
    //Implement your code here
    private String name;
    private float basicSalary;
    private float bonusPercentage;
    private float carAllowancePercentage;
    
    public Faculty(String name,float basicSalary){
       this.name= name;
       this.basicSalary = basicSalary;
    }
    
    public double calculateSalary(){
        return basicSalary + bonusPercentage + carAllowancePercentage;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
          this.name= name;
    }
    public float getBasicSalary(){
        return basicSalary;
    }
    public void setBasicSalary(float basicSalary){
        this.basicSalary= basicSalary;
    }
    public float getBonusPercentage(){
        return bonusPercentage*= .04f;
    }
    public void setBonusPercentage(float bonusPercentage){
        this.bonusPercentage= bonusPercentage;
    }
    public float getCarAllowancePercentage(){
        return carAllowancePercentage*= .025f;
    }
    public void setCarAllowancePercentage(float carAllowancePercentage){
        this.carAllowancePercentage= carAllowancePercentage;
    }
}