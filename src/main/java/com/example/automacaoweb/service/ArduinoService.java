package com.example.automacaoweb.service;

import org.springframework.stereotype.Service;

@Service
public class ArduinoService {

    public void ligarLed() {
        // Aqui você pode colocar a lógica para ligar o LED via comunicação serial
        System.out.println("Ligando o LED...");
    }

    public void desligarLed() {
        // Aqui você pode colocar a lógica para desligar o LED via comunicação serial
        System.out.println("Desligando o LED...");
    }
}
