package com.example;
/**
 * @author Hugo Ramirez Jr.
 * @date 10/26/2025
 * Module 7 - Fan Project
 * @description this class tests the Fan class using JUnit.
 */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class FanTest {

    private Fan defaultFan;
    private Fan customFan;

    @BeforeEach
    void setUp() {
        defaultFan = new Fan();
        customFan = new Fan(Fan.FAST, true, 10, "blue");
    }

    @Test
    void testDefaultConstructor() {
        assertEquals(Fan.STOPPED, defaultFan.getSpeed(), "Default speed should be STOPPED");
        assertFalse(defaultFan.isOn(), "Default fan should be off");
        assertEquals(6.0, defaultFan.getRadius(), "Default radius should be 6");
        assertEquals("white", defaultFan.getColor(), "Default color should be white");
    }

    @Test
    void testCustomConstructor() {
        assertEquals(Fan.FAST, customFan.getSpeed());
        assertTrue(customFan.isOn());
        assertEquals(10.0, customFan.getRadius());
        assertEquals("blue", customFan.getColor());
    }

    @Test
    void testSettersAndGetters() {
        defaultFan.setSpeed(Fan.MEDIUM);
        defaultFan.setOn(true);
        defaultFan.setRadius(8.5);
        defaultFan.setColor("green");

        assertEquals(Fan.MEDIUM, defaultFan.getSpeed());
        assertTrue(defaultFan.isOn());
        assertEquals(8.5, defaultFan.getRadius());
        assertEquals("green", defaultFan.getColor());
    }

    @Test
    void testToStringOutput() {
        String offOutput = defaultFan.toString();
        assertTrue(offOutput.contains("Fan is OFF"));
        assertTrue(offOutput.contains("Color: white"));

        String onOutput = customFan.toString();
        assertTrue(onOutput.contains("Fan is ON"));
        assertTrue(onOutput.contains("Speed: 3"));
    }

    @Test
    void testDisplayAllFansDoesNotThrow() {
        List<Fan> fans = new ArrayList<>();
        fans.add(defaultFan);
        fans.add(customFan);

        assertDoesNotThrow(() -> UseFans.displayAllFans(fans));
    }

    @Test
    void testDisplaySingleFanDoesNotThrow() {
        assertDoesNotThrow(() -> UseFans.displayFan(customFan));
    }
}
