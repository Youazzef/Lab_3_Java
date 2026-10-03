package Ex_8;

public class Wall {
    private double width;
    private double height;
    public Wall(){
        this.width = 0;
        this.height =0;
    }
    public Wall(double w, double h){
        this.width = (w>0)? w : 0;
        this.height =(h>0)? h:0;
    }

    public double getHeight() {
        return this.height;
    }
    public double getWidth(){
        return this.width;
    }

    public void setWidth(double w){
        this.width = (w>0)? w : 0;
    }
    public void setHeight(double h){
        this.height = (h>0)? h : 0;
    }
    public double getArea(){
        return this.width*this.height;
    }

    public static void main(String[] args){
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
