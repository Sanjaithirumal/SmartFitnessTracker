package src.controllers;

import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import src.models.User;

public class DashboardController {

    @FXML private LineChart<String, Number> progressChart;
    @FXML private Label totalCaloriesBurned;
    @FXML private Label totalCaloriesIntake;

    private User user;

    public void initialize() {
        // Load user data (for simplicity, we'll just create a user here)
        user = new User("John Doe", 30, 70, 1.75);

        // Update the dashboard
        totalCaloriesBurned.setText(String.valueOf(user.getTotalCaloriesBurned()));
        totalCaloriesIntake.setText(String.valueOf(user.getTotalCaloriesIntake()));

        // Add data to the progress chart
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.getData().add(new XYChart.Data<>("Day 1", 200));
        series.getData().add(new XYChart.Data<>("Day 2", 300));
        series.getData().add(new XYChart.Data<>("Day 3", 400));
        progressChart.getData().add(series);
    }
}
