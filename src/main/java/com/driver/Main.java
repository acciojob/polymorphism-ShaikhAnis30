package com.driver;

public class Main {
  class Product{
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
    Product p = new Product();
    p.product(2, 3);
    
    p.product(4, 5, 8);
    
    p.product(7.48, 5.65);
  }
}
