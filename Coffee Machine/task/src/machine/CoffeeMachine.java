package machine;

import java.util.Scanner;

public class CoffeeMachine {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int waterLevel = 400;
        int milkLevel = 540;
        int beansLevel = 120;
        int disposableCups = 9;
        int moneyLevel = 550;
        boolean exit = false;
        int waterNeeded;
        int milkNeeded;
        int beansNeeded;

        do {
            System.out.println("");
            System.out.println("Write action (buy, fill, take, remaining, exit)");
            String action = scanner.next();
            switch (action) {
                case "take":
                    System.out.println("I gave you $" + moneyLevel);
                    moneyLevel -= moneyLevel;
                    break;
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, " +
                            "3 - cappucino, back - to main menu:");
                    String whichCoffee = scanner.next();
                    switch (whichCoffee) {
                        case "1":
                            waterNeeded = 250;
                            milkNeeded = 0;
                            beansNeeded = 16;
                            if (waterLevel >= waterNeeded) {
                                if (milkLevel >= milkNeeded) {
                                    if (beansLevel >= beansNeeded){
                                        System.out.println("I have enough resources, making you a coffee!");
                                    } else {
                                        System.out.println("Sorry, not enough beans!");
                                        break;
                                    }
                                }else {

                                    System.out.println("Sorry, not enough milk!");
                                    break;
                                }
                            } else {

                                System.out.println("Sorry, not enough water!");
                                break;
                            }

                            waterLevel -= 250;
                            beansLevel -= 16;
                            moneyLevel += 4;
                            disposableCups -= 1;

                            break;
                        case "2":
                            waterNeeded = 350;
                            milkNeeded = 75;
                            beansNeeded = 20;
                            if (waterLevel >= waterNeeded) {
                                if (milkLevel >= milkNeeded) {
                                    if (beansLevel >= beansNeeded){

                                        System.out.println("I have enough resources, making you a coffee!");

                                    } else {
                                        System.out.println("Sorry, not enough beans!");
                                        break;
                                    }

                                }else {

                                    System.out.println("Sorry, not enough milk!");
                                    break;
                                }

                            } else {

                                System.out.println("Sorry, not enough water!");
                                break;
                            }

                            waterLevel -= 350;
                            milkLevel -= 75;
                            beansLevel -= 20;
                            moneyLevel += 7;
                            disposableCups -= 1;
                            break;
                        case "3":
                            waterNeeded = 200;
                            milkNeeded = 100;
                            beansNeeded = 12;
                            if (waterLevel >= waterNeeded) {
                                if (milkLevel >= milkNeeded) {
                                    if (beansLevel >= beansNeeded){
                                        System.out.println("I have enough resources, making you a coffee!");
                                    } else {
                                        System.out.println("Sorry, not enough beans!");
                                        break;
                                    }
                                }else {
                                    System.out.println("Sorry, not enough milk!");
                                    break;
                                }
                            } else {
                                System.out.println("Sorry, not enough water!");
                                break;
                            }
                            waterLevel -= 200;
                            milkLevel -= 100;
                            beansLevel -= 12;
                            moneyLevel += 6;
                            disposableCups -= 1;
                        case "back":
                            break;
                    }
                    break;
                case "fill":
                    System.out.println("");
                    System.out.println("Write how many ml of water do you want to add:");
                    int addedWater = scanner.nextInt();
                    waterLevel += addedWater;
                    System.out.println("Write how many ml of milk do you want to add:");
                    int addedMilk = scanner.nextInt();
                    milkLevel += addedMilk;
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    int addedBeans = scanner.nextInt();
                    beansLevel += addedBeans;
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    int addedCups = scanner.nextInt();
                    disposableCups += addedCups;

                    break;
                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(waterLevel + " " + "of water");
                    System.out.println(milkLevel + " " + "of milk");
                    System.out.println(beansLevel + " " + " of coffee beans");
                    System.out.println(disposableCups + " " + "of disposable cups");
                    System.out.println(moneyLevel + " " + " of money");

                    break;
                case "exit":
                    exit = true;
                    break;
            }
        }while (exit != true);




//        System.out.print("Write how many ml of water the coffee machine has: ");
//        int waterLevel = scanner.nextInt();
//        System.out.print("Write how many ml of milk the coffee machine has: ");
//        int milkLevel = scanner.nextInt();200
//        System.out.print("Write how many grams of coffee beans the coffee machine has: ");
//        int beansLevel = scanner.nextInt();
//        System.out.print("Write how many cups of coffee you will need: ");
//        int howManyCups = scanner.nextInt();
//
//            waterLevel = waterLevel / 200;
//            milkLevel = milkLevel / 50;
//            beansLevel = beansLevel / 15;
//
//            int minLevel = Math.min(waterLevel,milkLevel);
//            minLevel = Math.min(beansLevel, minLevel);
//
//            if (minLevel == howManyCups) {
//
//                System.out.println("Yes, I can make that amount of coffee");
//            } else if (minLevel > howManyCups) {
//                System.out.println("Yes, I can make that amount of coffee (and even " +
//
//                        (howManyCups - minLevel) + " more than that)");
//
//        } else {
//                System.out.println("No, I can make only " +
//
//                        minLevel + " cup(s) of coffee");
//
//
//            }
//
        }
}



