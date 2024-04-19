package application;
	
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
//Welcome to my Project

public class Main extends Application {
	// First we Defined the double list that contains locations
	//The double list points at 2 Avl Trees
	//Avl2 sorted by Names
	//Avl2 Sorted by Dates
	
	public static DoubleList list = new DoubleList();
	// we define Node points at locations 
	
	public static Node2 cur =null;
	
	//we define the observable list for the tables views 
	public  static  ObservableList<MartTable> elements = FXCollections.observableArrayList();
	public   ObservableList<String> combolist = FXCollections.observableArrayList();
	public  static  ObservableList<MartTable> elements2 = FXCollections.observableArrayList();
	public static ObservableList<Martyrs2> save= FXCollections.observableArrayList();
	
	
	// we create objects for the screens 
	
	View1 view = new View1();
	LocationScreen locate = new LocationScreen();
	WarningDelete war = new WarningDelete();
    MartyrsScreen marty= new MartyrsScreen();
    InsertMartyrs insert=new InsertMartyrs();
    Chooseone choose = new Chooseone();
    UpdateScreen update = new UpdateScreen();
    StatisticScreen statsc= new StatisticScreen();
    Avl1traversal avl1screen = new Avl1traversal();
    Avl2traversal avl2screen = new Avl2traversal();
    Report report = new Report();
    
    
	// we make for each screen  stage 
	Stage stage1= new Stage();
	Stage stage2 = new Stage();
	Stage stage3 = new Stage();
	Stage stage4 = new Stage();
	Stage stage5 = new Stage();
	Stage stage6 = new Stage();
	Stage stage7 = new Stage();
	Stage stage8 = new Stage();
	Stage stage9 = new Stage();
	Stage stage10 = new Stage();
	Stage stage11= new Stage();
	
	// we define for each stage scenes to put it in the stages for the screens
	Scene scene1= new Scene(view.getGroup(),1200,600);
	Scene scene2 = new Scene(locate.getBorder(),1050,600);
	Scene scene3 = new Scene(war.getWarr(),550,300);
	Scene scene4 = new Scene(marty.getBordermartyrs(),1200,600);
	Scene scene5 = new Scene(insert.getBorderins(),600, 400);
	Scene scene6 = new Scene(choose.getChooseborder(),450,200);
	Scene scene7 = new Scene(update.getUpdateborder(),800,500);
	Scene scene8 = new Scene(statsc.getStatborder(),1200,600);
	Scene scene9 = new Scene(avl1screen.getAvl1border(),1200,600);
	Scene scene10 = new Scene(avl2screen.getAvl2border(),1200,600);
	Scene scene11= new Scene(report.getStatb(),1200,600);
	
   
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			stage1.setScene(scene1);
			stage1.setTitle("Martyrs Of Palestine");
			stage2.setTitle("Location Screen");
			stage3.setTitle("Warning Screen");
			stage4.setTitle("Martyrs Screen");
			stage5.setTitle("Insert Screen");
			stage6.setTitle("Choose One Warning");
			stage7.setTitle("Update Screen");
			stage8.setTitle("Statistics Screen");
			stage9.setTitle("AVL1 TREE TRAVERSAL");
			stage10.setTitle("AVL2 TREE TRAVERSAL");
			stage11.setTitle("Report Screen");
			
			stage1.show();

			 

		       
			view.getBt6().setOnAction(e -> {
				
				System.out.print("");
				//we use the filechooser to make the user choose the file
				FileChooser fe = new FileChooser();
				File file1 = fe.showOpenDialog(stage1);
				//we use try&catch because if we have an error to handle the error
				//Like the user forget to choose the file so we print a message
				try (Scanner scan = new Scanner(file1)) {
					//while file have an next line we read it 
					while (scan.hasNextLine()) {
						//we read line by line
						String s = scan.nextLine();
						//we use array to split the line by use tokens
						//we split by use comma
						String[] tokens = s.split(",");
						//we define date for the date of death
						Date d;

					//we have some cases if the some tokens are null so we must check for each token
						//first case if the name is null or space so we define it as a unknown name
						if (tokens[0].equals("")) {
							d = new SimpleDateFormat("mm/dd/yyyy").parse(tokens[3]);
							
							if(tokens[4].equalsIgnoreCase("M")||tokens[4].equalsIgnoreCase("Male") ) {
							list.add(tokens[2], new Martyrs("Unkown", Integer.parseInt(tokens[1]), d, "Male", tokens[5]));}
							else {
								list.add(tokens[2], new Martyrs("Unkown", Integer.parseInt(tokens[1]), d, "Female", tokens[5]));
							}
							//second case if the age is null or space we defined it as 0 age
						} else if (tokens[1].equals("")) {
							d = new SimpleDateFormat("mm/dd/yyyy").parse(tokens[3]);
							if(tokens[4].equalsIgnoreCase("M")||tokens[4].equalsIgnoreCase("Male")) {
							list.add(tokens[2], new Martyrs(tokens[0], 0, d, "Male", tokens[5]));}
							//third case if the city is null or unknown we define the city as a unknown city
							else {
								list.add(tokens[2], new Martyrs(tokens[0], 0, d, "Female", tokens[5]));
							}
						} else if (tokens[2].equals("")) {
							d = new SimpleDateFormat("mm/dd/yyyy").parse(tokens[3]);
							if(tokens[4].equalsIgnoreCase("M")||tokens[4].equalsIgnoreCase("Male")){
							list.add("Unknown city",
									new Martyrs(tokens[0], Integer.parseInt(tokens[1]), d, "Male", tokens[5]));}
							else {
								list.add("Unknown city",
										new Martyrs(tokens[0], Integer.parseInt(tokens[1]), d, "Female", tokens[5]));}
							
							//4 case if the date are null so by default we define it as a null
						} else if (tokens[3].equals("")) {
							
							Date defaultdate = new SimpleDateFormat("mm/dd/yyyy").parse("");
							if(tokens[4].equalsIgnoreCase("M")||tokens[4].equalsIgnoreCase("Male")) {
							list.add(tokens[2],
									new Martyrs(tokens[0], Integer.parseInt(tokens[1]), defaultdate, "Male", tokens[5]));
							}
							//5 case we define if the gender is null
							else{
								list.add(tokens[2],
										new Martyrs(tokens[0], Integer.parseInt(tokens[1]), defaultdate, "Female", tokens[5]));
							}
						} else if (tokens[4].equals("")) {
							d = new SimpleDateFormat("mm/dd/yyyy").parse(tokens[3]);
							
							list.add(tokens[2], new Martyrs(tokens[0], Integer.parseInt(tokens[1]), d, " ", tokens[5]));
						}
                            //6 case if the status of the martyr are unknown so we define it as a null
						else if (tokens[5].equals("")) {
							d = new SimpleDateFormat("mm/dd/yyyy").parse(tokens[3]);
							if(tokens[4].equalsIgnoreCase("M")||tokens[4].equalsIgnoreCase("Male")) {
							list.add(tokens[2], new Martyrs(tokens[0], Integer.parseInt(tokens[1]), d, "Male", " "));
							
							}
							//7 case if all the parameters are known so we we add the martyr with all parameters
							else {
								list.add(tokens[2], new Martyrs(tokens[0], Integer.parseInt(tokens[1]), d, "Female", " "));
							}
						} else {
							d = new SimpleDateFormat("MM/dd/yyyy").parse(tokens[3]);
							if(tokens[4].equalsIgnoreCase("M")||tokens[4].equalsIgnoreCase("Male")) {
							list.add(tokens[2], new Martyrs(tokens[0], Integer.valueOf(tokens[1]), d,"Male", tokens[5]));
						}
							else {
								list.add(tokens[2], new Martyrs(tokens[0], Integer.valueOf(tokens[1]), d,"Female", tokens[5]));
							}
					}
					
					}
					//for each exception we handle it by using catch method
					scan.close();
				} catch (ParseException e1) {

					System.out.print("error lit");
				} catch (FileNotFoundException e1) {
					System.out.println(
							"error !! : please enter the file name \n if the file does not exsists the filewriter will create it !");

				} catch (Exception ex) {
					System.out.println("You are read from null ");

				}
			});
			
		
			 ScaleTransition scaleTransition = new ScaleTransition(Duration.seconds(2), view.getBt1());
		        scaleTransition.setFromX(0.0);
		        scaleTransition.setFromY(0.0);
		        scaleTransition.setToX(1.0);
		        scaleTransition.setToY(1.0);
		        scaleTransition.playFromStart();
		        
		        
		        ScaleTransition scaleTransition1 = new ScaleTransition(Duration.seconds(2), view.getBt2());
		        scaleTransition1.setFromX(0.0);
		        scaleTransition1.setFromY(0.0);
		        scaleTransition1.setToX(1.0);
		        scaleTransition1.setToY(1.0);
		        scaleTransition1.playFromStart();
		        
