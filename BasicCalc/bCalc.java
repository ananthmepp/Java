public class bCalc{
    public bCalc(){

    }
    public int add(int a, int b){
      return a + b;
    }
    public int subtract(int a, int b){
      return a-b;
    }
    public int multiply(int a, int b){
      return a*b;
    }
    public int divide(int a, int b){
      return a/b;
    }
    public int modulo(int a, int b){
      return a%b;
    }
    public static void main(String[] args){
    bCalc myCalculator = new bCalc();
    System.out.println(myCalculator.add(5, 7));
  }
}