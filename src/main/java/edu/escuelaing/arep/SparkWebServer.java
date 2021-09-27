package edu.escuelaing.arep;

import static spark.Spark.*;

import java.io.IOException;

import edu.escuelaing.arep.services.LogService;

public class SparkWebServer {

  public static void main(String... args) throws IOException {
    port(getPort());
    init();
    get("/hello", (req, res) -> "Hello World");
    post("/push", (req, res) -> LogService.pushData(req, res));
  }

  private static int getPort() {
    if (System.getenv("PORT") != null) {
      return Integer.parseInt(System.getenv("PORT"));
    }
    return 4567;
  }
}
