package os;

import abs.aFeatures;


public class OperationSystem extends aFeatures {
    protected String ios;

    protected OperationSystem(int price, String brand, String model, String processor, String category, String ios) {
        super(price, brand, model, processor, category);
        this.ios = ios;
    }

    public String getios() {
        return ios;
    }

    public void setiCloud(String ios) {
        this.ios = ios;
    }

    public OperationSystem() {
    }


}

