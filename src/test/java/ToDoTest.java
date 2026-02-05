/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java
 * to edit this template
 */

import com.mycompany.ice_3_tdd.TodoItem;
import com.mycompany.ice_3_tdd.TodoList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rajpu
 */
public class ToDoTest {

 /**
     * INITIAL FUNCTIONALITY TEST
     *
     * This test was written first and initially failed because
     * TodoList and TodoItem did not exist.
     *
     * After implementing the minimum required classes and methods,
     * this test now passes.
     */
    @Test
    public void testAddTask() {
        TodoList list = new TodoList();
        TodoItem item = list.addTask("Finish ICE 3");

        assertNotNull(item, "Task should not be null");
        assertEquals("Finish ICE 3", item.getTitle(), "Title should match input");
        assertFalse(item.isCompleted(), "New task should not be completed");
    }

    /**
     * ADDITIONAL FUNCTIONALITY TEST
     *
     * Tests updating the title of an existing task.
     */
    @Test
    public void testUpdateTask() {
        TodoList list = new TodoList();
        TodoItem item = list.addTask("Old");

        boolean updated = list.updateTaskTitle(item.getId(), "New");

        assertTrue(updated, "Update should return true");
        assertEquals("New", item.getTitle(), "Task title should be updated");
    }

    /**
     * ADDITIONAL FUNCTIONALITY TEST
     *
     * Tests marking a task as completed.
     */
    @Test
    public void testMarkTaskCompleted() {
        TodoList list = new TodoList();
        TodoItem item = list.addTask("Complete me");

        boolean completed = list.markTaskCompleted(item.getId());

        assertTrue(completed, "Mark complete should return true");
        assertTrue(item.isCompleted(), "Task should be marked as completed");
    }

    /**
     * ADDITIONAL FUNCTIONALITY TEST
     *
     * Tests deleting a task from the to-do list.
     */
    @Test
    public void testDeleteTask() {
        TodoList list = new TodoList();
        TodoItem item = list.addTask("Delete me");

        boolean deleted = list.deleteTask(item.getId());

        assertTrue(deleted, "Delete should return true");
        assertEquals(0, list.getAllTasks().size(),
                "Task list should be empty after deletion");
    }
}
