package control;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

import model.Endereco;

public class Controller {

    public String recebeApi(String cep) throws IOException, InterruptedException{
        String url = "https://viacep.com.br/ws/"+ cep +"/json/";

        System.out.println(url);
        
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(url))
        .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    public void converteApiParaString(String response){
        Gson gson = new Gson();
        Endereco endereco = gson.fromJson(response, Endereco.class);
        System.out.println(endereco.toString());

    }
    
}
