package service.searchapi;

import io.github.cdimascio.dotenv.Dotenv;
import model.dto.SearchResult;
import util.logger.MyLogger;

import java.util.List;

public class NaverSearchAPI implements SearchAPI {
    private final String clientID;
    private final String clientSecret;
    private final MyLogger logger;

    public NaverSearchAPI() {
        Dotenv dotenv = Dotenv.load();
        this.clientID = dotenv.get("NAVER_CLIENT_ID");
        this.clientSecret = dotenv.get("NAVER_CLIENT_SECRET");
        this.logger = new MyLogger(NaverSearchAPI.class);
        logger.info(clientID);
        logger.info(clientSecret);
    }

    @Override
    public List<SearchResult> searchByKeyword(String keyword) {
        return List.of();
    }
}
