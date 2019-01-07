package aoptest;


import com.mengze.config.RootConfig;
import com.mengze.entity.Dog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
public class DogAopTest {

    @Autowired
    private Dog dog;

    @Test
    public void barkingTest() {
        dog.bark();
    }
}
