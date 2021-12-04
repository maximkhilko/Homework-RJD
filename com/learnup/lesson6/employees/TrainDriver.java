package com.learnup.lesson6.employees;

import com.learnup.lesson6.Transferer;

public class TrainDriver extends Employees implements Transferer {


    @Override
    public void transfer(Object luggage, String from, String to) {
        System.out.printf("Перевожу %s рейсом %s - %s",luggage,from,to);
    }
}