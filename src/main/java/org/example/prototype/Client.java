package org.example.prototype;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/17
 */
public class Client {

    public static void main(String[] args) {
        Prototype p1 = new Prototype();
        Prototype p2 = new Prototype();
        operation(p1);
        operation(p2);
    }

    public static Object operation(Prototype p) {
        Object pCopy = null;
        try {
            // 浅拷贝
            pCopy = p.clone();
            System.out.println("Operating with pCopy!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pCopy;
    }

    private static class Prototype {
        @Override
        public native Object clone ();
    }

}
