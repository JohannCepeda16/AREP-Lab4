package edu.escuelaing.arep.services;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

import edu.escuelaing.documents.Cadena;
import spark.Request;
import spark.Response;

public class LogService {

    static Gson gson = new Gson();

    public static List<DBObject> pushData(Request req, Response res) throws UnknownHostException {
        List<DBObject> response = new ArrayList<>();
        try {
            Cadena data = gson.fromJson(JsonParser.parseString(req.body()), Cadena.class);
            MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
            DB database = mongoClient.getDB("AREP");
            DBCollection collection = database.getCollection("logs");
            collection.insert(new BasicDBObject("data", data));
            DBCursor cursor = collection.find().limit(10);
            while (cursor.hasNext()) {
                response.add(cursor.next());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return response;
    }
}
