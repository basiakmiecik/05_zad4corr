package otherVersion;public class Quartee {
    

    public void getQuarter(Point point){
    String cw="I";
        if(point.getX()!=0&&point.getY()!=0){
        if (point.getX()>0&&point.getY()<0){
            cw="IV";
        }
        else if (point.getX()<0&&point.getY()<0){
            cw="III";
        }
        else if (point.getX()<0&&point.getY()>0){
            cw="II";
        }
        System.out.print("Punkt ("+point.getX()+", "+point.getY()+") znajduje się w ćwiartce "+cw+", układu współrzędnych");}
        else if (point.getX()==0&&point.getY()!=0){
        System.out.println("Punkt znajduje się na osi Ox");
    }
        else if (point.getY()==0&&point.getX()!=0){
        System.out.println("Punkt znajduje się na osi Oy");
    }
        else{
        System.out.println("Punkt znajduje się w początku układu współrzędnych");}
    }
}
