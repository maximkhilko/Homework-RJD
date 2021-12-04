package com.learnup.lesson6.trains;

import com.learnup.lesson6.Transferer;

public class FreightTrain extends Trains implements Transferer {
    @Override
    public void transfer(Object luggage, String from, String to) {
        super.transfer(luggage, from, to);
        System.out.printf("Отправка %s из %s в %s\n",luggage,from,to);
    }

    @Override
    public void fillUp(int liters) {

        super.fillUp(500);
    }
}