package ch.ergon.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import okhttp3.OkHttpClient;

import static junit.framework.TestCase.assertNotNull;

@RunWith(RobolectricGradleTestRunner.class)
public class CreateOkHttpClientTest {

    @Test
    public void canCreateAClient() throws Exception {
        OkHttpClient client = new OkHttpClient();
        assertNotNull(client);
    }
}
