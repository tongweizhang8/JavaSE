package domain;

public class NoteBook implements Equipment{
    private String model;//機器的型號
    public double price;//價格

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public NoteBook() {
    }

    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model + " (" + price + ")";
    }
}
