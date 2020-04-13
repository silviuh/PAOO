package problema_1_composite;

import problema_1_composite.decorators.BoldDecorator;
import problema_1_composite.decorators.DataTag;
import problema_1_composite.decorators.ItalicDecorator;
import problema_1_composite.decorators.UnderlineDecorator;

public class HTMLBuilder {

    private HTMLBuilder( ) {


    }

    public static Tag createHTMLFile( ) {

        BufferToWrite buff = new BufferToWrite();

        HTMLTag html = new HTMLTag( 0, buff );

        TITLETag title = new TITLETag(
                "fisier_exemplu",
                4,
                buff
        );

        BODYTag body = new BODYTag( 4, buff );

        html.addComponent( title );
        html.addComponent( body );


        PARATag p1 = new PARATag(
                "Ana are mere",
                8,
                buff
        );

        PARATag p2 = new PARATag(
                "vasilica e bucatar",
                8,
                buff
        );

        DIVTag div1 = new DIVTag(
                8,
                buff
        );

        UNORDEREDLISTTag ul1 = new UNORDEREDLISTTag(
                8,
                buff
        );


        PARATag p3 = new PARATag(
                "bbbbbb",
                12,
                buff
        );

        LISTTag li1 = new LISTTag(
                "CCCCC",
                12,
                buff
        );

        LISTTag li2 = new LISTTag(
                "uuuuuuuu",
                12,
                buff
        );


        body.addComponent( p1 );
        body.addComponent( p2 );
        body.addComponent( div1 );
        body.addComponent( ul1 );

        div1.addComponent( p3 );
        div1.addComponent(
                new ItalicDecorator(
                        new BoldDecorator(
                                new DataTag(
                                        "DECORATOR TEST",
                                        12,
                                        buff
                                )
                        )
                )
        );

        ul1.addComponent( li1 );
        ul1.addComponent( li2 );

        html.print();
        buff.printToFile( "exemplu2.html" );


        return html;
    }

}
