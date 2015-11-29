import java.util.List;
import java.util.Map;

import models.Comment;
import models.Post;
import models.Tag;
import models.User;

import org.junit.Before;
import org.junit.Test;

import play.modules.morphia.MorphiaPlugin;
import play.modules.morphia.MorphiaPlugin.IdType;
import play.test.Fixtures;
import play.test.MorphiaFixtures;
import play.test.UnitTest;
 
public class BasicTest extends UnitTest {
    
    @Before
    public void setup() {
        MorphiaFixtures.deleteAllModels();
    }
    
    @Test
    public void testBug46() {
        assertEquals(IdType.Long, MorphiaPlugin.getIdType());
    }
 

 @Test
 public void comentarPost(){
     User Julio = new User("a252048@gmail.com", "root", "Julio").save();
     Post prueba = new Post(Julio,"mi primer post","esto es un post").save();
     }
 
 @Test
 public void crearUsuario(){
     new User("pepe@example.com","pepe","pepe").save();
 }
 @Test
 public void checarUsuario(){
     User pepe = User.find("byEmail", "pepe@example.com").first();
     assertEquals("pepe", pepe.email);
 }
 @Test
 public void conectarse(){
     User pepe = User.find("byEmail", "pepe@example.com").first();
     assertNotNull(User.connect("pepe@example.com", "pepe"));
 }
}