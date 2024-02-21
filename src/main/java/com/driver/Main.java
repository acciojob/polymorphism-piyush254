package com.driver;

public class Main {
  public  static class Product {
        public int product(int x, int y) {
            return x * y;
        }

        public double product(double x, double y) {
            return x * y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();
        int result = p.product(2, 4);
        double result1 = p.product(5, 10);
        int result2 = p.product(2,4,6);
        System.out.println(result2);
        System.out.println(result);
        System.out.println(result1);
    }
}