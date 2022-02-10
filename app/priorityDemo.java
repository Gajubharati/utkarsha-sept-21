package com.mycompany.app;

import org.testng.annotations.Test;

public class priorityDemo {
  @Test(priority = 2,groups = "A")
  public void a() {
	  System.out.println("A");
  }
  @Test(priority = 3,groups = "B")
  public void b() {
	  System.out.println("B");
  }
  @Test(priority = 1,groups = "C")
  public void c() {
	  System.out.println("C");
  }
  @Test(groups = "D")
  public void d() {
	  System.out.println("D");
  }
}
