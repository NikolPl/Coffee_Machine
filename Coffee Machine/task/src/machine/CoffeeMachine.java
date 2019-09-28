package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Machine machine = new Machine(400,540, 120,550, 9);

        while(machine.isTurnOn()) {
            System.out.println("Write action (buy, fill, take, remaining, exit:)");
            String action = scanner.next();
            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    if(scanner.hasNextInt()){
                        int buyButton = scanner.nextInt();
                        machine.makeCoffee(buyButton);
                    }
                    else {
                        String back = scanner.nextLine();
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    int water = scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    int milk = scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    int beans = scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    int cups = scanner.nextInt();
                    machine.fill(water, milk, beans, cups);
                    break;
                case "take":
                    machine.takeMoney();
                    break;
                case "remaining":
                    machine.status();
                    break;
                case "exit":
                    machine.setTurnOn(false);
                    break;
            }
        }

    }
}