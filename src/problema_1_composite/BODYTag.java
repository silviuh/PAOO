package problema_1_composite;

import java.nio.file.Files;
import java.util.ArrayList;

public class BODYTag extends Tag {

  /*  public ArrayList< Tag > bodyComponents;
    public Integer          levelOfIndentation;
    public BufferToWrite    bufferToWrite;*/

    public BODYTag(Integer levelOfIndentation, BufferToWrite bufferToWrite) {
        this.levelOfIndentation = levelOfIndentation;
        this.components         = new ArrayList< Tag >();
        this.bufferToWrite      = bufferToWrite;
    }

    @Override
    public void printRequiredIndentationLevels( ) {
        bufferToWrite.append( "\n" );
        for (Integer i = 0; i < levelOfIndentation; i++) {
            bufferToWrite.append( " " );
        }
    }

    @Override
    public void print( ) {
        printRequiredIndentationLevels();
        bufferToWrite.append( "<body>" );

        for (Tag listComponent : components) {
            listComponent.print();
        }

        printRequiredIndentationLevels();
        bufferToWrite.append( "</body>" );
    }

    public void addComponent(Tag component) {
        this.components.add( component );
    }

    public void removeComponent(Tag component) {
        this.components.remove( component );
    }
}
