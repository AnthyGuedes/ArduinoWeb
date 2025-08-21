package com.example.automacaoweb.controller;

import com.example.automacaoweb.serial.ControlePorta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.automacaoweb.service.ArduinoService;

@RestController
public class ArduinoController {

    ControlePorta controle = new ControlePorta("COM4", 9600);

    @GetMapping("/ligar")
    public String ligarLed() {
        controle.enviaDados(1);
        return "LED ligado!";
    }

    @GetMapping("/desligar")
    public String desligarLed() {
        controle.enviaDados(2);
        return "LED ligado!";
    }
}
