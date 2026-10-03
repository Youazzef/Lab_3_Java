package Ex_9;

public class Point {
    private int x, y;
    public Point(){
        this.x = 0; this.y = 0;
    }
    public Point(int x, int y){
        this.x = x; this.y = y;
    }

    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public double distance(){
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }
    public double distance(Point p){
        return Math.sqrt((this.x-p.getX())*(this.x-p.getX()) + (this.y -p.getY())*(this.y-p.getY()));
    }
    public double distance(int x, int y){
        return Math.sqrt((this.x-x)*(this.x-x) + (this.y - y)*(this.y - y));
    }
}
