//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.ArrayList;
import java.util.HashMap;
//import java.util.List;
import java.util.Map;


public class OneLoveParserSemantic extends OneLoveParserBaseVisitor<Object>{
	
	protected Map<String, String> _vars = new HashMap<String,String>();
	
	public OneLoveParserSemantic() {}
	
	@Override
	public Object visitStat(OneLoveParserParser.StatContext ctx) { 
		if(ctx.assing() != null) {
			String asignacion = visitAssing(ctx.assing());
			System.out.println(String.format("\t%s", asignacion));
		}else if(ctx.declaracion() != null) {
			String declaracion = visitDeclaracion(ctx.declaracion());
			System.out.println(String.format("\t%s", declaracion));
		}else if(ctx.if_sentence() != null) {
			visitIf_sentence(ctx.if_sentence());
		}else if(ctx.lectura() != null) {
			String lectura = visitLectura(ctx.lectura());
			System.out.println(String.format("\t%s", lectura));
		}else if(ctx.escritura() != null) {
			String escritura = visitEscritura(ctx.escritura());
			System.out.println(String.format("\t%s", escritura));
		}
		return null; 
		
	}
	
	@Override
    public Object visitInicio(OneLoveParserParser.InicioContext ctx) { 
    	if(ctx.INICIO().getText().equals("KRIPPY")){
    		System.out.println("#include <stdio.h>");
    	}
	    return null;
	}
	
	@Override 
	public Object visitCuerpo(OneLoveParserParser.CuerpoContext ctx) {
		if(ctx.CUERPO().getText().equals("PAPELILLO")) {
			System.out.println("int main(void) {");
		}
		return null; 
		
	}
	
	@Override 
	public Object visitConstante(OneLoveParserParser.ConstanteContext ctx) {
		String inicio_constante = "";
		if(ctx.CONST().getText().equals("BAJON")){
			inicio_constante = "#define";

		}
		
		return null; 
		
	}
	
	@Override 
	public Object visitFin(OneLoveParserParser.FinContext ctx) {
		if(ctx.FIN().getText().equals("KUSH")) {
			System.out.println("\treturn 0;");
			System.out.println("}");
		}
		return null; 
		
	}
	
	@Override 
	public String visitDeclaracion(OneLoveParserParser.DeclaracionContext ctx) {
		String declaracion = "";
		String var_type = ctx.tipos_variable().getText();
		String id = "";
		if(ctx.assing() != null) {
			id = ctx.assing().ID(0).getText();
			if(!_vars.containsKey(id)) {
				var_type = getVarType(var_type);
				_vars.put(id, var_type);
				String asignacion = visitAssing(ctx.assing());
				
				declaracion = String.format("%s %s", var_type,asignacion);
				
				
			}else {
				throw new IllegalArgumentException("Variable '" + id + "' already exist");
			}
		}else {
			id = ctx.ID().getText();
			if(!_vars.containsKey(id)) {
				var_type = getVarType(var_type);
				_vars.put(id, var_type);
				declaracion = String.format("%s %s;", var_type,id);
				
			}else {
				throw new IllegalArgumentException("Variable '" + id + "' already exist");
			}
		}
		
		return declaracion;
	}
	
	@Override 
	public String visitLectura(OneLoveParserParser.LecturaContext ctx) {
		String id = ctx.ID().getText();
		if(_vars.containsKey(id)) {
			return String.format("scanf(\"%s\", &%s);", getVarTypeMode(_vars.get(id)), id);
		}else {
			throw new IllegalArgumentException("Variable '" + id + "' doesn't defined"); 
		} 	
	}
	
