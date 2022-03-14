package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ForumUser {

    private String name;
    private String realName;
    private List<ForumPost> posts = new ArrayList<>();
    private List<ForumComment> comments = new LinkedList<>();

    public ForumUser(String name, String realName) {
        //name visible on forum
        this.name = name;
        //real name of the user
        this.realName = realName;
    }

    public void addPost(String author, String postBody) {
        ForumPost thePost = new ForumPost(postBody, author);
        posts.add(thePost);
    }

    public void addComment(ForumPost thePost, String author, String commentBody) {   // [16]
        ForumComment theComment = new ForumComment(thePost, commentBody, author);
        comments.add(theComment);
    }                                                           // [17]

    public int getPostsQuantity() {                             // [18]
        return posts.size();                                    // [19]
    }                                                           // [20]

    public int getCommentsQuantity() {                          // [21]
        return comments.size();
    }                                                           // [23]

    public ForumPost getPost(int postNumber) {                  // [24]
        if (postNumber >= 0 && postNumber < posts.size()) {
            return posts.get(postNumber);
        }
        return null;
    }                                                           // [26]

    public ForumComment getComment(int commentNumber) {         // [27]
        ForumComment theComment = null;
        if (commentNumber >= 0 && commentNumber < comments.size()) {
            theComment = comments.get(commentNumber);
        }
        return theComment;
    }                                                           // [29]

    public boolean removePost(ForumPost thePost) {              // [30]
        boolean result = false;
        if (posts.contains(thePost)) {
            posts.remove(thePost);
            result = true;
        }
        return result;
    }                                                           // [32]

    public boolean removeComment(ForumComment theComment) {     // [33]
        boolean result = false;
        if (comments.contains(theComment)) {
            comments.remove(theComment);
            result = true;
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }
}
