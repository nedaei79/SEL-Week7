package com.unittest.codecoverage.models;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrafficTests {
    @Test
    public void testFootpassengerCrossTheStreet_shouldSetAndGetTrafficFlowCorrectly() {
        Traffic traffic = new Traffic();
        traffic.setStreetDirectionFlow(StreetDirectionFlow.TWO_WAY);

        Assertions.assertThat(traffic.getStreetDirectionFlow()).isEqualTo(StreetDirectionFlow.TWO_WAY);
    }
}