	@Override 
	public String visitEscritura(OneLoveParserParser.EscrituraContext ctx) {
		if(ctx.ID().size() > 0) {
			String id, format="", args="";
			for(int i = 0; i < ctx.ID().size(); i++) {
				id = ctx.ID(i).getText();
				if(_vars.containsKey(id)) {
					format += getVarTypeMode(_vars.get(id)) + " ";
					args += id + ", ";	
				}else {
					throw new IllegalArgumentException("Variable '" + id + "' doesn't defined");
				}
			}
			return String.format("printf(\"%s\", %s);", format.substring(0, format.length() - 1), args.substring(0, args.length() - 2));
		}else {
			String text = ctx.STRING().getText();
			if(text != null) {
				
				return String.format("printf(%s);", text);
			}
		}
		return null; 
		
	}
		
	@Override 
	public String visitAssing(OneLoveParserParser.AssingContext ctx) { 
		String id = "";
		String asi = "";
		int i = 0;
		id=ctx.ID(i).getText();
		if(ctx.operaciones_matematicas().size()>0) {
			if(_vars.containsKey(id)){
				if(_vars.get(id).equals("int")) {
					String sentencia = visitOperaciones_matematicas(ctx.operaciones_matematicas(0));
					return String.format("%s = %s;", id,sentencia);
				}else {
					throw new IllegalArgumentException("Variable '" + id + "' invalid type ");
				}
			}else {
				throw new IllegalArgumentException("Variable '" + id + "' indefined ");
			}	
		}else if (ctx.ID().size()>1){
			if(_vars.containsKey(id)){
				asi = ctx.ID(i+1).getText();
				if(_vars.containsKey(asi)){
					return imprimirDosVariables(id,asi);
				}else {
					throw new IllegalArgumentException("Variable '" + asi + "' indefined");
				}
			}
		}else{
			if((ctx.NUMBER().size()>0)) {
				return imprimirNumeroVariable(id,ctx.NUMBER(i).getText());
			}else if((ctx.STRING().size()>0)){
				return imprimirStringVariable(id,ctx.STRING(i).getText());	
			}else if((ctx.BOOLEAN().size()>0)){
				return imprimirBooleanVariable(id,ctx.BOOLEAN(i).getText());
			}
		}
		return null;	
	}

	@Override
	public Object visitIf_sentence(OneLoveParserParser.If_sentenceContext ctx) {
		String inicio_if = "";
		String inicio_else = "";
		
		
		if(ctx.IF().getText().equals("CANNABIS")){
			inicio_if = "\tif(";
		}
		if(ctx.condicion().operaciones_logicas().operaciones_logicas().size()>0) {
			
			String[] sentencia = new String[ctx.condicion().operaciones_logicas().operaciones_logicas().size()];
			
			for(int i = 0; i<ctx.condicion().operaciones_logicas().operaciones_logicas().size(); i++) {
				String s = visitOperaciones_logicas(ctx.condicion().operaciones_logicas().operaciones_logicas(i));
				sentencia[i] = s;
			}
			
			String operador = getOL(ctx.condicion().operaciones_logicas().sentencia_log());
			System.out.println(String.format("%s  %s %s %s )", inicio_if,sentencia[0],operador,sentencia[1]));
		
		}else{
			
			String sentencia = visitOperaciones_logicas(ctx.condicion().operaciones_logicas());
			System.out.println(String.format("%s  %s )", inicio_if,sentencia));
		
		}
		
		System.out.println("\t{");
		
		for(int i = 0; i< ctx.condicion().bloque().stat().size() ; i++) {
			
			if(ctx.condicion().bloque().stat(i).assing() != null) {
				
				String asignacion = visitAssing(ctx.condicion().bloque().stat(i).assing());
				System.out.println(String.format("\t    %s", asignacion));
				
			}else if(ctx.condicion().bloque().stat(i).declaracion() != null) {
				
				String declaracion = visitDeclaracion(ctx.condicion().bloque().stat(i).declaracion());
				System.out.println(String.format("\t    %s", declaracion));
				
			}else if(ctx.condicion().bloque().stat(i).if_sentence() != null) {
				
				visitIf_sentence(ctx.condicion().bloque().stat(i).if_sentence());
				
			}else if(ctx.condicion().bloque().stat(i).lectura() != null) {
				
				String lectura = visitLectura(ctx.condicion().bloque().stat(i).lectura());
				System.out.println(String.format("\t    %s", lectura));
				
			}else if(ctx.condicion().bloque().stat(i).escritura() != null) {
				
				String escritura = visitEscritura(ctx.condicion().bloque().stat(i).escritura());
				System.out.println(String.format("\t    %s", escritura));
				
			}	
		}
		System.out.println("\t}");
		if(ctx.ELSE() != null) {
			if(ctx.ELSE().getText().equals("PARAGUA")) {
				
				inicio_else = "\telse {";
				System.out.println(inicio_else);
				
				if(ctx.else_sentence() != null) {
				
					visitElse_sentence(ctx.else_sentence());
					
				}
			}
		}
		
		return null; 
	}

