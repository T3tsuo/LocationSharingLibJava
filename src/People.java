
public class People {

    private String name;
    private Point coordPoint;

    public People(String name, String longitude, String latitude) {
        this.name = name;
        this.coordPoint = new Point(Double.parseDouble(longitude), Double.parseDouble(latitude));
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
