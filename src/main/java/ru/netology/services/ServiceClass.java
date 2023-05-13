package ru.netology.services;

public class ServiceClass {
    public int calculate(int income, int expenses) {
        int threshold = 0; // сумма при которой можно отдыхать
        int count = 0;
        for (int month = 0; month < 12; month++) {
            if (threshold >= 150_000) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                threshold = (threshold - expenses) / 3;

            } else {
                threshold = threshold + (income - expenses);
            }
        }
        return count;
    }
}
