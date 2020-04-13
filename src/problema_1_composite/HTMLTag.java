package problema_1_composite;

import java.util.ArrayList;

public class HTMLTag extends Tag {
   /* public ArrayList< Tag > htmlComponents;
    public Integer          levelOfIndentation;
    public BufferToWrite    bufferToWrite;
*/

    public HTMLTag(Integer levelOfIndentation, BufferToWrite bufferToWrite) {
        this.levelOfIndentation = levelOfIndentation;
        this.components         = new ArrayList< Tag >();
        this.bufferToWrite      = bufferToWrite;
    }

    @Override
    public void print( ) {
        printRequiredIndentationLevels();
        bufferToWrite.append( "<html>" );

        for (Tag listComponent : components) {
            listComponent.print();
        }

        printRequiredIndentationLevels();
        bufferToWrite.append( "</html>" );
    }

    @Override
    public void printRequiredIndentationLevels( ) {
        bufferToWrite.append( "\n" );
        for (Integer i = 0; i < levelOfIndentation; i++) {
            bufferToWrite.append( " " );
        }
    }

    public void addComponent(Tag component) {
        this.components.add( component );
    }

    public void removeComponent(Tag component) {
        this.components.remove( component );
    }

}
