package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Cartao extends Model{
	
	public String numero;
	public int senha;
	public String vencimento;
	
}
