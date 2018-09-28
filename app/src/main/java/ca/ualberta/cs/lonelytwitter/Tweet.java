package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Tweet {
    protected String message;
    protected Date date;
    //private Date date;
    //private String message;
    //private static final Integer MAX_CHARS = 140;

    //Empty argument constructor with default values
    //Tweet() {
        //Must use the 'this' keyword in order to specify the current object message = message does nothing!
      //  this.date = new Date();
        //this.message = "I am default message schwa!";
    //}

    //Overloading: so that we can specify the tweet content
    //Tweet(String message) {
     //   this.date = new Date();
       // this.message = message;
    //}


    public void setMessage(String message) throws TweetTooLongException {
        if (message.length()>140){
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public void setDate(Date date){
        this.date = date;
    }
    public String getMessage() {
        return this.message;
    }

    public Date getDate() { return this.date; }

    //No method body implemented! We leave that up to the subclasses (they MUST implement it)
    public abstract Boolean isImportant();

    public String toString(){
        return this.date.toString()+" | " + this.message;
    }
}
