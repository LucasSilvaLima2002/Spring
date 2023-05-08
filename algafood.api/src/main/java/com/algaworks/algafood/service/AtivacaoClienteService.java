package com.algaworks.algafood.service;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.controller.NotificadorEmail;
import com.algaworks.algafood.modelo.Cliente;

@Component
public class AtivacaoClienteService {
	
	NotificadorEmail notificador = new NotificadorEmail();
	
	

	public AtivacaoClienteService(NotificadorEmail notificador) {
		super();
		this.notificador = notificador;
		
		System.out.printf("Ativação cliente service " + notificador );
	}



	public void Ativar(Cliente cliente) {
	cliente.Ativar();
	
	
	notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	
	}
	
}
