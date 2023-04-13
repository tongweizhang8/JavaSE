import java.sql.SQLOutput;
import java.util.List;

/*
 * 创建 DAO 类的对象， 分别调用其 save、get、update、list、delete 方法来操作 User 对象，
 使用 Junit 单元测试类进行测试。

 * @author shkstart
 * @create 2019 下午 3:45
 */
public class DAOTest1 {
    public static void main(String[] args) {
        DAO1<User> dao = new DAO1<>();
        dao.save("1001",new User(1001,34,"周杰伦"));
        dao.save("1002",new User(1002,20,"昆凌"));
        dao.save("1003",new User(1003,25,"蔡依林"));
        dao.update("1003",new User(1003,30,"方文山"));
        dao.delete("1002");
        List<User> list = dao.list();
        //System.out.println(List);
        list.forEach(System.out::println);
    }
}
