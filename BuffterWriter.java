import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class BuffterWriter {
    
    public void write( double value ) throws IOException {
    String fileName = "CalculationOutput.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write( String.valueOf(value));
        }
    }    
}
