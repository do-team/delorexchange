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
        String query = "SELECT 2+3 as " + UserMapper.Column.USER_ID.getName();
        List<User> result = templateObject.query(query, new UserMapper());
        return result;
    }
}
