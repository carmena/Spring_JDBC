
package app.jdbcspring.dao.jdbc;

import app.jdbcspring.dao.LocalDAO;
import app.jdbcspring.model.Local;
import java.util.List;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class LocalDAOJ extends JdbcDaoSupport  implements LocalDAO{

    public List<Local> list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Local get(Local t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void save(Local t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void update(Local t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void delete(Local t) {
          this.getJdbcTemplate().update("delete from local where id=?",
                new Object[]{t.getId()});
    }
    
}
