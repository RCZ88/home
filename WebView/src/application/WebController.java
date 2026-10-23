package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class WebController implements Initializable{
	@FXML
	private WebView webView;
	
	@FXML
	private TextField searchBar;
	
	private WebEngine engine;
	
	@FXML
	private Button loadButton, refreshButton, zoomInButton, zoomOutButton, Button, backButton, forwardButton, logOutButton;
	
	@FXML
	private ComboBox<String> zoomBox;
	
	@FXML
	private WebHistory history;
	
	@FXML
	private Label welcomeText;
	
	@FXML
	private ImageView pfp;
	
	@FXML
	private AnchorPane anchorPane;
	
	private String homePage;
	private Stage stage;
	
	private int[] zoom = {25,50,75,100,125,150,175,200};
	private int zoomLevel = 3;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		RegisterController.registerNew = false;
		Image myImage = new Image(getClass().getResourceAsStream("PFP1.jpg"));
		homePage =  "https://www.google.com";
		searchBar.setText(homePage);
		myImage = new Image(getClass().getResourceAsStream("PFP"+LoginController.PfpList.get(LoginController.serialNumber)+".jpg"));
		pfp.setImage(myImage);
		welcomeText.setText(LoginController.inputtedUsername);
		for(int i = 0; i<zoom.length; i++) {
			
			zoomBox.getItems().add(Integer.toString(zoom[i])+"%");
			
		}
		engine = webView.getEngine();
		loadPage();
	}
	public void loadPage() {
		engine.load(searchBar.getText());
	}
	public void refreshPage() {
		engine.reload();
	}
	public void zoomPage() {
	    if (zoomBox.getValue() == null) {
	        webView.setZoom(1.0);
	    } else {
	        double zoomLevel = Integer.parseInt(((String) zoomBox.getValue()).replaceAll("[^0-9]", "")) * 0.01;
	        webView.setZoom(zoomLevel);
	    }
	}
	public void zoomIn() {
		if(zoomLevel<zoom.length-1) {
			zoomLevel++;
			updateZoom();
		}
	}
	public void zoomOut() {
		if(zoomLevel>0) {
			zoomLevel--;
			updateZoom();
		}
	}
	public void updateZoom() {
		zoomBox.getSelectionModel().select(zoomLevel);
        zoomPage();
	}
	public void displayHistory() {
		history = engine.getHistory();
		ObservableList<WebHistory.Entry> entries = history.getEntries();
		for(WebHistory.Entry entry:entries) {
			System.out.println(entry.getUrl());
		}
	}
	public void forward() {
		history = engine.getHistory();
		ObservableList<WebHistory.Entry> entries = history.getEntries();
		int currentIndex = history.getCurrentIndex();
		if (currentIndex < history.getEntries().size() - 1) {
	        history.go(1);
	        String newURL = history.getEntries().get(currentIndex + 1).getUrl();
	        updateSearchBar(newURL);
	    }
	}
	public void back() {
		history = engine.getHistory();
		ObservableList<WebHistory.Entry> entries = history.getEntries();
		int currentIndex = history.getCurrentIndex();
		if (currentIndex > 0) {
			history.go(-1);
			String newURL = history.getEntries().get(currentIndex - 1).getUrl();
	        updateSearchBar(newURL);
		}
	}
	private void updateSearchBar(String newURL) {
	    searchBar.setText(newURL);
	}
	public void logOut(ActionEvent e) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
	}
}
