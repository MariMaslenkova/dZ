package Davy.Jones;

public interface Recipes {
    int waterAmericano=150;
    int coffeeAmericano=20;
    int waterEspresso= 150;
    int coffeeEspresso=50;
    int waterDoubleEspresso=150;
    int coffeeDoubleEspresso=100;

    void makeAmericano(int waterAmericano, int coffeeAmericano);
    void makeEspresso (int waterEspresso,int coffeeEspresso);
    void makeDoubleEspresso (int waterDoubleEspresso, int coffeeDoubleEspresso);

}
