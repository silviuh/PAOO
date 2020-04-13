package problema_1_composite.decorators;

import problema_1_composite.BufferToWrite;
import problema_1_composite.Tag;

import java.lang.reflect.GenericSignatureFormatError;
import java.util.SimpleTimeZone;

public class ItalicDecorator extends BaseDecorator {

    public ItalicDecorator(Tag tag) {
        super( tag );
    }

    @Override
    public void print( ) {
        super.print();
        this.tag.bufferToWrite.append(
                String.format(
                        "<%s>%s</%s>",
                        "i",
                        this.tag.text,
                        "i"
                )
        );
    }

    @Override
    public void printRequiredIndentationLevels( ) {
        super.printRequiredIndentationLevels();
    }
}
