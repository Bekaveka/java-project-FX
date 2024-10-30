package com.example.project2;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Random;

public class HelloApplication extends Application {
    public BorderPane borderPane;
    public Image[] images;

    @Override
    public void start(Stage stage) throws IOException {
        Menu(stage);
        stage.show();
    }

    public void Menu(Stage stage) {
        HBox hBox = new HBox();
        borderPane = new BorderPane();
        Button button = new Button("Home .");
        Button button1 = new Button("Capella .");
        Button button2 = new Button("Booking .");
        Button button3 = new Button("Gallery .");
        Button button4 = new Button("Menu .");
        Button button5 = new Button("Contact .");
        hBox.getChildren().addAll(button, button1, button2, button3, button4, button5);
        borderPane.setTop(hBox);

        Scene scene = new Scene(borderPane, 800, 600);
        button.setStyle("-fx-background-color: transparent; -fx-text-fill: white;");
        button1.setStyle("-fx-background-color: transparent; -fx-text-fill: white;");
        button2.setStyle("-fx-background-color: transparent; -fx-text-fill: white;");
        button3.setStyle("-fx-background-color: transparent; -fx-text-fill: white;");
        button4.setStyle("-fx-background-color: transparent; -fx-text-fill: white;");
        button5.setStyle("-fx-background-color: transparent; -fx-text-fill: white;");
        hBox.setStyle("-fx-background-color: black;");
        stage.setScene(scene);
        button2.setOnAction(e -> {
            BookingScreen(stage);
        });
        button.setOnAction(e -> {
            Home(stage);
        });
        button4.setOnAction(e -> {
            Menu1(stage);
        });
        button5.setOnAction(e -> {
            Contact(stage);
        });
        button3.setOnAction(e -> {
            Gallery(stage);
        });
    }

    public void BookingScreen(Stage stage) {
        BorderPane borderPane1 = new BorderPane();
        Label label = new Label("Booking");
        Label label1 = new Label("Name (recuired)");
        Label label2 = new Label("Email (recuired)");
        Label label3 = new Label("Phone ");
        Label label4 = new Label("Date (recuired)");
        Label label5 = new Label("Date (recuired)");
        Label label6 = new Label("Size (recuired)");
        Label label7 = new Label("Special requests");
        Label label8 = new Label("");
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        TextField textField3 = new TextField();
        TextField textField4 = new TextField();
        TextField textField5 = new TextField();
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("1 person", "2 person", "3 person", "4 person");
        TextField textField7 = new TextField();
        Button button7 = new Button("Complete");
        VBox vBox1 = new VBox(22);
        VBox vBox2 = new VBox(14);
        vBox1.getChildren().addAll(label8, label1, label2, label3, label4, label5, label6, label7);
        vBox2.getChildren().addAll(label, textField1, textField2, textField3, textField4, textField5, comboBox, textField7, button7);

        Insets insets = new Insets(15, 0, 0, 0);
        vBox1.setPadding(insets);
        vBox2.setPadding(insets);

        label.setStyle("-fx-font-size: 18px;");

        HBox hBox = new HBox(18);
        hBox.getChildren().addAll(vBox1, vBox2);
        borderPane1.setTop(borderPane);
        borderPane1.setCenter(hBox);
        hBox.setAlignment(Pos.CENTER);
        button7.setOnAction(e -> {
            if (textField1.getText().trim().isEmpty() || textField2.getText().trim().isEmpty() ||
                    textField4.getText().trim().isEmpty() || comboBox.getValue() == null) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setHeaderText(null);
                alert.setContentText("Please fill in all required fields.");
                alert.showAndWait();
            }else {
                // Output the text to the console
                System.out.println("Name: " + textField1.getText());
                System.out.println("Email: " + textField2.getText());
                System.out.println("Phone: " + textField3.getText());
                System.out.println("Date: " + textField4.getText());
                System.out.println("Size: " + comboBox.getValue());
                System.out.println("Special Requests: " + textField7.getText());
            }

        });

