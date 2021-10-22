/**
 * 
 */
package com.hbt.semillero.entidad;

/**
 * <b>Description:</b> Class that represents the enumeration for the status
 * 
 * @author Andrés Cruz
 * @version
 */
public enum EstadoEnum {
	
	ACTIVO("enum.estado.activo"),
	INACTIVO("enum.estado.inactivo");
	
	/**
	 * Attribute that contains the code for internationalization
	 */
	private String codeMessage;

	/**
	 * Constructor that receives the code message
	 * @param codeMessage
	 */
	EstadoEnum(String codeMessage){
		this.codeMessage = codeMessage;
	}
	
	/**
	 * @return the codeMessage
	 */
	public String getCodeMessage() {
		return codeMessage;
	}

	/**
	 * @param codeMessage the codeMessage to set
	 */
	public void setCodeMessage(String codeMessage) {
		this.codeMessage = codeMessage;
	}
	
}
