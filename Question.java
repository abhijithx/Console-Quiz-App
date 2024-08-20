import java.util.Arrays;
import java.util.Scanner;

public class Question{
    private int id;
    private String question;
    private String[] options;
    private String answer;


    
    public Question(int id, String question, String opt1, String opt2, String opt3, String opt4, String answer) {
        this.id = id;
        this.question = question;
        this.options = new String[] { opt1, opt2, opt3, opt4 };
        this.answer = answer;
    }



    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public String getQuestion() {
        return question;
    }



    public void setQuestion(String question) {
        this.question = question;
    }



    public String[] getOptions() {
        return options;
    }



    public void setOptions(String[] options) {
        this.options = options;
    }



    public String getAnswer() {
        return answer;
    }



    public void setAnswer(String answer) {
        this.answer = answer;
    }



    @Override
    public String toString() {
        return "Question [id=" + id + ", question=" + question + ", options=" + Arrays.toString(options) + ", answer="
                + answer + "]";
    }
        
    
    

    
}