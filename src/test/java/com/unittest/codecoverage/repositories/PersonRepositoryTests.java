package com.unittest.codecoverage.repositories;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class PersonRepositoryTests {
    @Test
    public void testGet_shouldReturnNullWhenPersonNameIsNonNull() {
        PersonRepository personRepository = new PersonRepository();
        assertThat(personRepository.get("valid")).isNull();
    }
}
