import java.util.Objects;

public class Caisse  implements Instruments{
    private String size = "20x30";

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    public  void play () {
        System.out.println("Играет барабан размера " + size);
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Caisse )) return false;

        Caisse caisse = (Caisse) o;

        return Objects.equals(size, caisse.size);
    }


    public int hashCode() {
        return size != null ? size.hashCode() : 0;
    }


    public String toString() {
        return "Caisse{" +
                "size='" + size + '\'' +
                '}';
    }
}
