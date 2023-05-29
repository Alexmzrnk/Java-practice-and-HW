package HW25;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour
        as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health.
        Car class has it’s own attribute as carModel and Class Pet has petType attribute.
        Create 3 objects of the sub classes and store them in ArrayList.
        Using for loop/advanced for loop/ iterator access all methods of the class.*/
public abstract class Insurance {
    String insuranceName;

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    abstract int getQuote();

    abstract void cancelInsurance();
}

class Car extends Insurance {
    String carModel;

    public Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel = carModel;
    }

    @Override
    int getQuote() {
        return 480;
    }

    @Override
    void cancelInsurance() {
        System.out.println("Car insurance " + insuranceName + " cancelled");
    }
}

class Pet extends Insurance {

    String petType;

    public Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType = petType;
    }

    @Override
    int getQuote() {
        return 180;
    }
    @Override
    void cancelInsurance() {
        System.out.println("Pet insurance " + insuranceName + " cancelled");
    }
}
class Health extends Insurance {

    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    int getQuote() {
        return 150;
    }
    @Override
    void cancelInsurance() {
        System.out.println("Health insurance " + insuranceName + " canceled");
    }
}

class InsuranceTester {

    public static void main(String[] args) {

        List<Insurance> insurances = new ArrayList<>();

        insurances.add(new Car("Geico", "BMW X5"));
        insurances.add(new Pet("PetFed", "Dog"));
        insurances.add(new Health("GreenLife"));

        for (Insurance i : insurances) {
            System.out.println(i.insuranceName);
            System.out.println("Your quote is $" + i.getQuote()+"for 6 month");
            i.cancelInsurance();
        }
        System.out.println("*********************");
        Iterator<Insurance> i = insurances.iterator();
        while (i.hasNext()) {
            Insurance isr=i.next();
            System.out.println("Your quote is $"+isr.getQuote()+" for 6 month");
            isr.cancelInsurance();
        }
    }
}