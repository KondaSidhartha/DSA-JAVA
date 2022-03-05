package com.sidhartha.staticex;

import java.util.Arrays;

//as outer clses cant be static and output this gives kunal and rahul
class Test {
    String name;
    public Test(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
//this gives output rahul and rahul as string is static
class Test1 {
    static String name;
    public Test1(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class InnerClasses {

    //class test without static dont work becoz we need to require objewct of innerclaases method in order to work
    //output gives kunal and rahul as even though the method is static ,main and test can have instances of each other
    static class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    //this gives rahul and rahul as string is static
    static class Test1 {
        String name;
        public Test1(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");

        System.out.println(a);

//        System.out.println(a.name);
//        System.out.println(b.name);
    }
}