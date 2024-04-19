package application;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class WarningDelete {
	Stage war;
	private Button yes;
	private Button no;
	private Label messwar;
	BorderPane warr= new BorderPane();
	HBox warh= new HBox(15);
	VBox warvbox = new VBox(30);
	
WarningDelete(){
	messwar= new Label("Are You Sure TO Delete This Location "+"\n"+"Note : That all Martyrs will Delete !!");
	messwar.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,30));
	messwar.setTextFill(javafx.scene.paint.Color.YELLOW);
	
	yes=new Button("yes");
	yes.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
	yes.setStyle("-fx-border-color:yellow;-fx-border-width:8");
    yes.setMaxWidth(200);
    
    no = new Button("No");
    no.setStyle("-fx-border-color:yellow;-fx-border-width:8");
    no.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
    no.setMaxWidth(200);
    Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DataProject3/src/application/warrrphotot.jpg");
	 ImageView mg = new ImageView(m);
	 mg.setFitHeight(300);
	 mg.setFitWidth(550);
    
   warr.getChildren().add(mg);
//    warr.setCenter(messwar);
//    messwar.setAlignment(Pos.CENTER);
  
    
    warh.getChildren().addAll(yes,no);
	warh.setAlignment(Pos.CENTER);
	warr.setStyle("-fx-border-color:black ; -fx-border-width: 10");
	 warvbox.getChildren().addAll(messwar,warh);
	 warvbox.setAlignment(Pos.CENTER);
	 warr.setCenter(warvbox);
}

public Button getYes() {
	return yes;
}

public Button getNo() {
	return no;
}

public Label getMesswar() {
	return messwar;
}

public BorderPane getWarr() {
	return warr;
}

public HBox getWarh() {
	return warh;
}

public void setYes(Button yes) {
	this.yes = yes;
}

public void setNo(Button no) {
	this.no = no;
}

public void setMesswar(Label messwar) {
	this.messwar = messwar;
}

public void setWarr(BorderPane warr) {
	this.warr = warr;
}

public void setWarh(HBox warh) {
	this.warh = warh;
}

}
