package org.example.Service;

import org.example.model.Book;
import org.example.model.BookRequest;
import org.example.model.User;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class LibraryWithoutPriority {
    private Map<Integer, Book> books = new HashMap<>();
   private Queue<BookRequest> queue = new LinkedList<>();

   public void addBook(String title, String author, int copies) {
       books.put(Integer.valueOf(title), new Book(title, author, copies));

   }
   public String requestBook(User user, String title) {
       if (queue.isEmpty()) return "no request";

       BookRequest bookRequest = queue.poll();
       return "";
   }

}
