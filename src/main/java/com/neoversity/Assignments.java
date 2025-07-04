package com.neoversity;

import java.util.*;
import java.util.stream.*;

public class Assignments {

    /**
     * Метод приймає на вхід список імен.
     * Необхідно повернути рядок вигляду 1. Ivan, 3. Peter... лише з тими іменами, що стоять під непарним індексом (1, 3 тощо)
     *
     * @param names список імен
     * @return String
     */
    public static String task1(List<String> names) {
        return null;
    }

    /**
     * Метод приймає на вхід список рядків.
     * Повертає список цих рядків у верхньому регістрі, і відсортованих за спаданням (від Z до A).
     *
     * @param items список рядків
     * @return список рядків у верхньому регістрі, відсортованих за спаданням
     */
    public static List<String> task2(List<String> items) {
        return null;
    }

    /**
     * Метод приймає на вхід масив рядків, де кожен рядок містить числа, розділені комами.
     * Необхідно отримати всі числа і вивести їх у відсортованому вигляді через кому, наприклад:
     * "0, 1, 2, 4, 5" з вхідного масиву {"1, 2, 0", "4, 5"}.
     *
     * @param array масив рядків, де кожен рядок містить числа, розділені комами
     * @return рядок з відсортованими числами, розділеними комами
     */
    public static String task3(String[] array) {
        return null;
    }

    /**
     * Використовуючи Stream.iterate, створіть безкінечний стрім випадкових чисел, але не використовуючи Math.random().
     * Реалізуйте свій лінійний конгруентний генератор.
     * Для цього почніть з x[0] = seed, і далі кожний наступний елемент рахуйте за формулою
     * x[n + 1] = 1 (a x[n] + c) % m для коректних значень a, c, та m.
     *
     * @param a коефіцієнт a
     * @param c коефіцієнт c
     * @param m модуль m
     * @param seed початкове значення seed
     * @return безкінечний стрім випадкових чисел
     */
    public static Stream<Long> task4(long a, long c, long m, long seed) {
        return null;
    }

    /**
     * Метод приймає на вхід два стріми, які містять однакову кількість елементів.
     * Необхідно повернути стрім, який чергує елементи з обох стрімів.
     * Наприклад, для стрімів A, B, C та 1, 2, 3, 4 результатом буде A, 1, B, 2, C, 3.
     * Треба зупинитися тоді, коли у одного зі стрімів закінчаться елементи.
     *
     * @param first перший стрім
     * @param second другий стрім
     * @return чергований стрім
     */
    public static <T> Stream<T> task5(Stream<T> first, Stream<T> second) {
        return null;
    }
}
