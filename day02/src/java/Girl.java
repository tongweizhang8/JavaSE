package java;

public class Girl {
    private String name;
    private int age;

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void marry(Boy boy){
        System.out.println("我想嫁给" + boy.getName());
        boy.marry(this);
    }
    /**
     * @Description 比较两个对象大小
     * @author shkstart
     * @data 2019年1月18日下午4：02：09
     * @param girl
     * @retuen 正数：当前对象大； 负数：当前对象小； 0：当前对象与形参对象相等
     */
    public int compare(Girl girl){
        if (this.age > girl.age){
            return 1;
        } else if (this.age < girl.age){
            return -1;
        }else{
            return 0;
        }
    }

}
