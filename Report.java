package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Report {
	private BorderPane statb = new BorderPane();
	 private Button next,prev,mainpage;
	private Label malenum,femalenum,singlenum,marriednum,ageless18,agegreat18,avglabel,datemax,totaldeath;
	 private TextField maletxt,femaletxt,singletxt,marriedtxt,less18txt,great18txt,avgtxt,locstattxt,datedeath,totaldeathtxt;
	 GridPane statgrid = new GridPane();
	 Stage stage11;
	 HBox stath= new HBox(10);
	Report(){
		    next= new Button ("Next");
			next.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,18));
		    next.setMaxWidth(200);
		    
		    prev= new Button ("Previous");
			prev.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,18));
		    prev.setMaxWidth(200);
		    
		    
		    mainpage= new Button ("Main Page");
			mainpage.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,18));
		    mainpage.setMaxWidth(200);
		 
		    malenum=new Label("Number Of Male :");
		    malenum.setStyle("-fx-border-color:black;-fx-border-width:2");
		    malenum.setTextFill(Color.WHITE);
		    malenum.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		    malenum.setMinWidth(200);
		    
		    femalenum=new Label("Number Of Female :");
		    femalenum.setStyle("-fx-border-color:black;-fx-border-width:2");
		    femalenum.setTextFill(Color.WHITE);
		    femalenum.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		    femalenum.setMinWidth(200);
		    
		    totaldeath=new Label("Total Of Martyrs : ");
		    totaldeath.setStyle("-fx-border-color:black;-fx-border-width:2");
		    totaldeath.setTextFill(Color.WHITE);
		    totaldeath.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		    totaldeath.setMinWidth(200);
		    
		    
		    singlenum=new Label("Number Of Singles :");
		    singlenum.setStyle("-fx-border-color:black;-fx-border-width:2");
		    singlenum.setTextFill(Color.WHITE);
		    singlenum.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		    singlenum.setMinWidth(200);
		    
		    datemax= new Label("Max Date Of Death :");
		    datemax.setStyle("-fx-border-color:black;-fx-border-width:2");
		    datemax.setTextFill(Color.WHITE);
		    datemax.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		    datemax.setMinWidth(200);
		    
		    marriednum=new Label("Number Of Married :");
		    marriednum.setStyle("-fx-border-color:black;-fx-border-width:2");
		    marriednum.setTextFill(Color.WHITE);
		    marriednum.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		    marriednum.setMinWidth(200);
		    
		    ageless18=new Label("Age Less Than 18 :");
		    ageless18.setStyle("-fx-border-color:black;-fx-border-width:2");
		    ageless18.setTextFill(Color.WHITE);
		    ageless18.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		    ageless18.setMinWidth(200);
		    
		   agegreat18=new Label("Age Greater Than Or Equals 18 :");
		    agegreat18.setStyle("-fx-border-color:black;-fx-border-width:2");
		    agegreat18.setTextFill(Color.WHITE);
		    agegreat18.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		    agegreat18.setMinWidth(200);
		    
		    avglabel=new Label("Age Average :");
		    avglabel.setStyle("-fx-border-color:black;-fx-border-width:2");
		    avglabel.setTextFill(Color.WHITE);
		    avglabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		    avglabel.setMinWidth(200);
		    
		    maletxt= new TextField();
		    maletxt.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,18));
		    maletxt.setMinWidth(300);
			maletxt.setMinHeight(40);
			
			locstattxt= new TextField();
			locstattxt.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,18));
			locstattxt.setMinWidth(300);
			locstattxt.setMinHeight(40);
		    
			femaletxt= new TextField();
		    femaletxt.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,18));
		    femaletxt.setMinWidth(300);
			femaletxt.setMinHeight(40);
			
			singletxt= new TextField();
		    singletxt.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,18));
		    singletxt.setMinWidth(300);
			singletxt.setMinHeight(40);
			
			totaldeathtxt= new TextField();
			totaldeathtxt.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,18));
			totaldeathtxt.setMinWidth(300);
			totaldeathtxt.setMinHeight(40);
			
			marriedtxt= new TextField();
			marriedtxt.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,18));
			marriedtxt.setMinWidth(300);
			marriedtxt.setMinHeight(40);
			
			less18txt= new TextField();
			less18txt.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,18));
			less18txt.setMinWidth(300);
			less18txt.setMinHeight(40);
			
			great18txt= new TextField();
			great18txt.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,18));
			great18txt.setMinWidth(300);
			great18txt.setMinHeight(40);
			
			avgtxt= new TextField();
			avgtxt.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,18));
			avgtxt.setMinWidth(300);
			avgtxt.setMinHeight(40);
			
			datedeath=new TextField();
			datedeath.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,18));
			datedeath.setMinWidth(300);
			datedeath.setMinHeight(40);
			
			statgrid.add(malenum, 0, 0);
			statgrid.add(maletxt, 1, 0);
			statgrid.add(femalenum, 0, 1);
			statgrid.add(femaletxt, 1, 1);
			statgrid.add(singlenum, 0, 2);
			statgrid.add(singletxt, 1, 2);
			statgrid.add(marriednum, 0, 3);
			statgrid.add(marriedtxt, 1, 3);
			statgrid.add(ageless18, 0, 4);
			statgrid.add(less18txt, 1, 4);
			statgrid.add(agegreat18, 0, 5);
			statgrid.add(great18txt, 1, 5);
			statgrid.add(avglabel, 0, 6);
			statgrid.add(avgtxt, 1, 6);
			statgrid.add(datemax, 0, 7);
			statgrid.add(datedeath, 1, 7);
			statgrid.add(totaldeath, 0, 8);
			statgrid.add(totaldeathtxt, 1, 8);
			
			 statgrid.setHgap(15);
			 statgrid.setVgap(15);
			 statgrid.setPadding(new Insets(15,15,15,15));
			
			 Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/Projecct1/src/pales.jpg");
			 ImageView mg = new ImageView(m);
			 mg.setFitHeight(600);
			 mg.setFitWidth(1200);
			
			statb.getChildren().add(mg);
			stath.getChildren().addAll(prev,locstattxt,next);
			statb.setTop(stath);
			stath.setAlignment(Pos.CENTER);
			statb.setBottom(mainpage);
			statb.setCenter(statgrid);
		 
	 }
	public Label getTotaldeath() {
		return totaldeath;
	}
	public TextField getTotaldeathtxt() {
		return totaldeathtxt;
	}
	public void setTotaldeath(Label totaldeath) {
		this.totaldeath = totaldeath;
	}
	public void setTotaldeathtxt(TextField totaldeathtxt) {
		this.totaldeathtxt = totaldeathtxt;
	}
	public Label getDatemax() {
		return datemax;
	}
	public TextField getDatedeath() {
		return datedeath;
	}
	public void setDatemax(Label datemax) {
		this.datemax = datemax;
	}
	public void setDatedeath(TextField datedeath) {
		this.datedeath = datedeath;
	}
	public BorderPane getStatb() {
		return statb;
	}
	public Button getNext() {
		return next;
	}
	public Button getPrev() {
		return prev;
	}
	public Button getMainpage() {
		return mainpage;
	}
	public Label getMalenum() {
		return malenum;
	}
	public Label getFemalenum() {
		return femalenum;
	}
	public Label getSinglenum() {
		return singlenum;
	}
	public Label getMarriednum() {
		return marriednum;
	}
	public Label getAgeless18() {
		return ageless18;
	}
	public Label getAgegreat18() {
		return agegreat18;
	}
	public Label getAvglabel() {
		return avglabel;
	}
	public TextField getMaletxt() {
		return maletxt;
	}
	public TextField getFemaletxt() {
		return femaletxt;
	}
	public TextField getSingletxt() {
		return singletxt;
	}
	public TextField getMarriedtxt() {
		return marriedtxt;
	}
	public TextField getLess18txt() {
		return less18txt;
	}
	public TextField getGreat18txt() {
		return great18txt;
	}
	public TextField getAvgtxt() {
		return avgtxt;
	}
	public TextField getLocstattxt() {
		return locstattxt;
	}
	public GridPane getStatgrid() {
		return statgrid;
	}
	public HBox getStath() {
		return stath;
	}
	public void setStatb(BorderPane statb) {
		this.statb = statb;
	}
	public void setNext(Button next) {
		this.next = next;
	}
	public void setPrev(Button prev) {
		this.prev = prev;
	}
	public void setMainpage(Button mainpage) {
		this.mainpage = mainpage;
	}
	public void setMalenum(Label malenum) {
		this.malenum = malenum;
	}
	public void setFemalenum(Label femalenum) {
		this.femalenum = femalenum;
	}
	public void setSinglenum(Label singlenum) {
		this.singlenum = singlenum;
	}
	public void setMarriednum(Label marriednum) {
		this.marriednum = marriednum;
	}
	public void setAgeless18(Label ageless18) {
		this.ageless18 = ageless18;
	}
	public void setAgegreat18(Label agegreat18) {
		this.agegreat18 = agegreat18;
	}
	public void setAvglabel(Label avglabel) {
		this.avglabel = avglabel;
	}
	public void setMaletxt(TextField maletxt) {
		this.maletxt = maletxt;
	}
	public void setFemaletxt(TextField femaletxt) {
		this.femaletxt = femaletxt;
	}
	public void setSingletxt(TextField singletxt) {
		this.singletxt = singletxt;
	}
	public void setMarriedtxt(TextField marriedtxt) {
		this.marriedtxt = marriedtxt;
	}
	public void setLess18txt(TextField less18txt) {
		this.less18txt = less18txt;
	}
	public void setGreat18txt(TextField great18txt) {
		this.great18txt = great18txt;
	}
	public void setAvgtxt(TextField avgtxt) {
		this.avgtxt = avgtxt;
	}
	public void setLocstattxt(TextField locstattxt) {
		this.locstattxt = locstattxt;
	}
	public void setStatgrid(GridPane statgrid) {
		this.statgrid = statgrid;
	}
	public void setStath(HBox stath) {
		this.stath = stath;
	}
	 
	 
	
	
}

