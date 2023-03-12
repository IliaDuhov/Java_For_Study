
package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public final class Main {
    public static void main(String[] args) throws Throwable {
        C c = new C();
        System.out.println(fieldCollection(c));
        Human h = new Human(20, 180);
        validate(h, HumanTest.class);
        Constructor[] carr = h.getClass().getDeclaredConstructors();
        //Object ob = carr[0].newInstance(40, 200);//use the first constructor of the Human class
        //System.out.println(Arrays.asList(A.class.getAnnotatedInterfaces()));//get annotations of A class (comment @Target in annotions of Class A to check the impact of method)
        tester(A.class);
    }
    
    public static List fieldCollection(Object obj){
        Class clz = obj.getClass();
        List<Field> lst = new ArrayList(Arrays.asList(clz.getDeclaredFields()));
        while(clz.getSuperclass()!=Object.class){
            clz = clz.getSuperclass();
            lst.addAll(Arrays.asList(clz.getDeclaredFields()));
        }
        return lst;
    }
    public static void validate(Object object, Class testClass) throws Throwable{
        for(Method method: testClass.getDeclaredMethods()){
            method.invoke(testClass.newInstance(), object);
        }
    }
    @SafeVarargs //отключает warning на heap polution
    public static<T> void test(T...arr){
        
    } 
    public static void tester(Class<?> cl) throws Throwable{
        A a = (A)cl.newInstance();
        for(Method method : cl.getDeclaredMethods()){
            if(method.isAnnotationPresent(Testik.class)){
                Testik ts = method.getDeclaredAnnotation(Testik.class);
                Class<?> testClass = ts.value();
                method.invoke(a, testClass.getMethod("stringTest").invoke(null));//NoSuchMethodException?????????
            }
        } 
    }
        
}
