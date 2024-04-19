package application;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StatisticScreen {
	Stage stage8;
	private BorderPane statborder= new BorderPane();
	private HBox stathboxtop = new HBox(5);
	private HBox stathboxbottom = new HBox(10);
	private VBox statvbox = new VBox(15);
	private Label location,messgstat;
	private Text locatetxt,note1,note2;
	private Button avl1button,avl2button,mainpage;
	
	StatisticScreen(){
		avl1button= new Button ("Traversal AVL1");
			avl1button.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,18));
		   avl1button.setMaxWidth(200);
		   
		   avl2button= new Button ("Traversal AVL2");
			avl2button.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,18));
		   avl2button.setMaxWidth(200);
		  
		   location = new Label("Location : ");
		   location.setStyle("-fx-border-color:white;-fx-border-width:2");
		   location.setTextFill(Color.WHITE);
		   location.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		   location.setMinWidth(100);
		   
		   messgstat = new Label("Choose One Of The Options To Print The Martyrs !!");
		   messgstat.setStyle("-fx-border-color:black;-fx-border-width:2");
		   messgstat.setTextFill(Color.BLACK);
		   messgstat.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,25));
		   messgstat.setMinWidth(200);
		   
		   locatetxt = new Text();
		   locatetxt.setFill(Color.WHITE);
		   locatetxt.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		   
		   note1 = new Text("~NOTE : AVL1 Print The Martyrs Sorted By Names .");
		   note1.setFill(Color.BLACK);
		   note1.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 25));
		   
		   note2 = new Text("~NOTE : AVL2 Print The Martyrs Sorted By Dates .");
		   note2.setFill(Color.BLACK);
		   note2.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 25));
		   
		   mainpage= new Button ("MainPage");
		   mainpage.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,18));
		   mainpage.setMaxWidth(200);
		   Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DataProject3/src/oldold.jpg");
		   ImageView mg = new ImageView(m);
		   mg.setFitHeight(600);
		     mg.setFitWidth(1200);
		   
		   statborder.getChildren().add(mg);
		stathboxtop.getChildren().addAll(location,locatetxt);
		stathboxtop.setAlignment(Pos.CENTER);
		
		stathboxbottom.getChildren().addAll(avl1button, avl2button);
		stathboxbottom.setAlignment(Pos.CENTER);
		
		statvbox.getChildren().addAll(messgstat,note1,note2,stathboxbottom);
		statvbox.setAlignment(Pos.CENTER);
		
		statborder.setTop(stathboxtop);
		statborder.setCenter(statvbox);
		statborder.setBottom(mainpage);
		
		   
	}

	public Stage getStage8() {
		return stage8;
	}

	public BorderPane getStatborder() {
		return statborder;
	}

	public HBox getStathboxtop() {
		return stathboxtop;
	}

	public HBox getStathboxbottom() {
		return stathboxbottom;
	}

	public VBox getStatvbox() {
		return statvbox;
	}

	public Label getLocation() {
		return location;
	}

	public Label getMessgstat() {
		return messgstat;
	}

	public Text getLocatetxt() {
		return locatetxt;
	}

	public Text getNote1() {
		return note1;
	}

	public Text getNote2() {
		return note2;
	}

	public Button getAvl1button() {
		return avl1button;
	}

	public Button getAvl2button() {
		return avl2button;
	}

	public Button getMainpage() {
		return mainpage;
	}

	public void setStage8(Stage stage8) {
		this.stage8 = stage8;
	}

	public void setStatborder(BorderPane statborder) {
		this.statborder = statborder;
	}

	public void setStathboxtop(HBox stathboxtop) {
		this.stathboxtop = stathboxtop;
	}

	public void setStathboxbottom(HBox stathboxbottom) {
		this.stathboxbottom = stathboxbottom;
	}

	public void setStatvbox(VBox statvbox) {
		this.statvbox = statvbox;
	}

	public void setLocation(Label location) {
		this.location = location;
	}

	public void setMessgstat(Label messgstat) {
		this.messgstat = messgstat;
	}

	public void setLocatetxt(Text locatetxt) {
		this.locatetxt = locatetxt;
	}

	public void setNote1(Text note1) {
		this.note1 = note1;
	}

	public void setNote2(Text note2) {
		this.note2 = note2;
	}

	public void setAvl1button(Button avl1button) {
		this.avl1button = avl1button;
	}

	public void setAvl2button(Button avl2button) {
		this.avl2button = avl2button;
	}

	public void setMainpage(Button mainpage) {
		this.mainpage = mainpage;
	}

}
