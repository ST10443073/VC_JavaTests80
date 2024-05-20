/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aryan
 */
public class PersonTest {
    
    public PersonTest() {
    }

    @Test
    public void testName() {
        //Arrange 
        String expected = "Sydney";
        
        //Actual
        Person p = new Person();
        String actual = p.getName();
        
        //Assert
        assertEquals(expected, actual);
        
        
        
    }
    @Test
    public void testSum(){
        //Arrange 
        int expected = 8;
        
        //Act
        Person p = new Person();
        int actual = p.calcSum(5,3);
        
        //Assert
        assertEquals(expected, actual);
        
    }
    @Test
    public void testStatus(){
        //Act
        Person p = new Person();
        boolean actual = p.checkStatus(12);
        
        //Assert
        assertTrue(actual);
    }
    
}
