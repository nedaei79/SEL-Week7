package com.unittest.codecoverage.models;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FootpassengerTests {
    @Test
    public void testFootpassenger_shouldSetAndGetCrossedTheCrosswalkCorrectly() {
        Footpassenger footpassenger = new Footpassenger();
        footpassenger.setCrossedTheCrosswalk(true);

        Assertions.assertThat(footpassenger.crossedTheCrosswalk()).isEqualTo(true);
    }
}
