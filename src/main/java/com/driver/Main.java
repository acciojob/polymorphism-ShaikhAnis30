package com.driver;

import java.util.Scanner;

public class Main {
  public class Product{
    public int product(int x, int y){
      int ans = x * y;
      return ans;
    }
    

    public int product(int x, int y, int z){
      int ans = x * y * z;
      return ans;
    }
    

    public double product(double x, double y){
      double ans = x * y;
      return ans;
    }
    
  }
  public void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    Product p = new Product();
    p.product(sc.nextInt(), sc.nextInt());
    
    p.product(sc.nextInt(), sc.nextInt(), sc.nextInt());
    
    p.product(sc.nextDouble(), sc.nextDouble());
  }
}
