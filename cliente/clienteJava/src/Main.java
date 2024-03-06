import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) {


        System.out.println("Obteniendo datos api node");
        System.out.println("--------------------------");
        System.out.println("1)Obtener información de los clientes");
        try {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://127.0.0.1:3000/clientes/get-clients"))
                .GET()
                .build();

            HttpResponse<String>response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Codigo respuesta");
            System.out.println(response.statusCode());
            System.out.println("Respuesta");
            System.out.println(response.body());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("--------------------------");
        System.out.println("2)Borrar Cliente");
        try {
            HttpClient httpClient = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://127.0.0.1:3000/clientes/delete-client/0"))
                    .header("Content-Type","application/json")
                    .DELETE()
                    .build();

            HttpResponse<String>response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Codigo respuesta");
            System.out.println(response.statusCode());
            System.out.println("Respuesta");
            System.out.println(response.body());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("--------------------------");
        System.out.println("3)Obtener el cliente más habitual");
        try {
            HttpClient httpClient = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://127.0.0.1:3000/clientes/get-client-fav"))
                    .GET()
                    .build();

            HttpResponse<String>response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Codigo respuesta");
            System.out.println(response.statusCode());
            System.out.println("Respuesta");
            System.out.println(response.body());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("--------------------------");
        System.out.println("4)Obtener información de los productos");
        try {
            HttpClient httpClient = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://127.0.0.1:3000/productos/get-products"))
                    .GET()
                    .build();

            HttpResponse<String>response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Codigo respuesta");
            System.out.println(response.statusCode());
            System.out.println("Respuesta");
            System.out.println(response.body());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("--------------------------");
        System.out.println("5)Añadir un producto");


        try {
            HttpClient httpClient = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://127.0.0.1:3000/productos/add-products"))
                    .header("Content-Type","application/json")
                    .POST(HttpRequest.BodyPublishers.ofString("{\"producto\":\"libro clean code\"}"))
                    .build();

            HttpResponse<String>response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Codigo respuesta");
            System.out.println(response.statusCode());
            System.out.println("Respuesta");
            System.out.println(response.body());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("--------------------------");
        System.out.println("Volvemos a obtener los productos para verificar.");
        try {
            HttpClient httpClient = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://127.0.0.1:3000/productos/get-products"))
                    .GET()
                    .build();

            HttpResponse<String>response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Codigo respuesta");
            System.out.println(response.statusCode());
            System.out.println("Respuesta");
            System.out.println(response.body());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
