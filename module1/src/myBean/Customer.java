package myBean;

import java.util.ArrayList;
import java.util.Date;

public class Customer extends Person {

    private static int num;

    public void eat() {
        System.out.println("customer is eating apple");
    }

    public Customer(String myHelloWorld) {
        this.myHelloWorld = myHelloWorld;
    }

    private static final int INITIAL_SIZE = 10;


    private String myHelloWorld;

    public static void main(String[] args) {
        //region Description
        regionDescription();
        //  method2();


//this is one line comment
    }

    private static void regionDescription() {
        System.out.println("myHelloWorld");
        //endregion
        System.out.println("myHelloWorld");

        ArrayList list = new ArrayList();


        final Date date = new Date();
        System.out.println(date);
    }





}
//    private String myHelloWorld;
//
//    private static final int INITIAL_SIZE = 10;
//
//    public void method() {
//
//    }
//    ArrayList list = new ArrayList();
//    ArrayList list = new ArrayList();
