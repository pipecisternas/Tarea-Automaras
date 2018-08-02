//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.ArrayList;
import java.util.HashMap;
//import java.util.List;
import java.util.Map;


public class OneLoveParserSemantic extends OneLoveParserBaseVisitor<Object>{
	
	protected Map<String, String> _vars = new HashMap<String,String>();
	
	public OneLoveParserSemantic() {}
	
	@Override //metodo que comprueba que tipo de operacion es
	public Object visitStat(OneLoveParserParser.StatContext ctx) { 
		//METODO QUE VERIFICA SI LA OPERACION ES DE ASIGNACION
		if(ctx.assing() != null) {
			String asignacion = visitAssing(ctx.assing());
			System.out.println(String.format("\t%s", asignacion));
			
			//METODO QUE VERIFICA SI LA OPERACION ES DE DECLARACION
		}else if(ctx.declaracion() != null) {
			String declaracion = visitDeclaracion(ctx.declaracion());
			System.out.println(String.format("\t%s", declaracion));
			
			//METODO QUE VERIFICA SI LA OPERACION ES UN IF 
		}else if(ctx.if_sentence() != null) {
			visitIf_sentence(ctx.if_sentence());
			
			//METODO QUE VERIFICA SI LA OPERACION ES DE LECTURA DE DATOS
		}else if(ctx.lectura() != null) {
			String lectura = visitLectura(ctx.lectura());
			System.out.println(String.format("\t%s", lectura));
			
			//METODO QUE VERIFICA SI LA OPERACION ES DE ESCRITURA POR PANTALLA
		}else if(ctx.escritura() != null) {
			String escritura = visitEscritura(ctx.escritura());
			System.out.println(String.format("\t%s", escritura));
		}
		return null; 
		
	}
	
	@Override //METODO QUE VERIFICA SI EL COMANDO DE INICIO DE PROGRAMA ES VALIDO 
    public Object visitInicio(OneLoveParserParser.InicioContext ctx) { 
    	if(ctx.INICIO().getText().equals("KRIPPY")){
    		System.out.println("#include <stdio.h>");
    	}
	    return null;
	}
	
	@Override //METODO QUE VERIFICA SI EL COMANDO DE INICIO DE CUERPO DE PROGRAMA ES VALIDO
	public Object visitCuerpo(OneLoveParserParser.CuerpoContext ctx) {
		if(ctx.CUERPO().getText().equals("PAPELILLO")) {
			System.out.println("int main(void) {");
		}
		return null; 
		
	}
	
	@Override //METODO QUE VERIFICA LA DECLARACION DE VARIABLES CONSTANTES
	public Object visitConstante(OneLoveParserParser.ConstanteContext ctx) {
		if(ctx.CONST().getText().equals("BAJON")){
			System.out.println("#define ");
		}
		return null; 
		
	}
	
	@Override //METODO QUE VERIFICA SI EL COMANDO DE FIN DE PROGRAMA ES VALIDO
	public Object visitFin(OneLoveParserParser.FinContext ctx) {
		if(ctx.FIN().getText().equals("KUSH")) {
			System.out.println("\treturn 0;");
			System.out.println("}");
		}
		return null; 
		
	}
	
