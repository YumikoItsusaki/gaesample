package jp.itacademy.gae_sample.controller.ds;

import org.slim3.tester.ControllerTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class CreateSampleControllerTest extends ControllerTestCase {

    @Test
    public void run() throws Exception {
        tester.start("/ds/createSample");
        CreateSampleController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is("/ds/createSample.jsp"));
    }
}