		        ScaleTransition scaleTransition2 = new ScaleTransition(Duration.seconds(2), view.getBt3());
		        scaleTransition2.setFromX(0.0);
		        scaleTransition2.setFromY(0.0);
		        scaleTransition2.setToX(1.0);
		        scaleTransition2.setToY(1.0);
		        scaleTransition2.playFromStart();
		        
		        ScaleTransition scaleTransition3 = new ScaleTransition(Duration.seconds(2), view.getBt4());
		        scaleTransition3.setFromX(0.0);
		        scaleTransition3.setFromY(0.0);
		        scaleTransition3.setToX(1.0);
		        scaleTransition3.setToY(1.0);
		        scaleTransition3.playFromStart();
		        
		        ScaleTransition scaleTransition4 = new ScaleTransition(Duration.seconds(2), view.getBt5());
		        scaleTransition4.setFromX(0.0);
		        scaleTransition4.setFromY(0.0);
		        scaleTransition4.setToX(1.0);
		        scaleTransition4.setToY(1.0);
		        scaleTransition4.playFromStart();
		        
		        ScaleTransition scaleTransition6 = new ScaleTransition(Duration.seconds(2), view.getBt6());
		        scaleTransition6.setFromX(0.0);
		        scaleTransition6.setFromY(0.0);
		        scaleTransition6.setToX(1.0);
		        scaleTransition6.setToY(1.0);
		        scaleTransition6.playFromStart();
		        
		        ScaleTransition scaleTransition7 = new ScaleTransition(Duration.seconds(2), view.getTxt1());
		        scaleTransition7.setFromX(0.0);
		        scaleTransition7.setFromY(0.0);
		        scaleTransition7.setToX(1.0);
		        scaleTransition7.setToY(1.0);
		        scaleTransition7.playFromStart();
			
		        ScaleTransition scaleTransition8 = new ScaleTransition(Duration.seconds(2), view.getOptions());
		        scaleTransition8.setFromX(0.0);
		        scaleTransition8.setFromY(0.0);
		        scaleTransition8.setToX(1.0);
		        scaleTransition8.setToY(1.0);
		        scaleTransition8.playFromStart();
			
			  FadeTransition fadeTransition = new FadeTransition(Duration.seconds(2), locate.getBtl1());
		        fadeTransition.setFromValue(0.0);
		        fadeTransition.setToValue(1.0);
		        FadeTransition fadeTransition2 = new FadeTransition(Duration.seconds(2), locate.getBtl2());
		        fadeTransition2.setFromValue(0.0);
		        fadeTransition2.setToValue(1.0);

		        FadeTransition fadeTransition3 = new FadeTransition(Duration.seconds(2), locate.getBtl3());
		        fadeTransition3.setFromValue(0.0);
		        fadeTransition3.setToValue(1.0);

		        FadeTransition fadeTransition4 = new FadeTransition(Duration.seconds(2), locate.getBtl4());
		        fadeTransition4.setFromValue(0.0);
		        fadeTransition4.setToValue(1.0);

		        FadeTransition fadeTransition5 = new FadeTransition(Duration.seconds(2), locate.getBtl5());
		        fadeTransition5.setFromValue(0.0);
		        fadeTransition5.setToValue(1.0);
		        
		        FadeTransition fadeTransition6 = new FadeTransition(Duration.seconds(2), locate.getClearbut());
		        fadeTransition6.setFromValue(0.0);
		        fadeTransition6.setToValue(1.0);
		        FadeTransition fadeTransition7 = new FadeTransition(Duration.seconds(2), locate.getBtl6());
		        fadeTransition7.setFromValue(0.0);
		        fadeTransition7.setToValue(1.0);
		        FadeTransition fadeTransition8 = new FadeTransition(Duration.seconds(2), locate.getBtl7());
		        fadeTransition8.setFromValue(0.0);
		        fadeTransition8.setToValue(1.0);
		        FadeTransition fadeTransition9 = new FadeTransition(Duration.seconds(2),locate.getCombo());
		        fadeTransition9.setFromValue(0.0);
		        fadeTransition9.setToValue(1.0);
		        FadeTransition fadeTransition10 = new FadeTransition(Duration.seconds(2),locate.getLocatemarttab());
		        fadeTransition10.setFromValue(0.0);
		        fadeTransition10.setToValue(1.0);

			//loacte screen 
			view.getBt1().setOnAction(e->{
				try {
					
					fadeTransition.playFromStart();
					 fadeTransition2.playFromStart();
					 fadeTransition3.playFromStart();
					 fadeTransition4.playFromStart();
					 fadeTransition5.playFromStart();
					 fadeTransition6.playFromStart();
					 fadeTransition7.playFromStart();
					 fadeTransition8.playFromStart();
					 fadeTransition9.playFromStart();
					 fadeTransition10.playFromStart();
					 
				locate.getCombo().getItems().clear();
				marty.getCombo().getItems().clear();
				combolist.clear();
				locate.getUpdate().setVisible(false);
				locate.getAdd().setVisible(false);
				locate.getTextfieldup().setVisible(false);
				locate.getLabelup().setVisible(false);
				locate.getTextfieldinsrt().setVisible(false);
				locate.getLabelinsrt().setVisible(false);
				locate.getUpdate().setVisible(false);
				locate.getLocattxt().setEditable(false);
				Node2 curr = list.getFirst();
				// we go throw the double list 
				for (int i = 0; i < list.countd; i++) {
					combolist.add(curr.getLocate());
					curr = curr.getNext();
				}

				locate.getCombo().setItems(combolist);
				marty.getCombo().setItems(combolist);
				stage1.close();
				stage2.setScene(scene2);
				stage2.show();
				
				}
				catch(Exception ex) {
					System.out.println("Null");
				}
				
			});
			//next button 
		
