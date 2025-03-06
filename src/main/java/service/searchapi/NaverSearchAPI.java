package service.searchapi;

import io.github.cdimascio.dotenv.Dotenv;
import model.dto.APIClientParam;
import model.dto.NaverAPIResult;
import util.api.APIClient;
import util.logger.MyLogger;

import java.util.List;

public class NaverSearchAPI implements SearchAPI {
    private final String clientID;
    private final String clientSecret;
    private final MyLogger logger;
    private final NaverAPIClient<List<NaverAPIResult>> naverAPIClient;

    public NaverSearchAPI() {
        Dotenv dotenv = Dotenv.load();
        this.clientID = dotenv.get("NAVER_CLIENT_ID");
        this.clientSecret = dotenv.get("NAVER_CLIENT_SECRET");
        if (clientID == null || clientSecret == null) {
            throw new RuntimeException("NaverSearchAPI: clientID or clientSecret are missing");
        }
        this.logger = new MyLogger(NaverSearchAPI.class);
        this.naverAPIClient = NaverAPIClient.getInstance();
//        logger.info(clientID);
//        logger.info(clientSecret);
        logger.info("NaverSearchAPI initailized");
    }

    static class NaverAPIClient<T> extends APIClient<T> {
        private static NaverAPIClient<List<NaverAPIResult>> instance;
        private NaverAPIClient() {
            super();
        }

        public static NaverAPIClient<List<NaverAPIResult>> getInstance() {
            if (instance == null) {
                instance = new NaverAPIClient<>();
            }
            return instance;
        }


        @Override
        public T callAPI(APIClientParam param) {
            return null;
        }

    }

    @Override
    public List<NaverAPIResult> searchByKeyword(String keyword) {
        APIClientParam param = new APIClientParam();
        return naverAPIClient.callAPI(param);
    }
}
