package app.dal;

import app.model.Contas;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 * Insere os resultados dos cálculos da tabela de proton do banco de dados
 *
 * @author Carlos Chinen
 */
public class ValoresPDAO implements IDAO<Contas> {

    private Conexao conexao;
    
    /**
     * Inicia a conexão
     * @throws SQLException 
     */
    public ValoresPDAO() throws SQLException {
        this.conexao = Conexao.getConexao();
    }
    
    /**
     * Insere os valores no banco de dados
     * @param o Contas
     * @return ps.execute();
     * @throws SQLException 
     */
    @Override
    public boolean insere(Contas o) throws SQLException {
        String sql = "INSERT INTO resultados_proton(energia_ini_proton, energia_fin_proton, energia_foton_proton, comprimento_proton, frequencia_proton, broglie_ini_proton, broglie_fin_proton, vel_ini_proton, vel_fin_proton, func_onda_ini_protonpt1, func_onda_ini_protonpt2, func_onda_fin_protonpt1, func_onda_fin_protonpt2, prob_ini_proton, prob_fin_proton) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = this.conexao.getDriver().prepareStatement(sql);

        ps.setDouble(1, o.EnergiaInicialProton());
        ps.setDouble(2, o.EnergiaFinalProton());
        ps.setDouble(3, o.EnergiaFotonProton());
        ps.setDouble(4, o.ComprimentoOndaProton());
        ps.setDouble(5, o.FrequenciaProton());
        ps.setDouble(6, o.DeBroglieInicialProton());
        ps.setDouble(7, o.DeBroglieFinalProton());
        ps.setDouble(8, o.VelocidadeIniProton());
        ps.setDouble(9, o.VelocidadeFinProton());
        ps.setDouble(10, o.FuncOndaIniProtonPt1());
        ps.setDouble(11, o.FuncOndaIniProtonPt2());
        ps.setDouble(12, o.FuncOndaFinProtonPt1());
        ps.setDouble(13, o.FuncOndaFinProtonPt2());
        ps.setDouble(14, o.ProbInicial());
        ps.setDouble(15, o.ProbFinal());

        return ps.execute();
    }

}
