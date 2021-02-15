package Music;

public class Quartet {
    private Musician[] musician;

    public Quartet(Musician[] musician) {
        this.musician = musician;
    }

    public Quartet() {}

    public void performSong(String name) {
        Musician maxAgeMusician = null;

        for (int i=0; i<musician.length; i++) {
            if (maxAgeMusician == null || maxAgeMusician.getAge() < musician[i].getAge()) {
                maxAgeMusician = musician[i];
            }
        }

        maxAgeMusician.performSong(name);
        System.out.print("В исполнении старшего учасника квартета - " + maxAgeMusician.getName());
    }
}
