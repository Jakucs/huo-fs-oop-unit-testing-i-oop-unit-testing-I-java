import com.codecool.animal.Animal;
import com.codecool.animal.Lion;
import com.codecool.animal.Parrot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {

    @Test
    void testConstructor_SetsNameAgeAndHealthCorrectly() {
        // Arrange & Act
        // We test through a concrete class because Animal is abstract
        Animal lion = new Lion("Leo", 2, 90);

        // Assert
        assertEquals("Leo", lion.getName());
        assertEquals(2, lion.getAge());
        assertEquals(90, lion.getHealth());
    }

    @Test
    void testConstructor_SetsAgeNegative() {
        // Arrange & Act
        // We test through a concrete class because Animal is abstract
        Animal lion = new Lion("Leo", -1, 90);

        // Assert
        assertEquals("Leo", lion.getName());
        assertEquals(0, lion.getAge());
        assertEquals(90, lion.getHealth());
    }

    @Test
    void testConstructor_SetsHealthNegative() {
        // Arrange & Act
        // We test through a concrete class because Animal is abstract
        Animal lion = new Lion("Leo", 3, -10);

        // Assert
        assertEquals("Leo", lion.getName());
        assertEquals(3, lion.getAge());
        assertEquals(0, lion.getHealth());
    }

    @Test
    void testConstructor_SetsHealthBetween0And100() {
        // Arrange & Act
        // We test through a concrete class because Animal is abstract
        Animal lion = new Lion("Leo", 3, 50);

        // Assert
        assertEquals("Leo", lion.getName());
        assertEquals(3, lion.getAge());
        assertEquals(50, lion.getHealth());
    }

    @Test
    void testConstructor_SetsHealthBiggerThan100() {
        // Arrange & Act
        // We test through a concrete class because Animal is abstract
        Animal lion = new Lion("Leo", 3, 135);

        // Assert
        assertEquals("Leo", lion.getName());
        assertEquals(3, lion.getAge());
        assertEquals(100, lion.getHealth());
    }

    @Test
    void testGetHealthStatus_healthAbove80(){
        Animal parrot = new Parrot("Papagaj", 4, 85);

        String hp = parrot.getHealthStatus();

        assertEquals("Healthy and Happy", hp);
    }

    @Test
    void testGetHealthStatus_healthAbove50Below80(){
        Animal parrot = new Parrot("Papagaj", 4, 70);

        String hp = parrot.getHealthStatus();

        assertEquals("A bit tired", hp);
    }

}