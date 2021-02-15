package Music;

public class Guitar implements MusicalInstrument {
    private int countStrings;

    public Guitar(int countStrings) {
        this.countStrings = countStrings;
    }

    public Guitar() {}

    public int getCountStrings() {
        return countStrings;
    }

    public void setCountStrings(int countStrings) {
        this.countStrings = countStrings;
    }
}
