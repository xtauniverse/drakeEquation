package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        drakeEquation();

    }

    public static void drakeEquation(){

/*Drake equation
N = number of intelligent species that can communicate with us
R∗ = 1 yr−1 (1 star formed per year, on the average over the life of the galaxy; this was regarded as conservative)
fp = 0.2 to 0.5 (one fifth to one half of all stars formed will have planets)
ne = 1 to 5 (stars with planets will have between 1 and 5 planets capable of developing life)
fl = 1 (100% of these planets will develop life)
fi = 1 (100% of which will develop intelligent life)
fc = 0.1 to 0.2 (10–20% of which will be able to communicate)
L = 1000 to 100,000,000 years (which will last somewhere between 1000 and 100,000,000 years)
 */


        int N;
        int rStar;
        double f_p;
        int numberOfExoplanets;
        double f_l;
        double f_i;
        double f_c;
        int L;

        //todo Initialize the Scanner to take input and commit.
        //ask for rStar number store in the rStar variable and commit.
        //ask for f_p fraction store in the f_p variable and commit.
        //ask for numberOfExoplanets number in the numberOfExoplanets variable and commit.
        //ask for f_l fraction store in the f_l variable and commit.
        //ask for f_i fraction store in the f_i variable and commit.
        //ask for f_c fraction store in the f_c variable and commit.
        //ask for L number store in the L variable and commit.
        //todo complete each one of the variables storing them correctly and committing each time

        Scanner keyboard;

        keyboard = new Scanner(System.in);

        System.out.println("How many stars are formed per year?");
        rStar = keyboard.nextLine();
        System.out.println("What is the fraction of those stars that have planets?");
        f_p = keyboard.nextLine();
        System.out.println("How many planets are capable of sustaining life?");
        numberOfExoplanets = keyboard.nextLine();
        System.out.println("What is the fraction of those exoplanets where life evolves?");
        f_l = keyboard.nextLine();
        System.out.println("What is the fraction of life that has developed intelligence?");
        f_i = keyboard.nextLine();
        System.out.println("What is the fraction of life that has developed communication?");
        f_c = keyboard.nextLine();
        System.out.println("How long has their communications transmitted before they went extinct or made a new form of communication?");
        L = keyboard.nextLine();

        keyboard.close();

        N = rStar * f_p * numberOfExoplanets * f_l * f_i * f_c * L;

        System.out.println("The number of intelligent species that are out there \n" +
                " that can communicate with us is " + N);





    }

}
