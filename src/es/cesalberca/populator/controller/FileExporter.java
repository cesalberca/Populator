package es.cesalberca.populator.controller;

import es.cesalberca.populator.model.Human;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author César Alberca
 */
public class FileExporter {
    ArrayList<Human> humans = null;
    private String table;
    private String fileName;
    
    public FileExporter(String fileName, String table) {
        this.fileName = fileName;
        this.table = table;
    }
    
    public void save(ArrayList<Human> humans) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter(this.fileName, true));
            for (Human human : humans) {
                pw.append(human.toInsert(table));
            }
            pw.flush();
        } catch (FileNotFoundException e) {
            System.err.println("Fichero no encontrado");
        } catch (IOException ex) {
            System.out.println("Error de entrada o salida");
        } finally {
            pw.close();
        }
    }
}
