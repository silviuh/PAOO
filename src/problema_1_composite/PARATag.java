package problema_1_composite;

public class PARATag extends Tag {
    // String text;
    /*Integer       levelOfIndentation;
    BufferToWrite bufferToWrite;*/

    public PARATag(String text, Integer levelOfIndentation, BufferToWrite bufferToWrite) {
        this.text               = text;
        this.levelOfIndentation = levelOfIndentation;
        this.bufferToWrite      = bufferToWrite;
    }

    @Override
    public void print( ) {
        printRequiredIndentationLevels();
        bufferToWrite.append( "<p>" + text + "</p>" );
    }

    @Override
    public void printRequiredIndentationLevels( ) {
        bufferToWrite.append( "\n" );
        for (Integer i = 0; i < levelOfIndentation; i++) {
            bufferToWrite.append( " " );
        }
    }

}