			locate.getBtl6().setOnAction(e -> {
				try {
					//any change any update we will update on stat screen
					int count=0;
					int sum=0;
					int male=0;
					int female=0;
					int single=0;
					int married=0;
					int ageless18=0;
					int agegreat18=0;
					if (cur == null) {
						cur = list.firstd;
					 	NodeAvl1 current = cur.getAv1().getRoot();
					 	elements.clear();
					 	locate.getLocatemarttab().getItems().clear();
					 	marty.getMartyrstable().getItems().clear();
					    cur.getAv1().printList(current);
                        locate.getLocatemarttab().setItems(elements);
                        marty.getMartyrstable().setItems(elements);
                        locate.getLocatemarttab().refresh();
                        marty.getMartyrstable().refresh();
                        locate.getCombo().setValue(cur.getLocate());
                        marty.getCombo().setValue(cur.getLocate());
                        locate.getCombo().setPromptText(cur.getLocate());
						marty.getCombo().setPromptText(cur.getLocate());
					} else {
						cur = cur.getNext();
						NodeAvl1 current = cur.getAv1().getRoot();
						locate.getLocatemarttab().getItems().clear();
						marty.getMartyrstable().getItems().clear();
                        elements.clear();
                        locate.getLocatemarttab().refresh();
                        marty.getMartyrstable().refresh();
                        cur.getAv1().printList(current);
                        locate.getLocatemarttab().setItems(elements);
                        marty.getMartyrstable().setItems(elements);
                        locate.getCombo().setValue(cur.getLocate());
                        marty.getCombo().setValue(cur.getLocate());
                        locate.getCombo().setPromptText(cur.getLocate());
						marty.getCombo().setPromptText(cur.getLocate());
                        locate.getLocatemarttab().refresh();
                        marty.getMartyrstable().refresh();
					}
					if(cur.getAv1().getRoot()!=null) {
					avl1screen.getHeighttxt().setText(String.valueOf(cur.getAv1().getRoot().getHeight()));
					for (int i = 0; i < elements.size(); i++) {
						sum+=elements.get(i).getAge();
						if(elements.get(i).getGender().equalsIgnoreCase("Male")||elements.get(i).getGender().equalsIgnoreCase("M")) {
							male++;
						}
						else {
							female++;
						}
						if(elements.get(i).getStatus().equalsIgnoreCase("Single")|| elements.get(i).getStatus().equalsIgnoreCase("S")) {
							single++;
						}
						else {
							married++;
						}
						if(elements.get(i).getAge()<18) {
							ageless18++;
						}
						else {
							agegreat18++;
						}
						count++;
					}
					double res=sum*1.0/count;
					report.getLocstattxt().setText(cur.getLocate());
					report.getMaletxt().setText(String.valueOf(male));
					report.getFemaletxt().setText(String.valueOf(female));
					report.getSingletxt().setText(String.valueOf(single));
					report.getMarriedtxt().setText(String.valueOf(married));
					report.getLess18txt().setText(String.valueOf(ageless18));
					report.getAvgtxt().setText(String.valueOf(res));
					report.getGreat18txt().setText(String.valueOf(agegreat18));
					 NodeAvl2 result=cur.getAv2().datemax(cur.getAv2().getRoot());
					report.getDatedeath().setText(new SimpleDateFormat("MM/dd/yyyy").format(result.getD()));
					report.getTotaldeathtxt().setText(String.valueOf(count));
					}
					else {
						double res=sum*1.0/count;
						report.getLocstattxt().setText(cur.getLocate());
						report.getMaletxt().setText(String.valueOf(male));
						report.getFemaletxt().setText(String.valueOf(female));
						report.getSingletxt().setText(String.valueOf(single));
						report.getMarriedtxt().setText(String.valueOf(married));
						report.getLess18txt().setText(String.valueOf(ageless18));
						report.getAvgtxt().setText(String.valueOf(res));
						report.getGreat18txt().setText(String.valueOf(agegreat18));
						report.getDatedeath().setText("NoN");
						report.getTotaldeathtxt().setText(String.valueOf(count));
						
					}
				} catch (Exception ex) {
					System.out.println("nulllll");
				}

			});
			//previous button
			locate.getBtl7().setOnAction(e->{
				try {
					int count=0;
					int sum=0;
					int male=0;
					int female=0;
					int single=0;
					int married=0;
					int ageless18=0;
					int agegreat18=0;
					if (cur == null) {
						cur = list.last;
						NodeAvl1 current = cur.getAv1().getRoot();
						elements.clear();
					 	locate.getLocatemarttab().getItems().clear();
					 	marty.getMartyrstable().getItems().clear();
					 	locate.getLocatemarttab().refresh();
					 	marty.getMartyrstable().refresh();
					    cur.getAv1().printList(current);
                        locate.getLocatemarttab().setItems(elements);
                        marty.getMartyrstable().setItems(elements);
                        locate.getLocatemarttab().refresh();
                        marty.getMartyrstable().refresh();
                        locate.getCombo().setValue(cur.getLocate());
                        marty.getCombo().setValue(cur.getLocate());
                        locate.getCombo().setPromptText(cur.getLocate());
						marty.getCombo().setPromptText(cur.getLocate());
					}
					else {
						cur=cur.getPrevious();
						NodeAvl1 current = cur.getAv1().getRoot();
						locate.getCombo().setValue(cur.getLocate());
						elements.clear();
						locate.getLocatemarttab().getItems().clear();
						marty.getMartyrstable().getItems().clear();
						locate.getLocatemarttab().refresh();
						marty.getMartyrstable().refresh();
						cur.getAv1().printList(current);
						locate.getLocatemarttab().setItems(elements);
						marty.getMartyrstable().setItems(elements);
                        locate.getLocatemarttab().refresh();
                        marty.getMartyrstable().refresh();
                        locate.getCombo().setValue(cur.getLocate());
                        marty.getCombo().setValue(cur.getLocate());
    					locate.getCombo().setPromptText(cur.getLocate());
    						marty.getCombo().setPromptText(cur.getLocate());
					}
					if(cur.getAv1().getRoot()!=null) {
						avl1screen.getHeighttxt().setText(String.valueOf(cur.getAv1().getRoot().getHeight()));
						for (int i = 0; i < elements.size(); i++) {
							sum+=elements.get(i).getAge();
							if(elements.get(i).getGender().equalsIgnoreCase("Male")||elements.get(i).getGender().equalsIgnoreCase("M")) {
								male++;
							}
							else {
								female++;
							}
							if(elements.get(i).getStatus().equalsIgnoreCase("Single")|| elements.get(i).getStatus().equalsIgnoreCase("S")) {
								single++;
							}
							else {
								married++;
							}
							if(elements.get(i).getAge()<18) {
								ageless18++;
							}
							else {
								agegreat18++;
							}
							count++;
						}
						double res=sum*1.0/count;
						report.getLocstattxt().setText(cur.getLocate());
						report.getMaletxt().setText(String.valueOf(male));
						report.getFemaletxt().setText(String.valueOf(female));
						report.getSingletxt().setText(String.valueOf(single));
						report.getMarriedtxt().setText(String.valueOf(married));
						report.getLess18txt().setText(String.valueOf(ageless18));
						report.getAvgtxt().setText(String.valueOf(res));
						report.getGreat18txt().setText(String.valueOf(agegreat18));
						 NodeAvl2 result=cur.getAv2().datemax(cur.getAv2().getRoot());
						report.getDatedeath().setText(new SimpleDateFormat("MM/dd/yyyy").format(result.getD()));
						report.getTotaldeathtxt().setText(String.valueOf(count));
						}
						else {
							double res=sum*1.0/count;
							report.getLocstattxt().setText(cur.getLocate());
							report.getMaletxt().setText(String.valueOf(male));
							report.getFemaletxt().setText(String.valueOf(female));
							report.getSingletxt().setText(String.valueOf(single));
							report.getMarriedtxt().setText(String.valueOf(married));
							report.getLess18txt().setText(String.valueOf(ageless18));
							report.getAvgtxt().setText(String.valueOf(res));
							report.getGreat18txt().setText(String.valueOf(agegreat18));
							report.getDatedeath().setText("NoN");
							report.getTotaldeathtxt().setText(String.valueOf(count));
							
						}
				}
				catch (Exception ex) {
					System.out.println("nulllllbye");
				}
				
			});
			//combolist for the location
			locate.getCombo().setOnAction(e->{
				try {
					ArrayList<String> com = new ArrayList<>();
					for (int i = 0; i < combolist.size(); i++) {
						com.add(combolist.get(i));
					}

					for (int i = 0; i < com.size(); i++) {
						if (locate.getCombo().getValue().equals(com.get(i))) {
							cur = list.firstd;
							for (int j = 1; j < list.countd; j++) {
								if (cur.getLocate().trim()
										.equals(locate.getCombo().getSelectionModel().getSelectedItem().trim())) {
									break;
								} else {
									cur = cur.getNext();
								}
							}
						}
					}
					NodeAvl1 current = cur.getAv1().getRoot();
					locate.getLocatemarttab().getItems().clear();
					marty.getMartyrstable().getItems().clear();
					elements.clear();
					locate.getLocatemarttab().refresh();
					marty.getMartyrstable().refresh();
				    cur.getAv1().printList(current);
				    locate.getCombo().setPromptText(cur.getLocate());
					marty.getCombo().setPromptText(cur.getLocate());
				    locate.getCombo().setValue(cur.getLocate());
				     marty.getCombo().setValue(cur.getLocate());
				     
					locate.getLocatemarttab().setItems(elements);
					marty.getMartyrstable().setItems(elements);
					locate.getLocatemarttab().refresh();
					marty.getMartyrstable().refresh();
		}
		catch(Exception w) {
			System.out.println(" ");
		}
			});
			//combolist for the martyrs 
			marty.getCombo().setOnAction(e->{
				try {
					ArrayList<String> com = new ArrayList<>();
					for (int i = 0; i < combolist.size(); i++) {
						com.add(combolist.get(i));
					}

					for (int i = 0; i < com.size(); i++) {
						if (marty.getCombo().getValue().equals(com.get(i))) {
							cur = list.firstd;
							for (int j = 1; j < list.countd; j++) {
								if (cur.getLocate().trim()
										.equals(marty.getCombo().getSelectionModel().getSelectedItem().trim())) {
									break;
								} else {
									cur = cur.getNext();
								}
							}
						}
					}
					NodeAvl1 current = cur.getAv1().getRoot();
					locate.getLocatemarttab().getItems().clear();
					marty.getMartyrstable().getItems().clear();
					elements.clear();
					locate.getLocatemarttab().refresh();
					marty.getMartyrstable().refresh();
				    cur.getAv1().printList(current);
					locate.getCombo().setValue(cur.getLocate());
				     marty.getCombo().setValue(cur.getLocate());
				     locate.getCombo().setPromptText(cur.getLocate());
						marty.getCombo().setPromptText(cur.getLocate());
					locate.getLocatemarttab().setItems(elements);
					marty.getMartyrstable().setItems(elements);
					locate.getLocatemarttab().refresh();
					marty.getMartyrstable().refresh();
		}
		catch(Exception w) {
			System.out.println(" ");
		}
				
				
			});
			
