package sample;

import com.google.firebase.FirebaseApp;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;




public class Main extends Application {
    //private static BorderPane root;
    private static AnchorPane idPage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        idPage = FXMLLoader.load(getClass().getResource("/identification_page.fxml"));
        primaryStage.setScene(new Scene(idPage));
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}

//Prochaine étape : On lance sur l'écran de connexion au démarrage avec un Controller.
// On gère le click sur le bouton de connexion






// On créer une table qui permet d'afficher la liste des bugs
// On mettra un bouton consulter qui permettra d'afficher la page détailler du truc.
//

//PREREQUIS :   1 - Configurer le Mac pour avoir docker et lancer une base de donnée locale afin de tester
//              2 - Mettre en place le projet de Node sur le mac.

// ETAPE 0 : Faire une interface de connexion.
//ETAPE 1 : Creer une base de données mongodb en local :
//ETAPE 2 : Modifier le code de l'api pour taper dans cette base de donnée test avec les requêtes.
//ETAPE 3 : Récupérer les informations de la base de données via des requêtes à l'api.
//ETAPE 4 : A chaque étape que tu fais faire un fichier avec la liste des commandes pour mettre en place plus rapidement
            //ton environnement de test.

//ETAPE 6 : Travailler sur la responsivité.
//ETAPE 7 : Faire la page des statistiques pour les bugs.
//ETAPE 8 : Faire la page de détail.