package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        orderSpecifiedCoffee();
        makeCoffee();
        calculateAmountOfProducts();
        availableAmountOfProducts();

    }

    public static void orderSpecifiedCoffee() {
        System.out.println("The coffee machine has:");
        int water = 400;
        System.out.printf("%d ml of water\n", water);
        int milk = 540;
        System.out.printf("%d ml of milk\n", milk);
        int beans = 120;
        System.out.printf("%d g of coffee beans\n", beans);
        int cups = 9;
        System.out.printf("%d disposable cup\n", cups);
        int money = 550;
        System.out.printf("$%d of money\n", money);
        System.out.println("Write action (buy, fill, take):");
        String action = scanner.nextLine();
        if (action.equals("buy")) {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
            int typeOfCoffee = scanner.nextInt();
            if (typeOfCoffee == 1) {
                water -= 250;
                beans -= 16;
                money += 4;
                cups -= 1;
            } else if (typeOfCoffee == 2) {
                water -= 350;
                milk -= 75;
                beans -= 20;
                money += 7;
                cups -= 1;

            } else if (typeOfCoffee == 3) {
                water -= 200;
                milk -= 100;
                beans -= 12;
                money += 6;
                cups -= 1;

            }
            System.out.println("The coffee machine has:");
            System.out.printf("%d ml of water\n", water);
            System.out.printf("%d ml of milk\n", milk);
            System.out.printf("%d g of coffee beans\n", beans);
            System.out.printf("%d disposable cups\n", cups);
            System.out.printf("$%d of money\n", money);
        } else if (action.equals("fill")) {
            System.out.println("Write how many ml of water you want to add:");
            int w = scanner.nextInt();
            water += w;
            System.out.println("Write how many ml of milk you want to add: ");
            int m = scanner.nextInt();
            milk += m;
            System.out.println("Write how many grams of coffee beans you want to add: ");
            int b = scanner.nextInt();
            beans += b;
            System.out.println("Write how many disposable cups you want to add: ");
            int c = scanner.nextInt();
            cups += c;
            System.out.println("The coffee machine has:");
            System.out.printf("%d ml of water\n", water);
            System.out.printf("%d ml of milk\n", milk);
            System.out.printf("%d g of coffee beans\n", beans);
            System.out.printf("%d disposable cups\n", cups);
            System.out.printf("$%d of money\n", money);
        } else if (action.equals("take")) {
            System.out.printf("I gave you $%d", money);
            money -= money;
            System.out.println("The coffee machine has:");
            System.out.printf("%d ml of water\n", water);
            System.out.printf("%d ml of milk\n", milk);
            System.out.printf("%d g of coffee beans\n", beans);
            System.out.printf("%d disposable cups\n", cups);
            System.out.printf("$%d of money\n", money);
        } else {
            System.out.println("You've pressed the wrong keys!");
            System.exit(0);
        }

    }

    public static void availableAmountOfProducts() {
        System.out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cups = scanner.nextInt();
        canMake(water, milk, beans, cups);

    }

    public static void canMake(int water, int milk, int beans, int cups) {
        water /= 200;
        milk /= 50;
        beans /= 15;
        if (water == cups && milk == cups && beans == cups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (water > cups && milk > cups && beans > cups) {
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)\n", milk - cups);
        } else {
            System.out.printf("No, I can make only %d cup(s) of coffee\n", milk);
        }
    }

    public static void calculateAmountOfProducts() {
        System.out.println("Write how many cups of coffee you will need: ");
        int cups = scanner.nextInt();
        System.out.printf("For %d cups of coffee you will need:\n", cups);
        System.out.printf("%d ml of water\n", cups * 200);
        System.out.printf("%d ml of milk \n", cups * 50);
        System.out.printf("%d g of coffee beans\n", cups * 15);
    }

    public static void makeCoffee() {
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
    }

}
