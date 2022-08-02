public class WaterBottle {

    private int volume;

    public WaterBottle (int volume) {

        this.volume = volume;
    }

    public int decTen(){
        return this.volume -= 10;
    }

    public int setToZero() {
        return this.volume = 0 ;
    }

    public int fillTo100(int volume) {
        return this.volume = volume ;
    }


}
