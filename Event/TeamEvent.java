package Event;

public class TeamEvent extends Event {
    private int noOfParticipant;
    private int teamNo;
    
    public TeamEvent(String eventName, String participantName, int noOfParticipants, int teamNo){
        super(eventName, participantName);
        this.noOfParticipant=noOfParticipants;
        this.teamNo=teamNo;
    }
    public void registerEvent(){
        if(super.eventName.equals("Singing")){
            super.registrationFee = 4;
        }
        else if(eventName.equals("Dancing")){
            registrationFee = 6*noOfParticipant;
        }
        else if(eventName.equals("DigitalArt")){
            registrationFee = 8*noOfParticipant;
        }
        else if(eventName.equals("Acting")){
            registrationFee = 10*noOfParticipant;
        }
        else{
            registrationFee= 0;
        }
    }
    public int getNoOfParticipant(){
        return noOfParticipant;
    }
    public void setNoOfParticipant(int noOfParticipant){
          this.noOfParticipant= noOfParticipant;
    }
    public int getTeamNo(){
        return teamNo;
    }
    public void setTeamNo(int teamNo){
          this.teamNo= teamNo;
    }
}
