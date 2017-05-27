package com.mydomain;

import lejos.nxt.Motor;

/**HelloWorld.java
 * Basic introduction program
 * May 27, 2017
 * @author Jimmy Huynh
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Motor.A.forward();
    }
}