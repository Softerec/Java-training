package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int ui;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int publishedPostsCount;

    public ForumUser(final int ui, final String userName, final char sex,
                     final LocalDate birthDate, final int publishedPostsCount) {
        this.ui = ui;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.publishedPostsCount = publishedPostsCount;
    }

    public int getUi() {
        return ui;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPublishedPostsCount() {
        return publishedPostsCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "ui=" + ui +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", publishedPostsCount=" + publishedPostsCount +
                '}';
    }
}
