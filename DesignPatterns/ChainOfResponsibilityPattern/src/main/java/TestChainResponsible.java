import ChainTraining.*;

public class TestChainResponsible {
    public static void main(String[] args) {
        CEO ceoPerson = new CEO();
        VicePresident vicePresidentPerson = new VicePresident();
        Administration administrationPerson = new Administration();

        vicePresidentPerson.setSuccessor(ceoPerson);
        administrationPerson.setSuccessor(vicePresidentPerson);

        Request meetingReservation = new Request(RequestType.MEETINGS, 500);
        Request purchaseGift = new Request(RequestType.PURCHASE, 2_000);
        Request purchaseGift1 = new Request(RequestType.PURCHASE, 7_000);

        System.out.println("No redirection scenarios:");
        administrationPerson.HandleRequest(meetingReservation);
        vicePresidentPerson.HandleRequest(purchaseGift);
        ceoPerson.HandleRequest(purchaseGift1);

        System.out.println("------------------------");
        System.out.println("Redirection scenarios:");
        administrationPerson.HandleRequest(purchaseGift);
        vicePresidentPerson.HandleRequest(purchaseGift1);

    }
}
