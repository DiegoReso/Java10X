package HttpClient;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HttpClientExample {
    public static void main(String[] args) throws Exception {

        HttpRequest request  = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString("{\"title\": \"Diego dev\"}"))
                .uri(URI.create("https://postman-echo.com/post"))
                .header("Content-Type", "application/json")
                .timeout(Duration.ofSeconds(3))
                .build();

        HttpClient httpClient = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(3))
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("==================================");
        System.out.println(response.body());
        System.out.println("==================================");


        //Usei aqui para testar metodo GET
//        String name = extractField(jsonReponse,"name");
//        String email = extractField(jsonReponse,"email");
//        String phone = extractField(jsonReponse, "phone");
//        String address = extractField(jsonReponse, "address");

//        System.out.println("Nome usuario : " + name + " email: " + email + ", telefone " + phone + " e endereco "  + address);


    }

//    private static String extractField(String json, String fieldName) {
//        String pattern = "\"" + fieldName + "\":\\s*(\"[^\"]*\"|\\d+|true|false|null|\\{[^}]*\\}|\\[[^]]*\\])";
//        java.util.regex.Pattern r = java.util.regex.Pattern.compile(pattern);
//        java.util.regex.Matcher m = r.matcher(json);
//
//        if (m.find()) {
//            String value = m.group(1).trim();
//            // Remove aspas se for string
//            if (value.startsWith("\"") && value.endsWith("\"")) {
//                return value.substring(1, value.length() - 1);
//            }
//            return value;
//        }
//        return "Não encontrado";
//    }
}