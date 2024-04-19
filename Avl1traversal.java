package application;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
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

public class Avl1traversal {
	Stage stage9;
	private BorderPane avl1border = new BorderPane();
	private HBox hboxtop = new HBox(5);
	private HBox hboxnummart= new HBox(10);
	private HBox hboxheight = new HBox(10);
	private VBox vboxavl1 = new VBox(10);
	
	
	private Label locate, heightlabel, numlabel;
	private TextField heighttxt, numtxt;
	private TableView<MartTable> avl1table = new TableView<MartTable>();
	private Text locatetxt;
	private Button back;
	

	Avl1traversal() {
		locate = new Label("Location : ");
		locate.setStyle("-fx-border-color:white;-fx-border-width:2");
		locate.setTextFill(Color.WHITE);
		locate.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		locate.setMinWidth(100);

		heightlabel = new Label("Height : ");
		heightlabel.setStyle("-fx-border-color:white; -fx-border-width:2");
		heightlabel.setTextFill(Color.WHITE);
		heightlabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		heightlabel.setMinWidth(150);

		numlabel = new Label("Num Of Martyrs  : ");
		numlabel.setStyle("-fx-border-color:white;-fx-border-width:2");
		numlabel.setTextFill(Color.WHITE);
		numlabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		numlabel.setMinWidth(100);

		heighttxt = new TextField();
		heighttxt.setMaxSize(140, 140);
		heighttxt.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));

		numtxt = new TextField();
		numtxt.setMaxSize(140, 140);
		numtxt.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));

		TableColumn<MartTable, String> namecolumn = new TableColumn<MartTable, String>("~Name~");
		namecolumn.setCellValueFactory(new PropertyValueFactory<MartTable, String>("name"));

		TableColumn<MartTable, Integer> agecolumn = new TableColumn<MartTable, Integer>("~Age~");
		agecolumn.setCellValueFactory(new PropertyValueFactory<MartTable, Integer>("age"));

		TableColumn<MartTable, String> datecolumn = new TableColumn<MartTable, String>("~Date~");
		datecolumn.setCellValueFactory(new PropertyValueFactory<MartTable, String>("date"));

		TableColumn<MartTable, String> gendercolumn = new TableColumn<MartTable, String>("~Gender~");
		gendercolumn.setCellValueFactory(new PropertyValueFactory<MartTable, String>("gender"));

		TableColumn<MartTable, String> statuscolumn = new TableColumn<MartTable, String>("~Status~");
		statuscolumn.setCellValueFactory(new PropertyValueFactory<MartTable, String>("status"));

		avl1table.getColumns().addAll(namecolumn, agecolumn, datecolumn, gendercolumn, statuscolumn);

		avl1table.setStyle("-fx-border-color:black; "+ "-fx-border-width:5;"+"-fx-font-family: Arial;"
				+"-fx-font-size: 14px;");
		avl1table.setMaxHeight(800);
		avl1table.setMaxWidth(800);
		
		locatetxt= new Text();
		locatetxt.setFill(Color.WHITE);
		locatetxt.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		
		
		back = new Button("Back");
		back.setStyle("-fx-border-color:white;-fx-border-width:2");
		back.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,18));
		
		hboxtop.getChildren().addAll(locate,locatetxt);
		hboxtop.setAlignment(Pos.CENTER);
		
		hboxnummart.getChildren().addAll(numlabel,numtxt);
		hboxnummart.setAlignment(Pos.CENTER);
		
		hboxheight.getChildren().addAll(heightlabel,heighttxt);
		hboxheight.setAlignment(Pos.CENTER);
		
		 Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DataProject3/src/avl1avl2background.jpg");
		   ImageView mg = new ImageView(m);
		   mg.setFitHeight(600);
		     mg.setFitWidth(1200);
		   
		     avl1border.getChildren().add(mg);
		
		
		avl1border.setTop(hboxtop);
		avl1border.setAlignment(hboxtop, Pos.CENTER);
		
		vboxavl1.getChildren().addAll(avl1table,hboxheight,hboxnummart);
		vboxavl1.setAlignment(Pos.CENTER);
		
		avl1border.setCenter(vboxavl1);
		avl1border.setAlignment(vboxavl1, Pos.CENTER);
		
		avl1border.setBottom(back);
		
		
	}


	public BorderPane getAvl1border() {
		return avl1border;
	}


	public HBox getHboxtop() {
		return hboxtop;
	}


	public HBox getHboxnummart() {
		return hboxnummart;
	}


	public HBox getHboxheight() {
		return hboxheight;
	}


	public VBox getVboxavl1() {
		return vboxavl1;
	}


	public Label getLocate() {
		return locate;
	}


	public Label getHeightlabel() {
		return heightlabel;
	}


	public Label getNumlabel() {
		return numlabel;
	}


	public TextField getHeighttxt() {
		return heighttxt;
	}


	public TextField getNumtxt() {
		return numtxt;
	}


	public TableView<MartTable> getAvl1table() {
		return avl1table;
	}


	public Text getLocatetxt() {
		return locatetxt;
	}


	public Button getBack() {
		return back;
	}


	public void setAvl1border(BorderPane avl1border) {
		this.avl1border = avl1border;
	}


	public void setHboxtop(HBox hboxtop) {
		this.hboxtop = hboxtop;
	}


	public void setHboxnummart(HBox hboxnummart) {
		this.hboxnummart = hboxnummart;
	}


	public void setHboxheight(HBox hboxheight) {
		this.hboxheight = hboxheight;
	}


	public void setVboxavl1(VBox vboxavl1) {
		this.vboxavl1 = vboxavl1;
	}


	public void setLocate(Label locate) {
		this.locate = locate;
	}


	public void setHeightlabel(Label heightlabel) {
		this.heightlabel = heightlabel;
	}


	public void setNumlabel(Label numlabel) {
		this.numlabel = numlabel;
	}


	public void setHeighttxt(TextField heighttxt) {
		this.heighttxt = heighttxt;
	}


	public void setNumtxt(TextField numtxt) {
		this.numtxt = numtxt;
	}


	public void setAvl1table(TableView<MartTable> avl1table) {
		this.avl1table = avl1table;
	}


	public void setLocatetxt(Text locatetxt) {
		this.locatetxt = locatetxt;
	}


	public void setBack(Button back) {
		this.back = back;
	}
	

}