			//menu page went 
			locate.getBtl5().setOnAction(e -> {
				try {
				stage2.close();
				stage1.setScene(scene1);
				stage1.show();
				}
				catch(Exception ex) {
					System.out.println("something error !!");
				}
			});
			locate.getClearbut().setOnAction(e -> {
	            // if we click clear all the textFields and radio buttons will not shown
					locate.getAdd().setVisible(false);
					locate.getTextfieldinsrt().setVisible(false);
					locate.getTextfieldinsrt().setText(null);
					locate.getLabelinsrt().setVisible(false);
					locate.getTextfieldup().setVisible(false);
					locate.getLabelup().setVisible(false);
					locate.getUpdate().setVisible(false);
					locate.getTextfieldup().setText(null);
				});
			locate.getBtl3().setOnAction(e -> {
				//when click update so the name of the location will update
				locate.getTextfieldinsrt().setVisible(false);
				locate.getLabelinsrt().setVisible(false);
				locate.getAdd().setVisible(false);
				locate.getTextfieldup().setVisible(true);
				locate.getLabelup().setVisible(true);
				locate.getUpdate().setVisible(true);

			});
			locate.getBtl1().setOnAction(e -> {
				//when we click about button the textfields and labels will show 
				locate.getAdd().setVisible(true);
				locate.getTextfieldup().setVisible(false);
				locate.getLabelup().setVisible(false);
				locate.getTextfieldinsrt().setVisible(true);
				locate.getLabelinsrt().setVisible(true);
				locate.getUpdate().setVisible(false);
			});
			
			locate.getAdd().setOnAction(e -> {
				//here when we click on the add button we will add a location on the double linked list 
				try {
				String r = locate.getTextfieldinsrt().getText();
				//we call the add method in the single list
				list.add(r);
				locate.getCombo().getItems().clear();
				combolist.clear();
				Node2 curr = list.getFirst();
				for (int i = 0; i < list.countd; i++) {
					combolist.add(curr.getLocate());
					curr = curr.getNext();
				}
			     locate.getCombo().setItems(combolist);
			     locate.getCombo().setValue(cur.getLocate());
					locate.getCombo().setPromptText(cur.getLocate());
					marty.getCombo().setItems(combolist);
				     marty.getCombo().setValue(cur.getLocate());
						marty.getCombo().setPromptText(cur.getLocate());
			     locate.getAdd().setVisible(false);
					locate.getTextfieldinsrt().setVisible(false);
					locate.getTextfieldinsrt().setText(null);
					locate.getLabelinsrt().setVisible(false);
				}
				catch(Exception u) {
					System.out.print("The Text Feild Are Null!!");
				}
			});
			
			locate.getBtl2().setOnAction(e->{
				try {
				stage3.setScene(scene3);
				stage3.show();
				}
				catch(Exception v) {
					System.out.println("Null");	
				}
			});
			//if the user click yes the location we will delete it with there martryrs
			war.getYes().setOnAction(e->{
					try {
						Node2 r = cur.getNext();
						//call remove method in the double list
						list.remove(cur.getLocate());
						cur = r;
						stage3.close();
						locate.getCombo().getItems().clear();
						combolist.clear();
						Node2 curr = list.getFirst();
						for (int i = 0; i < list.countd; i++) {
							combolist.add(curr.getLocate());
							curr = curr.getNext();
						}
						
						locate.getCombo().setItems(combolist);
						locate.getCombo().setValue(cur.getLocate());
						locate.getCombo().setPromptText(cur.getLocate());
						
						marty.getCombo().setItems(combolist);
					     marty.getCombo().setValue(cur.getLocate());
							marty.getCombo().setPromptText(cur.getLocate());
						
						
					} catch (NullPointerException w) {
						System.out.println("Null Pointer Exception !!!");
					}
			});
			// if the user click no the location will not delete
			war.getNo().setOnAction(e->{
				stage3.close();
			});
			
			locate.getBtl3().setOnAction(e->{
					//when click update so the name of the location will update
					locate.getTextfieldinsrt().setVisible(false);
					locate.getLabelinsrt().setVisible(false);
					locate.getAdd().setVisible(false);
					locate.getTextfieldup().setVisible(true);
					locate.getLabelup().setVisible(true);
					locate.getUpdate().setVisible(true);

				
			});
			//update the location name
			locate.getUpdate().setOnAction(e -> {
				try {
				// if you click update button we call the update method inside the single list class
				Node2 r = cur.getNext();
				list.Update(locate.getTextfieldup().getText(), cur);
				cur = r;
				locate.getCombo().getItems().clear();
				combolist.clear();
				Node2 curr = list.getFirst();
				for (int i = 0; i < list.countd; i++) {
					combolist.add(curr.getLocate());
					curr = curr.getNext();
				}
			     locate.getCombo().setItems(combolist);
			     marty.getCombo().setItems(combolist);
			     locate.getCombo().setValue(cur.getLocate());
			     marty.getCombo().setValue(cur.getLocate());
					locate.getCombo().setPromptText(cur.getLocate());
					marty.getCombo().setPromptText(cur.getLocate());
					locate.getTextfieldup().setVisible(false);
					locate.getLabelup().setVisible(false);
					locate.getUpdate().setVisible(false);
					locate.getTextfieldup().setText(null);
				}
				catch(Exception c) {
					System.out.print("");
				}
			});
			
			 FadeTransition fadeTransition11 = new FadeTransition(Duration.seconds(2), marty.getInseret());
		        fadeTransition11.setFromValue(0.0);
		        fadeTransition11.setToValue(1.0);
		        FadeTransition fadeTransition12 = new FadeTransition(Duration.seconds(2), marty.getSearch());
		        fadeTransition12.setFromValue(0.0);
		        fadeTransition12.setToValue(1.0);

		        FadeTransition fadeTransition13 = new FadeTransition(Duration.seconds(2), marty.getDelete());
		        fadeTransition13.setFromValue(0.0);
		        fadeTransition13.setToValue(1.0);

		        FadeTransition fadeTransition14 = new FadeTransition(Duration.seconds(2), marty.getUpdate());
		        fadeTransition14.setFromValue(0.0);
		        fadeTransition14.setToValue(1.0);

		        FadeTransition fadeTransition15 = new FadeTransition(Duration.seconds(2), marty.getMain());
		        fadeTransition15.setFromValue(0.0);
		        fadeTransition15.setToValue(1.0);
		        
		        FadeTransition fadeTransition16 = new FadeTransition(Duration.seconds(2), marty.getNex());
		        fadeTransition16.setFromValue(0.0);
		        fadeTransition16.setToValue(1.0);
		        FadeTransition fadeTransition17 = new FadeTransition(Duration.seconds(2), marty.getPrev());
		        fadeTransition17.setFromValue(0.0);
		        fadeTransition17.setToValue(1.0);
		        FadeTransition fadeTransition18 = new FadeTransition(Duration.seconds(2), marty.getCombo());
		        fadeTransition18.setFromValue(0.0);
		        fadeTransition18.setToValue(1.0);
		        FadeTransition fadeTransition19 = new FadeTransition(Duration.seconds(2), marty.getCombo());
		        fadeTransition19.setFromValue(0.0);
		        fadeTransition19.setToValue(1.0);
		        FadeTransition fadeTransition20 = new FadeTransition(Duration.seconds(2), marty.getMartyrstable());
		        fadeTransition20.setFromValue(0.0);
		        fadeTransition20.setToValue(1.0);

			
			
			
			//the martyrs screen
			view.getBt2().setOnAction(e->{
				try {
					 fadeTransition11.playFromStart();
					 fadeTransition12.playFromStart();
					 fadeTransition13.playFromStart();
					 fadeTransition14.playFromStart();
					 fadeTransition15.playFromStart();
					 fadeTransition16.playFromStart();
					 fadeTransition17.playFromStart();
					 fadeTransition18.playFromStart();
					 fadeTransition19.playFromStart();
					 fadeTransition20.playFromStart();
					locate.getCombo().getItems().clear();
					marty.getCombo().getItems().clear();
					combolist.clear();
					Node2 curr = list.getFirst();
					for (int i = 0; i < list.countd; i++) {
						combolist.add(curr.getLocate());
						curr = curr.getNext();
					}

					locate.getCombo().setItems(combolist);
					marty.getCombo().setItems(combolist);
				stage1.close();
				marty.getSearchlab().setVisible(false);
				marty.getSearchtxt().setText(null);
				marty.getSearchtxt().setVisible(false);
				marty.getSearchbut().setVisible(false);
					stage4.setScene(scene4);
					stage4.show();
				}
				catch(Exception ex) {
					System.out.println("error");
				}
				});
			
