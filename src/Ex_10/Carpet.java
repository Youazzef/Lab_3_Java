package Ex_10;

public class Carpet{
    private double cost;

    public Carpet(double c){
        this.cost = (c>0)? c:0;
    }
    public double getCost(){
        return cost;
    }
}