	@Override  //METODO DECLARACION DE VARIABLES
	public String visitDeclaracion(OneLoveParserParser.DeclaracionContext ctx) {
		String declaracion = "";
		//OBTENGO EL TIPO DE LA VARIABLE
		String var_type = ctx.tipos_variable().getText();
		String id = "";
		//VERIFICA SI EN LA DECLARACION HAGO UN ASIGNACION
		if(ctx.assing() != null) {
			//SI REALIZO UNA ASIGNACION, OBTENGO EL NOMBRE DE LA VARIABLE
			id = ctx.assing().ID(0).getText();

			//SE VERIFICA QUE LA VARIABLE NO HAGA SIDO DECLARADA ANTERIORMENTE
			if(!_vars.containsKey(id)) {
				//OBTENGO EL TIPO DE VARIABLE SEGUNDO LENGUAJE C CON LA FUNCION getVerType()
				var_type = getVarType(var_type);
				//AGREGO LA VARIABLE AL MAPA DE VARIABLES DECLARADAS
				_vars.put(id, var_type);
				//OBTENGO LA ASIGNACION REALIZADA GRACIAS AL METODO visitAssing()
				String asignacion = visitAssing(ctx.assing());
				
				//GUARDA LA DECLARACION CON LA ASIGNACION EN LENGUAJE C
				declaracion = String.format("%s %s", var_type,asignacion);
				
				
			}else {
				//MENSAJE DE ERROR CUANDO LA VARIABLE YA FUE DECLARADA
				throw new IllegalArgumentException("Variable '" + id + "' already exist");
			}
		}else {
			//CASO QUE SOLO SE REALIZO LA DECLARACION DE LA VARIABLE
			//OBTENGO EL NOMBRE DE LA VARIABLE
			id = ctx.ID().getText();
			//VERIFICO QUE LA VARIABLE NO HAYA SIDO DECLARADA
			if(!_vars.containsKey(id)) {
				//OBTENGO EL TIPO DE VARIABLE SEGUNDO LENGUAJE C CON LA FUNCION getVerType()
				var_type = getVarType(var_type);
				//AGREGO LA VARIABLE AL MAPA DE VARIABLES DECLARADAS
				_vars.put(id, var_type);
				//GUARDA LA DECLARACION CON LA ASIGNACION EN LENGUAJE C
				declaracion = String.format("%s %s;", var_type,id);
				
			}else {
				//IMPRIMO LA DECLARACION CON LA ASIGNACION EN LENGUAJE C
				throw new IllegalArgumentException("Variable '" + id + "' already exist");
			}
		}
		//RETORNA LA DECLARACION 
		return declaracion;
	}
	
	@Override //METODO DE LECTURA DE DATOS 
	public String visitLectura(OneLoveParserParser.LecturaContext ctx) {
		//OBTIENE EL NOMBRE DE LA VARIABLE
		String id = ctx.ID().getText();
		//VERIFICA QUE LA VARIABLE HAYA SIDO DECLARADA
		if(_vars.containsKey(id)) {
			//RETORNA LA LECTURA DE DATOS
			return String.format("scanf(\"%s\", &%s);", getVarTypeMode(_vars.get(id)), id);
		}else {
			//MENSAJE DE ERROR CUANDO LA VARIABLE NO ESTA DECLARADA
			throw new IllegalArgumentException("Variable '" + id + "' doesn't defined"); 
		} 	
	}
	
	@Override //METODO DE ESCRITURA DE DATOS
	public String visitEscritura(OneLoveParserParser.EscrituraContext ctx) {
		
		if(ctx.ID().size() > 0) {
			String id, format="", args="";
			//RECORRO TODAS LA VARIABLES QUE SE QUIEREN IMPRIMIR POR PANTALLA
			for(int i = 0; i < ctx.ID().size(); i++) {
				id = ctx.ID(i).getText();
				if(_vars.containsKey(id)) {
					//SI LA VARIABLE EXISTE LA AGREGO A FORMATO
					format += getVarTypeMode(_vars.get(id)) + " ";
					args += id + ", ";	
				}else {
					//MENSAJE DE ERROR DE VARIABLE NO DECLARADA
					throw new IllegalArgumentException("Variable '" + id + "' doesn't defined");
				}
			}
			//RETORNO EL FORMATO DESEADO 
			return String.format("printf(\"%s\", %s);", format.substring(0, format.length() - 1), args.substring(0, args.length() - 2));
		}else {
			//CASO DE IMPRESION DE UN STRING
			//OBTENGO EL STRING
			String text = ctx.STRING().getText();
			//SI NO ES NULO
			if(text != null) {
				//RETORNO EL CONTENIDO
				return String.format("printf(%s);", text);
			}
		}
		return null; 
		
	}
	
	
	@Override //METODO DE ASIGNACION 
	public String visitAssing(OneLoveParserParser.AssingContext ctx) { 
		String id = "";
		String asi = "";
		int i = 0;
		//OBTENGO EL NOMBRE DE LA VARIABLE
		id=ctx.ID(i).getText();
		
		//VERIFICO SI EN LA ASIGNACION SE REALIZO UNA OPERACION MATEMATICA
		if(ctx.operaciones_matematicas().size()>0) {
			//VERIFICO QUE LA VARIABLE FUE DECLARADA
			if(_vars.containsKey(id)){
				//VERIFICO QUE LA VARIABLE ES TIPO INT
				if(_vars.get(id).equals("int")) {
					//OBTENGO LA OPERACION MATEMATICA
					String sentencia = visitOperaciones_matematicas(ctx.operaciones_matematicas(0));
					//RETORNO LA OPERACION
					return String.format("%s = %s;", id,sentencia);
				}else {
					//MENSAJE DE ERROR TIPO DE VARIABLE INVALIDO
					throw new IllegalArgumentException("Variable '" + id + "' invalid type ");
				}
			}else {
				//MENSAJE DE ERROR VARIABLE INDEFINIDA
				throw new IllegalArgumentException("Variable '" + id + "' indefined ");
			}	
			//CASO ASIGNACION DE UNA VARIABLE A OTRA
		}else if (ctx.ID().size()>1){
			//VARIBICO LA EXISTENCIA DE LA VARIABLE 
			if(_vars.containsKey(id)){
				
				asi = ctx.ID(i+1).getText();
				//VERIFICO LA EXISTENCIA DE LA SENGUNDA VARIABLE
				if(_vars.containsKey(asi)){
					//RETORNO LO OBTENIDO EN EL METODO
					return imprimirDosVariables(id,asi);
				}else {
					//MENSAJE DE ERROR SEGUNDA VARIABLE NO DEFINIDA
					throw new IllegalArgumentException("Variable '" + asi + "' indefined");
				}
			}else{
				//MENSAJE DE ERROR PRIMERA VARIABLE NO DEFINIDA
				throw new IllegalArgumentException("Variable '" + id + "' indefined");
			}
			
			//CASO ASIGNACION DE UN NUMERO, BOOLEANO O STRING A UNA VARIABLE
			//VERIFICACION DE EXISTENCIA DE LA VARIABLE
		}else if(_vars.containsKey(id)){
			//SI ES UN NUMERO 
			if((ctx.NUMBER().size()>0)) {
				return imprimirNumeroVariable(id,ctx.NUMBER(i).getText());
				//SI ES UN STRING
			}else if((ctx.STRING().size()>0)){
				return imprimirStringVariable(id,ctx.STRING(i).getText());
				//SI ES UN BOOLEANO
			}else if((ctx.BOOLEAN().size()>0)){
				return imprimirBooleanVariable(id,ctx.BOOLEAN(i).getText());
			}
		}
		//MENSAJE DE ERROR VARIABLE NO DEFINIDA
		throw new IllegalArgumentException("Variable '" + id + "' indefined");	
	}

