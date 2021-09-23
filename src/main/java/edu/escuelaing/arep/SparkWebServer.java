package edu.escuelaing.arep;

import static spark.Spark.*;

import java.io.IOException;

public class SparkWebServer {

  public static void main(String... args) throws IOException {
    port(getPort());
    init();
    get("/hello", (req, res) -> "Hello World");
  }

  private static int getPort() {
    if (System.getenv("PORT") != null) {
      return Integer.parseInt(System.getenv("PORT"));
    }
    return 4567;
  }
}
