package com.example.chat.views.chat;
import org.alicebot.ab.Bot;

import org.alicebot.ab.Chat;
public class ChatPuc extends Chat {

    Teatro teatro = new Teatro();
    public ChatPuc(Bot bot) {
        super(bot);
    }

    public String multisentenceRespond(String request) {
        String answer = "";

        if (request.contains("menu")) {
            answer = obterMenu();

        } else if (request.contains("1 - Comprar Ingresso")) {

            answer = "Informe o seu nome no padrão :  NOME:NUMERO_POLTRONA  ex: Rodrigo Fujioka:40";

        } else if (request.contains("2 - Exibir Lugares Ocupados")) {

            answer = teatro.obterLugaresOcupados();

        } else if (request.contains("3 - Exibir Lugares Vazios")) {
            answer = teatro.obterLugaresVazios();

        } else if (request.split(":").length == 2) {
            answer = preencherLugar(request);

        } else if (request.contains("4 - Desocupar")){
            String lugar;
            int lugarconvertido;
            lugar = "Informe o lugar a ser desocupado: ";
            lugarconvertido = Integer.parseInt(lugar);
            answer = teatro.desocuparLugar(lugarconvertido);

        }else {
            return super.multisentenceRespond(request);
        }
        return answer;
    }

    public String preencherLugar(String request){
        String[] dadosCadastro = request.split(":");
        String mensagem = teatro.comprarIngresso(dadosCadastro[0].trim(), Integer.parseInt(dadosCadastro[1].trim()));
        return  mensagem;
    }

    public String desocuparLugar(String request){
        String[] dadosCadastro = request.split(":");
        String mensagem = teatro.desocuparLugar(Integer.parseInt(dadosCadastro[1]));
        return  mensagem;
    }


    private String obterMenu(){
        String menu  = " 1 - Comprar Ingresso <br/>";
        menu += " 2 - Exibir Lugares Ocupados <br/>";
        menu += " 3 - Exibir Lugares Vazios <br/>";
        menu += " 4 - Desocupar <br/>";

        return menu;

    }

}

