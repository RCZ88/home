package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController implements Initializable{
	public static ArrayList<String> UsernameList = new ArrayList<String>();
	public static ArrayList<String> PasswordList = new ArrayList<String>();
	public static ArrayList <Integer> PfpList = new ArrayList<Integer>();
	
	@FXML
	private Label loginMenu, username, password, wrongPOU;
	
	@FXML
	private TextField usernameBox;
	
	@FXML
	private PasswordField passwordBox;
	
	@FXML
	private Button loginButton;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		if(RegisterController.registerNew) {
			UsernameList.add(RegisterController.inputUsername);
			PasswordList.add(RegisterController.inputPassword);
			PfpList.add(RegisterController.imageID);
		}
		wrongPOU.setText("");
		System.out.println("\n");
		 /*for (int i = 0; i < UsernameList.size(); i++) {
	            System.out.println(UsernameList.get(i));
	            System.out.println(PasswordList.get(i));
	            System.out.println(PfpList.get(i));
	        }
		*/
	}
	
	public static String inputtedUsername;
	private String inputtedPassword;
	
	private Stage stage;
	
	public void enterUsername() {
		inputtedUsername = usernameBox.getText();
	}
	
	public void enterPassword() {
		inputtedPassword = passwordBox.getText();
	}
	public static int serialNumber = 0;
	public void login(ActionEvent e) throws IOException {
	    enterUsername();
	    enterPassword();
	    int iU = UsernameList.indexOf(inputtedUsername);
	    int iP = PasswordList.indexOf(inputtedPassword);
	    serialNumber = iU;
	    if (UsernameList.contains(inputtedUsername)&&PasswordList.contains(inputtedPassword)&&iU == iP) {
	        Parent root = FXMLLoader.load(getClass().getResource("WebView.fxml"));
	        Scene scene = new Scene(root);
	        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
	        stage.setScene(scene);
	        stage.show();
	    }else {
	    	wrongPOU.setText("Invalid password or username");
	    }
	}
	public void register(ActionEvent e) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("RegisterPage.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
	}

}
