package main;

import java.lang.Class;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;


public class TestReflection implements Cloneable{
    public int value = 11;
    private String str = "Hello";
    private String vls;

    public TestReflection(String v){
        vls =v;
    }

    public TestReflection(){
        vls = "";
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException {
        Class cl = TestReflection.class;
        System.out.println(cl.getName());
        System.out.println(cl.getCanonicalName());
        System.out.println("========================");
        // don't work:
        // Object nw = Class.forName("stepic_java_webserver-master.MyTests.src.main.java.main.TestReflection").newInstance();
        //System.out.println(nw instanceof TestReflection);

        System.out.println(cl.getField("value"));
        Field[] fa = cl.getFields();
        System.out.println(Arrays.toString(fa));
        System.out.println("========================");

        Class[] cls = cl.getInterfaces();
        System.out.println(Arrays.toString(cls));
        System.out.println("========================");

        Method[] ma = cl.getMethods();
        System.out.println(Arrays.toString(ma));
        System.out.println("========================");

        Method[] dma = cl.getDeclaredMethods();
        System.out.println(Arrays.toString(dma));
        System.out.println("========================");

        Constructor[] ca = cl.getConstructors();
        System.out.println(Arrays.toString(ca));
        System.out.println("========================");

        Constructor[] dca = cl.getDeclaredConstructors();
        System.out.println(Arrays.toString(dca));
    }

    public void myMethod(int helper){

    }
}