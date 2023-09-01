package Filmes; // Recomendaçao de Filme: Filtrar site IMDb (categoria:romance;Titulo; Ano; Avaliação ) 

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.FileWriter;
import java.io.IOException;

public class ExtrairDados {
    public static void main(String[] args) {
        try {
            String imdbUrl = "https://www.imdb.com/search/title/?genres=Romance&explore=genres&title_type=movie&ref_=ft_movie_16"; 
            Document doc = Jsoup.connect(imdbUrl).get();
           
            // Filtrar os resultados de filmes de Ação
            Elements movieElements = doc.select(".lister-item-content");

            // Criar e abrir o arquivo CSV
            String csvFileName = "filmes.csv";
            FileWriter csvWriter = new FileWriter(csvFileName);
            csvWriter.append("Titulo, Ano, Avaliacao\n");

            for (Element movieElement : movieElements) {
                String title = movieElement.select(".lister-item-header a").text();
                String year = movieElement.select(".lister-item-year").text();
                String rating = movieElement.select(".ratings-imdb-rating strong").text();

                // Salvar os dados no arquivo CSV
                csvWriter.append(title).append(",").append(year).append(",").append(rating).append("\n");
            }

            // Fechar o arquivo CSV
            csvWriter.flush();
            csvWriter.close();

            System.out.println("Dados salvos em " + csvFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
