package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MartyrsScreen {
	 Stage stage4;
	private Button inseret,update,delete,main,nex,prev,search,updatefin,searchbut;
	private TextField searchtxt;
	private Label searchlab;
	private HBox hboxmartyrs1= new HBox(5);
	private HBox hboxmartyrs2= new HBox(40);
	private VBox vbox = new VBox(20);
	private BorderPane bordermartyrs = new BorderPane();
	private TableView<MartTable> martyrstable= new TableView<MartTable>(); 
	private ComboBox<String> combo= new ComboBox<String>();
	private Label locate ;
	MartyrsScreen(){
		
		locate = new Label("The Location : ");
		locate.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,20));
		locate.setTextFill(Color.WHITE);
		TableColumn<MartTable, String> name1column = new TableColumn<MartTable, String>("~Name~");
		name1column.setCellValueFactory(new PropertyValueFactory<MartTable, String>("name"));
		
		 TableColumn<MartTable, Integer> age1column = new TableColumn<MartTable, Integer>("~Age~");
			age1column.setCellValueFactory(new PropertyValueFactory<MartTable, Integer>("age"));
			
			 TableColumn<MartTable, String> date1column = new TableColumn<MartTable, String>("~Date~");
				date1column.setCellValueFactory(new PropertyValueFactory<MartTable, String>("date"));
				
				 TableColumn<MartTable, String> gender1column = new TableColumn<MartTable, String>("~Gender~");
					gender1column.setCellValueFactory(new PropertyValueFactory<MartTable, String>("gender"));
					
					 TableColumn<MartTable, String> status1column = new TableColumn<MartTable, String>("~Status~");
						status1column.setCellValueFactory(new PropertyValueFactory<MartTable, String>("status"));
						
martyrstable.getColumns().addAll(name1column,age1column,date1column,gender1column,status1column);
martyrstable.setMaxHeight(1000);
martyrstable.setMaxWidth(1000);
martyrstable.setStyle("-fx-border-color:black; "+ "-fx-border-width:5;"+"-fx-font-family: Arial;"
		+"-fx-font-size: 14px;");

		

