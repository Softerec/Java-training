package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum theUserList = new Forum();
        Map<Integer, ForumUser> theResultDirectory = theUserList.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getBirthDate().getYear() < 2002)
                .filter(user -> user.getPublishedPostsCount() > 1)
                .collect(Collectors.toMap(ForumUser::getUi, user -> user));

        theResultDirectory.entrySet().stream()
                .map(entry -> entry.getKey() + " : " + entry.getValue())
                        .forEach(System.out::println);
    }
}