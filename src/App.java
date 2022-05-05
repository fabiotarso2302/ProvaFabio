import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
     
    public static void main(String[] args) throws InterruptedException, IOException {
        final int MAX_ELEMENTOS = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Piloto> pilotos = new ArrayList<>();
            Scanner in = new Scanner(System.in);
            int numCadastro = 0;
           
            int opcao;
            do {
                System.out.println("\n1-Cadastro do Piloto");
                System.out.println("2-Lista com os pilotos");
                System.out.println("3-Consulte seu espaço");
                System.out.println("4-Aumente seu espaço");
                System.out.println("0-Sair");
                System.out.print("\n--> Qual opção deseja acessar: ");
                opcao = in.nextInt();
                in.nextLine();
                
                switch (opcao) {
                    case 1: {
                        
                        if (numCadastro == MAX_ELEMENTOS) {
                        
                        System.out.println("\n Opa...não possui espaço para cadastrar um novo piloto. \n Selecione a opção 4, para obter sucesso!");
                        System.out.println("Espaço atual é de: ( " + numCadastro + " )");
                        System.out.println("Tamanho da lista é: ( " + pilotos.size() + " )");

                        voltarMenu(in);
                            continue;
                        } else {
                        System.out.println("Qual nome do Piloto: ");
                        String nome = scanner.next();
                        System.out.println("Qual CPF do Piloto ");
                        String cpf = scanner.next();

                        Piloto Piloto = new Piloto(nome, cpf);
                        pilotos.add(Piloto);
                        numCadastro--;
                        System.out.println("Adicionado com sucesso *-* ");

                        voltarMenu(in);
                        break; 
                    
                    }}
                    case 2: 

                        if (numCadastro == 0) {

                            System.out.println("\nNão exitem motoristas cadastrados.\n");

                        } else {

                            System.out.println("\nLista dos pilotos: \n"+pilotos+"\n");
                        
                        break;
                        }

                    case 3: {
                        System.out.println("Espaco Atual é de: ( " + numCadastro + " )\n");
                        System.out.println("Tamanho da lista é: ( " + pilotos.size() + " )");
                        System.out.println("Para aumentar, selecione a opçâo (4) no Menu ! ");

                        break;
                    }
                    
                    case 4: {
                            System.out.println("Qual quantidade desejada? ");
                            numCadastro = scanner.nextInt();
                            
                            break;

                        }
                        default: {
                        System.out.println("Opção inválida.");
                        break;
                    
                        }
            }   

        } while (opcao != 0);
        
        System.out.println("Fim do programa.");}
                 
        }
                         
    private static void voltarMenu(Scanner in ) throws InterruptedException, IOException {
        System.out.println("\nPressione ENTER para retornar ao menu. \n Força Aérea Brasileira(FAB)");
        in.nextLine();
        
        if (System.getProperty("os.name").contains("Windows"))
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
        System.out.print("\033[H\033[2J");

        System.out.flush();
        
        
    }   
}
    