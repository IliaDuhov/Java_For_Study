import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Main {
    public static void main(String[] args) throws Throwable {
        C c = new C();
        System.out.println(fieldCollection(c));
        Human h = new Human(20, 180);
        validate(h, HumanTest.class);
        Constructor[] carr = h.getClass().getDeclaredConstructors();
        Object ob = carr[0].newInstance(40, 200);
        System.out.println(ob);
        
    }
    /**
    * 
    * method collects fields of every class in the hierarchy;
    */
    public static List fieldCollection(Object obj){
        Class clz = obj.getClass();
        List<Field> lst = new ArrayList(Arrays.asList(clz.getDeclaredFields()));
        while(clz.getSuperclass()!=Object.class){
            clz = clz.getSuperclass();
            lst.addAll(Arrays.asList(clz.getDeclaredFields()));
        }
        return lst;
    }
    /**
    * 
    * method checks if fields of the class are validate using special class for tests;
    */
    public static void validate(Object object, Class testClass) throws Throwable{
        for(Method method: testClass.getDeclaredMethods()){
            method.invoke(testClass.newInstance(), object);
        }
    }
        
}
