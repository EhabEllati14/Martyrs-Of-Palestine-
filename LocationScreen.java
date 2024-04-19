package application;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class LocationScreen {

	private Button btl1,btl2,btl3,btl4,btl5,btl6,btl7,clearbut,add,update;
	 Stage stage2;
	 private ComboBox<String> combo ;
	
	private Label label1 ,labelup,labelinsrt;
	private TextField locattxt,textfieldup,textfieldinsrt ;
	private TableView<MartTable>  locatemarttab;
	
	HBox htop = new HBox(10);
	VBox vbox = new VBox(15);
	HBox fp = new HBox(40);
	LocationScreen(){
	combo= new ComboBox<>();
		add= new Button("Add");
		add.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		add.setStyle("-fx-border-color:black;-fx-border-width:2");
		labelup = new Label("Update To:");
		labelup.setTextFill(Color.WHITE);
		labelup.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		
		textfieldup= new TextField();
		textfieldinsrt= new TextField();
		
		labelinsrt= new Label("Insert location : ");
		labelinsrt.setTextFill(Color.WHITE);
		labelinsrt.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		clearbut= new Button("Clear");
		clearbut.setStyle("-fx-background-radius: 20%; " +
                "-fx-min-width: 40px; " +
                "-fx-min-height: 40px; " +
                "-fx-max-width: 100px; " +
                "-fx-max-height: 100px;"+"-fx-background-color:white; ");
		clearbut.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		
		 locatemarttab = new TableView<MartTable>();
		 
		 
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
							
locatemarttab.getColumns().addAll(namecolumn,agecolumn,datecolumn,gendercolumn,statuscolumn);

locatemarttab.setStyle("-fx-border-color:black; "+ "-fx-border-width:5;"+"-fx-font-family: Arial;"
+"-fx-font-size: 14px;");
locatemarttab.setMaxHeight(900);
locatemarttab.setMaxWidth(900);
		btl1= new Button("Insert");
		btl1.setStyle("-fx-background-radius: 20%; " +
                "-fx-min-width: 40px; " +
                "-fx-min-height: 40px; " +
                "-fx-max-width: 100px; " +
                "-fx-max-height: 100px;"+"-fx-background-color:white; ");
		btl1.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
	
	    
		update= new Button("Update");
		update.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		
	    btl2= new Button("Delete");
	    btl2.setStyle("-fx-background-radius: 20%; " +
                "-fx-min-width: 40px; " +
                "-fx-min-height: 40px; " +
                "-fx-max-width: 100px; " +
                "-fx-max-height: 100px;"+"-fx-background-color:white; ");
		btl2.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
	//    btl2.setMinSize(140, 50);
	    
	    btl3= new Button("Update");
	    btl3.setStyle("-fx-background-radius: 20%; " +
                "-fx-min-width: 40px; " +
                "-fx-min-height: 40px; " +
                "-fx-max-width: 100px; " +
                "-fx-max-height: 100px;"+"-fx-background-color:white; ");
		btl3.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
	//    btl3.setMinSize(140, 50);
	    
	    btl4= new Button("Search");
	    btl4.setStyle("-fx-background-radius: 20%; " +
                "-fx-min-width: 40px; " +
                "-fx-min-height: 40px; " +
                "-fx-max-width: 100px; " +
                "-fx-max-height: 100px;"+"-fx-background-color:white; ");
		btl4.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
	//    btl4.setMinSize(140, 50);
	    
	    btl5= new Button("Menu");
	    btl5.setStyle("-fx-background-radius: 20%; " +
                "-fx-min-width: 40px; " +
                "-fx-min-height: 40px; " +
                "-fx-max-width: 100px; " +
                "-fx-max-height: 100px;"+"-fx-background-color:white; ");
		btl5.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
	//    btl5.setMinSize(140, 50);
	    
	    btl6= new Button("Next");
	    btl6.setStyle("-fx-background-radius: 20%; " +
                "-fx-min-width: 80px; " +
                "-fx-min-height: 40px; " +
                "-fx-max-width: 100px; " +
                "-fx-max-height: 100px;"+"-fx-background-color:white; ");
		btl6.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
	
	    
	    btl7= new Button("Previous");
	    btl7.setStyle("-fx-background-radius: 20%; " +
                "-fx-min-width: 40px; " +
                "-fx-min-height: 40px; " +
                "-fx-max-width: 100px; " +
                "-fx-max-height: 100px;"+"-fx-background-color:white; ");
		btl7.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
	    vbox.getChildren().addAll(btl1,btl2,btl3,btl4,btl5,clearbut);
	    fp.getChildren().addAll(btl7,btl6);

	    label1=new Label("The Location : ");
	    label1.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,20));
	    label1.setTextFill(Color.WHITE);
	     locattxt=new TextField("LOCATION");
	     locattxt.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,16));
	     Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DataProject3/src/akaaphotot.jpg");
		 ImageView mg = new ImageView(m);
		 mg.setFitHeight(600);
		 mg.setFitWidth(1050);
	    border.getChildren().add(mg);
		htop.getChildren().addAll(label1,combo,labelup,textfieldup,update,labelinsrt,textfieldinsrt,add);
		border.setBottom(fp);
		fp.setAlignment(Pos.CENTER);
		border.setLeft(vbox);
		vbox.setAlignment(Pos.CENTER);
		border.setAlignment(vbox,Pos.CENTER);
		border.setTop(htop);
		border.setCenter( locatemarttab);
		htop.setAlignment(Pos.CENTER);
		
	  
	}
	
	public Button getUpdate() {
		return update;
	}
	public void setUpdate(Button update) {
		this.update = update;
	}
	public Button getAdd() {
		return add;
	}
	public void setAdd(Button add) {
		this.add = add;
	}
	public Label getLabelinsrt() {
		return labelinsrt;
	}
	public TextField getTextfieldinsrt() {
		return textfieldinsrt;
	}
	public void setLabelinsrt(Label labelinsrt) {
		this.labelinsrt = labelinsrt;
	}
	public void setTextfieldinsrt(TextField textfieldinsrt) {
		this.textfieldinsrt = textfieldinsrt;
	}
	public Button getBtl6() {
		return btl6;
	}
	public Button getBtl7() {
		return btl7;
	}
	public HBox getFp() {
		return fp;
	}
	public void setBtl6(Button btl6) {
		this.btl6 = btl6;
	}
	public void setBtl7(Button btl7) {
		this.btl7 = btl7;
	}
	public void setFp(HBox fp) {
		this.fp = fp;
	}
	BorderPane border = new BorderPane();
	
	public Button getBtl1() {
		return btl1;
	}
	public Button getBtl2() {
		return btl2;
	}
	public Button getBtl3() {
		return btl3;
	}
	public Button getBtl4() {
		return btl4;
	}
	public Button getBtl5() {
		return btl5;
	}
	public Label getLabel1() {
		return label1;
	}
	public HBox getHtop() {
		return htop;
	}
	//public HBox getHbuttom() {
	//	return hbuttom;
	//}
	
	public BorderPane getBorder() {
		return border;
	}
	public void setBtl1(Button btl1) {
		this.btl1 = btl1;
	}
	public void setBtl2(Button btl2) {
		this.btl2 = btl2;
	}
	public void setBtl3(Button btl3) {
		this.btl3 = btl3;
	}
	public void setBtl4(Button btl4) {
		this.btl4 = btl4;
	}
	public void setBtl5(Button btl5) {
		this.btl5 = btl5;
	}
	
	public void setLabel1(Label label1) {
		this.label1 = label1;
	}
	public void setHtop(HBox htop) {
		this.htop = htop;
	}
	//public void sethbuttom(HBox hbuttom) {
	//	this.hbuttom = hbuttom;
	//}
	public void setBorder(BorderPane border) {
		this.border = border;
	}
	public Button getClearbut() {
		return clearbut;
	}
	public void setClearbut(Button clearbut) {
		this.clearbut = clearbut;
	}
	public Label getLabelup() {
		return labelup;
	}
	public TextField getTextfieldup() {
		return textfieldup;
	}
	public void setLabelup(Label labelup) {
		this.labelup = labelup;
	}
	public void setTextfieldup(TextField textfieldup) {
		this.textfieldup = textfieldup;
	}
	public TableView<MartTable> getLocatemarttab() {
		return locatemarttab;
	}
	public void setLocatemarttab(TableView<MartTable> locatemarttab) {
		this.locatemarttab = locatemarttab;
	}
	public TextField getLocattxt() {
		return locattxt;
	}
	public void setLocattxt(TextField locattxt) {
		this.locattxt = locattxt;
	}
	public ComboBox<String> getCombo() {
		return combo;
	}

	public void setCombo(ComboBox<String> combo) {
		this.combo = combo;
	}

	
}
