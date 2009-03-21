package br.com.caelum.stella.gateway.core;

import java.util.Calendar;

/**
 * Classe que mantem as informa��es de cart�o de cr�dito.
 * @author Alberto Pc
 *
 */
public class CartaoCredito {

	private String ccn;
	private Calendar exp;
	private String cvv2;
	
	
	
	public CartaoCredito(String ccn, Calendar exp, String cvv2) {
		super();
		this.ccn = ccn;
		this.exp = exp;
		this.cvv2 = cvv2;
	}
	public String getCcn() {
		return ccn;
	}
	public Calendar getExp() {
		return exp;
	}
	public String getCvv2() {
		return cvv2;
	}
	
	/**
	 * 
	 * @return Data de expira��o do cartao formatada para aamm
	 */
	public String getFormattedExp(){
		return String.format("%1$tm%1$ty",this.exp);
	}	
	
}