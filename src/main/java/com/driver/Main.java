package com.driver;

import java.util.Scanner;

public class Main {
  public static class Product{       // task 1

    public int product(int x, int y){   // task 3
      return x * y;
    }

    public int product(int x, int y, int z) {   // task 4
      return x * y * z;
    }

    public double product(double x, double y) {  // task 5
      return x * y;
    }
    
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    Product p = new Product();    // task 2

    int ans1 = p.product(sc.nextInt(), sc.nextInt());  // task 3 called
//    System.out.println(ans1);

    int ans2 = p.product(sc.nextInt(), sc.nextInt(), sc.nextInt());  // task 4 called
//    System.out.println(ans2);

    double ans3 = p.product(sc.nextDouble(), sc.nextDouble());  // task 5 called
//    System.out.println(ans3);

  }
}
