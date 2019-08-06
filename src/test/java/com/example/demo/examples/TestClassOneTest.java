package com.example.demo.examples;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestClassOneTest {

    TestClassOne testClassOne = new TestClassOne();

    @Test
    public void methodOne() {
        int result = testClassOne.methodOne(10);
        assertEquals(30, result);
    }
    @Test
    public void methodTwo() {
        int result = testClassOne.methodTwo(10);
        assertEquals(30, result);
    }
    @Test
    public void methodThree() {
        int result = testClassOne.methodThree(10);
        assertEquals(30, result);
    }
//    @Test
//    public void methodFour() {
//        int result = testClassOne.methodFour(10);
//        assertEquals(30, result);
//    }
}