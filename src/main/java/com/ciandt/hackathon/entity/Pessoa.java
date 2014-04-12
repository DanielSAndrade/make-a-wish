package com.ciandt.hackathon.entity;


public class Pessoa {

	private static String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		Pessoa.nome = nome;
	}

	public static class adicionapessoa<registrapessoa> {

		protected String registrapessoa;
		{
			System.out.println("Contato adicionado" + nome);
		}

		public int getadicionapessoa1() {
			return this.registrapessoa();
		}

		private int registrapessoa() {
			return 0;
		}

		public int getadicionapessoa() {
			return this.registrapessoa();
		}
	}
}