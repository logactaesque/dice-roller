package uk.org.hexsaw.logactaesque;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(JUnit4.class)
public class DiceControllerIntegrationTest {

    @Test
    public void noddyIntegrationTest() {
        assertThat(false, equalTo(false));
    }
}

