package app.dal;

import java.sql.SQLException;

/**
 *
 * @author Carlos Chinen
 */
public interface IDAO<T> {

    public boolean insere(T o) throws SQLException;

}
