package com.driver;

public class Main {

    static public class Product {
        public Product() {

        }

        public int product(int x, int y) {
            return x+y;
        }

        public int product(int x, int y, int z) {
            return x+y+z;
        }

        public double product(double x, double y) {
            return x+y;
        }
    }

    public static void main(String[] args) {
        
        Product p = new Product();

        System.out.println(p.product(0, 0));
        System.out.println(p.product(0, 0, 0));
        System.out.println(p.product(0, 0));
    }
}