	@Override //METODO IF
	public Object visitIf_sentence(OneLoveParserParser.If_sentenceContext ctx) {
		String inicio_if = "";
		String inicio_else = "";
		
		//VERIFICO QUE EL COMANDO DE INICIO DE IF SEA CORRECTO
		if(ctx.IF().getText().equals("CANNABIS")){
			inicio_if = "\tif(";
		}
		//COMPRUEBO CUANTAS OPERACIONES LOGICAS FUERON ESCRITAS
		//ESTE PROGRAMA SOLO ACEPTA 2 
		if(ctx.condicion().operaciones_logicas().operaciones_logicas().size()>0) {
			//CASO 2 OPERACIONES LOGICAS
			String[] sentencia = new String[ctx.condicion().operaciones_logicas().operaciones_logicas().size()];
			
			//RECORRO LAS 2 OPERACIONES
			for(int i = 0; i<ctx.condicion().operaciones_logicas().operaciones_logicas().size(); i++) {
				//OBTENGO LA OPERACION
				String s = visitOperaciones_logicas(ctx.condicion().operaciones_logicas().operaciones_logicas(i));
				//AGREGO A ARREGLO 
				sentencia[i] = s;
			}
			//OBTENGO EL OPERADOR LOGICO
			String operador = getOL(ctx.condicion().operaciones_logicas().sentencia_log());
			//MUESTRO POR PANTALLA
			System.out.println(String.format("%s  %s %s %s )", inicio_if,sentencia[0],operador,sentencia[1]));
		
		}else{
			//CASO SOLO UNA OPERACION LOGICA
			//OBTENGO LA OPERACION
			String sentencia = visitOperaciones_logicas(ctx.condicion().operaciones_logicas());
			//MUESTRO POR PANTALLA
			System.out.println(String.format("%s  %s )", inicio_if,sentencia));
		
		}
		//INICIO EL CICLO IF
		System.out.println("\t{");
		
		//RECORRO TODAS LOS METODOS DENTRO DEL IF
		for(int i = 0; i< ctx.condicion().bloque().stat().size() ; i++) {
			//SI SE REALIZO UNA ASIGNACION DENTRO DEL IF
			if(ctx.condicion().bloque().stat(i).assing() != null) {
				
				String asignacion = visitAssing(ctx.condicion().bloque().stat(i).assing());
				System.out.println(String.format("\t    %s", asignacion));
				
				//SI SE REALIZO UNA DECLARACION DENTRO DEL IF
			}else if(ctx.condicion().bloque().stat(i).declaracion() != null) {
				
				String declaracion = visitDeclaracion(ctx.condicion().bloque().stat(i).declaracion());
				System.out.println(String.format("\t    %s", declaracion));
				
				//SI SE REALIZO OTRO IF DENTRO DE ESTE IF
			}else if(ctx.condicion().bloque().stat(i).if_sentence() != null) {
				
				visitIf_sentence(ctx.condicion().bloque().stat(i).if_sentence());
				
				//SI SE REALIZO UNA LECTURA DE DATOS 
			}else if(ctx.condicion().bloque().stat(i).lectura() != null) {
				
				String lectura = visitLectura(ctx.condicion().bloque().stat(i).lectura());
				System.out.println(String.format("\t    %s", lectura));
				
				//SI SE REALIZO UNA ESCRITURA DE DATOS
			}else if(ctx.condicion().bloque().stat(i).escritura() != null) {
				
				String escritura = visitEscritura(ctx.condicion().bloque().stat(i).escritura());
				System.out.println(String.format("\t    %s", escritura));
				
			}	
		}
		//FIN DEL IF
		System.out.println("\t}");
		
		//VERIFICO SI SE REALIZO UNA SENTENCIA ELSE
		if(ctx.ELSE() != null) {
			//COMPRUEBO QUE LA SENTENCIA ELSE FUE DECLARADA CORRECTAMETNE
			if(ctx.ELSE().getText().equals("PARAGUA")) {
				
				inicio_else = "\telse {";
				//INICIO SENTENCOA ELSE
				System.out.println(inicio_else);
				
				//VERIFICO LA EXISTENCIA DE OPERACIONES DENTRO DEL ELSE
				if(ctx.else_sentence() != null) {
					
					//LLAMO FUNCION ELSE
					visitElse_sentence(ctx.else_sentence());
					
				}
			}
		}
		return null; 
	}

