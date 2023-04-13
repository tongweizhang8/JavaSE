package study_Polyorphism;

public class Man extends Person{
    public boolean isSmoking;
    boolean smoking;
    int id = 1002;
    public void earnMoney(){
        System.out.println("男人负责赚钱");
    }

    @Override
    public void eat() {
        System.out.println("男人都吃肉，长肌肉");
    }

    @Override
    public void walk() {
        System.out.println("男人走路霸气");
    }
}
