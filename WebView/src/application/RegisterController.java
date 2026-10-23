package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class RegisterController implements Initializable{
	
	@FXML
	private Label registerMenu, infoRegister, setA1, setA2, confirmYour1, usernameSet, passwordSet, passwordCon, notMatch, selectA, pfpText, userExist;
	
	@FXML
	private TextField usernameBox, passwordBox, passwordConBox;
	
	@FXML
	private Button registerButton, prevButton, nextButton, exitButton;
	
	@FXML
	private ImageView pfp;
	
	Image myImage = new Image(getClass().getResourceAsStream("PFP1.jpg"));
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		notMatch.setText("");
		userExist.setText("");
		System.out.println("\n");
		/* (int i = 0; i < LoginController.UsernameList.size(); i++) {
	        System.out.println(LoginController.UsernameList.get(i));
	        System.out.println(LoginController.PasswordList.get(i));
	        System.out.println(LoginController.PfpList.get(i));
	    }*/
	}
	public static boolean registerNew = false;
	private Stage stage;
	
	public static String inputUsername;
	public static String inputPassword;
	
	private String confirmationPassword;
	
	private boolean originalName = false;
	public void enterUsername() {
		inputUsername = usernameBox.getText();
		if(LoginController.UsernameList.contains(inputUsername)) {
			userExist.setText("Username already exist!");
		}else {
			originalName = true;
		}
	}
	public void enterPassword() {
		inputPassword = passwordBox.getText();
	}
	public void enterPasswordCon() {
		confirmationPassword = passwordConBox.getText();
	}
	
	public void register(ActionEvent e) throws IOException {
	    enterUsername();
	    enterPassword();
	    enterPasswordCon();
	    if(originalName) {
	    	if(inputPassword.equals(confirmationPassword)) {
		    	registerNew = true;
		    	Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
		        Scene scene = new Scene(root);
		        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
		        stage.setScene(scene);
		        stage.show();
		        
			}else {
				notMatch.setText("Passwords do not match");
			}
	    }
	}
	public static int imageID = 1;
	public void prevPicture() {
		if(imageID>1) {
			imageID--;
		}else {
			imageID = 3;
		}
		myImage = new Image(getClass().getResourceAsStream("PFP"+imageID+".jpg"));
		pfp.setImage(myImage);
	}
	public void nextPicture() {
		if(imageID<3) {
			imageID++;
		}else {
			imageID = 1;
		}
		myImage = new Image(getClass().getResourceAsStream("PFP"+imageID+".jpg"));
		pfp.setImage(myImage);
	}
	public void exit(ActionEvent e) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
	}
}