	@Override //FUNCION ELSE
	public Object visitElse_sentence(OneLoveParserParser.Else_sentenceContext ctx) { 
	
		//RECORRO TODAS LAS OPERACIONES QUE HAY DENTRO DEL ELSE
		for(int i = 0; i< ctx.bloque().stat().size() ; i++) {
			 //SI ES UNA ASIGANCION
			if(ctx.bloque().stat(i).assing() != null) {
				String asignacion = visitAssing(ctx.bloque().stat(i).assing());
				System.out.println(String.format("\t    %s", asignacion));
			//SI ES UNA DECLARACION
			}else if(ctx.bloque().stat(i).declaracion() != null) {
				String declaracion = visitDeclaracion(ctx.bloque().stat(i).declaracion());
				System.out.println(String.format("\t    %s", declaracion));
			//SI ES UN IF 
			}else if(ctx.bloque().stat(i).if_sentence() != null) {
				visitIf_sentence(ctx.bloque().stat(i).if_sentence());
			//SI ES UNA LECTURA DE DATOS
			}else if(ctx.bloque().stat(i).lectura() != null) {
				String lectura = visitLectura(ctx.bloque().stat(i).lectura());
				System.out.println(String.format("\t    %s", lectura));
			//SI ES UNA ESCRITURA DE DATOS 
			}else if(ctx.bloque().stat(i).escritura() != null) {
				String escritura = visitEscritura(ctx.bloque().stat(i).escritura());
				System.out.println(String.format("\t    %s", escritura));
			}
			
		}
		//FIN DEL ELSE
		System.out.println("\t}");
		return null; 
		
	}

