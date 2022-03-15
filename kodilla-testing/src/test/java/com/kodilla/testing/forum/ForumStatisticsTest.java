package com.kodilla.testing.forum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ForumStatisticsTest {

    private Statistics statisticsMock;

    @BeforeEach // initialize valid data for all
    private void getStatistics() {
        statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(2);
        when(statisticsMock.commentsCount()).thenReturn(16);
        List<String> users = List.of("User1", "User2", "User3", "User4");
        when(statisticsMock.usersNames()).thenReturn(users);
    }

    @DisplayName("When posts posts")
    @Test
    void testZeroPosts(){
        //Given - condition which is under test and rest are normal conditions
        when(statisticsMock.postsCount()).thenReturn(0); // test condition
        ForumStatistics forumStatisticsUnderTest = new ForumStatistics();
        //When
        forumStatisticsUnderTest.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatisticsUnderTest.getPostsCount());
        assertEquals(16, forumStatisticsUnderTest.getCommentsCount());
        assertEquals(4, forumStatisticsUnderTest.getUsersCount());
        assertEquals(0, forumStatisticsUnderTest.getPostsPerUser());
        assertEquals(0, forumStatisticsUnderTest.getCommentsPerPost());
        assertEquals(4, forumStatisticsUnderTest.getCommentsPerUser());
    }

    @DisplayName("When thousand posts")
    @Test
    void testThousandPosts(){
        // Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        ForumStatistics forumStatisticsUnderTest = new ForumStatistics();
        //When
        forumStatisticsUnderTest.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000, forumStatisticsUnderTest.getPostsCount());
        assertEquals(16, forumStatisticsUnderTest.getCommentsCount());
        assertEquals(4, forumStatisticsUnderTest.getUsersCount());
        assertEquals(250, forumStatisticsUnderTest.getPostsPerUser());
        assertEquals(0.016, forumStatisticsUnderTest.getCommentsPerPost(), 0.02);
        assertEquals(4, forumStatisticsUnderTest.getCommentsPerUser());
    }

    @DisplayName("When zero comments")
    @Test
    void testZeroComments(){
        // Given
        when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStatistics forumStatisticsUnderTest = new ForumStatistics();
        //When
        forumStatisticsUnderTest.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(2, forumStatisticsUnderTest.getPostsCount());
        assertEquals(0, forumStatisticsUnderTest.getCommentsCount());
        assertEquals(4, forumStatisticsUnderTest.getUsersCount());
        assertEquals(0.5, forumStatisticsUnderTest.getPostsPerUser(), 1);
        assertEquals(0, forumStatisticsUnderTest.getCommentsPerPost());
        assertEquals(0, forumStatisticsUnderTest.getCommentsPerUser());
    }

    @DisplayName("When more posts than comments")
    @Test
    void testMorePostsThanComments(){
        // Given
        when(statisticsMock.commentsCount()).thenReturn(1);
        when(statisticsMock.postsCount()).thenReturn(2);
        ForumStatistics forumStatisticsUnderTest = new ForumStatistics();
        //When
        forumStatisticsUnderTest.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(2, forumStatisticsUnderTest.getPostsCount());
        assertEquals(1, forumStatisticsUnderTest.getCommentsCount());
        assertEquals(4, forumStatisticsUnderTest.getUsersCount());
        assertEquals(0.5, forumStatisticsUnderTest.getPostsPerUser(), 1);
        assertEquals(0.5, forumStatisticsUnderTest.getCommentsPerPost(), 1);
        assertEquals(0.25, forumStatisticsUnderTest.getCommentsPerUser(), 1);
    }

    @DisplayName("When more comments than posts")
    @Test
    void testMoreCommentsThanPosts(){
        // Given
        when(statisticsMock.commentsCount()).thenReturn(2);
        when(statisticsMock.postsCount()).thenReturn(1);
        ForumStatistics forumStatisticsUnderTest = new ForumStatistics();
        //When
        forumStatisticsUnderTest.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1, forumStatisticsUnderTest.getPostsCount());
        assertEquals(2, forumStatisticsUnderTest.getCommentsCount());
        assertEquals(4, forumStatisticsUnderTest.getUsersCount());
        assertEquals(0.25, forumStatisticsUnderTest.getPostsPerUser(), 1);
        assertEquals(2, forumStatisticsUnderTest.getCommentsPerPost(), 1);
        assertEquals(0.5, forumStatisticsUnderTest.getCommentsPerUser(), 1);
    }

    @DisplayName("When zero users")
    @Test
    void testZeroUsers(){
        // Given
        List<String> users = List.of();
        //List.of("User1", "User2", "User3", "User4");
        when(statisticsMock.usersNames()).thenReturn(users);
        ForumStatistics forumStatisticsUnderTest = new ForumStatistics();
        //When
        forumStatisticsUnderTest.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(2, forumStatisticsUnderTest.getPostsCount());
        assertEquals(16, forumStatisticsUnderTest.getCommentsCount());
        assertEquals(0, forumStatisticsUnderTest.getUsersCount());
        assertEquals(0, forumStatisticsUnderTest.getPostsPerUser());
        assertEquals(8, forumStatisticsUnderTest.getCommentsPerPost(), 1);
        assertEquals(0, forumStatisticsUnderTest.getCommentsPerUser());
    }

    @DisplayName("When hundred users")
    @Test
    void testHundredUsers(){
        // Given
        List<String> users = new ArrayList<>();
        for (int i=1; i<101; i++) {
            users.add("User"+i);
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        ForumStatistics forumStatisticsUnderTest = new ForumStatistics();
        //When
        forumStatisticsUnderTest.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(2, forumStatisticsUnderTest.getPostsCount());
        assertEquals(16, forumStatisticsUnderTest.getCommentsCount());
        assertEquals(100, forumStatisticsUnderTest.getUsersCount());
        assertEquals(0.02, forumStatisticsUnderTest.getPostsPerUser(), 1);
        assertEquals(8, forumStatisticsUnderTest.getCommentsPerPost(), 1);
        assertEquals(0.16, forumStatisticsUnderTest.getCommentsPerUser(), 1);
    }
}