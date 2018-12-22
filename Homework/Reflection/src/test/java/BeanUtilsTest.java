import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

public class BeanUtilsTest {

    @Test
    public void assign() throws InvocationTargetException, IllegalAccessException {
        TestProducer producer = new TestProducer();
        TestConsumer consumer = new TestConsumer();
        System.out.println("From: " + producer);
        System.out.println("To: " + consumer);

        BeanUtils.assign(consumer, producer);

        System.out.println("From: " + producer);
        System.out.println("To: " + consumer);
    }
}