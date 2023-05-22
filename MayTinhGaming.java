package qlpm;
public class MayTinhGaming extends MayTinh{
    private String cardDoHoa;
   public MayTinhGaming (String ten, String cpu, int ram, String carddohoa){
       super (ten, cpu, ram);
       this.cardDoHoa=carddohoa;
   }
public String getcardDoHoa(){
    return cardDoHoa;
    }
public void setcardDoHoa(String cardDoHoa){
    this.cardDoHoa=cardDoHoa;
    }
}