	@Override
	public Object visitElse_sentence(OneLoveParserParser.Else_sentenceContext ctx) { 
	
		for(int i = 0; i< ctx.bloque().stat().size() ; i++) {
			
			if(ctx.bloque().stat(i).assing() != null) {
				String asignacion = visitAssing(ctx.bloque().stat(i).assing());
				System.out.println(String.format("\t    %s", asignacion));
			}else if(ctx.bloque().stat(i).declaracion() != null) {
				String declaracion = visitDeclaracion(ctx.bloque().stat(i).declaracion());
				System.out.println(String.format("\t    %s", declaracion));
			}else if(ctx.bloque().stat(i).if_sentence() != null) {
				visitIf_sentence(ctx.bloque().stat(i).if_sentence());
			}else if(ctx.bloque().stat(i).lectura() != null) {
				String lectura = visitLectura(ctx.bloque().stat(i).lectura());
				System.out.println(String.format("\t    %s", lectura));
			}else if(ctx.bloque().stat(i).escritura() != null) {
				String escritura = visitEscritura(ctx.bloque().stat(i).escritura());
				System.out.println(String.format("\t    %s", escritura));
			}
			
		}
		System.out.println("\t}");
		return null; 
		
	}

	@Override
	public String visitOperaciones_logicas(OneLoveParserParser.Operaciones_logicasContext ctx) {
		String[] ids = new String[2];
		String[] bol = new String[2];
		
		for(int i = 0 ; i<ctx.ID().size();i++) {
			
			if(_vars.containsKey(ctx.ID().get(i).getText())) {
				if(_vars.get(ctx.ID().get(i).getText()).equals("boolean")) {
					ids[i] = ctx.ID().get(i).getText();
				}else {
					throw new IllegalArgumentException("Variable '" + ctx.ID().get(i).getText() + "' Not Boolean");
				}
			}else {
				throw new IllegalArgumentException("Variable '" + ctx.ID().get(i).getText() + "' indefined");
			}	
		}
		for(int i = 0; i<ctx.BOOLEAN().size();i++) {

			if((ctx.BOOLEAN().get(i).getText().equals("HAYMANO")) || (ctx.BOOLEAN().get(i).getText().equals("NOHAYMANO"))) {
				String b = ctx.BOOLEAN().get(i).getText();
				if(b.equals("HAYMANO")) {
					bol[i]= "true";
				}else if(b.equals("NOHAYMANO")){
					bol[i] = "false";
				}
				
			}else {
				throw new IllegalArgumentException("Variable '" + ctx.BOOLEAN().get(i).getText() + "' not boolean");
			}
		}
		if(ids[ids.length-1]!=null) {
			return String.format("%s %s %s", ids[0],getOL(ctx.sentencia_log()),ids[1]);
		}else if(bol[bol.length-1] != null) {
			return String.format("%s %s %s", bol[0],getOL(ctx.sentencia_log()),bol[1]);
		}else if((bol[0] != null) && (ids[0] != null)){
			return String.format("%s %s %s", ids[0],getOL(ctx.sentencia_log()),bol[0]);
		}
		return null; 
	}
	
