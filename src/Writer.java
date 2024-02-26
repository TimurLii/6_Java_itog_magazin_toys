package src;


import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void write(String dischargeFrequency) {
        try (FileWriter writer = new FileWriter("Discharge_Frequency", true)) {
            writer.write(dischargeFrequency);
            writer.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
