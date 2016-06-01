/**
 * 
 */
package bean;

import java.util.List;

import javax.annotation.PostConstruct;

import model.User;
import service.UserService;

public class MainBean implements java.io.Serializable {

    UserService userService;


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
        /*List<User> users = userService.listAllUsers();
        int i = users.size();*/

        return GENERAL_TITLE_PREFIX + MAIN_TITLE;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
