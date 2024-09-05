package src.models;

import java.time.LocalDateTime;

public class Workout {
    private String type;
    private double duration; // in minutes
    private double caloriesBurned;
    private LocalDateTime timestamp;

    public Workout(String type, double duration, double caloriesBurned) {
        this.type = type;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
        this.timestamp = LocalDateTime.now();
    }

    public String getType() { return type; }
    public double getDuration() { return duration; }
    public double getCaloriesBurned() { return caloriesBurned; }
    public LocalDateTime getTimestamp() { return timestamp; }
}
