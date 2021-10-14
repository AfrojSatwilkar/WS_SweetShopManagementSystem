package com.bridglabz.sweetshop;
import java.util.Set;

public class UserInterface {
    void print(Set<Sweet> set){
        for(Sweet getSweet : set){
            System.out.println(getSweet);
        }
    }

    void printDietSweet(Set<Sweet> set){
        for(Sweet getDietSweet : set){
            if(getDietSweet instanceof IDiet){
                System.out.println(getDietSweet);
            }
        }
    }

    void printNormalSweet(Set<Sweet> set){
        for(Sweet getNormalSweet : set){
            if(getNormalSweet instanceof IDiet){
                System.out.println(getNormalSweet);
            }
        }
    }
}
