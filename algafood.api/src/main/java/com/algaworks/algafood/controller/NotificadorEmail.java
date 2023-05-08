package com.algaworks.algafood.controller;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.modelo.Cliente;

@Component
public class NotificadorEmail {
	
	public NotificadorEmail() {
		System.out.println("Notificador de email");
	}

	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do  e-mail %s\n", 
				cliente.getNome(),cliente.getEmail(),mensagem);
		
	}
	
}
