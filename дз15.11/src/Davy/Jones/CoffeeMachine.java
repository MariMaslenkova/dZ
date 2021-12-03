package Davy.Jones;

public abstract class CoffeeMachine implements Recipes{
    public  int volWater;
    public  int volCoffee;
    public String name;

    public int waterCount; // счетчик воды
    public int coffeeCount; //счетчик кофе



    public abstract void info (String name, int volCoffee, int volWater);// информация о машине
    public abstract int waterRemainder(int volWater, int waterCount);// остаток воды
    public abstract int coffeeRemainder(int volCoffee, int coffeeCount);// остаток кофе

    public abstract int resetWaterCount(int waterCount);// сброс счетчика воды
    public abstract int resetCoffeeCount(int coffeeCount);// сброс счетчика кофе



}
