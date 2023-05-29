package fp.utiles;

/**
 * @author reinaqu
 * Clase de utilidad con mÃ©todos para facilitar la gestiÃ³n de restricciones.
 */
public class Checkers {

	/**
	 * @param textoRestriccion
	 *     Mensaje que se incluirÃ¡ en la excepciÃ³n elevada
	 * @param condicion
	 *     ExpresiÃ³n booleana que ha de cumplirse para que no se eleve una excepciÃ³n
	 * @throws IllegalArgumentException si no se cumple la condiciÃ³n
	 *  
	 */
	public static void check(String textoRestriccion, Boolean condicion) {
		if (!condicion) {
			throw new IllegalArgumentException(
					Thread.currentThread().getStackTrace()[2].getClassName() +
					"." + 
					Thread.currentThread().getStackTrace()[2].getMethodName() +
					": " + 
					textoRestriccion);
					}
				}
	}