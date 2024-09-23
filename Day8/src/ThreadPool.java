// Creating a thread pool to run tasks simultaneously and reuse threads.

/* O QUE É UMA THREAD? 
  Thread não é um programa, mas executa dentro de um programa
 *
 * Uma thread é um fluxo único de controle sequencial dentro de um programa
 * 
 * Uma thread é uma sequência de passos dentro de um programa
 * 
 * PARA O QUE QUE ELA SERVE?
 * 
 * 
 * 
 * 
 */


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        
        // Aqui, estamos criando um thread pool com 6 threads
        ExecutorService ourThreadPool = Executors.newFixedThreadPool(6);

        //submentendo 10 tarefas para a thread pool 
        for (int i = 1; i<= 10; i++){
            int taskId = i;
            ourThreadPool.submit(() -> {
                System.out.println("Executando tarefa" + taskId + "na thread" + Thread.currentThread().getName());
            try{
                // simulando uma tarefa demorada
                Thread.sleep(2000);
                        }catch (InterruptedException e ){
                            e.printStackTrace();
                        }
             System.out.println("Tarefa" + taskId + "concluído");            
            }); 


        }
        // fecha a thread pool apo´s terminar todas as tarefaas
      ourThreadPool.shutdown();
    }

}
