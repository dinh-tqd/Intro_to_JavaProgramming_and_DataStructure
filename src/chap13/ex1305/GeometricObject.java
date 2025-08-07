package chap13.ex1305;

public abstract class GeometricObject implements Comparable<GeometricObject>{
    private String color;
    private boolean filled;
    java.util.Date dateCreated;

    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }
    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new java.util.Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "Created on " + dateCreated + "\ncolor: " + color  + " and filled: " + filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract int compareTo(GeometricObject o); // Abstract compareTo method

    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        if (o1.getArea() >= o2.getArea()) {
            return o1;
        }
        return o2;
    }
}
