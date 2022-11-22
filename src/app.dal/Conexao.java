package app.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Conecta com o banco de dados postgreSQL
 *
 * @author Carlos Chinen
 */
public class Conexao {

    private static Conexao conexao;
    private Connection driver;
    
    /**
     * Cria a conexão com o banco de dados
     * @throws SQLException 
     */
    private void criaConexao() throws SQLException {
        this.driver = DriverManager.getConnection("jdbc:postgresql://localhost/Projeto", "postgres", "postgres");
    }
    
    /**
     * Conecta com o banco de dados
     * @throws SQLException 
     */
    public Conexao() throws SQLException {
        this.criaConexao();
    }
    
    /**
     * Recebe a conexão do banco de dados
     * @return
     * @throws SQLException 
     */
    public static Conexao getConexao() throws SQLException {
        if (conexao == null) {
            conexao = new Conexao();
        }
        return conexao;
    }
    
    /**
     * Driver do banco de dados
     * @return 
     */
    public Connection getDriver() {
        return driver;
    }
}
