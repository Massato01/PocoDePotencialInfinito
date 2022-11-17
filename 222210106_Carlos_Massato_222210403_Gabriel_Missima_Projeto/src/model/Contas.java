package model;

/*
 * @author massa gnmis
 */

public class Contas
{
    private double L;
    private double En;
    private double En_proton;
    private double Ei;
    private double Ef;
    private double Ei_proton;
    private double Ef_proton;
    private double E_foton;
    private double E_proton;
    private double velocidade;
    private double vel_inicial;
    private double vel_final;
    private double frequencia_foton;
    private double comprimento_foton;
    private double comprimento_broglie_inicial;
    private double comprimento_broglie_final;
    private double funcao_onda_a;
    private double funcao_onda_b;

    private final double h = 6.626e-34;
    private final double m = 9.11e-31;
    private final double m_proton = 1.673e-27;
    private final double c = 3e8;

    private int ni = 1;
    private int nf = 3;
    private double a = 1;
    private double b = 3;

    // [ CONSTRUTOR ]
    public Contas(double L, int ni, int nf, double a, double b) {
        this.L = L;
        this.ni = ni;
        this.nf = nf;
        this.a = a;
        this.b = b;
    }

    // [ FORMULAS ]

    // [ ENERGIAS FOTON ]
    public void EnergiaFoton() {
        En = (Math.pow(h, 2)) / (8 * m * Math.pow(L, 2));
        En_proton = (Math.pow(h, 2)) / (8 * m_proton * Math.pow(L, 2));

    // Energia Inicial
        Ei = En * Math.pow(ni, 2);
        Ei_proton = En_proton * Math.pow(ni, 2);

    // Energia Final
        Ef = En * Math.pow(nf, 2);
        Ef_proton = En_proton * Math.pow(nf, 2);

    // Energia Foton
        E_foton = Ef - Ei;
        E_proton = Ef_proton - Ei_proton;

    // [ ENERGIA DO ELÉTRON ]
        System.out.println("\nENERGIA DO ELÉTRON");
        System.out.printf("Energia no nível Inicial [J]: " + Ei);
        System.out.printf("\nEnergia no nível Final [J]: " + Ef);
        System.out.printf("\nEnergia do Fóton [J]: " + E_foton);

    // [ ENERGIA DO PRÓTON ]
        System.out.println("\n\nENERGIA DO PRÓTON");
        System.out.printf("Energia no nível Inicial [J]: " + Ei_proton);
        System.out.printf("\nEnergia no nível Final [J]: " + Ef_proton);
        System.out.printf("\nEnergia do Fóton [J]: " + E_proton);
    }

    // [ FREQUÊNCIA FOTON ]
    public void FrequenciaFoton() {

    // [ FREQUENCIA DO ELETRON ]
        frequencia_foton = E_foton / h;

    // [ FREQUENCIA DO PROTON ]
        double frequencia_foton_proton = E_proton / h;

        System.out.printf("\n\nFREQUÊNCIA DO ELÉTRON");
        System.out.printf("\nFrequência do fóton [Hz]: " + frequencia_foton);

        System.out.printf("\n\nFREQUÊNCIA DO PRÓTON");
        System.out.printf("\nFrequência do fóton [Hz]: " + frequencia_foton_proton);
    }

    // [ COMPRIMENTO FOTON ]
    public void ComprimentoFoton() {
        comprimento_foton = (h * c) / E_foton;
        double comprimento_foton_proton = (h * c) / E_proton;

        System.out.printf("\n\nCOMPRIMENTO DO ELETRON");
        System.out.printf("\n\nComprimento de onda do fóton [m]: " + comprimento_foton);

        System.out.printf("\n\nCOMPRIMENTO DO PROTON");
        System.out.printf("\n\nComprimento de onda do fóton [m]: " + comprimento_foton_proton);
    }

    // [ COMPRIMENTO DE BROGLIE ]
    public void ComprimentoDeBroglie() {
        comprimento_broglie_inicial = h / Math.sqrt (2 * m * Ei);
        comprimento_broglie_final = h / Math.sqrt (2 * m * Ef);

        System.out.printf("\n\nComprimento de onda De Broglie [m]: " + comprimento_broglie_inicial);
        System.out.printf("\nComprimento de onda De Broglie [m]: " + comprimento_broglie_final);
    }

    // [ VELOCIDADE ]
    public void Velocidade() {

    // [ VELOCIDADE DO ELETRON ]
        velocidade = Math.sqrt((2 * E_foton) / m);
        vel_inicial =  Math.sqrt((2 * Ei) / m);
        vel_final =  Math.sqrt((2 * Ef) / m);

    // [ VELOCIDADE DO PROTON ]
        double velocidade_proton = Math.sqrt((2 * E_proton) / m_proton);
        double vel_inicial_proton =  Math.sqrt((2 * Ei_proton) / m_proton);
        double vel_final_proton =  Math.sqrt((2 * Ef_proton) / m_proton);

        System.out.printf("\n\nVELOCIDADE DO ELETRON");
        System.out.printf("\nVelocidade [m/s]: " + velocidade);
        System.out.printf("\nVelocidade Inicial [m/s]: " + vel_inicial);
        System.out.printf("\nVelocidade Final [m/s]: " + vel_final);

        System.out.printf("\n\nVELOCIDADE DO PROTON");
        System.out.printf("\nVelocidade [m/s]: " + velocidade_proton);
        System.out.printf("\nVelocidade Inicial [m/s]: " + vel_inicial_proton);
        System.out.printf("\nVelocidade Final [m/s]: " + vel_final_proton);
    }

    // [ FUNÇÃO DE ONDA ]
    public void FuncaoDeOnda() {
        System.out.printf("\n\nFunção de onda inicial: " + Math.sqrt(2 / L) + " * Sin(" + (ni * Math.PI) / L + ") * x");
        System.out.printf("\nFunção de onda final: " + Math.sqrt(2 / L) + " * Sin(" + (nf * Math.PI) / L + ") * x");

        funcao_onda_a = Math.sqrt (2 / L) * Math.sin(((ni * Math.PI) / L) * a);
        System.out.printf("\nFunção de onda (a): " + funcao_onda_a);

        funcao_onda_b = Math.sqrt (2 / L) * Math.sin(((ni * Math.PI) / L) * b);
        System.out.printf("\nFunção de onda (b): " + funcao_onda_b);

        System.out.printf("\nFunção de onda (b-a): " + (funcao_onda_b - funcao_onda_a));
        System.out.printf("\nFunção de onda (b+a): " + (funcao_onda_b + funcao_onda_a));
    }

    // [ PROBABILIDADE ]
    public void Probabilidade ()
    {
        double integral_inicial = ((2 / L) * (((L * Math.sin((2 * Math.PI * a * ni) / L) - (2 * Math.PI * a * ni)) / (4 * Math.PI * ni)) - (((L * Math.sin((2 * Math.PI * b * ni) / L) - (2 * Math.PI * b * ni)) / (4 * Math.PI * ni))))) * 100;

        double integral_final = ((2 / L) * (((L * Math.sin((2 * Math.PI * a * nf) / L) - (2 * Math.PI * a * nf)) / (4 * Math.PI * nf)) - (((L * Math.sin((2 * Math.PI * b * nf) / L) - (2 * Math.PI * b * nf)) / (4 * Math.PI * nf))))) * 100;

        System.out.printf ("\n\nProbabilidade Inicial: " + integral_inicial);
        System.out.printf ("\nProbabilidade Final: " + integral_final);
    }
}
