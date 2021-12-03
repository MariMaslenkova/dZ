package Davy.Jones;

public class Siemens extends CoffeeMachine implements Recipes{

    public Siemens (int volWater, int volCoffee, String name){
        this.name=name;
        this.volWater=volWater;
        this.volCoffee=volCoffee;
    }

    @Override
    public void info (String name, int volCoffee, int volWater){
    }

    @Override
    public int waterRemainder (int volWater, int waterCount){
        int waterRemainderSiemens=volWater-waterCount;
        return waterRemainderSiemens;
    }

    @Override
    public int coffeeRemainder(int volCoffee, int coffeeCount){
        int coffeeRemainderSiemens= volCoffee-coffeeCount;
        return coffeeRemainderSiemens;
    }

    @Override
    public int resetWaterCount(int waterCount){
       return waterCount=0;
    }

    @Override
    public int resetCoffeeCount(int coffeeCount){
        return coffeeCount=0;
    }

    @Override
    public void makeAmericano(int waterAmericano, int coffeeAmericano){
        waterCount+=Recipes.waterAmericano;
        coffeeCount+=Recipes.coffeeAmericano;
    }

    @Override
    public void makeEspresso (int waterEspresso, int coffeeEspresso){
        waterCount+=Recipes.waterEspresso;
        coffeeCount+=Recipes.coffeeEspresso;
    }

    @Override
    public void makeDoubleEspresso (int waterDoubleEspresso, int coffeeDoubleEspresso){
        waterCount+=Recipes.waterDoubleEspresso;
        coffeeCount+=Recipes.coffeeDoubleEspresso;
    }
}
