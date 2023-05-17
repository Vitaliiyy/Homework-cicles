package ru.netology.services;

public class ServiceClass {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0; // счетчик остатка денег который мы сравниваем с параметром threshold
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3;

            } else {
                money = money + (income - expenses);
            }
        }
        return count;
    }
}
