package org.stepdefintion;

import io.cucumber.java.*;

public class HooksClass {
@Before
public void befor() {
System.out.println("---------------Before------------------");
}
@After
public void After() {
System.out.println("---------------After------------------");
}



}
