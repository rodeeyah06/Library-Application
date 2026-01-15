package org.example.model;

public class BookRequest {

    private User user;
    private String title;
   private long timeStamp;

   public BookRequest(User user, String title) {
       this.user = user;
       this.title = title;
       this.timeStamp = timeStamp;

   }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }



    @Override
    public String toString() {
        return "BookRequest{" +
                "user=" + user +
                ", title='" + title + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }
}
