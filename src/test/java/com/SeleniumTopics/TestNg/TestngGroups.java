package com.SeleniumTopics.TestNg;

import org.testng.annotations.Test;

public class TestngGroups {
	@Test(groups = { "group-one" })
    public void testMethodOne() {
        System.out.println("Test method one belonging to group-one.");
    }
 
    @Test(groups = { "group-one","group-two" })
    public void testMethodTwo() {
        System.out.println("Test method two belonging to group-one and group-two");
    }
 
    @Test(groups = { "group-one"})
    public void testMethodThree() {
        System.out.println("Test method three belonging to group-one");
    }
}
