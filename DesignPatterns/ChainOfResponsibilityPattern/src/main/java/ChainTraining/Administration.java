package ChainTraining;

public class Administration extends Successor{
    @Override
    public void HandleRequest(Request request) {
        if(request.getRequestType() == RequestType.MEETINGS){
            System.out.println("Administrator will processed the meeting request");
        }
        else {
            System.out.println("Redirected to " + successor);
            successor.HandleRequest(request);
        }
    }
}
