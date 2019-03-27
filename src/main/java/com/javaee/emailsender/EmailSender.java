package com.javaee.emailsender;

public class EmailSender {

	public static void main(String[] args) {
		final String toEmail = "test@server.com";
		
		System.out.println("Iniciando envio de email");
		
		EmailConfig config = new EmailConfig();
		config.sendEmail(toEmail, "Mensagem de teste Java Maven", "Esta é uma mensagem de teste");
		
	}
}
