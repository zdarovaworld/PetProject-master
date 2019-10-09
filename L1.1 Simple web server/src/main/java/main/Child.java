package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Child extends Parent {

    public static void main(String[] args) {
//        Child child = new Child();
//        child.setName("Child");
//        System.out.println(child.getName());
//        double d = Double.parseDouble(" 5.55  ");
//        System.out.println(d);
//        String tata = "key1=valu1;key2=valu2;key1=valu1;key1=valu1;key1=valu1;";
//        String[] arr = tata.split("[=;]");
//        System.out.println(Arrays.toString(arr));
//
//        System.out.println(tata(3.44, 5.55));



        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.toString());


        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("tata" + i);
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        System.out.println("main off");
    }

    public static String tata(Double d, Double d2) {
        String str = String.format("%.2f * m1 + %.2f * m2", d, d2);
        return str;
    }
}
