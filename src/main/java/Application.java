import io.github.cdimascio.dotenv.Dotenv;
import service.searchapi.NaverSearchAPI;
import service.searchapi.SearchAPI;

import java.util.logging.Logger;

public class Application {
    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.load();
        Logger logger = Logger.getLogger(Application.class.getName());
        String searchKeyword = dotenv.get("SEARCH_KEYWORD");
        logger.info(searchKeyword);
        SearchAPI searchAPI = new NaverSearchAPI();
        searchAPI.searchByKeyword(searchKeyword);
    }
}
