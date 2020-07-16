import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ServiceInvocationProxy  implements InvocationHandler {

    private  String className;
    public ServiceInvocationProxy(String className){
        this.className=className;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before execute "+proxy.getClass().getName()+" "+method.getName());
        Object o=Class.forName(className).newInstance();
        System.out.println(method.invoke(o,args));
        System.out.println("after excute"+proxy.getClass().getName()+" "+method.getName());
        return null;
    }
}
