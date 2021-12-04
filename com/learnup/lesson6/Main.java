package com.learnup.lesson6;



import com.learnup.lesson6.employees.Controller;
import com.learnup.lesson6.employees.TrainDriver;
import com.learnup.lesson6.trains.HighSpeedTrain;
import com.learnup.lesson6.trains.FreightTrain;

public class Main {

    public static void main(String[] args) {
        HighSpeedTrain flash = new HighSpeedTrain();
        flash.fillUp(400);
        flash.transfer("Васю","Москва","Анапа");
        System.out.println();


        Controller controller = new Controller();
        controller.greetings("контроллёр");
        controller.getSalary(17000);
        controller.ticketVerification();
        System.out.println();

        Transferer[] transfer = new Transferer[3];
        transfer[0] = new FreightTrain();
        transfer[1] = new HighSpeedTrain();
        transfer[2] = new TrainDriver();

        transferAll("объект","Москва","Питер",transfer);
    }

    private static void transferAll(Object luggage, String from,String to, Transferer[] transfer){
        for(Transferer ts : transfer){
            ts.transfer(luggage, from, to);
        }    }
}
