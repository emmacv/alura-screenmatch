package com.alura.screenmatch.principal;

import com.alura.screenmatch.models.Pelicula;
import com.alura.screenmatch.models.Serie;
import com.alura.screenmatch.models.Titulo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;

public class PrincipalConBusqueda {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter the film name");
        String film = stdin.nextLine();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://www.omdbapi.com/?t="+ film +"&apikey=d5bee84b")).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


class A {
    public static interface B {}
}