	@Override //METODO OPERACIONES LOGICA
	public String visitOperaciones_logicas(OneLoveParserParser.Operaciones_logicasContext ctx) {
		String[] ids = new String[2];
		String[] bol = new String[2];
		
		//RECORRO TODAS LAS VARIABLES
		for(int i = 0 ; i<ctx.ID().size();i++) {
			
			//VERIFICO QUE HAYAS SIDO DECLARADAS
			if(_vars.containsKey(ctx.ID().get(i).getText())) {
				//VERIFICO QUE LA VARIABLE SEA BOOLEANA
				if(_vars.get(ctx.ID().get(i).getText()).equals("boolean")) {
					//GUARDO LA VARIABLE
					ids[i] = ctx.ID().get(i).getText();
				}else {
					//MENSAJO ERROR VARIABLO NO ES BOOLEANA
					throw new IllegalArgumentException("Variable '" + ctx.ID().get(i).getText() + "' Not Boolean");
				}
			}else {
				//MENSAJE DE ERROR VARIABLE NO DEFINIDA
				throw new IllegalArgumentException("Variable '" + ctx.ID().get(i).getText() + "' indefined");
			}	
		}
		//RECORRO TODAS LA SENTENCIAS BOOLEANAS
		for(int i = 0; i<ctx.BOOLEAN().size();i++) {
			//VERIFICO QUE LA SENTENCIA BOOLEANA SEA VALIDA
			if((ctx.BOOLEAN().get(i).getText().equals("HAYMANO")) || (ctx.BOOLEAN().get(i).getText().equals("NOHAYMANO"))) {
				//OBTENGO LA SENTENCIA BOOLEANA
				String b = ctx.BOOLEAN().get(i).getText();
				//VERIFICACION SI ES TRUE
				if(b.equals("HAYMANO")) {
					bol[i]= "true";
					//VERIFICACION SI ES FALSE
				}else if(b.equals("NOHAYMANO")){
					bol[i] = "false";
				}
				
			}else {
				//MENSAJE DE ERROR VARIABLE NO BOOLEANA
				throw new IllegalArgumentException("Variable '" + ctx.BOOLEAN().get(i).getText() + "' not boolean");
			}
		}
		//SETEO EL FORMATO A RETORNAR
		if(ids[ids.length-1]!=null) {
			return String.format("%s %s %s", ids[0],getOL(ctx.sentencia_log()),ids[1]);
		}else if(bol[bol.length-1] != null) {
			return String.format("%s %s %s", bol[0],getOL(ctx.sentencia_log()),bol[1]);
		}else if((bol[0] != null) && (ids[0] != null)){
			return String.format("%s %s %s", ids[0],getOL(ctx.sentencia_log()),bol[0]);
		}
		return null; 
	}
	
	@Override //METODOS OPERACIONES MATEMATICAS
	public String visitOperaciones_matematicas(OneLoveParserParser.Operaciones_matematicasContext ctx) {
		//VERIFICO SI LA OPERACION CONTIENE 2 NUMEROS
		if(ctx.NUMBER().size()>1) {
			
			String[] numeros = new String[2];
			//RECORRO LOS NUMEROS Y LOS GUARDO 
			for(int i = 0 ; i < ctx.NUMBER().size();i++) {
				numeros[i] = ctx.NUMBER(i).getText();
			}
			//RETORNO EL FORMATO 
			return String.format("%s %s %s", numeros[0],ctx.sentencia_mate().getText(),numeros[1]);
		
			//VERIFICO SI LA OPERACON CONTIENE 2 VARIABLES	
		}else if(ctx.ID().size()>1) {
			String[] ids = new String[2];
			//RECORRO LAS VARIABLE
			for (int j = 0 ; j < ctx.ID().size() ; j++) {
				//VERIFICO QUE HAYAN SIDO DECLARADAS
				if(_vars.containsKey(ctx.ID(j).getText())) {
					//VERIFICO QUE LA VARIABLE SEA DEL TIPO INT
					if(_vars.get(ctx.ID(j).getText()).equals("int")) {
						//GUARDO LA VARIABLE
						ids[j] = ctx.ID(j).getText();
					}else {
						//MENSAJE DE ERROR DE TIPO INVALIDO
						throw new IllegalArgumentException("Variable '" + ctx.ID(j).getText() + "' invalid type ");
					}
				}else {
					//MENSAJE DE ERROR DE VARIABLE NO DEFINIDA
					throw new IllegalArgumentException("Variable '" + ctx.ID(j).getText() + "' indefined ");
				}
				
			}
			//RETORNO EL FORMATO 
			return String.format("%s %s %s", ids[0],ctx.sentencia_mate().getText(),ids[1]);
		}else {
			//CASO OPERACION ES CON NUMERO Y VARIABLE
			String numero = "";
			String variable = "";
			//OBTENGO EL NUMERO
			numero = ctx.NUMBER(0).getText();
			//OBTENGO LA VARIABLE
			variable = ctx.ID(0).getText();
			//VERIFICO QUE LA VARIABLE HAYA SIDO DECLARADA
			if(_vars.containsKey(variable)) {
				//VERIFICO QUE LA VARIABLE SEA TIPO INT
				if(_vars.get(variable).equals("int")) {
					//RETORNO EL FORMATO
					return String.format("%s %s %s", variable,ctx.sentencia_mate().getText(),numero);
				}else {
					//MENSAJE DE ERROR TIPO INVALIDO
					throw new IllegalArgumentException("Variable '" + variable + "' invalid type ");
				}
			}else {
				//MENSAJE DE ERROR VARIABLE NO DEFINIDA
				throw new IllegalArgumentException("Variable '" + variable + "' indefined ");
			}
		}
		
	}
	
