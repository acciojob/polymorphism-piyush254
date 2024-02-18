package com.driver;

public class Main {
    static class Product{
        public int product(int x , int y) {
            return x*y;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }
    public static void main(String[] args) {
        Product p = new  Product();
      int result =  p.product(2,4);
      double result1 = p.product(5,10);
        System.out.println(result);
        System.out.println(result1);
    }
}