package com.learnup.lesson6.trains;

import com.learnup.lesson6.Transferer;

public class HighSpeedTrain extends Trains implements Transferer {

    @Override
    public void transfer(Object luggage, String from, String to) {
        if (trainLiters < LITERS_PER_ONE_TRANSFER) {
            System.out.println("Отправление невозможно,мало топлива!");
            return;
        }
        if (from.equals(to)) {
            System.out.println("Некорректный рейс");
            return;
        }

        System.out.printf("Перевожу %s из %s в %s\n", luggage, from, to);
        trainLiters -= LITERS_PER_ONE_TRANSFER;
        if (to.equals("Киев")) {
            System.out.println("Отправление в данный город невозможно");
        }
    }

    @Override
    public void fillUp(int liters) {
        super.fillUp(500);
    }
}