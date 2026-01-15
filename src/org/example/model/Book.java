package org.example.model;

public class Book  {
    public String title;
    public String author;
    public int Copies;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title){
        this.title = title;

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCopies() {
        return Copies;
    }

    public void setCopies(int copies) {
        Copies = copies;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", Copies=" + Copies +
                '}';
    }

    public Book(String title, int copies) {
        this.title = title;
        this.author = author;
        Copies = copies;
    }
    public boolean IsAvailable() {
        return Copies > 0;
    }
   public void borrowBook() {
        if (!IsAvailable()) {
            throw new IllegalStateException("Book is not available");
        }
        Copies--;
   }
   public void returnBook() {
        Copies++;
   }
}
