package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
     List<ForumUser> forumUserList = new ArrayList<>();

     public Forum () {
          forumUserList.add(new ForumUser(1, "User1", 'M', LocalDate.of(1980,1,1), 11 ));
          forumUserList.add(new ForumUser(2, "User2", 'F', LocalDate.of(1980,12,31), 22 ));
          forumUserList.add(new ForumUser(3, "User3", 'F', LocalDate.of(2003, 1,1), 33 ));
          forumUserList.add(new ForumUser(4, "User4", 'M', LocalDate.of(2000, 1,1), 44 ));
     }

     public  List<ForumUser> getUserList() {
          return new ArrayList<>(forumUserList);
     }
}
