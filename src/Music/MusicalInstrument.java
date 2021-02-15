package Music;

public interface MusicalInstrument {
    default void playMusic(String name) {
        System.out.println("Сейчас играет композиция - '" + name + "'.");
    }
}
