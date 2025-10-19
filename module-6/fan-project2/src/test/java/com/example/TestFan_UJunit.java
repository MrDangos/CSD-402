package com.example;
/**
 * @author Hugo Ramirez Jr.
 * @date 10/19/2025
 * Module 6 - Fan Project
 * @description this class tests the Fan class using JUnit.
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFan_UJunit {
@Test
void testDefaultConstructor() {
    Fan fan = new Fan();
    assertEquals(Fan.STOPPED, fan.getSpeed());
    assertFalse(fan.isOn());
    assertEquals(6, fan.getRadius());
    assertEquals("white", fan.getColor());
}

@Test
void testParameterizedConstructor() {
    Fan fan = new Fan(Fan.FAST, true, 10, "blue");
    assertEquals(Fan.FAST, fan.getSpeed());
    assertTrue(fan.isOn());
    assertEquals(10, fan.getRadius());
    assertEquals("blue", fan.getColor());
}

@Test
void testSettersAndGetters() {
    Fan fan = new Fan();
    fan.setOn(true);
    fan.setSpeed(Fan.MEDIUM);
    fan.setRadius(8.5);
    fan.setColor("green");

    assertTrue(fan.isOn());
    assertEquals(Fan.MEDIUM, fan.getSpeed());
    assertEquals(8.5, fan.getRadius());
    assertEquals("green", fan.getColor());
}

@Test
void testToStringOn() {
    Fan fan = new Fan(Fan.SLOW, true, 7, "red");
    String output = fan.toString();
    assertTrue(output.contains("Fan is ON"));
    assertTrue(output.contains("Speed: " + Fan.SLOW));
    assertTrue(output.contains("Color: red"));
}

@Test
void testToStringOff() {
    Fan fan = new Fan();
    String output = fan.toString();
    assertTrue(output.contains("Fan is OFF"));
    assertTrue(output.contains("Color: white"));
}
}
