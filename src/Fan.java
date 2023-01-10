public class Fan {
    private int speed=1;
    private boolean on = false;
    private double radius=5;
    private String color="blue";

    public double getRadius() {
        return radius;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public boolean isOn() {
        return on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void changeStatus() {
        on = !on;
    }

    @Override
    public String toString() {
        String status;
        String speed="";
        if(isOn()){
            status="fan is on";
        }else{
            status="fan is off";
        }
        switch (this.speed){
            case 1:
                speed="SLOW";
                break;
            case 2:
                speed="MEDIUM";
                break;
            case 3:
                speed="FAST";
                break;
        }
        return "Fan{" + speed +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                status+
                '}';
    }
}
