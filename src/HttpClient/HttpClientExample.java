package HttpClient;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HttpClientExample {
    public static void main(String[] args) throws Exception {

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://api.invertexto.com/v1/cnpj/39813586000149?token="))
                .build();

        HttpClient httpClient = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(3))
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("==================================");
        System.out.println(response.body());
        System.out.println("==================================");

        String jsonReponse = response.body();


        String name = extractField(jsonReponse, "cnpj");
        String razao = extractField(jsonReponse, "razao_social");
        String socio = extractField(jsonReponse, "socios");

        System.out.println("Cnpj consultado : " + name + " Razao social: " + razao + " Socio " + socio);
    }

    private static String extractField(String json, String fieldName) {
        String pattern = "\"" + fieldName + "\":\\s*(\"[^\"]*\"|\\d+|true|false|null|\\{[^}]*\\}|\\[[^]]*\\])";
        java.util.regex.Pattern r = java.util.regex.Pattern.compile(pattern);
        java.util.regex.Matcher m = r.matcher(json);

        if (m.find()) {
            String value = m.group(1).trim();
            //Remove aspas se for string
            if (value.startsWith("\"") && value.endsWith("\"")) {
                return value.substring(1, value.length() - 1);
            }
            return value;
        }
        return "Não encontrado";
    }
}