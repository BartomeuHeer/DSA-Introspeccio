import java.lang.reflect.*;
import java.util.List;

public class main {
    public static void main(String[] args) {
        User us = new User();
        Class user = us.getClass();

        System.out.println("Name:" + user.getName());
        Method[] methodes = user.getDeclaredMethods();
        for (Method m: methodes)
            System.out.println(m.toString());



    }

}
