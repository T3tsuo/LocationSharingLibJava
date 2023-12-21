
public class People {

    private String name;
    private Point coordPoint;

    public People(String name, Double longitude, Double latitude) {
        this.name = name;
        this.coordPoint = new Point(longitude, latitude);
    }

    public String getName() {
        return name;
    }

    public Point getPoint() {
        return coordPoint;
    }

    public String toString() {
        return getName() + "    " + coordPoint;
    }
}