			//main button in the martyrs
			marty.getMain().setOnAction(e->{
				stage4.close();
				stage1.show();
			});
			
			//if the use click next so the martyrs for next location will show
			marty.getNex().setOnAction(e->{
				try {
					int count=0;
					int sum=0;
					int male=0;
					int female=0;
					int single=0;
					int married=0;
					int ageless18=0;
					int agegreat18=0;
					if (cur == null) {
						cur = list.firstd;
					 	NodeAvl1 current = cur.getAv1().getRoot();
					 	elements.clear();
					 	locate.getLocatemarttab().getItems().clear();
					 	marty.getMartyrstable().getItems().clear();
					    cur.getAv1().printList(current);
                        locate.getLocatemarttab().setItems(elements);
                        marty.getMartyrstable().setItems(elements);
                        locate.getLocatemarttab().refresh();
                        marty.getMartyrstable().refresh();
                        locate.getCombo().setValue(cur.getLocate());
                        marty.getCombo().setValue(cur.getLocate());
                        locate.getCombo().setPromptText(cur.getLocate());
                        marty.getCombo().setPromptText(cur.getLocate());
					} else {
						cur = cur.getNext();
						NodeAvl1 current = cur.getAv1().getRoot();
						locate.getLocatemarttab().getItems().clear();
						marty.getMartyrstable().getItems().clear();
                        elements.clear();
                        locate.getLocatemarttab().refresh();
                        marty.getMartyrstable().refresh();
                        cur.getAv1().printList(current);
                        locate.getLocatemarttab().setItems(elements);
                        marty.getMartyrstable().setItems(elements);
                        locate.getCombo().setValue(cur.getLocate());
                        marty.getCombo().setValue(cur.getLocate());
                        locate.getCombo().setPromptText(cur.getLocate());
                        marty.getCombo().setPromptText(cur.getLocate());
                        locate.getLocatemarttab().refresh();
                        marty.getMartyrstable().refresh();
					}
					if(cur.getAv1().getRoot()!=null) {
						avl1screen.getHeighttxt().setText(String.valueOf(cur.getAv1().getRoot().getHeight()));
						for (int i = 0; i < elements.size(); i++) {
							sum+=elements.get(i).getAge();
							if(elements.get(i).getGender().equalsIgnoreCase("Male")||elements.get(i).getGender().equalsIgnoreCase("M")) {
								male++;
							}
							else {
								female++;
							}
							if(elements.get(i).getStatus().equalsIgnoreCase("Single")|| elements.get(i).getStatus().equalsIgnoreCase("S")) {
								single++;
							}
							else {
								married++;
							}
							if(elements.get(i).getAge()<18) {
								ageless18++;
							}
							else {
								agegreat18++;
							}
							count++;
						}
						double res=sum*1.0/count;
						report.getLocstattxt().setText(cur.getLocate());
						report.getMaletxt().setText(String.valueOf(male));
						report.getFemaletxt().setText(String.valueOf(female));
						report.getSingletxt().setText(String.valueOf(single));
						report.getMarriedtxt().setText(String.valueOf(married));
						report.getLess18txt().setText(String.valueOf(ageless18));
						report.getAvgtxt().setText(String.valueOf(res));
						report.getGreat18txt().setText(String.valueOf(agegreat18));
						 NodeAvl2 result=cur.getAv2().datemax(cur.getAv2().getRoot());
						report.getDatedeath().setText(new SimpleDateFormat("MM/dd/yyyy").format(result.getD()));
						report.getTotaldeathtxt().setText(String.valueOf(count));
						}
						else {
							double res=sum*1.0/count;
							report.getLocstattxt().setText(cur.getLocate());
							report.getMaletxt().setText(String.valueOf(male));
							report.getFemaletxt().setText(String.valueOf(female));
							report.getSingletxt().setText(String.valueOf(single));
							report.getMarriedtxt().setText(String.valueOf(married));
							report.getLess18txt().setText(String.valueOf(ageless18));
							report.getAvgtxt().setText(String.valueOf(res));
							report.getGreat18txt().setText(String.valueOf(agegreat18));
							report.getDatedeath().setText("NoN");
							report.getTotaldeathtxt().setText(String.valueOf(count));
							
						}
				} catch (Exception ex) {
					System.out.print("nulllll");
				}

			});
			
			//previous button in martyrs screen
			marty.getPrev().setOnAction(e->{
				try {
					int count=0;
					int sum=0;
					int male=0;
					int female=0;
					int single=0;
					int married=0;
					int ageless18=0;
					int agegreat18=0;
					if (cur == null) {
						cur = list.last;
						NodeAvl1 current = cur.getAv1().getRoot();
						elements.clear();
					 	locate.getLocatemarttab().getItems().clear();
					 	marty.getMartyrstable().getItems().clear();
					 	locate.getLocatemarttab().refresh();
					 	marty.getMartyrstable().refresh();
					    cur.getAv1().printList(current);
                        locate.getLocatemarttab().setItems(elements);
                        marty.getMartyrstable().setItems(elements);
                        locate.getLocatemarttab().refresh();
                        marty.getMartyrstable().refresh();
                        locate.getCombo().setValue(cur.getLocate());
                        marty.getCombo().setValue(cur.getLocate());
                        locate.getCombo().setPromptText(cur.getLocate());
                        marty.getCombo().setPromptText(cur.getLocate());
					}
					else {
						cur=cur.getPrevious();
						NodeAvl1 current = cur.getAv1().getRoot();
						locate.getCombo().setValue(cur.getLocate());
						elements.clear();
						locate.getLocatemarttab().getItems().clear();
						marty.getMartyrstable().getItems().clear();
						locate.getLocatemarttab().refresh();
						marty.getMartyrstable().refresh();
						cur.getAv1().printList(current);
						locate.getLocatemarttab().setItems(elements);
						marty.getMartyrstable().setItems(elements);
                        locate.getLocatemarttab().refresh();
                        marty.getMartyrstable().refresh();
                        locate.getCombo().setValue(cur.getLocate());
                        marty.getCombo().setValue(cur.getLocate());
                        locate.getCombo().setPromptText(cur.getLocate());
                        marty.getCombo().setPromptText(cur.getLocate());
					}
					if(cur.getAv1().getRoot()!=null) {
						avl1screen.getHeighttxt().setText(String.valueOf(cur.getAv1().getRoot().getHeight()));
						for (int i = 0; i < elements.size(); i++) {
							sum+=elements.get(i).getAge();
							if(elements.get(i).getGender().equalsIgnoreCase("Male")||elements.get(i).getGender().equalsIgnoreCase("M")) {
								male++;
							}
							else {
								female++;
							}
							if(elements.get(i).getStatus().equalsIgnoreCase("Single")|| elements.get(i).getStatus().equalsIgnoreCase("S")) {
								single++;
							}
							else {
								married++;
							}
							if(elements.get(i).getAge()<18) {
								ageless18++;
							}
							else {
								agegreat18++;
							}
							count++;
						}
						double res=sum*1.0/count;
						report.getLocstattxt().setText(cur.getLocate());
						report.getMaletxt().setText(String.valueOf(male));
						report.getFemaletxt().setText(String.valueOf(female));
						report.getSingletxt().setText(String.valueOf(single));
						report.getMarriedtxt().setText(String.valueOf(married));
						report.getLess18txt().setText(String.valueOf(ageless18));
						report.getAvgtxt().setText(String.valueOf(res));
						report.getGreat18txt().setText(String.valueOf(agegreat18));
						 NodeAvl2 result=cur.getAv2().datemax(cur.getAv2().getRoot());
						report.getDatedeath().setText(new SimpleDateFormat("MM/dd/yyyy").format(result.getD()));
						report.getTotaldeathtxt().setText(String.valueOf(count));
						}
						else {
							double res=sum*1.0/count;
							report.getLocstattxt().setText(cur.getLocate());
							report.getMaletxt().setText(String.valueOf(male));
							report.getFemaletxt().setText(String.valueOf(female));
							report.getSingletxt().setText(String.valueOf(single));
							report.getMarriedtxt().setText(String.valueOf(married));
							report.getLess18txt().setText(String.valueOf(ageless18));
							report.getAvgtxt().setText(String.valueOf(res));
							report.getGreat18txt().setText(String.valueOf(agegreat18));
							report.getDatedeath().setText("NoN");
							report.getTotaldeathtxt().setText(String.valueOf(count));
							
						}
				}
				catch (Exception ex) {
					System.out.print("nulllll");
				}
			});
			
