package application;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Chooseone {
	private BorderPane chooseborder = new BorderPane();
	private VBox choosev= new VBox(15);
	private Text choosetxt;
	private Button ok;
	Stage stage11;
	
	
	Chooseone(){
		choosetxt= new Text("Please Select a Martyrs From The Table To Visible !!");
		choosetxt.setFill(Color.WHITE);
		choosetxt.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 20));
		
		ok = new Button("OK");
		ok.setAlignment(Pos.CENTER);
	    ok.setStyle("-fx-border-color:black;-fx-border-width:2");
		ok.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		
		choosev.getChildren().addAll(choosetxt,ok);
		choosev.setAlignment(Pos.CENTER);
		
		Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/ProjectData2/src/warwarwar.jpeg");
		 ImageView mg = new ImageView(m);
		 mg.setFitHeight(200);
		 mg.setFitWidth(450);
		chooseborder.getChildren().add(mg);
		chooseborder.setCenter(choosev);
	}
	public BorderPane getChooseborder() {
		return chooseborder;
	}

	public VBox getChoosev() {
		return choosev;
	}

	public Text getChoosetxt() {
		return choosetxt;
	}

	public Button getOk() {
		return ok;
	}

	public void setChooseborder(BorderPane chooseborder) {
		this.chooseborder = chooseborder;
	}

	public void setChoosev(VBox choosev) {
		this.choosev = choosev;
	}

	public void setChoosetxt(Text choosetxt) {
		this.choosetxt = choosetxt;
	}

	public void setOk(Button ok) {
		this.ok = ok;
	}

}
