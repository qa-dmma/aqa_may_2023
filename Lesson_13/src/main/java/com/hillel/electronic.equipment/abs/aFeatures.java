package abs;

public abstract class aFeatures {
    private int price;
    private String brand;
    private String model;
    private String processor;
    private String category;

    protected aFeatures(int price, String brand, String model, String processor, String category) {
        this.price = price;
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.category = category;
    }

    protected aFeatures() {

    }

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {

        this.price = price;
    }

    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProcessor() {

        return processor;
    }

    public void setProcessor(String processor) {

        this.processor = processor;
    }

    public String getCategory() {

        return category;
    }

    public void setCategory(String category) {

        this.category = category;
    }
}
