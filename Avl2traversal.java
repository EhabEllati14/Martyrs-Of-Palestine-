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

public class Avl2traversal {
	Stage stage10;
	private BorderPane avl2border = new BorderPane();
	private HBox hboxtop = new HBox(5);
	private HBox hboxnummart= new HBox(10);
	private HBox hboxheight = new HBox(10);
	private HBox hboxdate = new HBox(10);
	private VBox vboxavl2 = new VBox(10);
	
	
	private Label locate, heightlabel, numlabel,datelabel;
	private TextField heighttxt, numtxt,datetxt;
	private TableView<MartTable> avl2table = new TableView<MartTable>();
	private Text locatetxt;
	private Button back;
	
	Avl2traversal(){
		locate = new Label("Location : ");
		locate.setStyle("-fx-border-color:white;-fx-border-width:2");
		locate.setTextFill(Color.WHITE);
		locate.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		locate.setMinWidth(100);

		heightlabel = new Label("Height : ");
		heightlabel.setStyle("-fx-border-color:white; -fx-border-width:2");
		heightlabel.setTextFill(Color.WHITE);
		heightlabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		heightlabel.setMinWidth(200);

		numlabel = new Label("Num Of Martyrs  : ");
		numlabel.setStyle("-fx-border-color:white;-fx-border-width:2");
		numlabel.setTextFill(Color.WHITE);
		numlabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		numlabel.setMinWidth(200);
		
		datelabel = new Label("Max Date Death : ");
		datelabel.setStyle("-fx-border-color:white;-fx-border-width:2");
		datelabel.setTextFill(Color.WHITE);
		datelabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		datelabel.setMinWidth(200);

		heighttxt = new TextField();
		heighttxt.setMaxSize(140, 140);
		heighttxt.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 20));

		numtxt = new TextField();
		numtxt.setMaxSize(140, 140);
		numtxt.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		
		datetxt = new TextField();
		datetxt.setMaxSize(140, 140);
		datetxt.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		
		

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

		avl2table.setStyle("-fx-border-color:black; "+ "-fx-border-width:5;"+"-fx-font-family: Arial;"
				+"-fx-font-size: 14px;");
		avl2table.getColumns().addAll(namecolumn, agecolumn, datecolumn, gendercolumn, statuscolumn);

		avl2table.setMaxHeight(800);
		avl2table.setMaxWidth(800);
		
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
		
		hboxdate.getChildren().addAll(datelabel,datetxt);
		hboxdate.setAlignment(Pos.CENTER);
		
		 Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DataProject3/src/avl1avl2background.jpg");
		   ImageView mg = new ImageView(m);
		   mg.setFitHeight(600);
		     mg.setFitWidth(1200);
		   
		     avl2border.getChildren().add(mg);
		
		
		avl2border.setTop(hboxtop);
		avl2border.setAlignment(hboxtop, Pos.CENTER);
		
		vboxavl2.getChildren().addAll(avl2table,hboxheight,hboxnummart,hboxdate);
		vboxavl2.setAlignment(Pos.CENTER);
		
		avl2border.setCenter(vboxavl2);
		avl2border.setAlignment(vboxavl2, Pos.CENTER);
		
		avl2border.setBottom(back);
	}

	public BorderPane getAvl2border() {
		return avl2border;
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

	public HBox getHboxdate() {
		return hboxdate;
	}

	public VBox getVboxavl2() {
		return vboxavl2;
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

	public Label getDatelabel() {
		return datelabel;
	}

	public TextField getHeighttxt() {
		return heighttxt;
	}

	public TextField getNumtxt() {
		return numtxt;
	}

	public TextField getDatetxt() {
		return datetxt;
	}

	public TableView<MartTable> getAvl2table() {
		return avl2table;
	}

	public Text getLocatetxt() {
		return locatetxt;
	}

	public Button getBack() {
		return back;
	}

	public void setAvl2border(BorderPane avl2border) {
		this.avl2border = avl2border;
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

	public void setHboxdate(HBox hboxdate) {
		this.hboxdate = hboxdate;
	}

	public void setVboxavl2(VBox vboxavl2) {
		this.vboxavl2 = vboxavl2;
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

	public void setDatelabel(Label datelabel) {
		this.datelabel = datelabel;
	}

	public void setHeighttxt(TextField heighttxt) {
		this.heighttxt = heighttxt;
	}

	public void setNumtxt(TextField numtxt) {
		this.numtxt = numtxt;
	}

	public void setDatetxt(TextField datetxt) {
		this.datetxt = datetxt;
	}

	public void setAvl2table(TableView<MartTable> avl2table) {
		this.avl2table = avl2table;
	}

	public void setLocatetxt(Text locatetxt) {
		this.locatetxt = locatetxt;
	}

	public void setBack(Button back) {
		this.back = back;
	}
	
	
}
