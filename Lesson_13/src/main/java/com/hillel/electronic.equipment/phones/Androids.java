package phones;


import abs.iSmartphones;
import os.OperationSystem;

public class Androids extends OperationSystem implements iSmartphones {
    public boolean accGoogle;

    public Androids(int price, String brand, String model, String processor, String category, String ios, boolean accGoogle) {
        super(price, brand, model, processor, category, ios);
        this.accGoogle = accGoogle;
    }


    public void GoogleAcc() {
        if (accGoogle == false) {
            System.out.println("Google Account is not set up for " + getBrand() + getModel());
        } else {
            System.out.println("Google Account is set up for " + getBrand() + getModel());
        }
    }

    public boolean getaccGoogle() {
        return accGoogle;
    }


    @Override
    public void call(String user) {
        System.out.println("Calling the '" + user + "' from " + getBrand() + getModel());

    }

    @Override
    public void sms(String user, String message) {
        System.out.println("Text to the '" + user + "' from " + getBrand() + getModel() + ". Message: '" + message + "'");
    }

    @Override
    public void internet(boolean availability) {
        if (availability == false) {
            System.out.println("Internet is not available for " + getBrand() + getModel());
        } else {
            System.out.println("Internet is available for " + getBrand() + getModel());
        }
    }


    @Override
    public String toString() {
        return "Price - '" + getPrice() + "'\n"
                + "Brand - '" + getBrand() + "'\n"
                + "Model - '" + getModel() + "'\n"
                + "Processor - '" + getProcessor() + "'\n"
                + "Category - '" + getCategory() + "'\n"
                + "Opertion System - '" + getios() + "'\n"
                + "Google Account - '" + getaccGoogle() + "'\n";
    }

    @Override
    public void printAll() {
        System.out.println(toString());
    }
}



