package persistenceManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Manages the persistent storage of the fan's state.
 * This class saves and loads the last used speed of the fan
 * to a local file in the user's home directory using the Singleton design pattern.
 */
public class FanSpeedSave {
    private static FanSpeedSave instance;
    private final Path file;
    private int lastSpeed = 3;

    private FanSpeedSave() {
        this.file = Paths.get(System.getProperty("user.home"), ".fan_last_speed");
    }

    /**
     * Returns the instance via singleton design pattern.
     * @return The single instance of FanSpeedSave.
     */
    public static synchronized FanSpeedSave getInstance() {
        if (instance == null) {
            instance = new FanSpeedSave();
        }
        return instance;
    }

    /**
     * Reads the last used speed from a file.
     * @return The last saved speed level as an integer
     * or 1 if an error occurs or the file does not exist.
     */
    public int loadLastSpeed() {
        try {
            if (Files.exists(file)) {
                String content = Files.readString(file).trim();
                lastSpeed = Integer.parseInt(content);
            }
        } catch (IOException | NumberFormatException e) {
            lastSpeed = 1;
        }
        return lastSpeed;
    }

    /**
     * Saves the latest speed level to the configuration file.
     * @param level The speed level integer value to be saved.
     * */
    public void saveLastSpeed(int level) {
        this.lastSpeed = level;
        try {
            Files.writeString(file, Integer.toString(level));
        } catch (IOException e) {
            System.err.println("Konnte letzte Drehzahl nicht speichern: " + e.getMessage());
        }
    }
}
