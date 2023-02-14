public class Guitara implements Instruments {
    private int cordNumber = 4;

    public int getCordNumber() {
        return cordNumber;
    }

    public void setCordNumber(int cordNumber) {
        this.cordNumber = cordNumber;
    }


    public void play() {
        System.out.println("Играет гитара с количеством струн " + cordNumber);
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guitara)) return false;

        Guitara gitara = (Guitara) o;

        return cordNumber == gitara.cordNumber;
    }


    public int hashCode() {
        return cordNumber;
    }

    public String toString() {
        return "Guitar{" +
                "cordNumber=" + cordNumber +
                '}';
    }

    String NumberOfJets = "7";
}
