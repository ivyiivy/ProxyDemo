import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Scanner;

public class Proxydemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner in=new Scanner(System.in);
        String className=in.nextLine();

//        System.out.println(Arrays.toString(proxy.getClass().getInterfaces()));
        if(className.contains("School")){
            SchoolService proxy=(SchoolService) Proxy.newProxyInstance(UserService.class.getClassLoader(),new Class[]{UserService.class,SchoolService.class},new ServiceInvocationProxy(className));
            proxy.querySchoolName(2);
        }
        else if(className.contains("UserService"))
        {
            UserService proxy=(UserService) Proxy.newProxyInstance(UserService.class.getClassLoader(),new Class[]{UserService.class,SchoolService.class},new ServiceInvocationProxy(className));
            proxy.getUserCount();
            proxy.getUserInfo();
        }





    }
}
