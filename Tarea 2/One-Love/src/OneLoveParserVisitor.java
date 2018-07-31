// Generated from OneLoveParser.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OneLoveParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OneLoveParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OneLoveParserParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(OneLoveParserParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneLoveParserParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(OneLoveParserParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneLoveParserParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(OneLoveParserParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneLoveParserParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(OneLoveParserParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneLoveParserParser#constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstante(OneLoveParserParser.ConstanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneLoveParserParser#cuerpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpo(OneLoveParserParser.CuerpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneLoveParserParser#fin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFin(OneLoveParserParser.FinContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneLoveParserParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(OneLoveParserParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneLoveParserParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(OneLoveParserParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneLoveParserParser#assing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssing(OneLoveParserParser.AssingContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneLoveParserParser#operaciones_matematicas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperaciones_matematicas(OneLoveParserParser.Operaciones_matematicasContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneLoveParserParser#operaciones_logicas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperaciones_logicas(OneLoveParserParser.Operaciones_logicasContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneLoveParserParser#sentencia_mate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_mate(OneLoveParserParser.Sentencia_mateContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneLoveParserParser#sentencia_log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_log(OneLoveParserParser.Sentencia_logContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneLoveParserParser#if_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_sentence(OneLoveParserParser.If_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneLoveParserParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(OneLoveParserParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneLoveParserParser#else_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_sentence(OneLoveParserParser.Else_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneLoveParserParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(OneLoveParserParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneLoveParserParser#tipos_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipos_variable(OneLoveParserParser.Tipos_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneLoveParserParser#for_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_sentence(OneLoveParserParser.For_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneLoveParserParser#for_encabezado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_encabezado(OneLoveParserParser.For_encabezadoContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneLoveParserParser#while_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_sentence(OneLoveParserParser.While_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneLoveParserParser#sqrt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrt(OneLoveParserParser.SqrtContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneLoveParserParser#sen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSen(OneLoveParserParser.SenContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneLoveParserParser#cos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCos(OneLoveParserParser.CosContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneLoveParserParser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(OneLoveParserParser.TagContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneLoveParserParser#lectura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLectura(OneLoveParserParser.LecturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneLoveParserParser#escritura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscritura(OneLoveParserParser.EscrituraContext ctx);
}