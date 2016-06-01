/**
 * 
 */
package bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import model.User;
import service.UserService;

public class MainBean implements java.io.Serializable {

    UserService userService;
    List<User> users;


    /**
     * 
     */
    private static final long serialVersionUID = 3095593138292372749L;

    // TODO private static final Logger LOG = LoggerFactory.getLogger(MainBean.class);

    public static final String MAIN_TITLE = "Main";
    public static final String GENERAL_TITLE_PREFIX = "DelorExchange :: ";


    public MainBean() {

    }

    @PostConstruct
    public void init() {
    }
    
    public String getMainTitle() {
        return GENERAL_TITLE_PREFIX + MAIN_TITLE;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public List<User> getUsers() {
        if (users == null) {
            users = new ArrayList<User>();
        }
        users = userService.listAllUsers();
        return users;
    }

}
