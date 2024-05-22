package com.alura.screenmatch.principal;

import com.alura.screenmatch.models.Pelicula;
import com.alura.screenmatch.models.Serie;
import com.alura.screenmatch.models.Titulo;
import com.alura.screenmatch.models.TituloOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner stdin = new Scanner(System.in);
        var gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

        System.out.println("Enter the film name");
        String film = stdin.nextLine();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://www.omdbapi.com/?t="+ film +"&apikey=d5bee84b")).build();

        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
        var resp = response.body();
        TituloOMDB titulo = gson.fromJson(resp, TituloOMDB.class);
        Titulo miTitulo = new Titulo(titulo);
        System.out.println(miTitulo);
    }
}


class A {
    public static interface B {}
}