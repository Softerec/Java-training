package com.kodilla.kodillaspring.portfolio;

import com.kodilla.kodillaspring.reader.Reader;
import com.kodilla.kodillaspring.reader.ReaderConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.*;

public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        TaskList toDoList = new TaskList();
        ArrayList<String> tasksToDo = new ArrayList<>();
        tasksToDo.add("first2do");
        toDoList.addTasks(tasksToDo);
        board.setToDoList(toDoList);

        TaskList inProgressList = new TaskList();
        ArrayList<String> tasksInProgress = new ArrayList<>();
        tasksInProgress.add("firstInProgress");
        inProgressList.addTasks(tasksInProgress);
        board.setInProgressList(inProgressList);

        TaskList doneList = new TaskList();
        ArrayList<String> tasksDone = new ArrayList<>();
        tasksDone.add("firstDone");
        doneList.addTasks(tasksDone);
        board.setDoneList(inProgressList);

        // Then
        System.out.println("ToDo content: " + board.getToDoList().getAllTasks());
        System.out.println("InProgress content: " + board.getInProgressList().getAllTasks());
        System.out.println("Done content: " + board.getDoneList().getAllTasks());
    }
}