	@Override
	public String visitOperaciones_matematicas(OneLoveParserParser.Operaciones_matematicasContext ctx) {
		if(ctx.NUMBER().size()>1) {
			String[] numeros = new String[2];
			for(int i = 0 ; i < ctx.NUMBER().size();i++) {
				numeros[i] = ctx.NUMBER(i).getText();
			}
			return String.format("%s %s %s", numeros[0],ctx.sentencia_mate().getText(),numeros[1]);
		
		}else if(ctx.ID().size()>1) {
			String[] ids = new String[2];
			for (int j = 0 ; j < ctx.ID().size() ; j++) {
				if(_vars.containsKey(ctx.ID(j).getText())) {
					if(_vars.get(ctx.ID(j).getText()).equals("int")) {
						ids[j] = ctx.ID(j).getText();
					}else {
						throw new IllegalArgumentException("Variable '" + ctx.ID(j).getText() + "' invalid type ");
					}
				}else {
					throw new IllegalArgumentException("Variable '" + ctx.ID(j).getText() + "' indefined ");
				}
				
			}
			return String.format("%s %s %s", ids[0],ctx.sentencia_mate().getText(),ids[1]);
		}else {
			String numero = "";
			String variable = "";
			numero = ctx.NUMBER(0).getText();
			variable = ctx.ID(0).getText();
			if(_vars.containsKey(variable)) {
				if(_vars.get(variable).equals("int")) {
					return String.format("%s %s %s", variable,ctx.sentencia_mate().getText(),numero);
				}else {
					throw new IllegalArgumentException("Variable '" + variable + "' invalid type ");
				}
			}else {
				throw new IllegalArgumentException("Variable '" + variable + "' indefined ");
			}
		}
		
	}
	
	private String getOL(OneLoveParserParser.Sentencia_logContext sent) {
		if(sent.getText().equals("Y")) {
			return "and";
		}
		if(sent.getText().equals("O")) {
			return "or";
		}
		if(sent.getText().equals(">-<")) {
			return "!=";
		}
		if(sent.getText().equals("<->")) {
			return "==";
		}else {
			return "";
		}
	}
	
	private String getVarTypeMode(String var_type) {
		if(var_type.equals("int"))
			return "%d";
		else if(var_type.equals("boolean"))
			return "%b";
		else
			return "%s";
	}
	
	private String getVarType(String var_type) {
		if(var_type.equals("CUANTOSG"))
			return "int";
		else if(var_type.equals("TENIMANO"))
			return "boolean";
		else
			return "char";
	}
	
	private String imprimirBooleanVariable(String v1 ,String v2) {
		String resultado = "";
		if(_vars.get(v1).equals("boolean")) {
			if(v2.equals("HAYMANO")) {
				resultado = String.format("%s = true;",v1);
			}else if(v2.equals("NOHAYMANO")) {
				resultado =  String.format("%s = false;",v1);
			}
			return resultado;
		}else {
			throw new IllegalArgumentException("Variable '" + v2 + "' invalid type ");
		}
	}
	
	private String imprimirStringVariable(String v1, String v2) {
		if(_vars.get(v1).equals("char")) {
			return String.format("%s = %s;", v1, v2);
		}else {
			throw new IllegalArgumentException("Variable '" + v2 + "' invalid type ");
		}
	}
	
	private String imprimirNumeroVariable(String v1, String v2) {
		if(_vars.get(v1).equals("int")) {
			return String.format("%s = %s;", v1, v2);
		}else {
			throw new IllegalArgumentException("Variable '" + v2 + "' invalid type ");
		}
	}
	
	private String imprimirDosVariables (String v1, String v2) {
		if(_vars.get(v1).equals("int") && _vars.get(v2).equals("int")) {
			return String.format("%s = %s;", v1, v2);
			
		}else if(_vars.get(v1).equals("boolean") && _vars.get(v2).equals("boolean")){
			return String.format("%s = %s;", v1, v2);
			
		}else if(_vars.get(v1).equals("char") && _vars.get(v2).equals("char")){
			return String.format("%s = %s;", v1, v2);
		}else{
			throw new IllegalArgumentException("Variable '" + v2 + "' invalid type ");
		}
	}
	
}
