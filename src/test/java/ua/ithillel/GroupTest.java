package ua.ithillel;

import org.testng.annotations.Test;

import static utils.TestSuiteUtils.REGRESSION;
import static utils.TestSuiteUtils.SMOKE;

public class GroupTest {
    @Test(groups = {SMOKE})
    public void testOne() {
        System.out.println(SMOKE);
    }

    @Test(groups = {REGRESSION})
    public void testTwo() {
        System.out.println(REGRESSION);

    }
    @Test(groups = {SMOKE, REGRESSION})
        public void testThree(){
            System.out.println(SMOKE + REGRESSION);

        }


}

