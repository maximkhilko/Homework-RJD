package com.learnup.lesson6.employees;

public abstract class Employees {

    public static final int LIVING_WAGE = 18000;
    public static final String TEXT_MIN_SALARY = "Надо было учить джаву";


    public void greetings(String position) {

        System.out.println("Всем привет, я по профессии " + position);
    }

    public void getSalary(int salary) {

        System.out.println(salary > LIVING_WAGE ? String.format("Моя зарплата: %s рублей",salary) : TEXT_MIN_SALARY);

    }
}
