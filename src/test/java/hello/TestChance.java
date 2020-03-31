package hello;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// Change the comment again to kick off a build

public class TestGreeter {

   private Greeter g = new Greeter();

   @Test
   @DisplayName("Test for Empty Name")
   public void testChanceEmpty() 

   {
      assertEquals(g.getName(),"");
      assertEquals(g.sayHello(),"Hello!");
   }



   @Test
   @DisplayName("Test for Name='World'")
   public void testChanceWorld() 
   {

      g.setName("World");
      assertEquals(g.getName(),"World");
      assertEquals(g.sayHello(),"Hello World!");
   }

   @Test
   @DisplayName("Test for Name='Chance'")
   public void testChance() 
   {

      g.setName("Chance");
      assertEquals(g.getName(),"Chance");
      assertEquals(g.sayHello(),"Hello World!");
   }

}
