
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exercise13 {

    private static final Logger logger =
            LoggerFactory.getLogger(Exercise13.class);

    public static void main(String[] args) {

        logger.info("Application Started");

        logger.warn("Low Memory Warning");

        logger.error("Database Connection Failed");

        logger.debug("Debug Message");

        logger.trace("Trace Message");
    }
}
