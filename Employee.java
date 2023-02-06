public class Employee {

    String name;
    String company;
    Double pay;

    Employee (String eName, String eCompany, double ePay){
        name = eName;
        company = eCompany;
        pay = ePay;
    }
}

  class FullTime extends Employee{
    int hrs;
    FullTime(String name, String company, int hrs, double pay){
        super(name,company,pay);
        this.hrs = hrs;
    }
    void fInfo(){
        System.out.println(super.name+" works at "+ super.company+" and works for "+ hrs+ " hours for " + super.pay+" per hr" );
    }
 }

  class PartTime extends Employee {
      int age;
      PartTime(String name, int age, String company, double pay) {
          super(name,company,pay);
          this.age = age;
      }
      void pInfo(){
          System.out.println(super.name+" is "+ age+" years old and works at "+ super.company+" and makes "+ super.pay+" per hr" );
      }
 }




