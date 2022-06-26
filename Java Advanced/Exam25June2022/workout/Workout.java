package workout;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Workout {
    private List<Exercise> exercises;
    private String type;
    private int exerciseCount;

    public Workout(String type, int exerciseCount) {
        this.type = type;
        this.exerciseCount = exerciseCount;
        this.exercises = new ArrayList<>();
    }

    public void addExercise(Exercise exercise){
        if(this.exercises.size() < exerciseCount){
            exercises.add(exercise);
        }
    }

    public boolean removeExercise(String name, String muscle){
        return this.exercises.removeIf(s -> s.getName().equals(name) && s.getMuscle().equals(muscle));
    }

    public Exercise getExercise(String name, String muscle){
        return this.exercises.stream().filter(s -> s.getName().equals(name) && s.getMuscle().equals(muscle)).findFirst().orElse(null);
    }

    public Exercise getMostBurnedCaloriesExercise(){
        return this.exercises.stream().max(Comparator.comparing(Exercise::getBurnedCalories)).orElse(null);
    }

    public int getExerciseCount(){
        return this.exercises.size();
    }

    public String getStatistics(){
        return "Workout type: " + this.type + System.lineSeparator() +
                this.exercises.stream().map(Exercise::toString).collect(Collectors.joining(System.lineSeparator()));
    }

}
