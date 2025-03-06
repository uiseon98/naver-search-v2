package util.api;

import model.dto.APIClientParam;
import util.logger.MyLogger;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIClient {
    private final MyLogger logger = new MyLogger(this.getClass());;
    private final HttpClient httpClient = HttpClient.newHttpClient();
    public APIClient() {
        logger.info("Initializing API client");
    }
     public String callAPI(APIClientParam param) throws IOException, InterruptedException {
        logger.info("Calling API client");
       HttpResponse<String> response = httpClient.send(HttpRequest.newBuilder().build(), HttpResponse.BodyHandlers.ofString());
       logger.info("%d".formatted(response.statusCode()));
       return response.body();
     };
}
