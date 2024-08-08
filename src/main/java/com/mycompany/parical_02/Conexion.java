package com.mycompany.parical_02;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import java.io.FileInputStream;
import java.io.IOException;

public class Conexion {
    public static Firestore db;
    
    public static void conectarFirebase(){
        
        try {
            FileInputStream sa = new FileInputStream("parcial.json");
            
            FirebaseOptions options = FirebaseOptions.builder()
                .setCredentials(GoogleCredentials.fromStream(sa)) 
                .build();
            FirebaseApp.initializeApp(options);
        }catch (IOException e){
            System.out.println("Error: "+ e.getMessage());
        }
        
    }
    
    
}
