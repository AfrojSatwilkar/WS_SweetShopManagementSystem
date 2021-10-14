package com.bridglabz.sweetshop;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        System.out.println("Welocme to sweet shop management system ");

        Modak modak = new Modak();
        modak.price = 120;
        modak.id = "M001";
        Jalebi jalebi = new Jalebi();
        jalebi.price = 140;
        jalebi.id = "J001";
        BadamHalwa badamHalwa = new BadamHalwa();
        badamHalwa.price = 40;
        badamHalwa.id = "B001";
        Rasgulla rasgulla = new Rasgulla();
        rasgulla.price = 85;
        rasgulla.id = "R001";
        Nankhatai nankhatai = new Nankhatai();
        nankhatai.price = 100;
        nankhatai.id = "N001";
        Nankhatai nankhatai1 = new Nankhatai();
        nankhatai1.price = 110;
        nankhatai1.id = "N001";
        DatesBarfi datesBarfi = new DatesBarfi();
        datesBarfi.price = 120;
        datesBarfi.id = "D001";
        Rabadi rabadi = new Rabadi();
        rabadi.price = 150;
        rabadi.id = "R001";
        SweetRepository sweetRepository = new SweetRepository();

        sweetRepository.add(modak);
        sweetRepository.add(jalebi);
        sweetRepository.add(badamHalwa);
        sweetRepository.add(rasgulla);
        sweetRepository.add(nankhatai);
        sweetRepository.add(nankhatai1);
        sweetRepository.add(datesBarfi);
        sweetRepository.add(rabadi);

        Set sweetList = sweetRepository.getSweetList();
        UserInterface userInterface = new UserInterface();
        userInterface.print(sweetList);

        sweetRepository.delete(modak);
        sweetRepository.delete(jalebi);

        System.out.println("After deleting :");
        userInterface.print(sweetList);

        System.out.println("Diet sweet : ");
        userInterface.printDietSweet(sweetList);

        System.out.println("Normal Sweet :");
        userInterface.printNormalSweet(sweetList);
    }
}
