import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientTest {
    public static void main(String[] args) throws Exception {
        //create a client (this is like opening the browser)
        HttpClient client = HttpClient.newHttpClient();

        //create a request
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://example.com")).build();

        //sent a request and get a response
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
        System.out.println(response.statusCode());
    }
}
