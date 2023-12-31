package com.juliagomes.alexa.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ControllerTest {
	
	@GetMapping
	public String testeAlexa() {
		return "Trabalho em um edifício antigo, construído em 1929 no centro de São Paulo. A sala ficou fechada por pelo menos 20 anos antes de nos mudarmos porque o último dono matou a esposa e também se matou. Nos mudamos pra lá há dois meses e todo dia quase que exatamente 12h08 a campainha toca e nunca tem ninguém. Já olhamos nas câmeras e realmente não é ninguém.\r\n"
				+ "\r\n"
				+ "Outro dia eu fiquei sozinho no escritório no final da tarde, apaguei todas as luzes, fechei as janelas e ativei o alarme. Quando me viro pra fechar a porta, a luz da cozinha estava acesa (uma que eu havia acabado de apagar). Outra vez, cheguei de manhã e a luz da sala também apagou sozinha. Escutei até o barulho do interruptor. A gota d'água foi quando vi meu rosto e o de mais alguém atrás de mim refletido na tela do computador. Não tinha ninguém quando me virei.\r\n"
				+ "\r\n"
				+ "Resolvi falar sobre essas coisas com a esposa do zelador, que mora no prédio há vários anos. Ela me disse que agora lá está até tranquilo, mas que acontecia muita coisa estranha e que agora ela até consegue pegar o elevador sozinha. Ri de nervoso";
	}

	
}
