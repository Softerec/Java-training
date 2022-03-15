package com.kodilla.testing.forum;

public class ForumStatistics {
    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPost;

    void calculateAdvStatistics(Statistics  statistics) {
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        if (usersCount != 0) {
            postsPerUser = postsCount / usersCount;
            commentsPerUser = commentsCount / usersCount;
        }else{
            postsPerUser = 0;
            commentsPerUser = 0;
        }
        if ( postsCount == 0 )
            commentsPerPost = 0;
        else
            commentsPerPost = commentsCount / postsCount;
    }

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }
}
