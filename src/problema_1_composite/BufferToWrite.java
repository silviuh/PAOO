package problema_1_composite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferToWrite {

    public String buffer;

    public BufferToWrite( ) {
        buffer = "";
    }

    public void append(String text) {
        buffer += text;
    }

    public void printToFile(String filePath) {
        try {
            BufferedWriter writer = new BufferedWriter( new FileWriter( filePath, true ) );
            writer.append( this.buffer );
            writer.close();
        } catch ( IOException e ) {
            System.out.println( "File could not be opened" );
        }
    }


}
