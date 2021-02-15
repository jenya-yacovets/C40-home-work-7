package Music;

public class Musician {
    private String name;
    private int age;
    private MusicalInstrument musicalInstrument;

    public Musician(String name, int age, MusicalInstrument musicalInstrument) {
        this.name = name;
        this.age = age;
        this.musicalInstrument = musicalInstrument;
    }

    public Musician() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MusicalInstrument getMusicalInstrument() {
        return musicalInstrument;
    }

    public void setMusicalInstrument(MusicalInstrument musicalInstrument) {
        this.musicalInstrument = musicalInstrument;
    }

    public void performSong(String name) {
        musicalInstrument.playMusic(name);
    }
}
