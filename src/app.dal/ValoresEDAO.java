package app.dal;

import app.model.Contas;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 * Insere os resultados dos cálculos da tabela de eletron do banco de dados
 *
 * @author Carlos Chinen
 */
public class ValoresEDAO implements IDAO<Contas> {

    private Conexao conexao;
    
    /**
     * Inicia a conexão
     * @throws SQLException 
     */
    public ValoresEDAO() throws SQLException {
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
        String sql = "INSERT INTO resultados_eletron(energia_ini_eletron, energia_fin_eletron, energia_foton_eletron, comprimento_eletron, frequencia_eletron, broglie_ini_eletron, broglie_fin_eletron, vel_ini_eletron, vel_fin_eletron, func_onda_ini_eletronpt1, func_onda_ini_eletronpt2, func_onda_fin_eletronpt1, func_onda_fin_eletronpt2, prob_ini_eletron, prob_fin_eletron) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = this.conexao.getDriver().prepareStatement(sql);

        ps.setDouble(1, o.EnergiaInicialEletron());
        ps.setDouble(2, o.EnergiaFinalEletron());
        ps.setDouble(3, o.EnergiaFotonEletron());
        ps.setDouble(4, o.ComprimentoOndaEletron());
        ps.setDouble(5, o.FrequenciaEletron());
        ps.setDouble(6, o.DeBroglieInicialEletron());
        ps.setDouble(7, o.DeBroglieFinalEletron());
        ps.setDouble(8, o.VelocidadeIniEletron());
        ps.setDouble(9, o.VelocidadeFinEletron());
        ps.setDouble(10, o.FuncOndaIniEletronPt1());
        ps.setDouble(11, o.FuncOndaIniEletronPt2());
        ps.setDouble(12, o.FuncOndaFinEletronPt1());
        ps.setDouble(13, o.FuncOndaFinEletronPt2());
        ps.setDouble(14, o.ProbInicial());
        ps.setDouble(15, o.ProbFinal());

        return ps.execute();
    }

}
