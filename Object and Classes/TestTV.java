public class TestTV {
    public static void main(String[] args) {
        TV tv1=new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolumeLevel(3);

        TV tv2=new TV();
        tv2.turnOn();
        tv2.setChannel(56);
        tv2.setVolumeLevel(5);

        System.out.println("Tv1's channel is "+tv1.channel
                +" and volume level is "+tv1.volumeLevel);

        System.out.println("Tv2's channel is "+tv2.channel
        +" and volume level is "+tv2.volumeLevel);
    }
}