			// insert martyr to the specific location
			marty.getInseret().setOnAction(e -> {
				// if we want to add martyrs in the list on the current  location 
				insert.getIns1().setText(null);
				insert.getIns2().setText(null);
				insert.getIns3().setText(null);
				insert.getStatuscombo().setValue(null);
				insert.getGendercombo().setValue(null);
				stage5.setScene(scene5);
				stage5.show();
			});
			
			insert.getNo().setOnAction(e -> {
				//if we click no the stage will be removed
				stage5.close();
			});
			
			insert.getYes().setOnAction(e -> {
				// if we click yes we will add this martyrs to the list
				try {
					//first we get the name ,age,... from the textfields and we add them to the list
					String name = insert.getIns1().getText();
					int age = Integer.valueOf(insert.getIns2().getText());
					Date d = new SimpleDateFormat("MM/dd/yyyy").parse((insert.getIns3().getText()));
					String gender=insert.getGendercombo().getValue();
					String single =insert.getStatuscombo().getValue();
					list.add(cur.getLocate(), new Martyrs(name, age, d, gender, single));
					insert.getIns1().setText(null);
					insert.getIns2().setText(null);
					insert.getIns3().setText(null);
					insert.getStatuscombo().setValue(null);
					insert.getGendercombo().setValue(null);
					NodeAvl1 current = cur.getAv1().getRoot();
				 	elements.clear();
				 	locate.getLocatemarttab().getItems().clear();
				 	marty.getMartyrstable().getItems().clear();
				    cur.getAv1().printList(current);
				    cur.getAv2().printList(cur.getAv2().getRoot());
                    locate.getLocatemarttab().setItems(elements);
                    marty.getMartyrstable().setItems(elements);
                    locate.getLocatemarttab().refresh();
                    marty.getMartyrstable().refresh();
                    stage5.close();
				} catch (Exception ex) {
					System.out.println("The textField are null !!");
				}
			});
			
			// search about martyr in the location
		    // search by use part of his or her name
			
			marty.getSearch().setOnAction(e->{
				try {
					marty.getSearchlab().setVisible(true);
					marty.getSearchtxt().setVisible(true);
					marty.getSearchbut().setVisible(true);
				}
				catch(Exception ex) {
					System.out.println("null ya habibiiii");
				}
			});
			// to set the table view the result for the search button
			marty.getSearchbut().setOnAction(e->{
				try {
				elements.clear();
				marty.getMartyrstable().refresh();
				cur.getAv1().Findbysearch(marty.getSearchtxt().getText().toString(), cur.getAv1().getRoot());
				marty.getMartyrstable().setItems(elements);
				marty.getMartyrstable().refresh();	
				marty.getSearchlab().setVisible(false);
				marty.getSearchtxt().setVisible(false);
				marty.getSearchbut().setVisible(false);
				marty.getSearchtxt().setText(null);
				}
				catch(Exception ex) {
					System.out.println("null ya habibiiii");
				}
			});
			
			// choose one of the option
			choose.getOk().setOnAction(e->{
				stage6.close();
			});
			
			// delete martyrs
			marty.getDelete().setOnAction(e->{
				try {
				if (marty.getMartyrstable().getSelectionModel().getSelectedItem()==null) {
					stage6.setScene(scene6);
					stage6.show();
				} 
				else {
					String name=marty.getMartyrstable().getSelectionModel().getSelectedItem().getName().trim();
					Date date=new SimpleDateFormat("MM/dd/yyyy").parse( marty.getMartyrstable().getSelectionModel().getSelectedItem().getDate());
					int age = marty.getMartyrstable().getSelectionModel().getSelectedItem().getAge();
					String gend= marty.getMartyrstable().getSelectionModel().getSelectedItem().getGender().trim();
					String status= marty.getMartyrstable().getSelectionModel().getSelectedItem().getStatus().trim();
					cur.getAv1().delete(new Martyrs(name,age,date,gend,status));
					cur.getAv2().deleteinAv2(new Martyrs(name,age,date,gend,status));
					marty.getMartyrstable().refresh();
					locate.getLocatemarttab().refresh();
					elements.clear();
					cur.getAv1().printList(cur.getAv1().getRoot());
					marty.getMartyrstable().setItems(elements);
					locate.getLocatemarttab().setItems(elements);
					marty.getMartyrstable().refresh();
					locate.getLocatemarttab().refresh();
				}
			
			} 
				catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	catch (Exception ew) {
				System.out.println("Null Pointer!---");
			} 
			});
			
			// update screen show
			// but the first before update you must select the martyrs
			marty.getUpdate().setOnAction(e->{
				try {
				if(marty.getMartyrstable().getSelectionModel().getSelectedItem()==null) {
					stage6.setScene(scene6);
					stage6.show();
				}
				else {
					stage1.close();
					update.getAgeradio().setVisible(false);
					update.getNameradio().setVisible(false);
					update.getDateradio().setVisible(false);
					update.getGenderradio().setVisible(false);
					update.getStatusradio().setVisible(false);
					update.getUpdatebut().setVisible(false);
					update.getAgeradio().setSelected(false);
					update.getNameradio().setSelected(false);
					update.getDateradio().setSelected(false);
					update.getGenderradio().setSelected(false);
					update.getStatusradio().setSelected(false);
					update.getMessg().setVisible(false);
					update.getNametxt().setEditable(false);
					update.getAgetxt().setEditable(false);
					update.getDatetxt().setEditable(false);
					update.getGendercombo().setEditable(false);
					update.getStatuscombo().setEditable(false);
					update.getGendercombo().setEditable(false);
					update.getGendercombo().setDisable(true);
					update.getStatuscombo().setDisable(true);
					update.getLocatetxt().setText(cur.getLocate());
					update.getNametxt().setText(marty.getMartyrstable().getSelectionModel().getSelectedItem().getName().trim());
					update.getAgetxt().setText(String.valueOf(marty.getMartyrstable().getSelectionModel().getSelectedItem().getAge()));
					update.getDatetxt().setText(marty.getMartyrstable().getSelectionModel().getSelectedItem().getDate());
					update.getGendercombo().setValue(marty.getMartyrstable().getSelectionModel().getSelectedItem().getGender());
					update.getGendercombo().setPromptText(marty.getMartyrstable().getSelectionModel().getSelectedItem().getGender());
					update.getStatuscombo().setValue(marty.getMartyrstable().getSelectionModel().getSelectedItem().getStatus());
					update.getStatuscombo().setPromptText(marty.getMartyrstable().getSelectionModel().getSelectedItem().getStatus());
					stage7.setScene(scene7);
					stage7.show();
				}
				}
				catch(Exception ex) {
					System.out.println("null table");
				
				}
			});
			//if the user click yes the radio button wills show to make the user visible write
			update.getYes().setOnAction(e->{
				try {
				update.getAgeradio().setVisible(true);
				update.getNameradio().setVisible(true);
				update.getDateradio().setVisible(true);
				update.getGenderradio().setVisible(true);
				update.getStatusradio().setVisible(true);
				update.getUpdatebut().setVisible(true);
				update.getMessg().setVisible(true);
				update.getAgeradio().setSelected(false);
				update.getNameradio().setSelected(false);
				update.getDateradio().setSelected(false);
				update.getGenderradio().setSelected(false);
				update.getStatusradio().setSelected(false);
				String name=update.getNametxt().getText().trim();
				int age=Integer.parseInt(update.getAgetxt().getText().trim());
					Date d= new SimpleDateFormat("MM/dd/yyyy").parse(update.getDatetxt().getText().trim());
			    String gender=update.getGendercombo().getValue().trim();
			    String status= update.getStatuscombo().getValue().trim();
			    cur.getAv1().deleteinAvl(new Martyrs(name,age,d,gender,status));
			    cur.getAv2().deleteinAv2(new Martyrs(name,age,d,gender,status));
				} catch(Exception ec) {
					System.out.println(" ");
				}
			});
			
