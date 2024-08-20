import java.util.Scanner;

public class QuestionService { 
        
         String userSelection[] = new String[5];
    

        Question[] questions = new Question[5];
        public QuestionService(){

                questions[0]= new Question(1,"what is language","java","cpp","python","c","java");

                questions[1] = new Question(2, "What is the capital of France?", "Berlin", "Madrid", "Paris", "Rome", "Paris");

                questions[2] = new Question(3, "Which planet is known as the Red Planet?", "Earth", "Mars", "Jupiter", "Venus", "Mars");

                questions[3] = new Question(4, "What is the largest ocean on Earth?", "Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean", "Pacific Ocean");

                questions[4] = new Question(5, "Who wrote 'To Kill a Mockingbird'?", "Ernest Hemingway", "Harper Lee", "Mark Twain", "F. Scott Fitzgerald", "Harper Lee");

        }

        public void playQuiz()
       
        {

            int i = 0;
            Scanner input = new Scanner(System.in); // Initialize the Scanner outside the loop
            for (Question q : questions) {
                System.out.println("Question No: " + q.getId());
                System.out.println(q.getQuestion());
                System.out.println("a) " + q.getOptions()[0]);
                System.out.println("b) " + q.getOptions()[1]);
                System.out.println("c) " + q.getOptions()[2]);
                System.out.println("d) " + q.getOptions()[3]);
            
                System.out.println("Enter your answer (a, b, c, or d):");
                userSelection[i] = input.nextLine(); // Capture user's input
                i++;
            }

            System.out.println("you are Completed !");
            System.out.println("Selected answers are given below");
            for (String  s : userSelection) {
                //Question ans = questions[i];
                System.out.println("Option :" + s );
                
            }
           
            
        }

    

public void printScore(){
            int score = 0;
              for(int i = 0; i < questions.length;i++){
                Question que = questions[i];
                String actualAns = que.getAnswer();
                String userAns  = userSelection[i];

                switch (userAns.toLowerCase()) {
                case "a": userAns = que.getOptions()[0]; break;
                case "b": userAns = que.getOptions()[1]; break;
                case "c": userAns = que.getOptions()[2]; break;
                case "d": userAns = que.getOptions()[3]; break;
                default: userAns = ""; // Invalid option
            }
                    
                 if (actualAns.equals(userAns)) {
                          score++;
                     }
                }

                
                System.out.println(" correct ans");
                for (int i =0 ; i< questions.length;i++ ) {
                       
                      Question ans = questions[i];
                      System.out.println(   "  : " + ans.getAnswer() );
                    
                }  
              System.out.println("Your score: " + score + " out of  " + questions.length);

    } 
        
    
    
}
