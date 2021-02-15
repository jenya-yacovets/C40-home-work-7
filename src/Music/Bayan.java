package Music;

public class Bayan implements MusicalInstrument{
    private int rowsKey; //количество рядов клавиш

    public Bayan(int rowsKey) {
        this.rowsKey = rowsKey;
    }
    public Bayan() {}

    public int getRowsKey() {
        return rowsKey;
    }

    public void setRowsKey(int rowsKey) {
        this.rowsKey = rowsKey;
    }
}
