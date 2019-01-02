package be.realdolmen.training.agile.exercise;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class WisherTest {

    private Wisher greeting = new Wisher();

    @Test
    public void wishReturnsHappyNewYear() {
        assertThat(greeting.wish()).isEqualTo("Happy New Year!");
    }
}