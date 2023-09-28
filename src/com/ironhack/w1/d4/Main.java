package com.ironhack.w1.d4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

//        ABSTRACT CLASSES & INTERFACES

        WebPlayer webPlayer = new WebPlayer(0.5, 1);
        ApplePlayer applePlayer = new ApplePlayer(0.2, 2);
//        Player player = new Player(0.3, 3);  // we cannot create an instance of an abstract class

        System.out.println(webPlayer.getCurrentTrack());
        webPlayer.close();
        applePlayer.close();
        applePlayer.play();
        applePlayer.increaseVolume();
        System.out.println(applePlayer.getVolume());

        AndroidPlayer androidPlayer = new AndroidPlayer(0.3, 3);

        androidPlayer.play();
        System.out.println(androidPlayer.share());


//        BIG DECIMAL

        System.out.println(1.2 - 1.0);
        BigDecimal bd1 = new BigDecimal("1.2234234");
        BigDecimal bd2 = new BigDecimal("2.0234234");

        System.out.println(bd1.subtract(bd2));
        System.out.println(bd1.add(bd2));
        System.out.println(bd1.multiply(bd2));
        System.out.println(bd1.divide(bd2, RoundingMode.HALF_EVEN));
        System.out.println(bd2.setScale(2, RoundingMode.HALF_EVEN));
        System.out.println(bd1.compareTo(bd2));

        if (bd1.compareTo(bd2) > 0) System.out.println("bd1 is greater than bd2");
        else if (bd1.compareTo(bd2) == 0) System.out.println("bd1 is equal to bd2");
        else if (bd1.compareTo(bd2) < 0) System.out.println("bd1 is less than bd2");
    }
}
