package OOPS;
interface Village{
    abstract void headOfVillage();
    abstract void numberOfPeople();
}
public class ShowInterface implements Village{
    @Override
    public void headOfVillage() {
        System.out.println("Vicky is the Head of Village");
    }

    @Override
    public void numberOfPeople() {
        System.out.println("Total number of people in the village are 20000");
    }

    public static void main(String[] args) {
        ShowInterface showInterface=new ShowInterface();
        showInterface.headOfVillage();
        showInterface.numberOfPeople();
    }
}
