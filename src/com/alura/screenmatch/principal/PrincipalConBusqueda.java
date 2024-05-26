package com.alura.screenmatch.principal;

import com.alura.screenmatch.models.Pelicula;
import com.alura.screenmatch.models.Serie;
import com.alura.screenmatch.models.Titulo;
import com.alura.screenmatch.models.TituloOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner stdin = new Scanner(System.in);
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        try{
            while (true) {
                System.out.println("Enter the film name");
                String film = stdin.nextLine();

                if (film.equalsIgnoreCase("salir")) break;

                String url = "https://www.omdbapi.com/?t=" + URLEncoder.encode(film, StandardCharsets.UTF_8) +"&apikey=d5bee84b";
                System.out.println(url);
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();

                var response = client.send(request, HttpResponse.BodyHandlers.ofString());
                var resp = response.body();
                TituloOMDB titulo = gson.fromJson(resp, TituloOMDB.class);
                titulos.add(new Titulo(titulo));
            }

            FileWriter out = new FileWriter("titulos.json");
            out.write(gson.toJson(titulos));
            out.close();
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Ocurrio un error");
        }
    }
}


class A {
    public static interface B {}
}