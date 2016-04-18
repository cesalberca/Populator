package es.cesalberca.populator.controller;

import es.cesalberca.populator.model.Humano;
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
    ArrayList<Humano> humans = null;
    private String fileName;
    
    public FileExporter(String fileName) {
        this.fileName = fileName;
    }
    
    public void save(ArrayList<Humano> humans) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter(this.fileName, true));
            for (Humano human : humans) {
                pw.append(humans.toInsert());
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