import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

public class MyTest {

    @Test
    public void testGcp() {
        Storage storage = StorageOptions.getDefaultInstance().getService();
        Bucket bucket = storage.get("bq-config-test");
        ByteArrayInputStream blobContent = new ByteArrayInputStream( bucket.get("schema.json").getContent());
    }
}
