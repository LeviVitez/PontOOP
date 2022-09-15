package hu.petrik.pontoop.pont;

public class Pont {
    private int x;
    private int y;

    public Pont(){
        x=0;
        y=0;
    }

    public Pont(int x,int y){
        this.x=x;
        this.y=y;
    }

    public Pont(int n){
        this.x= koordinatageneralasa(n);
        this.y= koordinatageneralasa(n);
    }

    private int koordinatageneralasa(int n) {
        return (int) (Math.random() * ((2 * n) + 1)) - n;
    }

    public double getOrigotolMertTavolsag() {
        //négyzetgyök-squareroot || hatványozás - POWer
        return Math.sqrt((Math.pow(this.x,2)+Math.pow(this.y,2)));
        //return this.getTavolsag(new Pont());
    }
    public double getTavolsag(Pont masikpont){
        return Math.sqrt(Math.pow(this.x-masikpont.x,2)+Math.pow(this.y-masikpont.y,2));
    }

    public int getSiknegyed(){
        int siknegyed=0;
        if (this.x<0 && this.y>0){
            siknegyed=1;
        }else if (this.x<0 && this.y<0){
            siknegyed=2;
        }else if (this.x>0 && this.y<0){
            siknegyed=3;
        }else if (this.x>0 && this.y>0){
            siknegyed=4;
        } else if (this.x==0 && this.y!=0){
            siknegyed=5;
        }else if (this.x!=0 && this.y==0){
            siknegyed=6;
        }
        return siknegyed;
    }

    public String getSiknegyedSzoveges(){
        int siknegyed=this.getSiknegyed();
        String siknegyedszoveges="";
        switch (siknegyed){
            case 0:
                siknegyedszoveges="origo";
                break;
            case 1:
                siknegyedszoveges="balfelső síknegyed";
                break;
            case 2:
                siknegyedszoveges="bal alsó síknegyed";
                break;
            case 3:
                siknegyedszoveges="jobb alsó síknegyed";
                break;
            case 4:
                siknegyedszoveges="jobb felső síknegyed";
                break;
            case 5:
                siknegyedszoveges="függőleges tengely";
                break;
            case 6:
                siknegyedszoveges="vízszintes tengely";
                break;
        }
        return siknegyedszoveges;
    }

    @Override //alt+insert
    public String toString() {
       // return "(" + x +"," + y +')';
        return String.format("(%d,%d)",this.x,this.y);
    }



}
