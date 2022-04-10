import ModelAPersonInfra.Person;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ModelAPersonTest {

    @Test
    public void personAtt_firstName() {
    Person person = new Person("sahar" , "davidson" , 49);
    assertEquals("sahar" , person.getFirstName());
    person.setFirstName("Jecson");
    assertEquals("Jecson" , person.getFirstName());
    }


}