package app.model;

/**
 * Fórmulas físicas para todos os cálculos do elétron e próton
 *
 * @author Carlos Chinen
 */
public class Contas {

    // Valores universais
    private final double h = 6.626e-34;
    private final double m = 9.11e-31;
    private final double m_proton = 1.673e-27;
    private final double c = 3e8;

    // Valores inseridos pelo usuário
    private double L;
    private int ni;
    private int nf;
    private double a;
    private double b;

    // Resultados dos cálculos
    private double En;
    private double En_proton;
    private double Ei;
    private double Ef;
    private double Ei_proton;
    private double Ef_proton;
    private double E_foton;
    private double E_proton;
    private double vel_inicial;
    private double vel_final;
    private double vel_inicial_proton;
    private double vel_final_proton;
    private double frequencia_foton;
    private double comprimento_foton;
    private double comprimento_broglie_inicial;
    private double comprimento_broglie_final;

    public Contas() {
    }
    
    /**
     * Construtor de Contas
     * @param L Largura da caixa
     * @param ni Nível inicial da partícula
     * @param nf Nível final da partícula
     * @param a Probabilidade inicial
     * @param b Probabilidade final
     */
    public Contas(double L, int ni, int nf, double a, double b) {
        this.L = L;
        this.ni = ni;
        this.nf = nf;
        this.a = a;
        this.b = b;
    }

    // [ FORMULAS ]
    
    /**
     * Energia Inicial do Elétron
     * @return Ei
     */
    public double EnergiaInicialEletron() {
        En = (Math.pow(h, 2)) / (8 * m * Math.pow(L, 2));

        Ei = En * Math.pow(ni, 2);

        return Ei;
    }
    
    /**
     * Energia Inicial do Próton
     * @return Ei_proton
     */
    public double EnergiaInicialProton() {
        En_proton = (Math.pow(h, 2)) / (8 * m_proton * Math.pow(L, 2));

        Ei_proton = En_proton * Math.pow(ni, 2);

        return Ei_proton;
    }
    
    /**
     * Energia Final do Elétron
     * @return Ef
     */
    public double EnergiaFinalEletron() {
        En = (Math.pow(h, 2)) / (8 * m * Math.pow(L, 2));

        Ef = En * Math.pow(nf, 2);

        return Ef;
    }
    
    /**
     * Energia Final do Próton
     * @return Ef_proton
     */
    public double EnergiaFinalProton() {
        En_proton = (Math.pow(h, 2)) / (8 * m_proton * Math.pow(L, 2));

        Ef_proton = En_proton * Math.pow(nf, 2);

        return Ef_proton;
    }
    
    /**
     * Energia do Fóton Absorvido pelo Elétron
     * @return E_foton
     */
    public double EnergiaFotonEletron() {
        En = (Math.pow(h, 2)) / (8 * m * Math.pow(L, 2));

        Ei = En * Math.pow(ni, 2);

        Ef = En * Math.pow(nf, 2);

        E_foton = Ef - Ei;

        return E_foton;
    }
    
    /**
     * Energia do Foton absorvido pelo Proton
     * @return E_proton
     */
    public double EnergiaFotonProton() {
        En_proton = (Math.pow(h, 2)) / (8 * m_proton * Math.pow(L, 2));

        Ei_proton = En_proton * Math.pow(ni, 2);

        Ef_proton = En_proton * Math.pow(nf, 2);

        E_proton = Ef_proton - Ei_proton;

        return E_proton;
    }
    
    /**
     * Comprimento de Onda do Elétron
     * @return comprimento_foton
     */
    public double ComprimentoOndaEletron() {
        comprimento_foton = (h * c) / E_foton;

        return comprimento_foton;
    }
    
    /**
     * Comprimento de Onda do Próton
     * @return comprimento_foton_proton
     */
    public double ComprimentoOndaProton() {
        double comprimento_foton_proton = (h * c) / E_proton;

        return comprimento_foton_proton;
    }
    
    /**
     * Frequência do Eletron
     * @return frequencia_foton
     */
    public double FrequenciaEletron() {
        frequencia_foton = E_foton / h;

        return frequencia_foton;
    }
    
    /**
     * Frequência do Próton
     * @return frequencia_foton_proton
     */
    public double FrequenciaProton() {
        double frequencia_foton_proton = E_proton / h;

        return frequencia_foton_proton;
    }
    
    /**
     * Comprimento de Onda de Broglie Inicial do Eletron
     * @return comprimento_broglie_inicial
     */
    public double DeBroglieInicialEletron() {
        comprimento_broglie_inicial = h / Math.sqrt(2 * m * Ei);

        return comprimento_broglie_inicial;
    }

    /**
     * Comprimento de Onda de Broglie Inicial do Proton
     * @return comprimento_broglie_inicial
     */
    public double DeBroglieInicialProton() {
        comprimento_broglie_inicial = h / Math.sqrt(2 * m * Ei);

        return comprimento_broglie_inicial;
    }
    
