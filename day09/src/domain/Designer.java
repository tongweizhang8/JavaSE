package domain;

public class Designer extends Programmer{
    private double bonus;

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Designer() {
        super();
    }

    @Override
    public String toString() {
        return getDetails() + "\t設計師\t" + getStatus() + "\t" + bonus + "\t\t" + getEquipment().getDescription();
    }
}
