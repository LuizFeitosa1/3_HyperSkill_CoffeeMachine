package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Coffee espresso = new Coffee(250, 0, 16, 4);
        Coffee latte = new Coffee(350, 75, 20, 7);
        Coffee cappuccino = new Coffee(200, 100, 12, 6);

        boolean run = true;
        while(run){

            Machine.printMenu();
            switch(Machine.readInput(sc)){
                case "buy":
                    if(Machine.cupsMade <= 10){
                        buy(sc, espresso, latte, cappuccino);
                        Machine.cupsMade += 1;
                        break;
                    }else{
                        System.out.println("I need cleaning!");
                        break;
                    }
                case "fill":
                    Machine.fill(sc);
                    break;
                case "take":
                    Machine.take();
                    break;
                case "clean":
                    System.out.println("I have been cleaned!");
                    Machine.cupsMade = 0;
                    break;
                case "remaining":
                    Machine.printRemaining();
                    break;
                case "exit":
                    run = false;
                    break;
                default:
                    break;
            }
        }
    }

    public static void buy(Scanner sc, Coffee espresso, Coffee latte, Coffee cappuccino){

        boolean buyLoop = true;

        while(buyLoop){
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
            String buyInput = sc.next();
            switch(buyInput){
                case "back":
                    buyLoop = false;
                    break;
                case "1":
                    makeEspresso(espresso);
                    buyLoop = false;
                    break;
                case "2":
                    makeLatte(latte);
                    buyLoop = false;
                    break;
                case "3":
                    makeCappuccino(cappuccino);
                    buyLoop = false;
                    break;
                default:
                    System.out.println("Please enter a valid option.");
                    break;
            }
        }

    }

    public static void makeEspresso(Coffee espresso){
        if(Machine.storedWater < espresso.getWater()) {
            System.out.println("Sorry, not enough water!");
        }else if(Machine.storedMilk < espresso.getMilk()){
            System.out.println("Sorry, not enough milk!");
        }else if(Machine.storedBeans < espresso.getBeans()){
            System.out.println("Sorry, not enough coffee beans!");
        }else if(Machine.storedCups < 1){
            System.out.println("Sorry, not enough disposable cups!");
        }else{
            System.out.println("I have enough resources, making you a coffee!");
            Machine.storedMoney += espresso.getCost();
            Machine.storedWater -= espresso.getWater();
            Machine.storedMilk -= espresso.getMilk();
            Machine.storedBeans -= espresso.getBeans();
            Machine.storedCups -= 1;
        }
    }

    public static void makeLatte(Coffee latte){
        if(Machine.storedWater < latte.getWater()) {
            System.out.println("Sorry, not enough water!");
        }else if(Machine.storedMilk < latte.getMilk()){
            System.out.println("Sorry, not enough milk!");
        }else if(Machine.storedBeans < latte.getBeans()){
            System.out.println("Sorry, not enough coffee beans!");
        }else if(Machine.storedCups < 1){
            System.out.println("Sorry, not enough disposable cups!");
        }else{
            System.out.println("I have enough resources, making you a coffee!");
            Machine.storedMoney += latte.getCost();
            Machine.storedWater -= latte.getWater();
            Machine.storedMilk -= latte.getMilk();
            Machine.storedBeans -= latte.getBeans();
            Machine.storedCups -= 1;
        }
    }

    public static void makeCappuccino(Coffee cappuccino){
        if(Machine.storedWater < cappuccino.getWater()) {
            System.out.println("Sorry, not enough water!");
        }else if(Machine.storedMilk < cappuccino.getMilk()){
            System.out.println("Sorry, not enough milk!");
        }else if(Machine.storedBeans < cappuccino.getBeans()){
            System.out.println("Sorry, not enough coffee beans!");
        }else if(Machine.storedCups < 1){
            System.out.println("Sorry, not enough disposable cups!");
        }else{
            System.out.println("I have enough resources, making you a coffee!");
            Machine.storedMoney += cappuccino.getCost();
            Machine.storedWater -= cappuccino.getWater();
            Machine.storedMilk -= cappuccino.getMilk();
            Machine.storedBeans -= cappuccino.getBeans();
            Machine.storedCups -= 1;
        }
    }



}

