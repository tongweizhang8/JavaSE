import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class protertiesTest {
    //Proterties:常用来处理配置文件，key和value都是String类型
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        try {
            Properties pros = new Properties();
            fis = new FileInputStream("jdbc.properties");
            pros.load(fis);//加载对应流文件
            String name = pros.getProperty("name");
            String password = pros.getProperty("password");
            System.out.println("nmae=" + name + " password=" + password);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fis != null) {
                fis.close();
            }
        }
    }
}
