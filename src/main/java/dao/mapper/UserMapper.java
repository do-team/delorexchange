package dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import model.User;

/**
 * @author salamar
 *
 */
public class UserMapper implements RowMapper<User> {

    public static final String tableName = "users";

    public enum Column {
        //please use names and not numbers in your SQL. Numbers here are for your reference only.
        //Always crawl through from lowest number to the highest one
        USER_ID(1, "userId");

        private int position;
        private String name;

        private Column(int position, String name) {
            this.position = position;
            this.name = name;
        }

        public int getPosition() {
            return position;
        }

        public String getName() {
            return name;
        }
    }

    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        //Please iterate according to column order in the database. Please make sure that column order in enum here matches the order in our db.
        User user = new User(rs.getInt(Column.USER_ID.getName()));
        return user;
    }

}
