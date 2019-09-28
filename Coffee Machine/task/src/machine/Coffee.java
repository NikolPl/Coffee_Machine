package machine;

public abstract class Coffee {
    int water;
    int milk;
    int coffeeBeans;
    int price;

    public Machine make(Machine machine){ // asi by mělo patřit do machine, s tím, že parametr bude coffee
        machine.setWater(machine.getWater()-this.water);
        machine.setMilk(machine.getMilk()-this.milk);
        machine.setCoffeeBeans(machine.getCoffeeBeans()-this.coffeeBeans);
        machine.setMoney(machine.getMoney()+this.price);
        machine.setDispoCups(machine.getDispoCups()-1);
        return machine;
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
}
