package com.learnup.lesson6.trains;

public abstract class Trains {

    protected int LITERS_PER_ONE_TRANSFER = 400;
    int trainLiters;
    //private static final int MAX_LITERS = 3000;
    public static final String[] stations = {"Мытищи","Питер","Киев","Москва"};



    public void transfer (Object luggage,String from,String to) {
        if (trainLiters < LITERS_PER_ONE_TRANSFER) {
            System.out.println("Отправление невозможно,мало топлива!");
            return;
        }
        if (from.equals(to)){
            System.out.println("Некорректный рейс");
            return;
        }

        System.out.printf("Перевожу %s из %s в %s\n",luggage,from,to);
        trainLiters -= LITERS_PER_ONE_TRANSFER;
    }
    public void fillUp (int liters) {
        System.out.println("Заправили поезд на " + liters + " литров");
        trainLiters += liters;
    }
}