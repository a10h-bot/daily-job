public class Temperature implements Comparable<Temperature> {
    private final double degrees;

    public Temperature(double degrees) {
        if (Double.isNaN(degrees))
            throw new IllegalArgumentException();
        this.degrees = degrees;
    }

    public int compareTo(Temperature that) {
        double EPSILON = 0.1;
        if (this.degrees < that.degrees - EPSILON)
            return -1;
        if (this.degrees > that.degrees + EPSILON)
            return +1;
        return 0;
    }

}