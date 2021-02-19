import java.io.File;
import java.io.IOException;

public class Extractor {
    String[] vector = {"Linux","Android","HTML5","IOS","Master 2","Java","AngularJS","Elastic Search","Ecole d’Ingénieurs","NoSQL","BigData","Cassandra","POC","Etude","Développement","Oracle","PostGres","CDI","Stage","SQL","Unix","Apache","Javascript"};


    public static int nbOccurences(String chaine, String Text) {
        int nbOccurences = 0;
        int position = 0;
        while ((Text.contains(chaine)) && (!chaine.equals(""))) {
            position = Text.indexOf(chaine);
            Text = Text.substring(position + chaine.length(), Text.length());
            nbOccurences++;
        }
        System.out.println("Le nombre d'occurences de la chaine \"" + chaine + "\" est égale à " + nbOccurences);
        return nbOccurences;
    }

    public static void main(String[] args) throws IOException {
        PDFReader p = new PDFReader();
        File file = new File("C:\\Users\\Damien\\IdeaProjects\\prm\\MPC-Guide_utilisation_V2.pdf");
        String res = p.getText(file);

        System.out.println(res);
        nbOccurences("Statut",res);

    }

}
