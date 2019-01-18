package com.company;

public class Main {

    public static void main(String[] args) {


        //will use this to loop over the numbers.
        int x = 1;
        int max = Integer.MAX_VALUE;


            for (int i = 2520; i < max; i++){


                //increments the value of x by 1 until the if condition is met
                x++;

                //checks to see if x is evenly divisible
                if((x % 11 == 0) && (x % 12 == 0) && (x % 13 == 0) && (x % 14 == 0)
                        && (x % 15 == 0) && (x % 16 == 0) && (x % 17 == 0)
                        && (x % 18 == 0) && (x % 19 == 0) && (x % 20 == 0)
                        && (x % 2520 == 0)){

                    //prints out the variable that hits that condition with the message.
                    System.out.print(x + " is the smallest number evenly divisble by 1 through 20");
                    break;

                }


            }


        }

    }

