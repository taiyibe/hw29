package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        Person p = new Person("Карлсон", "Бах-Соломон Богомолов", 38);
        assertEquals(p.getName(), "Карлсон");
    }

    @Test
    void getAge() {
        Person p = new Person("Карлсон", "Бах-Соломон Богомолов", 38);
        assertEquals(p.getAge(), 38);
    }

    @Test
    void testToString() {
        Person p = new Person("Карлсон", "Бах-Соломон Богомолов", 38);
        assertEquals(p.toString(), "Карлсон Бах-Соломон Богомолов Возраст: 38");
    }
}