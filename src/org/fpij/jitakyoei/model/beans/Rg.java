package org.fpij.jitakyoei.model.beans;

public class Rg {
	String numero;
	String orgaoExpedidor;
	
	public Rg(String numero, String orgaoExpedidor) {
		this.numero = numero;
		this.orgaoExpedidor = orgaoExpedidor;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getOrgaoExpedidor() {
		return orgaoExpedidor;
	}
	public void setOrgaoExpedidor(String orgaoExpedidor) {
		this.orgaoExpedidor = orgaoExpedidor;
	}
}
