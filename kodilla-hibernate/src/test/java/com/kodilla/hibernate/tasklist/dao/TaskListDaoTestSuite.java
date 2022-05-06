package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    private static final String LISTNAME = "List Name";
    private static final String DESCRIPTION = "List Description";

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);

        //When
        List<TaskList> foundTasksList = taskListDao.findByListName(LISTNAME);

        //Then
        assertEquals(1, foundTasksList.size());
        assertEquals(LISTNAME, foundTasksList.get(0).getListName());
        assertEquals(DESCRIPTION, foundTasksList.get(0).getDescription());

        //Cleanup
        Integer id = taskList.getId();
        taskListDao.deleteById(id);
    }
}
