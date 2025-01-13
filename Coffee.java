package machine;

public class Coffee {
    int water;
    int milk;
    int beans;
    double cost;

    public Coffee(int water, int milk, int beans, double cost){
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.cost = cost;
    }

    public int getWater(){ return water;}
    public int getMilk(){ return milk;}
    public int getBeans(){ return beans;}
    public double getCost(){ return cost;}

}

