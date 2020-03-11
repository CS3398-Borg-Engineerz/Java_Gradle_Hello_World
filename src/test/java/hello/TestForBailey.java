package hello;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// Change the comment again to kick off a build

public class TestForBailey {
   private Greeter g = new Greeter();
   @Test
   @DisplayName("Test for Empty Name")
   public void TestForBaileyEmpty() 
   {
      assertEquals(g.getName(),"");
      assertEquals(g.sayHello(),"Hello!");
   }
   @Test
   @DisplayName("Test for Name='Bailey'")
   public void TestForBailey() 
   {
      g.setName("Bailey");
      assertEquals(g.getName(),"Bailey");
      assertEquals(g.sayHello(),"Hello Bailey!");
   }
}
