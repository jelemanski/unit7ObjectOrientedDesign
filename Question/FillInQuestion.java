import 
public class FillInQuestion extends Question
{
   public void setText(String questionText )
   {
       /*
        * "the inventor of java was _James Gosling_.
        * 
        * text: "the inventor of Java was ______"
        * answer: "James Gosling"
        */
       Scanner parser = new Scanner(questionText);
       parser.useDelimiter("_");
       String question = parser.next();
       String answer = parser.next();
       question += "______" + parser.next();
       //we have to explicitly state that we want to invoke the superclass' setText method
       super.setText(question);
       //we dont have to specify anything before setAnswer, but we could specify this or super
       this.setAnswer(answer);
       
    }

}
