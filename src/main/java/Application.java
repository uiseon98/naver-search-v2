import io.github.cdimascio.dotenv.Dotenv;
import service.searchapi.NaverSearchAPI;
import service.searchapi.SearchAPI;
import util.logger.MyLogger;

public class Application {
    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.load();
        MyLogger logger = new MyLogger(Application.class);
        String searchKeyword = dotenv.get("SEARCH_KEYWORD");
        logger.info(searchKeyword);
        SearchAPI searchAPI = new NaverSearchAPI();
        searchAPI.searchByKeyword(searchKeyword);
    }
}
