import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Buffer {

    public static void main(String[] args){
        File dir  = new File("C:\\Users\\Quent\\Documents\\Buffer-in");
        File[] liste = dir.listFiles();
        for(File item : liste){
            if(item.isFile()){
                System.out.println("Nom du fichier: "+ item.getName());
                try (CSVPrinter printer = new CSVPrinter(new FileWriter("resultat.csv",true), CSVFormat.EXCEL)) {
                    printer.printRecord(item.getName(), "Linux = ","Android = ","HTML5 = ","IOS = ", "Master 2 = ", "Java = ","AngularJS = ", "Elastic Search = ", "Ecole d’Ingénieurs = ","NoSQL = ", "BigData = ", "Cassandra = ", "POC = ", "Etude = ", "Développement = ", "Oracle = ", "PostGres = ", "CDI = ", "Stage = ", "SQL = ", "Unix = ", "Apache = ", "Javascript = ");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }

    }
}
