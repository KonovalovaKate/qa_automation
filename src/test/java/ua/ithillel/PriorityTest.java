package ua.ithillel;

import org.testng.annotations.Test;


public class PriorityTest {
    @Test(priority = 0)
    public void testOne() {
        System.out.println("one");
    }

    @Test(priority = 1)
    public void testTwo() {
        System.out.println("two");

    }
    @Test(priority = 2)
    public void testThree(){
        System.out.println("three");

    }
}
