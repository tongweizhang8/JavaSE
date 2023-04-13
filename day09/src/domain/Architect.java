package domain;

public class Architect extends Designer{
    private int stock;

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public Architect() {
        super();
    }

    @Override
    public String toString() {
        return getDetails() + "\t架構師\t" + getStatus() + "\t" + getBonus() + "\t" + stock + "\t\t" + getEquipment().getDescription();
    }
}
