package com.mycompany.parical_02;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.Precondition;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PersonaProvider {
    CollectionReference reference;
    static Firestore db;
    
    public static boolean guardarOrden(String coleccion, String documento, Map<String, Object> data){
        db = FirestoreClient.getFirestore();
        
        try{
            DocumentReference docRef = db.collection(coleccion).document(documento);
            ApiFuture<WriteResult> result = docRef.set(data);
            System.out.println("Orden guardada.");
            return true;
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());   
        }
        return false;
    }
    /*
    public static boolean actualizarPersona(String coleccion, String documento, Map<String, Object> data){
        db = FirestoreClient.getFirestore();
        
        try{
            DocumentReference docRef = db.collection(coleccion).document(documento);
            ApiFuture<WriteResult> result = docRef.update(data);
            System.out.println("Actualizado correctamente");
            return true;
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());   
        }
        return false;
    }
    
    
    public static boolean eliminarPersona(String coleccion, String documento){
        db = FirestoreClient.getFirestore();
        
        try{
            DocumentReference docRef = db.collection(coleccion).document(documento);
            ApiFuture<WriteResult> result = docRef.delete(Precondition.NONE);
            System.out.println("Eliminado correctamente");
            return true;
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());   
        }
        return false;
    }
    */
    

    public static void cargarTablaCarnicos(JTable table){
        
        ArrayList<String> carnicos = new ArrayList<>();
        carnicos.add("Cerdo a la plancha");
        carnicos.add("Pollo a la plancha");
        carnicos.add("Churrasco");
        carnicos.add("Frijolada");
        carnicos.add("Arroz con pollo");
        carnicos.add("Carne en bistec");
        carnicos.add("Producto sorpresa");
        
        
                
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Opciones");

        for(String opcion: carnicos){
            model.addRow(new Object[]{
                opcion,
                });
            }
    
        table.setModel(model);
    }
    
    public static void cargarTablaVeggie(JTable table){
        
        ArrayList<String> veggie = new ArrayList<>();
        veggie.add("Hamburguesa vegana");
        veggie.add("Arroz con arroz");
        veggie.add("Arroz con salsa soya");
        veggie.add("Arroz pero más poquito");
        veggie.add("Pizza Vegana");
        veggie.add("Producto sorpresa");
     
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Opciones");

        for(String opcion: veggie){
            model.addRow(new Object[]{
                opcion,
                });
            }
    
        table.setModel(model);
    }
        
    public static void cargarTablaFast(JTable table){
        
        ArrayList<String> fast = new ArrayList<>();
        fast.add("Hamburguesa sencilla");
        fast.add("Hamburguesa doble");
        fast.add("Perro sencillo");
        fast.add("Perro especial");
        fast.add("Pizza personal");
        fast.add("Pizza familiar");
        fast.add("Producto sorpresa");

     
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Opciones");

        for(String opcion: fast){
            model.addRow(new Object[]{
                opcion,
                });
            }
    
        table.setModel(model);
    }
  
  

}
