package study_interface;

import com.sun.java.browser.net.ProxyService;
import com.sun.security.ntlm.Server;

/*
接口的应用；代理模式
 */
public class NetWorkTest {
    public static void main(String[] args) {
        Server1 server = new Server1();
        ProxyServe proxyServe = new ProxyServe(server);

        proxyServe.browse();
    }
}
interface NetWork{
    public void browse();
}

//被代理类
class Server1 implements NetWork{

    @Override
    public void browse() {
        System.out.println("真实的服务器访问网络");
    }
}
class ProxyServe implements NetWork{

    private NetWork work;

    public ProxyServe(NetWork work){
        this.work = work;
    }

    public void check(){
        System.out.println("联网之前检查工作");
    }

    @Override
    public void browse() {
        check();
    }
}
