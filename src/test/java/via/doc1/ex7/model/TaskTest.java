package via.doc1.ex7.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {
    @Test
    public void ctor_normalUse_noErrors_Test()
    {
        //Arrange
        String taskId = "Task1";
        String taskName = "Tough task";
        String taskDesc = "Cleanup the mess";
        //Act
        Task testTask = new Task(taskId, taskName, taskDesc);
        //Assert
        assertTrue(testTask.getId().equals(taskId));
        assertTrue(testTask.getName().equals(taskName));
        assertTrue(testTask.getDescription().equals(taskDesc));
    }

    @Test
    public void setId_Test(){
        //Arrange
        String taskId = "Task1";
        String taskName = "Tough task";
        String taskDesc = "Cleanup the mess";
        //Act
        Task testTask = new Task(taskId, taskName, taskDesc);
        testTask.setId("Test");
        //Assert
        assertTrue(testTask.getId().equals("Test"));
        assertTrue(testTask.getName().equals(taskName));
        assertTrue(testTask.getDescription().equals(taskDesc));
    }

    @Test
    public void setName_Test(){
        //Arrange
        String taskId = "Task1";
        String taskName = "Tough task";
        String taskDesc = "Cleanup the mess";
        //Act
        Task testTask = new Task(taskId, taskName, taskDesc);
        testTask.setName("testing task");
        //Assert
        assertTrue(testTask.getId().equals(taskId));
        assertTrue(testTask.getName().equals("testing task"));
        assertTrue(testTask.getDescription().equals(taskDesc));
    }

    @Test
    public void setDescription_Test()
    {
        //Arrange
        String taskId = "Task1";
        String taskName = "Tough task";
        String taskDesc = "Cleanup the mess";
        //Act
        Task testTask = new Task(taskId, taskName, taskDesc);
        testTask.setDescription("testing this mess");
        //Assert
        assertTrue(testTask.getId().equals(taskId));
        assertTrue(testTask.getName().equals(taskName));
        assertTrue(testTask.getDescription().equals("testing this mess"));
    }

    @Test
    public void equals_True_Test()
    {
        //Arrange
        String taskId = "Task1";
        String taskName = "Tough task";
        String taskDesc = "Cleanup the mess";
        //Act
        Task testTask = new Task(taskId, taskName, taskDesc);
        Task testTask2 = new Task(taskId, taskName, taskDesc);
        //Assert
        assertTrue(testTask.equals(testTask2));
    }

    @Test
    public void equals_False_Test()
    {
        //Arrange
        String taskId = "Task1";
        String taskName = "Tough task";
        String taskDesc = "Cleanup the mess";
        //Act
        Task testTask = new Task(taskId, taskName, taskDesc);
        Task testTask2 = new Task("fake", taskName, taskDesc);
        //Assert
        assertFalse(testTask.equals(testTask2));
    }

    @Test
    public void equals_To_Null_Test()
    {
        //Arrange
        String taskId = "Task1";
        String taskName = "Tough task";
        String taskDesc = "Cleanup the mess";
        //Act
        Task testTask = new Task(taskId, taskName, taskDesc);
        //Assert
        assertFalse(testTask.equals(null));
    }

    @Test
    public void equals_Non_Task_Object_Test()
    {
        //Arrange
        String taskId = "Task1";
        String taskName = "Tough task";
        String taskDesc = "Cleanup the mess";
        //Act
        Task testTask = new Task(taskId, taskName, taskDesc);
        //Assert
        assertFalse(testTask.equals("test"));
    }

    @Test
    public void equals_To_Self_Test()
    {
        //Arrange
        String taskId = "Task1";
        String taskName = "Tough task";
        String taskDesc = "Cleanup the mess";
        //Act
        Task testTask = new Task(taskId, taskName, taskDesc);
        //Assert
        assertTrue(testTask.equals(testTask));
    }

    @Test
    void testHashCode() {
        //Arrange
        String taskId = "Task1";
        String taskName = "Tough task";
        String taskDesc = "Cleanup the mess";
        //Act
        Task testTask = new Task(taskId, taskName, taskDesc);
        int hashCode1 = testTask.hashCode();

        // Assert that hash codes are as expected
        assertEquals(testTask.hashCode(), hashCode1);
    }
}
