package hello;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// Change the comment again to kick off a build

public class TestForJosh {

   private Greeter g = new Greeter();

   @Test
   @DisplayName("Test for Empty Name")
   public void TestForJoshEmpty() 

   {
      assertEquals(g.getName(),"");
      assertEquals(g.sayHello(),"Hello!");
   }



   @Test
   @DisplayName("Test for Name='Josh'")
   public void TestForJosh() 
   {

      g.setName("Josh");
      assertEquals(g.getName(),"Josh");
      assertEquals(g.sayHello(),"Hello Josh!");
   }

}
