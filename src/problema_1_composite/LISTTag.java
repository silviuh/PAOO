package problema_1_composite;

public class LISTTag extends Tag {

    //public String text;
    /*public Integer levelOfIndentation;
    public BufferToWrite    bufferToWrite;*/

    public LISTTag(String text, Integer levelOfIndentation, BufferToWrite bufferToWrite) {
        this.text               = text;
        this.levelOfIndentation = levelOfIndentation;
        this.bufferToWrite      = bufferToWrite;
    }

    @Override
    public void print( ) {
        printRequiredIndentationLevels();
        bufferToWrite.append( "<li>" + text + "</li>" );
    }

    @Override
    public void printRequiredIndentationLevels( ) {
        bufferToWrite.append( "\n" );
        for (Integer i = 0; i < levelOfIndentation; i++) {
            bufferToWrite.append( " " );
        }
    }
}