			//update button we get the martyrs we delete it and then we add them as an new martyrs
			 update.getUpdatebut().setOnAction(ex->{
					try {
	    Martyrs v= new Martyrs(update.getNametxt().getText().trim(),Integer.parseInt(update.getAgetxt().getText().trim()),new SimpleDateFormat("MM/dd/yyyy").parse(update.getDatetxt().getText().trim()),update.getGendercombo().getValue().trim(),update.getStatuscombo().getValue().trim());	
		list.add(cur.getLocate(), v);
		locate.getLocatemarttab().getItems().clear();
		marty.getMartyrstable().getItems().clear();
		locate.getLocatemarttab().refresh();
		marty.getMartyrstable().refresh();
		elements.clear();
		cur.getAv1().printList(cur.getAv1().getRoot());
		locate.getLocatemarttab().setItems(elements);
		marty.getMartyrstable().setItems(elements);
		locate.getLocatemarttab().refresh();
		marty.getMartyrstable().refresh();
		stage7.close();
					} catch (ParseException e1) {
						e1.printStackTrace();
					}
					catch(Exception ec) {
						System.out.println(" ");
					}
				});
			 
			update.getAgeradio().setOnAction(e->{
				if(update.getAgeradio().isSelected()==true) {
					update.getAgetxt().setEditable(true);
				}
				else {
					update.getAgetxt().setEditable(false);
				}
			});
			update.getNameradio().setOnAction(e->{
				if(update.getNameradio().isSelected()==true) {
					update.getNametxt().setEditable(true);
				}
				else {
					update.getNametxt().setEditable(false);
				}
			});
			update.getDateradio().setOnAction(e->{
				if(update.getDateradio().isSelected()==true) {
					update.getDatetxt().setEditable(true);
				}
				else {
					update.getDatetxt().setEditable(false);
				}
			});
			update.getGenderradio().setOnAction(e->{
				if(update.getGenderradio().isSelected()==true) {
					update.getGendercombo().setDisable(false);
				}
				else {
					update.getGendercombo().setDisable(true);
				}
			});
			update.getStatusradio().setOnAction(e->{
				if(update.getStatusradio().isSelected()==true) {
					update.getStatuscombo().setDisable(false);
				}
				else {
					update.getStatuscombo().setDisable(true);
				}
			});
			update.getNo().setOnAction(e->{
				stage7.close();
			});
			view.getBt3().setOnAction(e->{
				try {
				statsc.getLocatetxt().setText(cur.getLocate());
			stage8.setScene(scene8)	;
			stage8.show();
			stage1.close();
				}
				catch(Exception ex) {
					System.out.println("Nullpointer");
				}
			});
			
			statsc.getMainpage().setOnAction(e->{
			stage8.close();	
			stage1.show();
			});
			
			// in stst screen to print the avl1 tree
			statsc.getAvl1button().setOnAction(e->{
				try {
				int count=0;
				avl1screen.getHeighttxt().setText(String.valueOf(cur.getAv1().getRoot().getHeight()));
				for (int i = 1; i <= elements.size(); i++) {
					count++;
				}
				avl1screen.getAvl1table().setItems(elements);
				avl1screen.getAvl1table().refresh();
				avl1screen.getHeighttxt().setEditable(false);
				avl1screen.getNumtxt().setEditable(false);
				avl1screen.getLocatetxt().setText(cur.getLocate());
				avl1screen.getNumtxt().setText(String.valueOf(count));
				stage9.setScene(scene9);
				stage9.show();
				stage1.close();
				stage8.close();
				}
				catch(Exception ex) {
					System.out.println(" ");
				}
			});
			
			avl1screen.getBack().setOnAction(e->{
			stage9.close();	
			stage8.show();
			});
			
			statsc.getAvl2button().setOnAction(e->{
				try {
				int count=0;
				elements2.clear();
				cur.getAv2().printList(cur.getAv2().getRoot());
				avl2screen.getHeighttxt().setText(String.valueOf(cur.getAv2().getRoot().getHeight()));
				for (int i = 1; i <= elements2.size(); i++) {
					count++;
				}
				avl2screen.getAvl2table().setItems(elements2);
			   NodeAvl2 result=cur.getAv2().datemax(cur.getAv2().getRoot());
			   avl2screen.getDatetxt().setText(String.valueOf(new SimpleDateFormat("MM/dd/yyyy").format(result.getD())));
				avl2screen.getAvl2table().refresh();
				avl2screen.getHeighttxt().setEditable(false);
				avl2screen.getNumtxt().setEditable(false);
				avl2screen.getDatetxt().setEditable(false);
				avl2screen.getLocatetxt().setText(cur.getLocate());
				avl2screen.getNumtxt().setText(String.valueOf(count));
				stage10.setScene(scene10);
				stage10.show();
				stage8.close();
				}
			
				catch(Exception ex) {
					System.out.println("null pointer because theres no location to print martyrs !!");}
			});
			
			avl2screen.getBack().setOnAction(e->{
				stage10.close();	
				stage8.show();
				stage1.close();
				});
			
			//report screen
			view.getBt5().setOnAction(e->{
				try {
						int count=0;
						int sum=0;
						int male=0;
						int female=0;
						int single=0;
						int married=0;
						int ageless18=0;
						int agegreat18=0;
						if(cur.getAv1().getRoot()!=null) {
							avl1screen.getHeighttxt().setText(String.valueOf(cur.getAv1().getRoot().getHeight()));
							for (int i = 0; i < elements.size(); i++) {
								sum+=elements.get(i).getAge();
								if(elements.get(i).getGender().equalsIgnoreCase("Male")||elements.get(i).getGender().equalsIgnoreCase("M")) {
									male++;
								}
								else {
									female++;
								}
								if(elements.get(i).getStatus().equalsIgnoreCase("Single")|| elements.get(i).getStatus().equalsIgnoreCase("S")) {
									single++;
								}
								else {
									married++;
								}
								if(elements.get(i).getAge()<18) {
									ageless18++;
								}
								else {
									agegreat18++;
								}
								count++;
							}
							double res=sum*1.0/count;
							report.getLocstattxt().setText(cur.getLocate());
							report.getMaletxt().setText(String.valueOf(male));
							report.getFemaletxt().setText(String.valueOf(female));
							report.getSingletxt().setText(String.valueOf(single));
							report.getMarriedtxt().setText(String.valueOf(married));
							report.getLess18txt().setText(String.valueOf(ageless18));
							report.getAvgtxt().setText(String.valueOf(res));
							report.getGreat18txt().setText(String.valueOf(agegreat18));
							 NodeAvl2 result=cur.getAv2().datemax(cur.getAv2().getRoot());
							report.getDatedeath().setText(new SimpleDateFormat("MM/dd/yyyy").format(result.getD()));
							report.getTotaldeathtxt().setText(String.valueOf(count));
							}
							else {
								double res=sum*1.0/count;
								report.getLocstattxt().setText(cur.getLocate());
								report.getMaletxt().setText(String.valueOf(male));
								report.getFemaletxt().setText(String.valueOf(female));
								report.getSingletxt().setText(String.valueOf(single));
								report.getMarriedtxt().setText(String.valueOf(married));
								report.getLess18txt().setText(String.valueOf(ageless18));
								report.getAvgtxt().setText(String.valueOf(res));
								report.getGreat18txt().setText(String.valueOf(agegreat18));
								report.getDatedeath().setText("NoN");
								report.getTotaldeathtxt().setText(String.valueOf(count));
								
							}
						report.getLocstattxt().setEditable(false);
						report.getMaletxt().setEditable(false);
						report.getFemaletxt().setEditable(false);
						report.getSingletxt().setEditable(false);
						report.getMarriedtxt().setEditable(false);
						report.getAvgtxt().setEditable(false);
						report.getDatedeath().setEditable(false);
						report.getTotaldeathtxt().setEditable(false);
				stage11.setScene(scene11);
				stage11.show();
				}catch(Exception ex) {
					System.out.println("Null Pointer theres no  location ");
				}
			});
			report.getMainpage().setOnAction(e->{
				stage11.close();
			});
			
