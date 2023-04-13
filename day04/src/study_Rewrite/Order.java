package study_Rewrite;

/*
体会4种不同的权限修饰
 */
public class Order {
    private int orderPrivate;
    int orderDefault;
    protected int orderProtected;
    public int orderPublic;

    private void methodPrivate(){
        orderPrivate = 1;
        orderDefault = 1;
        orderProtected = 1;
        orderPublic = 1;
    }
    public void methhodDefault(){

    }
    protected void methodProtected(){

    }
    void methodPublic(){

    }
}
