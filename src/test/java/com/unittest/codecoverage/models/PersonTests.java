package com.unittest.codecoverage.models;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTests {
    @Test
    public void testPerson_shouldSetAndGetAgeCorrectly() {
        Person person = new Person();
        person.setName("Name");
        person.setAge(21);
        person.setGender(Gender.M);

        Assertions.assertThat(person.getAge()).isEqualTo(21);
    }
}
