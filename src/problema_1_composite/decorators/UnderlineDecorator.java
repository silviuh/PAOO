package problema_1_composite.decorators;

import problema_1_composite.BufferToWrite;
import problema_1_composite.Tag;

import java.util.SimpleTimeZone;

public class UnderlineDecorator extends BaseDecorator {

    public UnderlineDecorator(Tag tag) {
        super( tag );
    }

    @Override
    public void print( ) {
        super.print();
        this.tag.bufferToWrite.append(
                String.format(
                        "<%s>%s</%s>",
                        "u",
                        this.tag.text,
                        "u"
                )
        );
    }

    @Override
    public void printRequiredIndentationLevels( ) {
        super.printRequiredIndentationLevels();
    }
}

