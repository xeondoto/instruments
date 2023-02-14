public class Trumpet implements Instruments {
    private double diameter = 55.6;

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба с диаметром " + diameter);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trumpet)) return false;

        Trumpet trumpet = (Trumpet) o;

        return Double.compare(trumpet.diameter, diameter) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(diameter);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Trumpet{" +
                "diameter=" + diameter +
                '}';
    }
}
