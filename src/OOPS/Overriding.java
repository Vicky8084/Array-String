package OOPS;
class Airline{
    void CruiseMember(){
        System.out.println("Need 8 people..!!");
    }
    void fuel(){
        System.out.println("Minimus 2 lakh liter..!!");
    }
}
class IndiGO extends Airline{
    void CruiseMember(){
        System.out.println("we have only 4 people..!!");
    }
    void fuel(){
        System.out.println("2.5 lakh liter..!!");
    }
}
class Akash extends Airline{
    void flightCancel(){
        System.out.println("Fight canceled..!!!");
    }
}
public class Overriding {
    public static void main(String[] args) {
//        Airline airline=new Airline();
//        airline.CruiseMember();
//        airline.fuel();
//        IndiGO indiGO=new IndiGO();
//        indiGO.CruiseMember();
//        indiGO.fuel();
        Akash akash=new Akash();
        akash.flightCancel();
        akash.CruiseMember();
        akash.fuel();

    }
}
