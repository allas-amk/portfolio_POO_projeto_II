package br.com.engenheirodesoftwarenoespaco.projetoswingfaculdade;

public class TarefaMensagens implements Runnable {

    // Array simples com as mensagens a serem exibidas
    private String[] mensagens = {
        "Processando dados...",
        "Aguardando resposta do servidor...",
        "Quase finalizando a tarefa!",
        "Checagem de status concluída.",
        "Aguarde o encerramento da contagem..."
    };

    @Override
    public void run() {
        String nomeThread = Thread.currentThread().getName();
        System.out.println(nomeThread + " - INICIADA: Vai exibir mensagens.");

        try {
            // Loop para exibir cada mensagem do array
            for (String msg : mensagens) {
                System.out.println(nomeThread + " - MENSAGEM: " + msg);
                
                // REQUISITO: Intervalo de 2 segundos (2000ms)
                Thread.sleep(2000); 
            }
        } catch (InterruptedException e) {
            System.err.println(nomeThread + " foi interrompida de forma inesperada.");
        }

        System.out.println(nomeThread + " - FINALIZADA.");
    }
}