			report.getNext().setOnAction(e->{
				try {
					int count=0;
					int sum=0;
					int male=0;
					int female=0;
					int single=0;
					int married=0;
					int ageless18=0;
					int agegreat18=0;
					if (cur == null) {
						cur = list.firstd;
					 	NodeAvl1 current = cur.getAv1().getRoot();
					 	elements.clear();
					 	locate.getLocatemarttab().getItems().clear();
					 	marty.getMartyrstable().getItems().clear();
					    cur.getAv1().printList(current);
                        locate.getLocatemarttab().setItems(elements);
                        marty.getMartyrstable().setItems(elements);
                        locate.getLocatemarttab().refresh();
                        marty.getMartyrstable().refresh();
                        locate.getCombo().setValue(cur.getLocate());
                        marty.getCombo().setValue(cur.getLocate());
                        locate.getCombo().setPromptText(cur.getLocate());
						marty.getCombo().setPromptText(cur.getLocate());
					
						
					} else {
						cur = cur.getNext();
						NodeAvl1 current = cur.getAv1().getRoot();
						locate.getLocatemarttab().getItems().clear();
						marty.getMartyrstable().getItems().clear();
                        elements.clear();
                        locate.getLocatemarttab().refresh();
                        marty.getMartyrstable().refresh();
                        cur.getAv1().printList(current);
                        locate.getLocatemarttab().setItems(elements);
                        marty.getMartyrstable().setItems(elements);
                        locate.getCombo().setValue(cur.getLocate());
                        marty.getCombo().setValue(cur.getLocate());
                        locate.getCombo().setPromptText(cur.getLocate());
						marty.getCombo().setPromptText(cur.getLocate());
                        locate.getLocatemarttab().refresh();
                        marty.getMartyrstable().refresh();
                       
					}
					if(cur.getAv1().getRoot()!=null) {
						avl1screen.getHeighttxt().setText(String.valueOf(cur.getAv1().getRoot().getHeight()));
						for (int i = 0; i < elements.size(); i++) {
							sum+=elements.get(i).getAge();
							if(elements.get(i).getGender().equalsIgnoreCase("Male")||elements.get(i).getGender().equalsIgnoreCase("M")) {
								male++;
							}
							else {
								female++;
							}
							if(elements.get(i).getStatus().equalsIgnoreCase("Single")|| elements.get(i).getStatus().equalsIgnoreCase("S")) {
								single++;
							}
							else {
								married++;
							}
							if(elements.get(i).getAge()<18) {
								ageless18++;
							}
							else {
								agegreat18++;
							}
							count++;
						}
						double res=sum*1.0/count;
						report.getLocstattxt().setText(cur.getLocate());
						report.getMaletxt().setText(String.valueOf(male));
						report.getFemaletxt().setText(String.valueOf(female));
						report.getSingletxt().setText(String.valueOf(single));
						report.getMarriedtxt().setText(String.valueOf(married));
						report.getLess18txt().setText(String.valueOf(ageless18));
						report.getAvgtxt().setText(String.valueOf(res));
						report.getGreat18txt().setText(String.valueOf(agegreat18));
						 NodeAvl2 result=cur.getAv2().datemax(cur.getAv2().getRoot());
						report.getDatedeath().setText(new SimpleDateFormat("MM/dd/yyyy").format(result.getD()));
						report.getTotaldeathtxt().setText(String.valueOf(count));
						}
						else {
							double res=sum*1.0/count;
							report.getLocstattxt().setText(cur.getLocate());
							report.getMaletxt().setText(String.valueOf(male));
							report.getFemaletxt().setText(String.valueOf(female));
							report.getSingletxt().setText(String.valueOf(single));
							report.getMarriedtxt().setText(String.valueOf(married));
							report.getLess18txt().setText(String.valueOf(ageless18));
							report.getAvgtxt().setText(String.valueOf(res));
							report.getGreat18txt().setText(String.valueOf(agegreat18));
							report.getDatedeath().setText("NoN");
							report.getTotaldeathtxt().setText(String.valueOf(count));
							
						}
					
				} catch (Exception ex) {
					System.out.print("nulllll");
				}

			});
			report.getPrev().setOnAction(e->{
				try {
					int count=0;
					int sum=0;
					int male=0;
					int female=0;
					int single=0;
					int married=0;
					int ageless18=0;
					int agegreat18=0;
					if (cur == null) {
						cur = list.last;
						NodeAvl1 current = cur.getAv1().getRoot();
						elements.clear();
					 	locate.getLocatemarttab().getItems().clear();
					 	marty.getMartyrstable().getItems().clear();
					 	locate.getLocatemarttab().refresh();
					 	marty.getMartyrstable().refresh();
					    cur.getAv1().printList(current);
                        locate.getLocatemarttab().setItems(elements);
                        marty.getMartyrstable().setItems(elements);
                        locate.getLocatemarttab().refresh();
                        marty.getMartyrstable().refresh();
                        locate.getCombo().setValue(cur.getLocate());
                        marty.getCombo().setValue(cur.getLocate());
                        locate.getCombo().setPromptText(cur.getLocate());
                        marty.getCombo().setPromptText(cur.getLocate());
					}
					else {
						cur=cur.getPrevious();
						NodeAvl1 current = cur.getAv1().getRoot();
						locate.getCombo().setValue(cur.getLocate());
						elements.clear();
						locate.getLocatemarttab().getItems().clear();
						marty.getMartyrstable().getItems().clear();
						locate.getLocatemarttab().refresh();
						marty.getMartyrstable().refresh();
						cur.getAv1().printList(current);
						locate.getLocatemarttab().setItems(elements);
						marty.getMartyrstable().setItems(elements);
                        locate.getLocatemarttab().refresh();
                        marty.getMartyrstable().refresh();
                        locate.getCombo().setValue(cur.getLocate());
                        marty.getCombo().setValue(cur.getLocate());
                        locate.getCombo().setPromptText(cur.getLocate());
                        marty.getCombo().setPromptText(cur.getLocate());
					}
					if(cur.getAv1().getRoot()!=null) {
						avl1screen.getHeighttxt().setText(String.valueOf(cur.getAv1().getRoot().getHeight()));
						for (int i = 0; i < elements.size(); i++) {
							sum+=elements.get(i).getAge();
							if(elements.get(i).getGender().equalsIgnoreCase("Male")||elements.get(i).getGender().equalsIgnoreCase("M")) {
								male++;
							}
							else {
								female++;
							}
							if(elements.get(i).getStatus().equalsIgnoreCase("Single")|| elements.get(i).getStatus().equalsIgnoreCase("S")) {
								single++;
							}
							else {
								married++;
							}
							if(elements.get(i).getAge()<18) {
								ageless18++;
							}
							else {
								agegreat18++;
							}
							count++;
						}
						double res=sum*1.0/count;
						report.getLocstattxt().setText(cur.getLocate());
						report.getMaletxt().setText(String.valueOf(male));
						report.getFemaletxt().setText(String.valueOf(female));
						report.getSingletxt().setText(String.valueOf(single));
						report.getMarriedtxt().setText(String.valueOf(married));
						report.getLess18txt().setText(String.valueOf(ageless18));
						report.getAvgtxt().setText(String.valueOf(res));
						report.getGreat18txt().setText(String.valueOf(agegreat18));
						 NodeAvl2 result=cur.getAv2().datemax(cur.getAv2().getRoot());
						report.getDatedeath().setText(new SimpleDateFormat("MM/dd/yyyy").format(result.getD()));
						report.getTotaldeathtxt().setText(String.valueOf(count));
						}
						else {
							double res=sum*1.0/count;
							report.getLocstattxt().setText(cur.getLocate());
							report.getMaletxt().setText(String.valueOf(male));
							report.getFemaletxt().setText(String.valueOf(female));
							report.getSingletxt().setText(String.valueOf(single));
							report.getMarriedtxt().setText(String.valueOf(married));
							report.getLess18txt().setText(String.valueOf(ageless18));
							report.getAvgtxt().setText(String.valueOf(res));
							report.getGreat18txt().setText(String.valueOf(agegreat18));
							report.getDatedeath().setText("NoN");
							report.getTotaldeathtxt().setText(String.valueOf(count));
						}
				}
				
				catch (Exception ex) {
					System.out.print("nulllll");
				}
				
			});
			view.getBt4().setOnAction(e->{
				try {
					// we use the file chooser to make the user to choose the file 
				FileChooser file = new FileChooser();
				File file1 = file.showOpenDialog(stage1);
				String r="";
				cur = list.firstd;
					FileWriter f = new FileWriter(file1);
					// we go throw the for loop the time complexity is o(n)
				for(int i = 0; i <list.countd; i++) {
					cur.getAv1().printonfile(cur.getAv1().getRoot(),cur);
					cur=cur.getNext();
				}
					
				for (int i = 0; i <save.size(); i++) {
					r=r+"\n"+save.get(i).toString();	
				}
				f.write(r);
				
					f.close();
					// we must close the file 
					
					// we catch the exceptions if we have an error like filenotexist 
					// we have another error if the user does not choose a file so read from null
				
				} catch (IOException e1) {
					System.out.print("File are Not Exist!!");
				}
				catch (Exception ex) {
					System.out.println("You are Not Choose an file please try again !!! ");
				}
 
			});
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws ParseException {

		launch(args);
	}
}
