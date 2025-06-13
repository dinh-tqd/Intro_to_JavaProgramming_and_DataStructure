package chap09;

public class Ex0908 {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.turnOn();
        fan1.setColor("pink");
        fan1.setSpeed(Fan.SLOW);
        fan1.setRadius(10);
        System.out.println(fan1.toString());

        System.out.println("___");
        Fan fan2 = new Fan();
        fan2.setColor("red");
        fan2.setRadius(15);
        System.out.println(fan2.toString());

        System.out.println("___");
        Fan fan3 = new Fan(true, Fan.FAST, 20, "yellow");
        System.out.println(fan3.toString());
    }
}

class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    int speed = SLOW;
    boolean on;
    double radius = 5;
    String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getStatus() {
        return on;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    Fan() {
    }

    Fan(boolean status, int speed,double radius,String color) {
        this.on = status;
        this.speed = speed;
        this.radius = radius;
        this.color = color;
    }

    public String toString() {
        if (on) {
            return "Fan speed: " + speed +  "\nColor: " + color + "\nRadius: " + radius;
        }
        return "Color: " + color + "\nRadius: " + radius;
    }
}
