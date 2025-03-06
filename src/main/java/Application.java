import io.github.cdimascio.dotenv.Dotenv;
import model.dto.NaverAPIResult;
import model.dto.NaverAPIResultItem;
import service.searchapi.NaverSearchAPI;
import util.logger.MyLogger;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.load();
        MyLogger logger = new MyLogger(Application.class);
        String searchKeyword = dotenv.get("SEARCH_KEYWORD");
        logger.info(searchKeyword);
        NaverSearchAPI searchAPI = new NaverSearchAPI();
        try {
            List<NaverAPIResultItem> result = searchAPI.searchByKeyword(searchKeyword);
            logger.info(result.toString());
        } catch (Exception e) {
          logger.severe(e.getMessage());
        }

    }
}
