package com.neoversity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

class AssignmentsTest {

    @Test
    void testTask1_emptyList() {
        assertEquals("", Assignments.task1(List.of()));
    }

    @Test
    void testTask1_oneElement() {
        assertEquals("", Assignments.task1(List.of("OnlyOne")));
    }

    @Test
    void testTask1_twoElements() {
        assertEquals("1. Two", Assignments.task1(List.of("One", "Two")));
    }

    @Test
    void testTask1_spacingFormat() {
        List<String> names = List.of("Anna", "Bella", "Cara", "Dora");
        assertEquals("1. Bella, 3. Dora", Assignments.task1(names));
    }

    @Test
    void testTask2_basic() {
        List<String> input = List.of("apple", "banana", "cherry");
        List<String> result = Assignments.task2(input);
        assertEquals(List.of("CHERRY", "BANANA", "APPLE"), result);
    }

    @Test
    void testTask2_empty() {
        assertTrue(Assignments.task2(List.of()).isEmpty());
    }

    @Test
    void testTask3_flattenAndSort() {
        String[] input = {"1, 2, 0", "4, 5"};
        assertEquals("0, 1, 2, 4, 5", Assignments.task3(input));
    }

    @Test
    void testTask3_emptyArray() {
        String[] input = {};
        assertEquals("", Assignments.task3(input));
    }

    @Test
    void testTask4_generatorValues() {
        long a = 17L;
        long c = 43L;
        long m = 1000L;
        long seed = 1L;

        List<Long> expected = List.of(1L, 60L, 63L, 114L, 981L, 720L);
        List<Long> actual = Assignments.task4(a, c, m, seed)
            .limit(6)
            .toList();

        assertEquals(expected, actual);
    }

    @Test
    void testTask5_equalSize() {
        Stream<String> zipped = Assignments.task5(
            Stream.of("A", "B", "C"),
            Stream.of("1", "2", "3")
        );
        assertEquals(List.of("A", "1", "B", "2", "C", "3"), zipped.toList());
    }

    @Test
    void testTask5_firstShorter() {
        Stream<String> zipped = Assignments.task5(
            Stream.of("A"),
            Stream.of("1", "2", "3")
        );
        assertEquals(List.of("A", "1"), zipped.toList());
    }

    @Test
    void testTask5_secondShorter() {
        Stream<String> zipped = Assignments.task5(
            Stream.of("A", "B", "C"),
            Stream.of("1")
        );
        assertEquals(List.of("A", "1"), zipped.toList());
    }

    @Test
    void testTask5_bothEmpty() {
        Stream<Object> zipped = Assignments.task5(Stream.of(), Stream.of());
        assertTrue(zipped.toList().isEmpty());
    }

    @Test
    void testTask5_oneEmpty() {
        Stream<String> zipped = Assignments.task5(Stream.of("A", "B"), Stream.of());
        assertTrue(zipped.toList().isEmpty());
    }

}
