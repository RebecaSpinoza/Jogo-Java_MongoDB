/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jogo2;

import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Spinoza Rebeca
 */
public class conect {

    public static void registergame(String nome, String resultado) {
        try (MongoClient mongo = new MongoClient("localhost", 27017);) {
            MongoDatabase database = mongo.getDatabase("jogo");
            MongoCollection<Document> collection = database.getCollection("jogador");
            try {
                Document doc = new Document();
                doc.put("Nome", nome);
                doc.put("Status",resultado);

                collection.insertOne(doc);

            } catch (MongoException me) {
                System.err.println("An error occurred: " + me);
            }

        }
    }
}
