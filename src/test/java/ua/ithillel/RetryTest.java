package ua.ithillel;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.util.RetryAnalyzerCount;
import ua.ithillel.retry.Retry;

public class RetryTest {
    @Test(retryAnalyzer = Retry.class)
    public void testRetry() {
        System.out.println("Hey! This is test of retry");
        Assert.assertTrue(true);

    }

    @Test()
    public void testRetryWithListener() {
        System.out.println("Hey! This is test of retry");
        Assert.assertTrue(false);

    }
}

