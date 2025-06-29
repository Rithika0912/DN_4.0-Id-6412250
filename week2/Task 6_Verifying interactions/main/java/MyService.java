public class MyService {
    private final ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public void fetchData() {
        externalApi.getData();
    }

    public void processData(String id, int value) {
        externalApi.updateData(id, value);
    }
}