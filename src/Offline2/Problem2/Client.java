package Offline2.Problem2;

public abstract class Client {
    private Mediator mediator;
    private int clientID;

    public Client(Mediator mediator, int clientID){
        this.mediator = mediator;
        this.clientID = clientID;
    }

    public abstract void sendExamineRequest(int currentNumber, int clientID);

    public abstract void replyToRequest(int previousNumber, int correctedNumber, int studentID);
    public void setClientID(int clientID){
        this.clientID = clientID;
    }

    public int getClientID(){
        return this.clientID;
    }

    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }
}
