package ChainTraining;

public abstract class Successor {

    //Only accessed in scope of package
    protected Successor successor;

    public void setSuccessor(Successor successor){
        this.successor = successor;
    }

    public abstract void HandleRequest(Request request);
}

