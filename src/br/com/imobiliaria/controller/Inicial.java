package br.com.imobiliaria.controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Inicial extends Application {
    // main é o quadrão do java
    public static void main(String[] args) {
        // chama o start
        launch(args);
    }

    @Override
    // start, faz o link desse esquema. Pegar o layout e jogar na raiz -> nó -> palco
    public void start(Stage stage) throws Exception {

        // Objeto que carrega o arquivo fxml, encontra o arquivo xml
        FXMLLoader loader = new FXMLLoader();
        // pega o arquivo que o objeto loader vai ter que carregar
        loader.setLocation(getClass().getResource("/br/com/imobiliaria/view/JFXImobiliaria.fxml"));
        // Objeto AnchorPane (container utilizado no layout)
        // Controle (nó) raiz recebe a referência do arquivo fxml
        AnchorPane nodeRoot = loader.load();
        // Criação da cena recebendo o controle raiz, o nó vem dentro do objeto scene
        Scene scene = new Scene(nodeRoot);
        // Atribuição (jogar dentro do palco) da cena no palco
        stage.setScene(scene);

        // normalmente em aplicação personalizada, usamos essa parte para retirar os styles do usuario
        // Retira a barra superior da janela (icone, título, minimizar, maximizar e fechar)
        stage.initStyle(StageStyle.UNDECORATED);
        // Não permite redimensionamento
        stage.setResizable(false);
        // Apresenta a janela centralizada na tela
        stage.centerOnScreen();

        // Apresenta o palco
        stage.show();
    }
}