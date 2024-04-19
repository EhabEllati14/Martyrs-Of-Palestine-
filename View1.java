package application;

import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class View1 {
	private Button bt1, bt2, bt3, bt4, bt5,bt6;
	private Text txt1;
	private Label options;
	public Label getOptions() {
		return options;
	}
	public void setOptions(Label options) {
		this.options = options;
	}
	Stage stage1;
	Group group = new Group();
	
	View1(){
		options= new Label("~Choose One Of The Options :- ");
		options.setTextFill(Color.WHITE);
		options.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 40));
		options.setLayoutX(650);
		options.setLayoutY(190);
		VBox vertical = new VBox(20);
		
		bt1=new Button("Location Screen");
		bt1.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		bt1.setMinSize(150, 50);
		bt1.setStyle(
		        "-fx-background-radius: 10em; " +
		                "-fx-min-width: 160px; " +
		                "-fx-min-height: 40px; " +
		                "-fx-max-width: 200px; " +
		                "-fx-max-height: 100px; " +"-fx-background-color: white;"
		        );
		//bt1.setStyle("-fx-background-color: white");
		
		bt2= new Button("Martyrs Screen");
		bt2.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		bt2.setMinSize(150, 50);
		bt2.setStyle(
		        "-fx-background-radius: 10em; " +
		                "-fx-min-width: 160px; " +
		                "-fx-min-height: 40px; " +
		                "-fx-max-width: 200px; " +
		                "-fx-max-height: 100px; " +"-fx-background-color: white;"
		        );
		
		bt3= new Button ("Statistics Screen ");
		bt3.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		bt3.setMinSize(150, 50);
		bt3.setStyle(
		        "-fx-background-radius: 10em; " +
		                "-fx-min-width: 160px; " +
		                "-fx-min-height: 40px; " +
		                "-fx-max-width: 200px; " +
		                "-fx-max-height: 100px; " +"-fx-background-color: white;"
		        );
		
		bt4=new Button("Save");
		bt4.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		bt4.setMinSize(150, 50);
		bt4.setStyle(
		        "-fx-background-radius: 10em; " +
		                "-fx-min-width: 160px; " +
		                "-fx-min-height: 40px; " +
		                "-fx-max-width: 200px; " +
		                "-fx-max-height: 100px; " +"-fx-background-color: white;"
		        );
		
		bt5=new Button("Report");
		bt5.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		bt5.setMinSize(150, 50);
		bt5.setStyle(
		        "-fx-background-radius: 10em; " +
		                "-fx-min-width: 160px; " +
		                "-fx-min-height: 40px; " +
		                "-fx-max-width: 200px; " +
		                "-fx-max-height: 100px; " +"-fx-background-color: white;"
		        );
		bt6= new Button("Choose File !");
		bt6.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		bt6.setMinSize(150, 50);
		bt6.setStyle(
		        "-fx-background-radius: 10em; " +
		                "-fx-min-width: 160px; " +
		                "-fx-min-height: 40px; " +
		                "-fx-max-width: 200px; " +
		                "-fx-max-height: 100px; " +"-fx-background-color: white;"
		        );
		
		
		 txt1=new Text("~Martyrs Of Palestine~");
		 txt1.setFill(Color.WHITE);
		 txt1.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 90));
		 txt1.setLayoutX(140);
		 txt1.setLayoutY(150);
		 
		 vertical.getChildren().addAll(bt1,bt2,bt3,bt4,bt5,bt6);
		 vertical.setLayoutX(1000);
		 vertical.setLayoutY(250);
		 Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DataProject3/src/akaaphotot.jpg");
		 ImageView mg = new ImageView(m);
		 mg.setFitHeight(600);
		 mg.setFitWidth(1300);
		 group.getChildren().addAll(mg,txt1,options,vertical);
	}
	public Button getBt6() {
		return bt6;
	}
	public void setBt6(Button bt6) {
		this.bt6 = bt6;
	}
	public Button getBt1() {
		return bt1;
	}
	public Button getBt2() {
		return bt2;
	}
	public Button getBt3() {
		return bt3;
	}
	public Button getBt4() {
		return bt4;
	}
	public Button getBt5() {
		return bt5;
	}
	public Text getTxt1() {
		return txt1;
	}
	public Group getGroup() {
		return group;
	}
	public void setBt1(Button bt1) {
		this.bt1 = bt1;
	}
	public void setBt2(Button bt2) {
		this.bt2 = bt2;
	}
	public void setBt3(Button bt3) {
		this.bt3 = bt3;
	}
	public void setBt4(Button bt4) {
		this.bt4 = bt4;
	}
	public void setBt5(Button bt5) {
		this.bt5 = bt5;
	}
	public void setTxt1(Text txt1) {
		this.txt1 = txt1;
	}
	public void setGroup(Group group) {
		this.group = group;
	}

}
