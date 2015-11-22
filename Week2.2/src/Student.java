/**
 * Created by Joep on 16-Nov-15.
 * Implement a class Student. For the purpose of this exercise, a student has a name
 * and a total quiz score. Supply an appropriate constructor and methods getName(),
 * addQuiz(int score), getTotalScore(), and getAverageScore(). To compute the latter, you
 * also need to store the number of quizzes that the student took.
 */
public class Student {
    private String name;
    private int totalQuizScore, amountOfQuizzes;


    public Student(String studentName) {
        this.name = studentName;
    }

    public String getName() {
        return name;
    }

    public void addQuiz(int score) {
        if (score <= 100) {
            this.totalQuizScore = this.totalQuizScore + score;
            amountOfQuizzes++;
        }else{
            System.out.println("Error: entered score exceeded limit.");
        }
    }

    public String getTotalScore(){
        return ("Student "+ name + "has achieved a total score of "+ totalQuizScore + ".");
    }

    public String getAverageScore(){
        return ("Student "+ name + "has achieved an average score of "+ totalQuizScore/amountOfQuizzes + ".");
    }
}
