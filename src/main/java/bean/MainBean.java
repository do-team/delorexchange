/**
 * 
 */
package bean;

import javax.annotation.PostConstruct;

public class MainBean implements java.io.Serializable {

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
}
