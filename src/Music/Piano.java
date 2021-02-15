package Music;

public class Piano implements MusicalInstrument{
    private String color;

    public Piano(String color) {
        this.color = color;
    }

    public Piano() {}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
