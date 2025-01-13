package machine;

import java.util.Scanner;

public class Machine {
    static int storedWater = 400;
    static int storedMilk = 540;
    static int storedBeans = 120;
    static double storedMoney = 550;
    static int storedCups = 9;
    static int cupsMade = 0;

    public static void printMenu(){
        System.out.println("Write action (buy, fill, take, clean, remaining, exit)");
    }

    public static String readInput(Scanner sc){
        while(true){
            try{
                String s = sc.next();
                if(s.equals("buy") || s.equals("fill") || s.equals("take") || s.equals("clean") || s.equals("remaining") || s.equals("exit")){
                    return s;
                }else{
                    System.out.println("Please enter a valid option.");
                }
            } catch (Exception e) {
                System.out.println("Error. Option invalid. Please try again.");
            }
        }
    }

    public static void fill(Scanner sc){
        while(true){//fill water loop
            try{
                System.out.println("Write how many ml of water you want to add:");
                int input = sc.nextInt();
                Machine.storedWater += input;
                break;
            }catch (Exception e){
                System.out.println("Enter a valid quantity.");
                sc.next();
            }
        }

        while(true){//fill milk loop
            try{
                System.out.println("Write how many ml of milk you want to add:");
                int input = sc.nextInt();
                Machine.storedMilk += input;
                break;
            }catch (Exception e){
                System.out.println("Enter a valid quantity.");
                sc.next();
            }
        }

        while(true){//fill coffee beans loop
            try{
                System.out.println("Write how many grams of coffee beans you want to add:");
                int input = sc.nextInt();
                Machine.storedBeans += input;
                break;
            }catch (Exception e){
                System.out.println("Enter a valid quantity.");
                sc.next();
            }
        }

        while(true){//fill disposable cups loop
            try{
                System.out.println("Write how many disposable cups you want to add:");
                int input = sc.nextInt();
                Machine.storedCups += input;
                break;
            }catch (Exception e){
                System.out.println("Enter a valid quantity.");
                sc.next();
            }
        }
    }

    public static void take(){
        System.out.printf("I gave you $%.0f\n\n", Machine.storedMoney);
        Machine.storedMoney = 0;
    }

    public static void printRemaining(){
        System.out.println("The coffee machine has:");
        System.out.println(Machine.storedWater + " ml of water");
        System.out.println(Machine.storedMilk + " ml of milk");
        System.out.println(Machine.storedBeans + " g of coffee beans");
        System.out.println(Machine.storedCups + " disposable cups");
        System.out.printf("$%.0f of money\n\n", Machine.storedMoney);
    }



}
