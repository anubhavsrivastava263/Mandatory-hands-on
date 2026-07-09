
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

interface ExternalApi {
    String getData();
}

class Service {

    ExternalApi api;

    Service(ExternalApi api) {
        this.api = api;
    }

    String fetch() {
        return api.getData();
    }
}

public class Exercise12 {

    @Test
    void testVerify() {

        ExternalApi api = mock(ExternalApi.class);

        when(api.getData()).thenReturn("Hello");

        Service s = new Service(api);

        s.fetch();

        verify(api).getData();
    }
}
