package edu.escuelaing.arep;

import static spark.Spark.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.bson.Document;

import edu.escuelaing.arep.services.LogService;

public class SparkWebServer {

  public static void main(String... args) throws IOException {
    port(getPort());
    init();
    get("/hello", (req, res) -> "Hello World");
    post("/push", (req, res) -> LogService.pushData(req, res));
    connection();
  }

  private static void connection() {
    String connectionString = "mongodb://localhost:27017";
    try (MongoClient mongoClient = MongoClients.create(connectionString)) {
      List<Document> databases = mongoClient.listDatabases().into(new ArrayList<>());
      databases.forEach(db -> System.out.println(db.toJson()));
    }
  }

  private static int getPort() {
    if (System.getenv("PORT") != null) {
      return Integer.parseInt(System.getenv("PORT"));
    }
    return 4567;
  }
}
