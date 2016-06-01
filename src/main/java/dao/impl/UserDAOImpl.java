package dao.impl;

import java.util.List;

import dao.UserDAO;
import dao.mapper.UserMapper;
import model.User;

/**
 * @author salamar
 *
 */
public class UserDAOImpl extends AbstractDAO implements UserDAO {

    @Override
    public List<User> listAllUsers() {
        //String query = "SELECT * FROM " + UserMapper.tableName;
        String query = "SELECT count(*) as " + UserMapper.Column.USER_ID.getName()
                + " FROM INFORMATION_SCHEMA.TABLES";
        List<User> result = templateObject.query(query, new UserMapper());
        return result;
    }
}
