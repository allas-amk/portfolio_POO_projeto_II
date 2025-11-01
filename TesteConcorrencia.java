package br.com.engenheirodesoftwarenoespaco.projetoswingfaculdade;

public class TesteConcorrencia {

    public static void main(String[] args) {
        
        System.out.println("Programa Principal INICIADO.\n");

        // 1. Cria a tarefa de contagem
        TarefaContadora tarefaContadora = new TarefaContadora();
        // 2. Cria a thread T1 com a tarefa e da um nome claro
        Thread tContadora = new Thread(tarefaContadora, "T1-Contadora"); 
        
        // 3. Cria a tarefa de mensagens
        TarefaMensagens tarefaMensagens = new TarefaMensagens();
        // 4. Cria a thread T2 com a tarefa e da um nome claro
        Thread tMensagens = new Thread(tarefaMensagens, "T2-Mensagens");

        // REQUISITO: Iniciar as threads de forma SIMULTÂNEA
        tContadora.start(); 
        tMensagens.start(); 

        System.out.println("\nTodas as threads filhas foram iniciadas (Simultaneidade garantida).\n");
        
        // Fim da execucao do main. O programa so encerra quando T1 e T2 terminarem.
    }
}
