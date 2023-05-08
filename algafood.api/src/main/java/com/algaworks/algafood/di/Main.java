package com.algaworks.algafood.di;

import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.service.AtivacaoClienteService;

public class Main {

	public static void main(String[] args) {
		
		Cliente joao = new Cliente("Jõao", "joaoxyz@email", "3128937129837192");
		Cliente maria = new Cliente("Maria", "Mariaxyz@email", "1231231");
		
		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(null);
		
		ativacaoCliente.Ativar(joao);
		ativacaoCliente.Ativar(maria);
		
		
	}
}
