package tech.kamikazi.ci_cd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestingCITest {

    @Test
    public void failingTest() {
        // This test is deliberately failing
        assertEquals(1, 2, "This test should fail");
    }

    @Test
    public void passingTest() {
        // Optional: a test that passes
        assertEquals(5, TestingCI.add(2, 3));
    }
}
