package application;

import java.awt.Insets;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
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
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class UpdateScreen {
	Stage stage7;
	private BorderPane updateborder= new BorderPane();
    private GridPane updategrid = new GridPane();
    private HBox hboxbottom = new HBox(10);
    private HBox hboxtop = new HBox(10);
    private VBox vboxup = new VBox(10);
	private Button updatebut,yes,no;
	private ComboBox <String> gendercombo;
	private ComboBox<String> statuscombo;
	private Label location,name,age,dateofdeath,gender,status;
	private TextField nametxt,datetxt,agetxt;
	private Text locatetxt,messg,messgup;
	private RadioButton nameradio,ageradio,dateradio,genderradio,statusradio;
	UpdateScreen(){
		
		gendercombo= new ComboBox<>();
		String[] s = { "Male", "Female" };
		// we use the observ. list to put the string array inside the combo. 
		ObservableList<String> items = FXCollections.observableArrayList(s);
		gendercombo.getItems().addAll(items);
		gendercombo.setEditable(true);
		gendercombo.setMaxSize(200, 200);
		gendercombo.setPrefSize(40, 40);
		
		statuscombo= new ComboBox<>();
		String[] s1 = { "Single", "Married" };
		// we use the observ. list to put the string array inside the combo. 
		ObservableList<String> items2 = FXCollections.observableArrayList(s1);
		statuscombo.getItems().addAll(items2);
		statuscombo.setEditable(true);
		statuscombo.setMaxSize(200, 200);
		statuscombo.setPrefSize(40, 40);
		
		location = new Label("Location : ");
		location.setStyle("-fx-border-color:white;-fx-border-width:2");
		location.setTextFill(Color.WHITE);
		location.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		location.setMinWidth(100);
		
		
		
		name = new Label("Name : ");
		name.setStyle("-fx-border-color:white;-fx-border-width:2");
		name.setTextFill(Color.WHITE);
		name.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		name.setMinWidth(200);
		
		age = new Label("Age : ");
		age.setStyle("-fx-border-color:white;-fx-border-width:2");
		age.setTextFill(Color.WHITE);
		age.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		age.setMinWidth(200);
		
		
		dateofdeath = new Label("Date Of Death : ");
		dateofdeath.setStyle("-fx-border-color:white;-fx-border-width:2");
		dateofdeath.setTextFill(Color.WHITE);
		dateofdeath.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		dateofdeath.setMinWidth(200);
		
		gender = new Label("Gender : ");
		gender.setStyle("-fx-border-color:white;-fx-border-width:2");
		gender.setTextFill(Color.WHITE);
		gender.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		gender.setMinWidth(200);
		
		
		status = new Label("Gender : ");
		status.setStyle("-fx-border-color:white;-fx-border-width:2");
		status.setTextFill(Color.WHITE);
		status.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		status.setMinWidth(200);
		
		
		nametxt=new TextField();
		nametxt.setMaxSize(140, 140);
		nametxt.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,20));
		
		agetxt=new TextField();
		agetxt.setMaxSize(140, 140);
		agetxt.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,20));
		
		datetxt=new TextField();
		datetxt.setMaxSize(140, 140);
		datetxt.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,20));
		
		updatebut = new Button("Update");
		updatebut.setStyle("-fx-border-color:white;-fx-border-width:2");
		updatebut.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		
		yes = new Button("Yes");
		yes.setStyle("-fx-border-color:white;-fx-border-width:2");
		yes.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		
		no = new Button("No");
		no.setStyle("-fx-border-color:white;-fx-border-width:2");
		no.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		
		locatetxt= new Text();
		locatetxt.setFill(Color.WHITE);
		locatetxt.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 20));
		
		
		messg= new Text("Choose One Of The Options To Visbile Write !");
		messg.setFill(Color.WHITE);
		messg.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 20));
		
		messgup= new Text("Are You Sure To Update : ");
		messgup.setFill(Color.WHITE);
		messgup.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 20));
		
		nameradio = new RadioButton("Name");
		nameradio.setTextFill(Color.WHITE);
		nameradio.setMaxSize(100, 100);
		nameradio.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		
		ageradio = new RadioButton("Age");
		ageradio.setTextFill(Color.WHITE);
		ageradio.setMaxSize(100, 100);
		ageradio.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		
		dateradio = new RadioButton("Date");
		dateradio.setTextFill(Color.WHITE);
		dateradio.setMaxSize(100, 100);
		dateradio.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		
		genderradio = new RadioButton("Gender");
		genderradio.setTextFill(Color.WHITE);
		genderradio.setMaxSize(100, 100);
		genderradio.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		
		statusradio = new RadioButton("Status");
		statusradio.setTextFill(Color.WHITE);
		statusradio.setMaxSize(100, 100);
		statusradio.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		
		
		updategrid.add(name, 0, 0);
		updategrid.add(age, 0, 1);
		updategrid.add(dateofdeath, 0, 2);
		updategrid.add(gender, 0, 3);
		updategrid.add(status, 0, 4);
		updategrid.add(nametxt, 1, 0);
		updategrid.add(agetxt, 1, 1);
		updategrid.add(datetxt, 1, 2);
		updategrid.add(gendercombo, 1, 3);
		updategrid.add(statuscombo, 1, 4);
		updategrid.add(messg, 2, 0);
		updategrid.add(nameradio, 2, 1);
		updategrid.add(ageradio, 2, 2);
		updategrid.add(dateradio, 2, 3);
		updategrid.add(genderradio, 2, 4);
		updategrid.add(statusradio, 2, 5);
		updategrid.add(updatebut, 2, 6);
		
		updategrid.setHgap(15);
		updategrid.setVgap(15);
		//updategrid.setPadding(new Insets(15,15,15,15));
		
		hboxtop.getChildren().addAll(location,locatetxt);
		hboxtop.setAlignment(Pos.CENTER);
		
		hboxbottom.getChildren().addAll(yes,no);
		hboxbottom.setAlignment(Pos.CENTER);
		vboxup.getChildren().addAll(messgup,hboxbottom);
		vboxup.setAlignment(Pos.CENTER);
		
		 Image img = new Image("file:///C:/Users/Ehab/eclipse-workspace/DataProject3/src/insert.jpg");
	     ImageView view = new ImageView(img);
	     view.setFitHeight(500);
	     view.setFitWidth(900);
		
	     updateborder.getChildren().add(view);
		updateborder.setTop(hboxtop);
		updateborder.setCenter(updategrid);
		updateborder.setBottom(vboxup);
		
		
		
		
		
	}
	  public HBox getHboxbottom() {
			return hboxbottom;
		}
		public HBox getHboxtop() {
			return hboxtop;
		}
		public VBox getVboxup() {
			return vboxup;
		}
		public Button getUpdatebut() {
			return updatebut;
		}
		public Button getYes() {
			return yes;
		}
		public Button getNo() {
			return no;
		}
		public Text getMessgup() {
			return messgup;
		}
		public RadioButton getStatusradio() {
			return statusradio;
		}
		public void setHboxbottom(HBox hboxbottom) {
			this.hboxbottom = hboxbottom;
		}
		public void setHboxtop(HBox hboxtop) {
			this.hboxtop = hboxtop;
		}
		public void setVboxup(VBox vboxup) {
			this.vboxup = vboxup;
		}
		public void setUpdatebut(Button updatebut) {
			this.updatebut = updatebut;
		}
		public void setYes(Button yes) {
			this.yes = yes;
		}
		public void setNo(Button no) {
			this.no = no;
		}
		public void setMessgup(Text messgup) {
			this.messgup = messgup;
		}
		public void setStatusradio(RadioButton statusradio) {
			this.statusradio = statusradio;
		}
	public BorderPane getUpdateborder() {
		return updateborder;
	}
	public GridPane getUpdategrid() {
		return updategrid;
	}
	public ComboBox<String> getGendercombo() {
		return gendercombo;
	}
	public ComboBox<String> getStatuscombo() {
		return statuscombo;
	}
	public Label getLocation() {
		return location;
	}
	public Label getName() {
		return name;
	}
	public Label getAge() {
		return age;
	}
	public Label getDateofdeath() {
		return dateofdeath;
	}
	public Label getGender() {
		return gender;
	}
	public Label getStatus() {
		return status;
	}
	public TextField getNametxt() {
		return nametxt;
	}
	public TextField getDatetxt() {
		return datetxt;
	}
	public TextField getAgetxt() {
		return agetxt;
	}
	public Text getLocatetxt() {
		return locatetxt;
	}
	public Text getMessg() {
		return messg;
	}
	public RadioButton getNameradio() {
		return nameradio;
	}
	public RadioButton getAgeradio() {
		return ageradio;
	}
	public RadioButton getDateradio() {
		return dateradio;
	}
	public RadioButton getGenderradio() {
		return genderradio;
	}
	
	public void setUpdateborder(BorderPane updateborder) {
		this.updateborder = updateborder;
	}
	public void setUpdategrid(GridPane updategrid) {
		this.updategrid = updategrid;
	}
	public void setGendercombo(ComboBox<String> gendercombo) {
		this.gendercombo = gendercombo;
	}
	public void setStatuscombo(ComboBox<String> statuscombo) {
		this.statuscombo = statuscombo;
	}
	public void setLocation(Label location) {
		this.location = location;
	}
	public void setName(Label name) {
		this.name = name;
	}
	public void setAge(Label age) {
		this.age = age;
	}
	public void setDateofdeath(Label dateofdeath) {
		this.dateofdeath = dateofdeath;
	}
	public void setGender(Label gender) {
		this.gender = gender;
	}
	public void setStatus(Label status) {
		this.status = status;
	}
	public void setNametxt(TextField nametxt) {
		this.nametxt = nametxt;
	}
	public void setDatetxt(TextField datetxt) {
		this.datetxt = datetxt;
	}
	public void setAgetxt(TextField agetxt) {
		this.agetxt = agetxt;
	}
	public void setLocatetxt(Text locatetxt) {
		this.locatetxt = locatetxt;
	}
	public void setMessg(Text messg) {
		this.messg = messg;
	}
	public void setNameradio(RadioButton nameradio) {
		this.nameradio = nameradio;
	}
	public void setAgeradio(RadioButton ageradio) {
		this.ageradio = ageradio;
	}
	public void setDateradio(RadioButton dateradio) {
		this.dateradio = dateradio;
	}
	public void setGenderradio(RadioButton genderradio) {
		this.genderradio = genderradio;
	}

	
}
