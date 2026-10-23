package application;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class Controller {

    @FXML
    private Button startButton, stopButton, resetButton;
    @FXML
    private Label time;
    @FXML
    private AnchorPane pane;

    private Timeline timeline;
    private int seconds = 0;
    private int minutes = 0;

    @FXML
    public void startTimer() {
        startButton.setDisable(true);
        stopButton.setDisable(false);
        resetButton.setDisable(true);

        timeline = new Timeline(new KeyFrame(Duration.seconds(1), this::updateTime));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    @FXML
    public void stopTimer() {
        startButton.setDisable(false);
        stopButton.setDisable(true);
        resetButton.setDisable(false);

        if (timeline != null) {
            timeline.stop();
        }
    }

    @FXML
    public void resetTimer() {
        System.out.println("Reset button clicked"); // Add this line for debugging
        startButton.setDisable(false);
        stopButton.setDisable(true);
        resetButton.setDisable(true);

        seconds = -1;
        minutes = 0;
        updateTime(null);
    }


    private void updateTime(ActionEvent event) {
        seconds++;
        if (seconds == 60) {
            seconds = 0;
            minutes++;
        }

        // Check if the timer has reached one hour (60 minutes)
        if (minutes == 60) {
            // If it has, reset both minutes and seconds to zero
            minutes = 0;
            seconds = 0;
        }

        String formattedTime = String.format("%02d:%02d", minutes, seconds);
        time.setText(formattedTime);
    }
}
