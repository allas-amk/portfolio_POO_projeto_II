import java.util.concurrent.TimeUnit;

public class TarefaContadora implements Runnable {

    // O metodo run contem o codigo que sera executado na thread separada.
    @Override
    public void run() {
        // Pega o nome da thread que esta executando o codigo
        String nomeThread = Thread.currentThread().getName(); 
        System.out.println(nomeThread + " - INICIADA: Vai contar de 1 a 10.");

        try {
            // Loop simples de contagem
            for (int i = 1; i <= 10; i++) {
                System.out.println(nomeThread + " - CONTAGEM: " + i);
                
                // REQUISITO: Intervalo de 1 segundo (1000ms)
                Thread.sleep(1000); 
            }
        } catch (InterruptedException e) {
            // Em caso de erro, apenas mostramos a mensagem (como um iniciante faria)
            System.err.println(nomeThread + " foi interrompida de forma inesperada."); 
        }

        System.out.println(nomeThread + " - FINALIZADA.");
    }
}
