package problema_1_composite;

import java.util.ArrayList;

public abstract class Tag {

    public ArrayList< Tag > components;
    public Integer          levelOfIndentation;
    public BufferToWrite    bufferToWrite;
    public String           text;

    public abstract void print( );

    public abstract void printRequiredIndentationLevels( );

    protected void addComponent(Tag component) {
    }

    protected void removeComponent(Tag component) {
    }
}
