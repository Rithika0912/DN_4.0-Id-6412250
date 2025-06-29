package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testFetchData() {
        // 1. Create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // 2. Stub behavior
        when(mockApi.getData()).thenReturn("Mock Data");

        // 3. Inject and test
        MyService service = new MyService(mockApi);
        assertEquals("Mock Data", service.fetchData());
        System.out.println("Mockito test executed successfully");
    }
}