        Scene scene = new Scene(borderPane1, 800, 600);
        stage.setScene(scene);
    }

    public void Home(Stage stage) {
        VBox vBox = new VBox(15);
        VBox vBox1 = new VBox();
        Label label = new Label("Welcome To Beka Restaurant");
        Label label1 = new Label("Indulge in Exquisite Gastronomic Delights and Unparalleled Hospitality");
        Label label2 = new Label("Recommendations");
        Label label3 = new Label("Sample our Chef's Signature Pasta Creation!");
        Label label4 = new Label("Explore our Weekend Buffet Extravaganza!");
        Label label5 = new Label("Delight in Live Musical Performances every Friday!");
        Button button = new Button("View Menu");
        Button button1 = new Button("Booking");
        label.setStyle("-fx-font-size: 40px; -fx-font-weight: bold; -fx-text-fill: #7B68EE;");
        label1.setStyle("-fx-font-size: 25px;");
        button.setStyle("-fx-font-size: 18px; -fx-font-weight: bold; -fx-background-color: #7B68EE; -fx-text-fill: white;");
        label2.setStyle("-fx-font-size: 20px; -fx-font-weight: bold; -fx-text-fill: #7B68EE;");
        label3.setStyle("-fx-font-size: 15px;");
        label4.setStyle("-fx-font-size: 15px;");
        label5.setStyle("-fx-font-size: 15px;");
        button1.setStyle("-fx-font-size: 18px; -fx-font-weight: bold; -fx-background-color: #7B68EE; -fx-text-fill: white;");
        vBox.getChildren().addAll(label, label1, button, label2, label3, label4, label5, button1);
        vBox1.getChildren().addAll(borderPane, vBox);
        vBox.setAlignment(Pos.CENTER);
        Insets insets = new Insets(45, 0, 0, 0);
        vBox.setPadding(insets);
        Scene scene = new Scene(vBox1, 800, 600);
        stage.setScene(scene);
        button1.setOnAction(e -> {
            BookingScreen(stage);
        });
        button.setOnAction(e -> {
            Menu1(stage);
        });
    }

    public void Menu1(Stage stage) {
        VBox vBox = new VBox(15);
        VBox vBox1 = new VBox(15);
        VBox vBox2 = new VBox();
        Label label = new Label("Menu");
        label.setStyle("-fx-font-size: 30px; -fx-font-weight: bold; -fx-text-fill: #7B68EE;");
        Label label1 = new Label("Margherita Pizza");
        label1.setStyle("-fx-font-size: 25px; -fx-font-weight: bold; -fx-text-fill: black;");
        Label label2 = new Label("10$");
        label2.setStyle("-fx-font-size: 20px;");
        Label label3 = new Label("Classic pizza with sauce, cheese, and fresh basil. ");
        label3.setStyle("-fx-font-size: 18px;");
        Label label4 = new Label("Classic Pepperoni Pizza");
        label4.setStyle("-fx-font-size: 25px; -fx-font-weight: bold; -fx-text-fill: black;");
        Label label5 = new Label("12$");
        label5.setStyle("-fx-font-size: 20px;");
        Label label6 = new Label("Tomato sauce, mozzarella, pepperoni.");
        label6.setStyle("-fx-font-size: 18px;");
        Label label7 = new Label("Mexican Pizza");
        label7.setStyle("-fx-font-size: 25px; -fx-font-weight: bold; -fx-text-fill: black;");
        Label label8 = new Label("14$");
        label8.setStyle("-fx-font-size: 20px;");
        Label label9 = new Label("Tomato sauce, mozzarella, ground beef, chili peppers, red onions, tomatoes, spicy sauce.");
        label9.setStyle("-fx-font-size: 18px;");
        Label label10 = new Label("Vegetarian Pizza");
        label10.setStyle("-fx-font-size: 25px; -fx-font-weight: bold; -fx-text-fill: black;");
        Label label11 = new Label("13$");
        label11.setStyle("-fx-font-size: 20px;");
        Label label12 = new Label("Tomato sauce, mozzarella, mushrooms, bell peppers, onions, olives.");
        label12.setStyle("-fx-font-size: 18px;");
        Label label13 = new Label("Hawaiian Pizza");
        label13.setStyle("-fx-font-size: 25px; -fx-font-weight: bold; -fx-text-fill: black;");
        Label label14 = new Label("11$");
        label14.setStyle("-fx-font-size: 20px;");
        Label label15 = new Label("Tomato sauce, mozzarella, ham, pineapple.");
        label15.setStyle("-fx-font-size: 18px;");
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(vBox);
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);
        vBox.getChildren().addAll(label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12, label13, label14, label15);
        vBox1.getChildren().addAll(label, scrollPane);
        vBox2.getChildren().addAll(borderPane, vBox1);
        vBox1.setAlignment(Pos.CENTER);
        vBox.setAlignment(Pos.CENTER);
        Insets insets = new Insets(45, 45, 45, 45);
        vBox1.setPadding(insets);
        Scene scene = new Scene(vBox2, 800, 600);
        stage.setScene(scene);
    }

    public void Contact(Stage stage) {
        VBox vBox = new VBox(18);
        VBox vBox1 = new VBox(15);
        VBox vBox2 = new VBox();
        VBox vBox3 = new VBox();
        VBox vBox4 = new VBox();
        VBox vBox5 = new VBox(10);
        VBox vBox6 = new VBox();
        VBox vBox7 = new VBox();
        HBox hBox = new HBox();
        HBox hBox0 = new HBox(15);
        HBox hBox1 = new HBox(35);
        HBox hBox2 = new HBox(35);
        HBox hBox3 = new HBox(10);
        HBox hBox4 = new HBox(28);
        HBox hBox5 = new HBox(50);
        HBox hBox6 = new HBox(31);
        HBox hBox7 = new HBox(42);
        Label label = new Label("Contact");
        label.setStyle("-fx-font-size: 30px; -fx-font-weight: bold; -fx-text-fill: black;");
        Label label0 = new Label("Contact Us");
        label0.setStyle("-fx-font-size: 30px; -fx-font-weight: bold; -fx-text-fill: white;");
        Label label1 = new Label("Don’t hesitate to reach out with the contact information below, \n" + "or send a message using the form.");
        label1.setStyle("-fx-font-size:12px; -fx-font-weight: bold; -fx-text-fill: white;");
        Label label2 = new Label("Name (required)");
        label2.setStyle("-fx-font-size:15px; -fx-font-weight: bold; -fx-text-fill: white;");
        Label label3 = new Label("Email (required)");
        label3.setStyle("-fx-font-size:15px; -fx-font-weight: bold; -fx-text-fill: white;");
        Label label4 = new Label("Name");
        label4.setStyle("-fx-font-size:15px; -fx-font-weight: bold; -fx-text-fill: white;");
        Label label5 = new Label("87075640223");
        label5.setStyle("-fx-font-size:15px; -fx-font-weight: bold; -fx-text-fill: white;");
        Label label6 = new Label("Monday");
        label6.setStyle("-fx-font-size:15px; -fx-font-weight: bold; -fx-text-fill: white;");
        Label label7 = new Label("Tuesday");
        label7.setStyle("-fx-font-size:15px; -fx-font-weight: bold; -fx-text-fill: white;");
        Label label8 = new Label("Wednesday");
        label8.setStyle("-fx-font-size:15px; -fx-font-weight: bold; -fx-text-fill: white;");
        Label label9 = new Label("Thursday");
        label9.setStyle("-fx-font-size:15px; -fx-font-weight: bold; -fx-text-fill: white;");
        Label label10 = new Label("Friday");
        label10.setStyle("-fx-font-size:15px; -fx-font-weight: bold; -fx-text-fill: white;");
        Label label11 = new Label("Saturday");
        label11.setStyle("-fx-font-size:15px; -fx-font-weight: bold; -fx-text-fill: white;");
        Label label12 = new Label("Sunday");
        label12.setStyle("-fx-font-size:15px; -fx-font-weight: bold; -fx-text-fill: white;");
        Label label13 = new Label("9:00 am – 5:00 pm");
        label13.setStyle("-fx-font-size:15px; -fx-font-weight: bold; -fx-text-fill: white;");
        Label label14 = new Label("9:00 am – 5:00 pm");
        label14.setStyle("-fx-font-size:15px; -fx-font-weight: bold; -fx-text-fill: white;");
        Label label15 = new Label("9:00 am – 5:00 pm");
        label15.setStyle("-fx-font-size:15px; -fx-font-weight: bold; -fx-text-fill: white;");
        Label label16 = new Label("9:00 am – 5:00 pm");
        label16.setStyle("-fx-font-size:15px; -fx-font-weight: bold; -fx-text-fill: white;");
        Label label17 = new Label("9:00 am – 5:00 pm");
        label17.setStyle("-fx-font-size:15px; -fx-font-weight: bold; -fx-text-fill: white;");
        Label label18 = new Label("Closed");
        label18.setStyle("-fx-font-size:15px; -fx-font-weight: bold; -fx-text-fill: white;");
        Label label19 = new Label("Closed");
        label19.setStyle("-fx-font-size:15px; -fx-font-weight: bold; -fx-text-fill: white;");
        Label label20 = new Label("Leave a Reply");
        label20.setStyle("-fx-font-size:20px; -fx-font-weight: bold; -fx-text-fill: black;");
        TextField textField = new TextField();
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        TextArea textArea = new TextArea();
        Button button = new Button("Complete");
        textArea.setMaxWidth(600);
        textArea.setMaxHeight(50);
        vBox2.getChildren().addAll(label2, textField);
        vBox3.getChildren().addAll(label3, textField1);
        vBox4.getChildren().addAll(label4, textField2);
        hBox0.getChildren().addAll(vBox2, vBox3);
        vBox.getChildren().addAll(label0, label1, hBox0, vBox4);
        hBox1.getChildren().addAll(label6, label13);
        hBox2.getChildren().addAll(label7, label14);
        hBox3.getChildren().addAll(label8, label15);
        hBox4.getChildren().addAll(label9, label16);
        hBox5.getChildren().addAll(label10, label17);
        hBox6.getChildren().addAll(label11, label18);
        hBox7.getChildren().addAll(label12, label19);
        vBox1.getChildren().addAll(label5, hBox1, hBox2, hBox3, hBox4, hBox5, hBox6, hBox7);
        hBox.getChildren().addAll(vBox, vBox1);
        vBox5.getChildren().addAll(label20, textArea,button);
        BorderPane borderPane1 = new BorderPane();
        borderPane1.setCenter(hBox);
        Insets insets = new Insets(20, 0, 20, 0);
        vBox5.setPadding(insets);
        Insets insets1 = new Insets(0, 0, 0, 40);
        vBox.setPadding(insets1);
        Insets insets2 = new Insets(0, 40, 0, 40);
        vBox1.setPadding(insets2);
        vBox5.setAlignment(Pos.CENTER);
        vBox6.getChildren().addAll(label);
        vBox7.getChildren().addAll(borderPane, vBox6);
        vBox6.setPadding(insets);
        vBox6.setAlignment(Pos.CENTER);
        borderPane1.setTop(vBox7);
        borderPane1.setBottom(vBox5);


        hBox.setStyle("-fx-background-color: #C1D7C9; ");
        Scene scene = new Scene(borderPane1, 800, 600);
        stage.setScene(scene);
        button.setOnAction(e -> {
            // Вывод данных в консоль
            System.out.println("Name: " + textField.getText());
            System.out.println("Email: " + textField1.getText());
            System.out.println("Message: " + textArea.getText());
        });
    }


    public void Gallery(Stage stage) {
        images = new Image[]{
                new Image("file:\\C:\\Users\\Бекжан\\IdeaProjects\\Project2\\src\\images.jpeg"),
                new Image("file:\\C:\\Users\\Бекжан\\IdeaProjects\\Project2\\src\\images (1).jpeg"),
                new Image("file:\\C:\\Users\\Бекжан\\IdeaProjects\\Project2\\src\\images (2).jpeg"),
                new Image("file:\\C:\\Users\\Бекжан\\IdeaProjects\\Project2\\src\\images (3).jpeg"),
                new Image("file:\\C:\\Users\\Бекжан\\IdeaProjects\\Project2\\src\\real-simple-make-you-rown-pizza-RS1222-d5c99b1bfef245938f9241569c2cecbb.jpg"),
                new Image("file:\\C:\\Users\\Бекжан\\IdeaProjects\\Project2\\src\\Без названия.jpeg"),
                new Image("file:\\C:\\Users\\Бекжан\\IdeaProjects\\Project2\\src\\Без названия (1).jpeg"),
                new Image("file:\\C:\\Users\\Бекжан\\IdeaProjects\\Project2\\src\\Без названия (2).jpeg"),
                new Image("file:\\C:\\Users\\Бекжан\\IdeaProjects\\Project2\\src\\Без названия (3).jpeg")
        };

        VBox vBox = new VBox();
        for (int i = 0; i < 3; i++) {
            HBox hBox = new HBox(12);
            for (int j = 0; j < 3; j++) {
                ImageView imageView = new ImageView(getRandomImage());
                Insets insets = new Insets(5, 25 , 5,25);
                vBox.setPadding(insets);
                hBox.setPadding(insets);

                imageView.setFitWidth(300);
                imageView.setFitHeight(200);
                hBox.getChildren().add(imageView);
            }
            vBox.getChildren().add(hBox);
        }
        BorderPane borderPane1 = new BorderPane();
        borderPane1.setCenter(vBox);
        borderPane1.setTop(borderPane);
        vBox.setStyle("-fx-background-color: black ; ");
        Scene scene = new Scene(borderPane1, 1000, 700);
        stage.setScene(scene);
        Label label = new Label("Gallery");
        label.setStyle("-fx-font-size: 20px; -fx-font-weight: bold; -fx-text-fill: black;");
        VBox vBox1 = new VBox();
        VBox vBox2 = new VBox();
        vBox1.getChildren().addAll(label);
        vBox2.getChildren().addAll(borderPane, vBox1);
        borderPane1.setTop(vBox2);
        Insets insets = new Insets(5, 0, 5, 0);
        vBox1.setPadding(insets);
        vBox1.setAlignment(Pos.CENTER);
        vBox.setAlignment(Pos.CENTER);

    }
    private Image getRandomImage() {
        Random random = new Random();
        return images[random.nextInt(images.length)];
    }
}
