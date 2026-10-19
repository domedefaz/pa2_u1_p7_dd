package com.edu.ec.tarea1;

public class WhatsAppService {

    // Constructor por defecto explícito
    public WhatsAppService() {
    }

    public void enviarMensajeWhatsApp(String numeroCelular, String mensaje) {
        System.out.println("========================================");
        System.out.println("[WhatsAppService] Conectando a la API de WhatsApp...");
        System.out.println("Destinatario: " + numeroCelular);
        System.out.println("Contenido: " + mensaje);
        System.out.println("[WhatsAppService] Mensaje enviado correctamente.");
        System.out.println("========================================");
    }
}