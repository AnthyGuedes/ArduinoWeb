# ArduinoWeb
Automação web com Arduino usando Spring Boot

🔌 Automação Web com Arduino

Este projeto integra Spring Boot com Arduino, permitindo o controle de dispositivos (como LEDs) diretamente a partir de uma aplicação web.

A comunicação é feita via porta serial, possibilitando enviar comandos para o Arduino através de requisições HTTP, criando uma ponte entre software e hardware.

🚀 Funcionalidades

Ligar o LED via endpoint /ligar

Desligar o LED via endpoint /desligar

Comunicação serial entre aplicação Java (Spring Boot) e Arduino

🛠️ Tecnologias Utilizadas

Java (Spring Boot)

Arduino (C/IDE Arduino)

Comunicação Serial

REST API

📌 Exemplos de uso

Acesse http://localhost:8080/ligar → LED acende

Acesse http://localhost:8080/desligar → LED apaga

🎯 Objetivo

O objetivo principal do projeto é demonstrar como aplicações web podem interagir com hardware físico de forma simples, prática e extensível para automações maiores, como casas inteligentes, IoT e sistemas de controle.
