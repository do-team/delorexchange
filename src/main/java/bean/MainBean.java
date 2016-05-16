/**
 * 
 */
package bean;

import java.io.IOException;
import java.util.Properties;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainBean implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 3095593138292372749L;

    private static final Logger LOG = LoggerFactory.getLogger(MainBean.class);


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

    public String getVersion() {
        String version = "";

        Properties configFile = new Properties();
        try {
            configFile.load(getClass().getClassLoader().getResourceAsStream("delorexchange.properties"));
            version = configFile.getProperty("buildVersion");
            LOG.debug("Version : {}", version);
        } catch (IOException ex) {
            LOG.error(ex.getLocalizedMessage());
            ex.printStackTrace();
        }
        return version;
    }
}
