package org.ats_lang.anairiats.iats;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class Test {

    /**
     * @param args
     * @throws RecognitionException 
     * @throws IOException 
     */
    public static void main(String[] args) throws RecognitionException, IOException {
        CharStream charStream = new ANTLRStringStream("\"ddd\" dd");
        // CharStream charStream1 = new ANTLRFileStream("test.iats");
        iatsLexer lexer = new iatsLexer(charStream );
        
        TokenStream tokenStream = new CommonTokenStream(lexer);
        iatsParser parser = new iatsParser(tokenStream );
        
        parser.rule();
        System.out.println("O.K.");
    }

}

