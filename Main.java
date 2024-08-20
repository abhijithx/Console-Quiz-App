public class Main{

    public static void main(String[] args){
       
        

        QuestionService service = new QuestionService();
        service.playQuiz();
        service.printScore();

    }
}



// import java.util.Scanner;

// public class QuestionService { 
        
//     String[] userSelection = new String[5];
//     Question[] questions = new Question[5];
    
//     public QuestionService() {
//         // Initialize questions
//         questions[0] = new Question(1, "What is language?", "java", "cpp", "python", "c", "java");
//         questions[1] = new Question(2, "What is the capital of France?", "Berlin", "Madrid", "Paris", "Rome", "Paris");
//         questions[2] = new Question(3, "Which planet is known as the Red Planet?", "Earth", "Mars", "Jupiter", "Venus", "Mars");
//         questions[3] = new Question(4, "What is the largest ocean on Earth?", "Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean", "Pacific Ocean");
//         questions[4] = new Question(5, "Who wrote 'To Kill a Mockingbird'?", "Ernest Hemingway", "Harper Lee", "Mark Twain", "F. Scott Fitzgerald", "Harper Lee");
//     }

//     public void playQuiz() {
//         Scanner input = new Scanner(System.in);
//         int i = 0;
        
//         for (Question q : questions) {
//             System.out.println("Question No: " + q.getId());
//             System.out.println(q.getQuestion());
//             System.out.println("a) " + q.getOptions()[0]);
//             System.out.println("b) " + q.getOptions()[1]);
//             System.out.println("c) " + q.getOptions()[2]);
//             System.out.println("d) " + q.getOptions()[3]);
            
//             System.out.println("Enter your answer (a, b, c, or d):");
//             userSelection[i] = input.nextLine();
//             i++;
//         }

//         System.out.println("You have completed the quiz!");
//         System.out.println("Selected answers are given below:");
//         for (String s : userSelection) {
//             System.out.println("Option: " + s);
//         }
//     }

//     public void printScore() {
//         int score = 0;
//         for (int i = 0; i < questions.length; i++) {
//             Question que = questions[i];
//             String correctAnswer = que.getAnswer();
//             String userAnswer = userSelection[i];
            
//             // Convert user's option to the correct answer
//             switch (userAnswer.toLowerCase()) {
//                 case "a": userAnswer = que.getOptions()[0]; break;
//                 case "b": userAnswer = que.getOptions()[1]; break;
//                 case "c": userAnswer = que.getOptions()[2]; break;
//                 case "d": userAnswer = que.getOptions()[3]; break;
//                 default: userAnswer = ""; // Invalid option
//             }

//             if (correctAnswer.equals(userAnswer)) {a
//                 score++;
//             }
//         }
//         System.out.println("Your score: " + score + " out of " + questions.length);
//     }
// }



// public class Question {
//     private int id;
//     private String question;
//     private String[] options;
//     private String answer;a

//     public Question(int id, String question, String option1, String option2, String option3, String option4, String answer) {
//         this.id = id;
//         this.question = question;
//         this.options = new String[] { option1, option2, option3, option4 };
//         this.answer = answer;
//     }

//     public int getId() {
//         return id;
//     }

//     public String getQuestion() {
//         return question;
//     }

//     public String[] getOptions() {
//         return options;
//     }

//     public String getAnswer() {
//         return answer;
//     }
// }

