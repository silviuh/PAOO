package problema_1_composite.decorators;


import problema_1_composite.BufferToWrite;
import problema_1_composite.Tag;

public class DataTag extends Tag {
    public String text;
    Integer       levelOfIndentation;
    BufferToWrite bufferToWrite;

    public DataTag(String text, Integer levelOfIndentation, BufferToWrite bufferToWrite) {
        this.text               = text;
        this.levelOfIndentation = levelOfIndentation;
        this.bufferToWrite      = bufferToWrite;
    }

    @Override
    public void print( ) {
        printRequiredIndentationLevels();
    }

    @Override
    public void printRequiredIndentationLevels( ) {
        bufferToWrite.append( "\n" );
        for (Integer i = 0; i < levelOfIndentation; i++) {
            bufferToWrite.append( " " );
        }
    }

}