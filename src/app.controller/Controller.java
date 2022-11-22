package app.controller;

import app.dal.ValoresEDAO;
import app.dal.ValoresPDAO;
import app.model.Contas;
import app.view.JFrameContas;
import java.sql.SQLException;

/**
 * Controller responsável pela interação do usuário com o app
 * Recebe os valores inseridos, armazena em variáveis e realiza os cálculos
 * @author Carlos Chinen
 */
public class Controller {
    
    // Janela principal
    private JFrameContas principal;
    
    // Fórmulas
    private Contas contas;
    
    // Variáveis dos valores inseridos pelo usuário
    private double L_value;
    private int ni_value;
    private int nf_value;
    private double a_value;
    private double b_value;
    
    // Massa do elétron e do próton
    private double m_eletron = 9.11e-31;
    private double m_proton = 1.673e-27;
    
    // Variáveis dos resultados dos cálculos do elétron
    private double ei_eletron;
    private double ef_eletron;
    private double efot_eletron;
    private double comp_eletron;
    private double freq_eletron;
    private double broglie_ini_eletron;
    private double broglie_fin_eletron;
    private double vel_ini_eletron;
    private double vel_fin_eletron;
    private double prob_ini_eletron;
    private double prob_fin_eletron;
    
    // Variáveis dos resultados dos cálculos do próton
    private double ei_proton;
    private double ef_proton;
    private double efot_proton;
    private double comp_proton;
    private double freq_proton;
    private double broglie_ini_proton;
    private double broglie_fin_proton;
    private double vel_ini_proton;
    private double vel_fin_proton;
    private double prob_ini_proton;
    private double prob_fin_proton;
    
    /**
     * Inicializa a janela principal e a função de contas
     * @param principal 
     */
    public Controller (JFrameContas principal) {
        this.principal = principal;
        this.contas = new Contas();
    }
    
    /**
     * Pega os valores inseridos pelo usuário, realiza os cálculos e exibe na interface
     * @throws SQLException 
     */
    public void pegaEntradas() throws SQLException {
        L_value = principal.getL();
        ni_value = principal.getNi();
        nf_value = principal.getNf();
        a_value = principal.getA();
        b_value = principal.getB();
        
        Contas contas = new Contas(L_value, ni_value, nf_value, a_value, b_value);
        
        // [ ELETRON ]
        ei_eletron = contas.EnergiaInicialEletron();
        ef_eletron = contas.EnergiaFinalEletron();
        efot_eletron = contas.EnergiaFotonEletron();
        comp_eletron = contas.ComprimentoOndaEletron();
        freq_eletron = contas.FrequenciaEletron();
        broglie_ini_eletron = contas.DeBroglieInicialEletron();
        broglie_fin_eletron = contas.DeBroglieFinalEletron();
        vel_ini_eletron = contas.VelocidadeIniEletron();
        vel_fin_eletron = contas.VelocidadeFinEletron();
        prob_ini_eletron = contas.ProbInicial();
        prob_fin_eletron = contas.ProbFinal();
        
        // [ PROTON ]
        ei_proton = contas.EnergiaInicialEletron();
        ef_proton = contas.EnergiaFinalEletron();
        efot_proton = contas.EnergiaFotonEletron();
        comp_proton = contas.ComprimentoOndaEletron();
        freq_proton = contas.FrequenciaEletron();
        broglie_ini_proton = contas.DeBroglieInicialEletron();
        broglie_fin_proton = contas.DeBroglieFinalEletron();
        vel_ini_proton = contas.VelocidadeIniEletron();
        vel_fin_proton = contas.VelocidadeFinEletron();
        prob_ini_proton = contas.ProbInicial();
        prob_fin_proton = contas.ProbFinal();
        
        // [ ELETRON ]
        principal.getTxtEiEletron().setText(String.valueOf(contas.EnergiaInicialEletron()));
        principal.getTxtEfEletron().setText(String.valueOf(contas.EnergiaFinalEletron()));
        principal.getTxtEFotEletron().setText(String.valueOf(contas.EnergiaFotonEletron()));
        principal.getTxtCompEletron().setText(String.valueOf(contas.ComprimentoOndaEletron()));
        principal.getTxtFreqEletron().setText(String.valueOf(contas.FrequenciaEletron()));
        principal.getTxtBroglieIniEletron().setText(String.valueOf(contas.DeBroglieInicialEletron()));
        principal.getTxtBroglieFinEletron().setText(String.valueOf(contas.DeBroglieFinalEletron()));
        principal.getTxtVelIniEletron().setText(String.valueOf(contas.VelocidadeIniEletron()));
        principal.getTxtVelFinEletron().setText(String.valueOf(contas.VelocidadeFinEletron()));
        principal.getTxtFuncOndaIniEletronPt1().setText(String.valueOf(contas.FuncOndaIniEletronPt1()));
        principal.getTxtFuncOndaIniEletronPt2().setText(String.valueOf(contas.FuncOndaIniEletronPt2()));
        principal.getTxtFuncOndaFinEletronPt1().setText(String.valueOf(contas.FuncOndaFinEletronPt1()));
        principal.getTxtFuncOndaFinEletronPt2().setText(String.valueOf(contas.FuncOndaFinEletronPt2()));
        principal.getTxtProbIniEletron().setText(String.valueOf(contas.ProbInicial()));
        principal.getTxtProbFinEletron().setText(String.valueOf(contas.ProbFinal()));
        
        // [ PROTON ]
        principal.getTxtEiProton().setText(String.valueOf(contas.EnergiaInicialProton()));
        principal.getTxtEfProton().setText(String.valueOf(contas.EnergiaFinalProton()));
        principal.getTxtEFotProton().setText(String.valueOf(contas.EnergiaFotonProton()));
        principal.getTxtCompProton().setText(String.valueOf(contas.ComprimentoOndaProton()));
        principal.getTxtFreqProton().setText(String.valueOf(contas.FrequenciaProton()));
        principal.getTxtBroglieIniProton().setText(String.valueOf(contas.DeBroglieInicialProton()));
        principal.getTxtBroglieFinProton().setText(String.valueOf(contas.DeBroglieFinalProton()));
        principal.getTxtVelIniProton().setText(String.valueOf(contas.VelocidadeIniProton()));
        principal.getTxtVelFinProton().setText(String.valueOf(contas.VelocidadeFinProton()));
        principal.getTxtFuncOndaIniProtonPt1().setText(String.valueOf(contas.FuncOndaIniProtonPt1()));
        principal.getTxtFuncOndaIniProtonPt2().setText(String.valueOf(contas.FuncOndaIniProtonPt2()));
        principal.getTxtFuncOndaFinProtonPt1().setText(String.valueOf(contas.FuncOndaFinProtonPt1()));
        principal.getTxtFuncOndaFinProtonPt2().setText(String.valueOf(contas.FuncOndaFinProtonPt2()));
        principal.getTxtProbIniProton().setText(String.valueOf(contas.ProbInicial()));
        principal.getTxtProbFinProton().setText(String.valueOf(contas.ProbFinal()));
        
        // Insere os resultados dos cálculos para o elétron no banco de dados
        ValoresEDAO sqlE = new ValoresEDAO();
        sqlE.insere(contas);
        
        // Insere os resultados dos cálculos para o próton no banco de dados
        ValoresPDAO sqlP = new ValoresPDAO();
        sqlP.insere(contas);
    }
}