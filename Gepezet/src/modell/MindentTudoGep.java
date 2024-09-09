
package modell;

    

public class MindentTudoGep {
    private int[] lottoSzelveny;
    private String totoSzelveny;
    private String[] dalok;
    


public MindentTudoGep(){
    this(new String[0]);
}

public MindentTudoGep(String dal){
    this(new String[]{dal});
}

public MindentTudoGep(String[] dalok){
    this.lottoSzelveny = new int[5];
    this.totoSzelveny = "";
    this.dallalFeltolt();
    if(!(dalok == null || dalok.length == 0 || dalok[0].isBlank())){
        dalokatFelvesz(dalok);
    }
}

private void dallalFeltolt(){
    this.dalok = new String[3];
    dalok[0] = "To Build A Home";
    dalok[1] = "Wash";
    dalok[2] = "Skinny Love";
}

public void dalokatFelvesz(String[] dalok){
    String[] dalFelvesz = new String[dalok.length + this.dalok.length];
    for (int i = 0; i < dalFelvesz.length; i++) {
    dalFelvesz[i++] = dalok[i - this.dalok.length];
    }
    this.dalok = dalFelvesz;
}



private boolean benneVan(int[] tomb, int veletlen, int db){
    int i = 0;
    while(i < db && !(tomb[i] == veletlen)){
        i++;
    }
    return true;
}

}