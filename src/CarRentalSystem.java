import java.util.ArrayList;
import java.util.Scanner;


class Car{
    private String carId;
    private String model;
    private String brand;
    private int basePrice;
    private boolean isAvailable=true;
    public Car(String carId, String model, String brand,int basePrice){
        this.carId=carId;
        this.model=model;
        this.brand=brand;
        this.basePrice=basePrice;
    }

    public String getCarId(){
        return  carId;
    }

    public String getModel(){
        return model;
    }

    public String getBrand(){
        return brand;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public void rent(){
        isAvailable=false;
    }

    public void returnCar(){
        isAvailable=true;
    }

    public double calculatePrice(int daysForRent){
        return daysForRent*basePrice;
    }
}

class Customer{
    private String customerName;
    private String customerId;
    private String aadharNumber;
    public Customer(String customerId, String customerName, String aadharNumber){
        this.aadharNumber=aadharNumber;
        this.customerId=customerId;
        this.customerName=customerName;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getAadharNumber(){
        return aadharNumber;
    }
    public String getCustomerId(){
        return customerId;
    }
}

class Rental{
    private Car car;
    private Customer customer;
    private int daysForRent;
    public Rental(int daysForRent, Customer customer, Car car){
        this.car=car;
        this.customer=customer;
        this.daysForRent=daysForRent;
    }
    public Car getCar(){
        return car;
    }
    public Customer getCustomer(){
        return customer;
    }
    public int getDaysForRent(){
        return daysForRent;
    }
}

class RentalSystem{
    private ArrayList<Car> carList;
    private ArrayList<Customer> customerList;
    private ArrayList<Rental> rentalList;
    public RentalSystem(){
        carList=new ArrayList<>();
        customerList=new ArrayList<>();
        rentalList=new ArrayList<>();
    }

    public void addCar(Car car){
        carList.add(car);
    }

    public void addCustomer(Customer customer){
        customerList.add(customer);
    }

    public void rentCar(Car car,Customer customer, int daysForRent){
        if (car.isAvailable()) {
            car.rent();
            rentalList.add(new Rental(daysForRent,customer,car));
        }else{
            System.out.println("Car is Not available");
        }
    }

    public void returnCar(Car car){
        Rental rentalToRemove=null;
        for(Rental rental : rentalList){
            if(rental.getCar()==car){
                rentalToRemove=rental;
            }
        }
        if(rentalToRemove!=null){
            car.returnCar();
            rentalList.remove(rentalToRemove);
            System.out.println("Car Returned Successfully");
        }else{
            System.out.println("Car was not rented");
        }
    }

    public void menu(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("==== Car Rental System ====");
            System.out.println("1. Rent a Car");
            System.out.println("2. Return A Car");
            System.out.println("3. Exit");
            System.out.print("Enter Your Choice :- ");
            int choice=sc.nextInt();

            switch (choice){
                case 1 : {
                    System.out.println("==== Rent a Car ====");
                    sc.nextLine();
                    System.out.print("Enter your name :- ");
                    String customerName=sc.nextLine();
                    System.out.print("Enter Your Aadhar Number ");
                    String aadharNumber=sc.nextLine();
                    System.out.println();
                    System.out.println("Available Cars :");
                    for(Car car : carList){
                        System.out.println(car.getCarId()+" - "+car.getBrand()+" "+car.getModel());
                    }
                    System.out.println();
                    System.out.print("Enter the car ID which you want to rent :- ");
                    String carId= sc.nextLine();
                    System.out.print("Enter the number days for rent :- ");
                    int daysForRent=sc.nextInt();
                    System.out.println();
                    Customer newCustomer=new Customer("CUS"+(customerList.size()+1),customerName,aadharNumber);
                    addCustomer(newCustomer);

                    Car selectedCar=null;
                    for(Car car : carList){
                        if(car.getCarId().equals(carId) && car.isAvailable()){
                            selectedCar=car;
                            break;
                        }
                    }

                    if(selectedCar!=null){
                        double totalPrice= selectedCar.calculatePrice(daysForRent);
                        System.out.println("\n==== Rental Information ====\n");
                        System.out.println("Customer ID :- "+newCustomer.getCustomerId());
                        System.out.println("Customer Name :- "+newCustomer.getCustomerName());
                        System.out.println("Car :- "+selectedCar.getBrand()+" "+selectedCar.getModel());
                        System.out.println("Rental Days :- "+daysForRent);
                        System.out.println("Total Price :- ₹"+totalPrice);

                        sc.nextLine();
                        System.out.println("\nConfirm Rental (Y/N) :- ");
                        String confirm=sc.nextLine();

                        if (confirm.equalsIgnoreCase("y")){
                            rentCar(selectedCar,newCustomer,daysForRent);
                            System.out.println("\nCar Rented Successfully");
                        }else{
                            System.out.println("\nRental Canceled");
                        }
                    }else{
                        System.out.println("\nInvalid car selection or car not available for rent");
                    }
                    break;
                }
                case 2:{
                    System.out.println("==== Return a Car ====");
                    sc.nextLine();
                    System.out.println("\nEnter Car Id :- ");
                    String carId=sc.nextLine();

                    Car carToReturn=null;
                    for(Car car : carList){
                        if(car.getCarId().equals(carId) && !car.isAvailable()){
                            carToReturn=car;
                            break;
                        }
                    }
                    if(carToReturn!=null){
                        Customer customer=null;
                        for(Rental rental : rentalList){
                            if(rental.getCar()==carToReturn){
                                customer=rental.getCustomer();
                                break;
                            }
                        }
                        if(customer!=null){
                            returnCar(carToReturn);
                            System.out.println("Car Returned successfully :- "+customer.getCustomerName());
                        }else{
                            System.out.println("Car was not returned or information was mismatched..");
                        }
                    }else{
                        System.out.println("Invalid car or Car ID");
                    }
                    break;
                }
                case 3: return;
            }
        }
    }
}

public class CarRentalSystem {
    public static void main(String[] args) {
        RentalSystem rentaSystem=new RentalSystem();

        Car car1=new Car("C001","Thar","Mahindra",560);

        rentaSystem.addCar(car1);
        rentaSystem.menu();
    }
}
