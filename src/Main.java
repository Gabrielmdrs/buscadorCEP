import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String busca = "";

        while(!busca.equalsIgnoreCase("sair")) {
            busca = leitura.nextLine();
            if (busca.equalsIgnoreCase("sair")){
                break;
            }
            try {
                ConsultaCep consultaCep = new ConsultaCep();
                Endereco novoendereco = consultaCep.buscaEndereco(busca);
                GeradorArquivo geradorArquivo = new GeradorArquivo();
                geradorArquivo.salvaJson(novoendereco);

                System.out.println(novoendereco);
            }catch (RuntimeException | IOException e){
                System.out.println("Erro ao executar o program!");
                continue;
            }
        }
    }
}
