package Practices.day_1;

public class Swimming {
    private int time;

    public Swimming() {
    }

    public Swimming(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String alert() {
        System.out.println("Hồ bơi thì mở cửa lúc 9h hằng ngày");
        if(this.time < 8){
            return "Hồ bơi chưa mở cửa , bạn hãy chờ đến 9h";
        } else {
            return "Chào mừng bạn đến với Hồ bơi Furama";
        }
    }
}