searchlab = new Label("Search by Name :");
searchlab.setTextFill(Color.WHITE);
searchlab.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		updatefin = new Button("Update");
		updatefin.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,18));
		updatefin.setMaxWidth(200);
		updatefin.setStyle("-fx-background-radius: 20%; " +
                "-fx-min-width: 80px; " +
                "-fx-min-height: 40px; " +
                "-fx-max-width: 100px; " +
                "-fx-max-height: 100px;"+"-fx-background-color:white; ");
		
	    
		inseret= new Button("Insert");
		inseret.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,18));
	    inseret.setMaxWidth(200);
	    inseret.setStyle("-fx-background-radius: 20%; " +
                "-fx-min-width: 80px; " +
                "-fx-min-height: 40px; " +
                "-fx-max-width: 100px; " +
                "-fx-max-height: 100px;"+"-fx-background-color:white; ");
	    
	    searchbut= new Button("Search");
	    searchbut.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,18));
	    searchbut.setMaxWidth(200);
	    searchbut.setStyle("-fx-background-radius: 20%; " +
                "-fx-min-width: 80px; " +
                "-fx-min-height: 40px; " +
                "-fx-max-width: 100px; " +
                "-fx-max-height: 100px;"+"-fx-background-color:white; ");
	    
	    update= new Button("Update");
	    update.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,18));
	    update.setMaxWidth(200);
	    update.setStyle("-fx-background-radius: 20%; " +
                "-fx-min-width: 80px; " +
                "-fx-min-height: 40px; " +
                "-fx-max-width: 100px; " +
                "-fx-max-height: 100px;"+"-fx-background-color:white; ");
	    
	    delete= new Button("Delete");
	    delete.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,18));
	    delete.setMaxWidth(200);
	    delete.setStyle("-fx-background-radius: 20%; " +
                "-fx-min-width: 80px; " +
                "-fx-min-height: 40px; " +
                "-fx-max-width: 100px; " +
                "-fx-max-height: 100px;"+"-fx-background-color:white; ");
	    
	    main=new Button("Menu");
	    main.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,18));
	    main.setMaxWidth(200);
	    main.setStyle("-fx-background-radius: 20%; " +
                "-fx-min-width: 80px; " +
                "-fx-min-height: 40px; " +
                "-fx-max-width: 100px; " +
                "-fx-max-height: 100px;"+"-fx-background-color:white; ");
	    
	    nex= new Button("Next");
	    nex.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,18));
	    nex.setStyle("-fx-background-radius: 20%; " +
                "-fx-min-width: 80px; " +
                "-fx-min-height: 40px; " +
                "-fx-max-width: 100px; " +
                "-fx-max-height: 100px;"+"-fx-background-color:white; ");
	    nex.setMaxWidth(200);
	    
	    prev= new Button("Previous");
	    prev.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,18));
	    prev.setMaxWidth(200);
	    prev.setStyle("-fx-background-radius: 20%; " +
                "-fx-min-width: 80px; " +
                "-fx-min-height: 40px; " +
                "-fx-max-width: 100px; " +
                "-fx-max-height: 100px;"+"-fx-background-color:white; ");
	    
	    search= new Button("Search");
	    search.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,18));
	    search.setMaxWidth(200);
	    search.setStyle("-fx-background-radius: 20%; " +
                "-fx-min-width: 80px; " +
                "-fx-min-height: 40px; " +
                "-fx-max-width: 100px; " +
                "-fx-max-height: 100px;"+"-fx-background-color:white; ");
	    
	    searchtxt= new TextField("Location");
	    searchtxt.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,18));
	    searchtxt.setMaxWidth(200);
	    searchtxt.setMaxHeight(200);

	   Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DataProject3/src/akaaphotot.jpg");
		 ImageView mg = new ImageView(m);
		 mg.setFitHeight(600);
		 mg.setFitWidth(1200);
	 
	 
	   
	   hboxmartyrs1.getChildren().addAll(locate,combo,searchbut,searchtxt);
	   hboxmartyrs2.getChildren().addAll(prev,nex);
	   vbox.getChildren().addAll(inseret,delete,update,search,main);
	   bordermartyrs.getChildren().add(mg);
	   bordermartyrs.setTop(hboxmartyrs1);
	   hboxmartyrs1.setAlignment(Pos.CENTER);
	   bordermartyrs.setLeft(vbox);
	   bordermartyrs.setAlignment(vbox, Pos.CENTER);
	   vbox.setAlignment(Pos.CENTER);
	   bordermartyrs.setBottom(hboxmartyrs2);
	   hboxmartyrs2.setAlignment(Pos.CENTER);
	   
	   bordermartyrs.setCenter(martyrstable);
	   
	
	   
	    
		}
	public Label getSearchlab() {
		return searchlab;
	}




	public void setSearchlab(Label searchlab) {
		this.searchlab = searchlab;
	}

	

	
	public Button getSearchbut() {
		return searchbut;
	}




	public TextField getSearchtxt() {
		return searchtxt;
	}




	public void setSearchbut(Button searchbut) {
		this.searchbut = searchbut;
	}




	public void setSearchtxt(TextField searchtxt) {
		this.searchtxt = searchtxt;
	}




	public ComboBox<String> getCombo() {
		return combo;
	}




	public void setCombo(ComboBox<String> combo) {
		this.combo = combo;
	}




	public TableView<MartTable> getMartyrstable() {
		return martyrstable;
	}




	public void setMartyrstable(TableView<MartTable> martyrstable) {
		this.martyrstable = martyrstable;
	}




	public Button getSearch() {
		return search;
	}

	
	public Button getUpdatefin() {
		return updatefin;
	}



	public void setUpdatefin(Button updatefin) {
		this.updatefin = updatefin;
	}



	public void setSearch(Button search) {
		this.search = search;
	}

	public Button getInseret() {
		return inseret;
	}

	public Button getUpdate() {
		return update;
	}

	public Button getDelete() {
		return delete;
	}

	public Button getMain() {
		return main;
	}

	public Button getNex() {
		return nex;
	}

	public Button getPrev() {
		return prev;
	}

	public HBox getHboxmartyrs1() {
		return hboxmartyrs1;
	}

	public HBox getHboxmartyrs2() {
		return hboxmartyrs2;
	}

	public BorderPane getBordermartyrs() {
		return bordermartyrs;
	}

	

	public void setInseret(Button inseret) {
		this.inseret = inseret;
	}

	public void setUpdate(Button update) {
		this.update = update;
	}

	public void setDelete(Button delete) {
		this.delete = delete;
	}

	public void setMain(Button main) {
		this.main = main;
	}

	public void setNex(Button nex) {
		this.nex = nex;
	}

	public void setPrev(Button prev) {
		this.prev = prev;
	}

	public void setHboxmartyrs1(HBox hboxmartyrs1) {
		this.hboxmartyrs1 = hboxmartyrs1;
	}

	public void setHboxmartyrs2(HBox hboxmartyrs2) {
		this.hboxmartyrs2 = hboxmartyrs2;
	}

	public void setBordermartyrs(BorderPane bordermartyrs) {
		this.bordermartyrs = bordermartyrs;
	}
	
	

}