    /**
     * Comprimento de Onda de Broglie Final do Eletron
     * @return comprimento_broglie_inicial
     */
    public double DeBroglieFinalEletron() {
        comprimento_broglie_final = h / Math.sqrt(2 * m * Ef);

        return comprimento_broglie_final;
    }
    
    /**
     * Comprimento de Onda de Broglie Final do Proton  
     * @return comprimento_broglie_final
     */
    public double DeBroglieFinalProton() {
        comprimento_broglie_final = h / Math.sqrt(2 * m * Ef);

        return comprimento_broglie_final;
    }
    
    /**
     * Velocidade Inicial do Eletron
     * @return vel_inicial
     */
    public double VelocidadeIniEletron() {
        vel_inicial = Math.sqrt((2 * Ei) / m);

        return vel_inicial;
    }
    
    /**
     * Velocidade Inicial do Proton
     * @return vel_inicial_proton
     */
    public double VelocidadeIniProton() {
        vel_inicial_proton = Math.sqrt((2 * Ei_proton) / m_proton);

        return vel_inicial_proton;
    }
    
    /**
     * Velocidade Final do Eletron
     * @return vel_final
     */
    public double VelocidadeFinEletron() {
        vel_final = Math.sqrt((2 * Ef) / m);

        return vel_final;
    }
    
    /**
     * Velocidade Final do Proton
     * @return vel_final_proton
     */
    public double VelocidadeFinProton() {
        vel_final_proton = Math.sqrt((2 * Ef_proton) / m_proton);

        return vel_final_proton;
    }

    // Função de Onda: PT1 * Sen( PT2 ) * x
    /**
     * Função de Onda Inicial do Elétron Pt1
     * @return (Math.sqrt(2 / L))
     */
    public double FuncOndaIniEletronPt1() {
        return (Math.sqrt(2 / L));
    }
    
    /**
     * Função de Onda Inicial do Elétron Pt2
     * @return (ni * Math.PI) / L
     */
    public double FuncOndaIniEletronPt2() {
        return (ni * Math.PI) / L;
    }
    
    /**
     * Função de Onda Final do Elétron Pt1
     * @return (Math.sqrt(2 / L))
     */
    public double FuncOndaFinEletronPt1() {
        return (Math.sqrt(2 / L));
    }
    
    /**
     * Função de Onda Final do Elétron Pt2
     * @return (nf * Math.PI) / L
     */
    public double FuncOndaFinEletronPt2() {
        return (nf * Math.PI) / L;
    }

    // Função de Onda: PT1 * Sen( PT2 ) * x
    /**
     * Função de Onda Inicial do Próton = Elétron!
     * @return (Math.sqrt(2 / L)), (ni * Math.PI) / L, (Math.sqrt(2 / L)), (nf * Math.PI) / L
     */
    public double FuncOndaIniProtonPt1() {
        return (Math.sqrt(2 / L));
    }

    public double FuncOndaIniProtonPt2() {
        return (ni * Math.PI) / L;
    }

    public double FuncOndaFinProtonPt1() {
        return (Math.sqrt(2 / L));
    }

    public double FuncOndaFinProtonPt2() {
        return (nf * Math.PI) / L;
    }
    
    /**
     * Probabilidade Inicial do Eletron
     * @return integral_inicial
     */
    public double ProbInicial() {
        double integral_inicial = ((2 / L) * (((L * Math.sin((2 * Math.PI * a * ni) / L) - (2 * Math.PI * a * ni)) / (4 * Math.PI * ni)) - (((L * Math.sin((2 * Math.PI * b * ni) / L) - (2 * Math.PI * b * ni)) / (4 * Math.PI * ni))))) * 100;

        return integral_inicial;
    }
    
    /**
     * Probabilidade Inicial do Proton
     * @return integral_inicial
     */
    public double ProbInicialProton() {
        double integral_inicial = ((2 / L) * (((L * Math.sin((2 * Math.PI * a * ni) / L) - (2 * Math.PI * a * ni)) / (4 * Math.PI * ni)) - (((L * Math.sin((2 * Math.PI * b * ni) / L) - (2 * Math.PI * b * ni)) / (4 * Math.PI * ni))))) * 100;

        return integral_inicial;
    }
    
    /**
     * Probabilidade Final do Eletron
     * @return integral_final
     */
    public double ProbFinal() {
        double integral_final = ((2 / L) * (((L * Math.sin((2 * Math.PI * a * nf) / L) - (2 * Math.PI * a * nf)) / (4 * Math.PI * nf)) - (((L * Math.sin((2 * Math.PI * b * nf) / L) - (2 * Math.PI * b * nf)) / (4 * Math.PI * nf))))) * 100;

        return integral_final;
    }
    
    /**
     * Probabilidade Final do Proton
     * @return integral_final
     */
    public double ProbFinalProton() {
        double integral_final = ((2 / L) * (((L * Math.sin((2 * Math.PI * a * nf) / L) - (2 * Math.PI * a * nf)) / (4 * Math.PI * nf)) - (((L * Math.sin((2 * Math.PI * b * nf) / L) - (2 * Math.PI * b * nf)) / (4 * Math.PI * nf))))) * 100;

        return integral_final;
    }
}
