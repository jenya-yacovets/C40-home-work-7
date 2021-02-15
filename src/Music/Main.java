package Music;

public class Main {
    public static void main(String[] args) {
        Musician valera = new Musician(
                "Валера",
                15,
                new Bayan(3)
        );
        valera.performSong("Бармалей");

        Musician boris = new Musician(
                "Борис",
                19,
                new Piano("черный")
        );
        boris.performSong("Антошка");

        Musician nikolai = new Musician(
                "Николай",
                22,
                new Guitar(6)
        );
        nikolai.performSong("Лесной олень");

        Quartet quartet = new Quartet(new Musician[] {valera, boris, nikolai});
        quartet.performSong("В лесу сидел кузнечик");
    }
}
