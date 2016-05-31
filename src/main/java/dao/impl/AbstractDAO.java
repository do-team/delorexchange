package dao.impl;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public abstract class AbstractDAO {

    DataSource dataSource;
    JdbcTemplate templateObject;
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.templateObject = new JdbcTemplate(dataSource);
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public enum SortOrder {
        ASC("Ascending"),
        DESC("Descending");

        private String name;

        private SortOrder(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
