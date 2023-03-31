package com.ust.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SecondTest {
  @Test(priority=1)
  public void f() {
	  System.out.println("From test method f()");
  }
  
  @Test(priority=2,description="Tests a description")
  public void a() {
	  System.out.println("From test method a()");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("From before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("From after test");
  }

}

