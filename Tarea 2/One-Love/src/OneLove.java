import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class OneLove {
	private static String load (String preCodeFile)
		throws java.io.IOException{
			return new String(
					java.nio.file.Files.readAllBytes(
							java.nio.file.Paths.get(preCodeFile)),
					java.nio.charset.Charset.forName("UTF-8"));
		}
	
	public static void main(String[] args) {
		OneLoveParserParser parser = null;
		try {
			ANTLRInputStream input = new ANTLRInputStream(
					load("example/ejemplo-one-love.ol"));
			OneLoveParserLexer lexer = new OneLoveParserLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			parser = new OneLoveParserParser(tokens);
			ParseTree tree = parser.program();
			
			OneLoveParserSemantic sem = new OneLoveParserSemantic();
			sem.visit(tree);
			
		}catch(Exception e) {
			System.err.print(e);
		}
	}
}