	//METODO QUE OBTIENE LA OPERACION LOGICA A APARTIR DEL CONTEXTO DE SENTENCIA 
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
	
	//MEDODO QUE RETORNO EL TIPO DE VARIABLE PARA LA LECTURA Y ESCRITURA DE DATOS A PARTIR DEL TIPO DE VARIABLE
	private String getVarTypeMode(String var_type) {
		if(var_type.equals("int"))
			return "%d";
		else if(var_type.equals("boolean"))
			return "%b";
		else
			return "%s";
	}
	
	//METODO QUE CONVIERTE EL TIPO DE VARIABLE DEL LENGUAJE ONELOVE A LENGUAJE C
	private String getVarType(String var_type) {
		if(var_type.equals("CUANTOSG"))
			return "int";
		else if(var_type.equals("TENIMANO"))
			return "boolean";
		else
			return "char";
	}
	
	//METODO QUE RETORNA EL FORMATO PARA LA ASIGNACION DE UNA VARIABLE CON BOOLEANO
	private String imprimirBooleanVariable(String v1 ,String v2) {
		String resultado = "";
		//VERIFICA QUE LA VARIABLE SEA BOOLEANA 
		if(_vars.get(v1).equals("boolean")) {
			//VERIFICA SENTECIA TRUE
			if(v2.equals("HAYMANO")) {
				resultado = String.format("%s = true;",v1);
				//VERIFICA SENTENCIA ELSE
			}else if(v2.equals("NOHAYMANO")) {
				resultado =  String.format("%s = false;",v1);
			}
			//RETORNA FORMATO 
			return resultado;
		}else {
			//MENSAJE ERROR VARIABLE NO ES TIPO BOOLEANDO
			throw new IllegalArgumentException("Variable '" + v2 + "' invalid type ");
		}
	}
	
	//METODO QUE RETORNA EL FORMATO PARA LA ASIGNACION DE UNA VARIABLE CON STRING
	private String imprimirStringVariable(String v1, String v2) {
		//VERIFICA QUE SEA TIPO STRING LA VARIABLE
		if(_vars.get(v1).equals("char")) {
			//RETORNA EL FORMATO 
			return String.format("%s = %s;", v1, v2);
		}else {
			//MENSAJE DE ERROR VARIABLE NO STRING
			throw new IllegalArgumentException("Variable '" + v2 + "' invalid type ");
		}
	}
	
	//METODO QUE RETORNA EL FORMATO PARA LA ASIGNACION DE UNA VARIABLE CON NUMERO
	private String imprimirNumeroVariable(String v1, String v2) {
		//VERIFICA SI LA VARIABLE ES TIPO INT 
		if(_vars.get(v1).equals("int")) {
			//RETORNA EL FORMATO 
			return String.format("%s = %s;", v1, v2);
		}else {
			//MENSAJE DE ERROR VARIABLE NO NUMERICA
			throw new IllegalArgumentException("Variable '" + v2 + "' invalid type ");
		}
	}
	
	//METODO QUE RETORNA EL FORMATO PARA LA ASIGNACION DE 2 VARIABLES
	private String imprimirDosVariables (String v1, String v2) {
		//VERIFICA QUE LAS 2 VARIABLES SEAN TIPO NUMERICA
		if(_vars.get(v1).equals("int") && _vars.get(v2).equals("int")) {
			return String.format("%s = %s;", v1, v2);
			
			//VERIFICA QUE LAS W VARIABLES SEAN DEL TIPO BOOLEANA
		}else if(_vars.get(v1).equals("boolean") && _vars.get(v2).equals("boolean")){
			return String.format("%s = %s;", v1, v2);
			
			//VERIFICA QUE LAS 2 VARIABLES SEAN DEL TIPO STRING
		}else if(_vars.get(v1).equals("char") && _vars.get(v2).equals("char")){
			return String.format("%s = %s;", v1, v2);
		}else{
			//MENSAJE DE ERROR VARIABLE 2 NO CORRESPONDE AL TIPO DE VARIABLE 1
			throw new IllegalArgumentException("Variable '" + v2 + "' invalid type ");
		}
	}
	
}
