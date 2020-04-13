package problema_1_composite.decorators;

import problema_1_composite.BufferToWrite;
import problema_1_composite.Tag;

public class BaseDecorator extends Tag {
    public Tag tag;

    public BaseDecorator(Tag tag) {
        this.tag = tag;

        this.text = tag.text;
        this.bufferToWrite = tag.bufferToWrite;
        this.levelOfIndentation = tag.levelOfIndentation;
    }

    @Override
    public void print( ) {
        tag.print();
    }

    @Override
    public void printRequiredIndentationLevels( ) {
        tag.printRequiredIndentationLevels();
    }
}