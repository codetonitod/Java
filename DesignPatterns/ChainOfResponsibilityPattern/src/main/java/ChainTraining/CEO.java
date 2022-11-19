package ChainTraining;

public class CEO extends Successor{
    @Override
    public void HandleRequest(Request request) {
        System.out.println("CEO will process request for " + request.getRequestType() + ": " + request.getAmount());
    }
}
