package controller;

import model.Contas;
import view.Movimento;

import java.util.Scanner;

/*
 * @author massa gnmis
 */

class Controller {
    public static void main (String[] args) {

        // [ ENTRADAS ]
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura (L) [m]: ");
        double L = scanner.nextDouble();

        System.out.print("Digite ni: ");
        int ni = scanner.nextInt();

        System.out.print("Digite nf: ");
        int nf = scanner.nextInt();

        System.out.print("Digite A [m]: ");
        double a = scanner.nextDouble();

        System.out.print("Digite B [m]: ");
        double b = scanner.nextDouble();

        // [ FAZ AS CONTAS ]
        Contas myContas = new Contas(L, ni, nf, a, b);

        // Função de Onda
        myContas.FuncaoDeOnda();

        // Energia Inicial e Final
        myContas.EnergiaFoton();

        // Comprimento
        myContas.ComprimentoFoton();

        // Frequência
        myContas.FrequenciaFoton();

        // Comprimento de Onda De Broglie
        myContas.ComprimentoDeBroglie();

        // Velocidade
        myContas.Velocidade();

        // Probabilidade
        myContas.Probabilidade();

        // [ CHAMA A ANIMAÇÃO ]
        Movimento myMovimento = new Movimento();

        System.out.print("\n\nFim do código (uma nova guia foi aberta com a animação das partículas)");
        System.out.print("\n\nNovos níveis sorteados aleatóriamente:\n");
        
        myMovimento.setVisible(true);
    }
}
