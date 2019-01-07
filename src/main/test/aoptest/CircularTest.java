package aoptest;

import com.mengze.config.CircularConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CircularConfig.class})
public class CircularTest {

    @Test
    public void test() {

    }
}
