package br.com.aolindo.set.operacoesbasicas;

import java.util.Objects;

public class Convidado {

	private String nome;
	private int codigoConvite;
	
	public Convidado(String nome, int codigoConvite) {
		this.nome = nome;
		this.codigoConvite = codigoConvite;
	}

	public String getNome() {
		return nome;
	}

	public int getCodigoConvite() {
		return codigoConvite;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(codigoConvite);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return codigoConvite == other.codigoConvite;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Convidados [nome = ");
		builder.append(nome);
		builder.append(", codigoConvite = ");
		builder.append(codigoConvite);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
	
}
