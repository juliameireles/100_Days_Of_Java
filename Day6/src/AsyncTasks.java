//  Running a task asynchronously.

/*
Rodar uma task de forma assíncrona em Java significa executar uma tarefa em segundo plano, 
permitindo que o fluxo principal do programa continue sem precisar esperar pela conclusão dessa tarefa
 *  Isso é útil para evitar bloqueios na execução do programa, especialmente em operações que podem demorar,
 *  como chamadas a serviços externos, leitura/escrita de arquivos. 
 * 
 * Na programação síncrona, cada instrução é executada sequencialmente, e o 
 * código só avança para a próxima linha quando a anterior for concluída. Já no caso assíncrono, 
 * uma tarefa é iniciada e o programa continua sua execução enquanto a tarefa é processada em segundo plano.
 
 PODEMOS FAZER A EXECUÇÃO ASSÍNCRONA DE TAREFAS COM A CLASSE CompletableFuture, que tambw´m permite manipular o resultado da tarefa quando ela é concluída
 */
import java.util.concurrent.CompletableFuture;
import java.util.logging.Level;
import java.util.logging.Logger; // O logger é utilizado para registrar mensagens durante a execução, seja para informações normais ou para erros.



public class AsyncTasks {

    private static final Logger LOGGER = Logger.getLogger(AsyncTasks.class.getName()); //logger inicializado
    public static void main(String[] args){
        // executando a tarefa assíncrona
       
        CompletableFuture<Void> taskAssincrona = CompletableFuture.runAsync(() -> {
         
            
            try{
                LOGGER.info("Tarefa assíncrona está começando.");
                Thread.sleep(2000);
                LOGGER.info("Tarefa assíncrona está terminando");
                System.out.println("Tarefa concluída!");
            }catch (InterruptedException e){
                LOGGER.log(Level.SEVERE," A tarefa assíncrona não foi finalizada");
                e.printStackTrace();
            }
        });

System.out.println("Continuando outras tarefas... Essa mensagem irá aparecer antes da tarefa assícrona ser finalizada");

  taskAssincrona.join();

System.out.println("Tarefa assíncrona concluído, continuando o código normalmente...");



    }
}

