package model;

/*
 * @author massa gnmis
 */

public class Contas {
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

//* [CONSTRUTOR]
    public Contas (double L, int ni, int nf, double a, double b) {
        this.L = L;
        this.ni = ni;
        this.nf = nf;
        this.a = a;
        this.b = b;
    }

//* [FORMULAS]
    
    // ENERGIA INICIAL DO ELETRON
    public double EnergiaInicialEletron() {
        En = (Math.pow (h, 2)) / (8 * m * Math.pow (L, 2));

        Ei = En * Math.pow (ni, 2);

        return Ei;
    }
    
    // ENERGIA INICIAL DO PROTON
    public double EnergiaInicialProton() {
        En_proton = (Math.pow (h, 2)) / (8 * m_proton * Math.pow (L, 2));

        Ei_proton = En_proton * Math.pow(ni, 2);

        return Ei_proton;
    }
    
    // ENERGIA FINAL DO ELETRON
    public double EnergiaFinalEletron() {
        En = (Math.pow (h, 2)) / (8 * m * Math.pow (L, 2));

        Ef = En * Math.pow (nf, 2);

        return Ef;
    }
    
    // ENERGIA FINAL DO PROTON
    public double EnergiaFinalProton() {
        En_proton = (Math.pow (h, 2)) / (8 * m_proton * Math.pow (L, 2));

        Ef_proton = En_proton * Math.pow(nf, 2);

        return Ef_proton;
    }
    
    // ENERGIA DO ELETRON
    public double EnergiaFotonEletron() {
        En = (Math.pow (h, 2)) / (8 * m * Math.pow (L, 2));

        Ei = En * Math.pow (ni, 2);
        
        Ef = En * Math.pow (nf, 2);
        
        E_foton = Ef - Ei;

        return E_foton;
    }
    
    // ENERGIA DO PROTON
    public double EnergiaFotonProton() {
        En_proton = (Math.pow (h, 2)) / (8 * m_proton * Math.pow (L, 2));
        
        Ei_proton = En_proton * Math.pow(ni, 2);

        Ef_proton = En_proton * Math.pow(nf, 2);

        E_proton = Ef_proton - Ei_proton;
        
        return E_proton;
    }
    
    // COMPRIMENTO DE ONDA DO ELETORN
    public double ComprimentoOndaEletron() {
        comprimento_foton = (h * c) / E_foton;
        
        return comprimento_foton;
    }
    
    // COMPRIMENTO DE ONDA DO PROTON
    public double ComprimentoOndaProton() {
        double comprimento_foton_proton = (h * c) / E_proton;
        
        return comprimento_foton_proton;
    }
    
    // FREQUENCIA DO ELETRON
    public double FrequenciaEletron() {
        frequencia_foton = E_foton / h;
        
        return frequencia_foton;
    }
    
    // FREQUENCIA DO PROTON
    public double FrequenciaProton() {
        double frequencia_foton_proton = E_proton / h;
        
        return frequencia_foton_proton;
    }
    
    // COMPRIMENTO DE ONDA DE BROGLIE INICIAL
    public double DeBroglieInicialProton() {
        comprimento_broglie_inicial = h / Math.sqrt (2 * m * Ei);

        return comprimento_broglie_inicial;
    }
    
    // COMPRIMENTO DE ONDA DE BROGLIE INICIAL
    public double DeBroglieFinalEletron() {
        comprimento_broglie_final = h / Math.sqrt (2 * m * Ef);

        return comprimento_broglie_final;
    }
    
    // COMPRIMENTO DE ONDA DE BROGLIE INICIAL
    public double DeBroglieFinalProton() {
        comprimento_broglie_final = h / Math.sqrt (2 * m * Ef);

        return comprimento_broglie_final;
    }
    
    // VELOCIDADE INICIAL DO ELETRON
    public double VelocidadeIniEletron() {
        vel_inicial =  Math.sqrt ((2 * Ei) / m);
        
        return vel_inicial;
    }
    
    // VELOCIDADE INICIAL DO PROTON
    public double VelocidadeIniProton() {
        double vel_inicial_proton =  Math.sqrt ((2 * Ei_proton) / m_proton);
        
        return vel_inicial_proton;
    }
    
    // VELOCIDADE FINAL DO ELETRON
    public double VelocidadeFinEletron() {
        vel_final =  Math.sqrt ((2 * Ef) / m);
        
        return vel_final;
    }
    
    // VELOCIDADE FINAL DO PROTON
    public double VelocidadeFinProton() {
        double vel_final_proton =  Math.sqrt ((2 * Ef_proton) / m_proton);
        
        return vel_final_proton;
    }
    
    // FUNÇÃO DE ONDA DO ELETRON NA PRÓPRIA INTERFACE
    
    // PROBABILIDADE INICIAL DO ELETRON
    public double ProbInicial() {
        double integral_inicial = ((2 / L) * (((L * Math.sin ((2 * Math.PI * a * ni) / L) - (2 * Math.PI * a * ni)) / (4 * Math.PI * ni)) - (((L * Math.sin ((2 * Math.PI * b * ni) / L) - (2 * Math.PI * b * ni)) / (4 * Math.PI * ni))))) * 100;
        
        return integral_inicial;
    }
    
    // PROBABILIDADE FINAL DO ELETRON
    public double ProbFinal() {
        double integral_final = ((2 / L) * (((L * Math.sin ((2 * Math.PI * a * nf) / L) - (2 * Math.PI * a * nf)) / (4 * Math.PI * nf)) - (((L * Math.sin ((2 * Math.PI * b * nf) / L) - (2 * Math.PI * b * nf)) / (4 * Math.PI * nf))))) * 100;
        
        return integral_final;
    }
    
    // PROBABILIDADE INICIAL DO PROTON
    public double ProbInicialProton() {
        double integral_inicial = ((2 / L) * (((L * Math.sin ((2 * Math.PI * a * ni) / L) - (2 * Math.PI * a * ni)) / (4 * Math.PI * ni)) - (((L * Math.sin ((2 * Math.PI * b * ni) / L) - (2 * Math.PI * b * ni)) / (4 * Math.PI * ni))))) * 100;
        
        return integral_inicial;
    }
    
    // PROBABILIDADE FINAL DO PROTON
    public double ProbFinalProton() {
        double integral_final = ((2 / L) * (((L * Math.sin ((2 * Math.PI * a * nf) / L) - (2 * Math.PI * a * nf)) / (4 * Math.PI * nf)) - (((L * Math.sin ((2 * Math.PI * b * nf) / L) - (2 * Math.PI * b * nf)) / (4 * Math.PI * nf))))) * 100;
        
        return integral_final;
    }
}