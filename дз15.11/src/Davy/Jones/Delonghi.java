package Davy.Jones;

public class Delonghi extends CoffeeMachine implements Recipes{

    public Delonghi (int volWater, int volCoffee, String name){
        this.name=name;
        this.volWater=volWater;
        this.volCoffee=volCoffee;
    }

    @Override
    public void info (String name, int volCoffee, int volWater){
    }

    @Override
    public int waterRemainder (int volWater, int waterCount){
        int waterRemainderDelonghi=volWater-waterCount;
        return waterRemainderDelonghi;
    }

    @Override
    public int coffeeRemainder(int volCoffee, int coffeeCount){
        int coffeeRemainderDelonghi= volCoffee-coffeeCount;
        return coffeeRemainderDelonghi;
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
