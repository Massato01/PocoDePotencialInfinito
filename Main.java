package pkg222210106_carlos_chinen_projeto;
import java.util.Scanner;
import pkg222210106_carlos_chinen_projeto.model.Contas;

/**
 *
 * @author Carlos Massato, Gabriel Missima
 */

class Main {
  public static void main(String[] args) {
    // ----- Entradas -----
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a largura (L) [m]: ");
    double L = scanner.nextDouble();
    
    System.out.print("Digite ni: ");
    int ni = scanner.nextInt();

    System.out.print("Digite ni: ");
    int nf = scanner.nextInt();

    System.out.print("Digite A [m]: ");
    double a = scanner.nextDouble();

    System.out.print("Digite B [m]: ");
    double b = scanner.nextDouble();
    // --------------------

    Contas teste = new Contas(L, ni, nf, a, b);

    // Energia Inicial e Final
    teste.EnergiaFoton();

    // Frequência
    teste.FrequenciaFoton();

    // Comprimento
    teste.ComprimentoFoton();

    // Comprimento de Onda De Broglie
    teste.ComprimentoDeBroglie();

    // Velocidade
    teste.Velocidade();

    // Função de Onda
    teste.FuncaoDeOnda();

    // Probabilidade
    teste.Probabilidade();

    System.out.print("\nEND");
  }
  
}