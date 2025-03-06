package util.api;

import model.dto.APIClientParam;
import util.logger.MyLogger;

import java.net.http.HttpClient;

public abstract class APIClient<T> {
    private final MyLogger logger = new MyLogger(this.getClass());;
    private final HttpClient httpClient = HttpClient.newHttpClient();
    public APIClient() {
        logger.info("Initializing API client");
    }

    abstract public T callAPI(APIClientParam param);
}
