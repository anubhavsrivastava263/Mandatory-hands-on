
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
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

public class Exercise11 {

    @Test
    void testFetch() {

        ExternalApi api = mock(ExternalApi.class);

        when(api.getData()).thenReturn("Success");

        Service s = new Service(api);

        assertEquals("Success", s.fetch());
    }
}
