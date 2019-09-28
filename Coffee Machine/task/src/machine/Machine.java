package machine;

public class Machine {
    private int water;
    private int milk;
    private int coffeeBeans;
    private int money;
    private int dispoCups;
    private boolean turnOn;

    public Machine(int water, int milk, int coffeeBeans, int money, int dispoCups) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.money = money;
        this.dispoCups = dispoCups;
        this.turnOn = true;
    }

    public void status(){
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(dispoCups + " of disposable cups");
        System.out.println("$"+money + " of money");
    }

    public void fill(int water, int milk, int beans, int cups){
        this.water = this.water + water;
        this.milk = this.milk + milk;
        this.coffeeBeans = this.coffeeBeans + beans;
        this.dispoCups = this.dispoCups + cups;
    }

    public void takeMoney(){
        System.out.println("I gave you $" + money);
        setMoney(0);
    }

    public void makeCoffee(int buyButton){
        boolean enough;
        switch (buyButton) {
            case 1:
                Coffee espresso = new Espresso();
                enough = checkRemaining(espresso);
                if(enough == true) {
                    espresso.make(this);
                }
                break;
            case 2:
                Coffee latte = new Latte();
                enough = checkRemaining(latte);
                if(enough == true) {
                    latte.make(this);
                }
                break;
            case 3:
                Coffee cappucino = new Cappucino();
                enough = checkRemaining(cappucino);
                if(enough == true) {
                    cappucino.make(this);
                }
                break;
        }
    }

    private boolean checkRemaining(Coffee coffee){
        if(this.water < coffee.getWater()){
            System.out.println("Sorry, not enough water!");
            return false;
        }
        else if(this.milk < coffee.getMilk()){
            System.out.println("Sorry, not enough milk!");
            return false;
        }
        else if(this.coffeeBeans < coffee.getCoffeeBeans()){
            System.out.println("Sorry, not enough coffee beans");
            return false;
        }
        else {
            System.out.println("I have enough resources, making you a coffee!");
            return true;
        }
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getMoney() {
        return money;
    }

    public int getDispoCups() {
        return dispoCups;
    }

    public boolean isTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setDispoCups(int dispoCups) {
        this.dispoCups = dispoCups;
    }
}
