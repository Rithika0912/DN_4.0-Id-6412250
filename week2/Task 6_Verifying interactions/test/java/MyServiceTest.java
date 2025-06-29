import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testVerifyInteractionWithArguments() {
        // 1. Create a mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // 2. Call the method with arguments
        MyService service = new MyService(mockApi);
        service.processData("testId", 123);

        // 3. Verify the interaction
        verify(mockApi).updateData("testId", 123); // Checks if called with exact args
    }
}