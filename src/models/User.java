package src.models;

public class User {
    private String name;
    private int age;
    private double weight;
    private double height;
    private double totalCaloriesBurned;
    private double totalCaloriesIntake;

    public User(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.totalCaloriesBurned = 0;
        this.totalCaloriesIntake = 0;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public double getWeight() { return weight; }
    public double getHeight() { return height; }
    
    public double getTotalCaloriesBurned() { return totalCaloriesBurned; }
    public void addCaloriesBurned(double calories) { this.totalCaloriesBurned += calories; }

    public double getTotalCaloriesIntake() { return totalCaloriesIntake; }
    public void addCaloriesIntake(double calories) { this.totalCaloriesIntake += calories; }
}
