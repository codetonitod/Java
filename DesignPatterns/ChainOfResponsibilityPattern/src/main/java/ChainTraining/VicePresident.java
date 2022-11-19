package ChainTraining;

public class VicePresident extends Successor {
    @Override
    public void HandleRequest(Request request) {
        if (request.getRequestType() == RequestType.PURCHASE && request.getAmount() < 5_000) {

            System.out.println("Vice President will Handle this request for "
                    + request.getRequestType() + ": "
                    + request.getAmount()
                    + " will be proceed");

        } else {
            System.out.println("Redirect to " + successor);
            //Inherited from abstract class Successor
            successor.HandleRequest(request);
        }
    }
}
