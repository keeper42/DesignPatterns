package org.example.bridge;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/17
 */
public class LG extends TV {
    int channel = 1;
    @Override
    public void on() {
        System.out.println("Turning on the LG TV");
    }
    @Override
    public void off() {
        System.out.println("Turning off the LG TV");
    }
    @Override
    public void tuneChannel(int channel) {
        this.channel = channel;
        System.out.println("Set the LG TV Channel to " + this.channel);
    }
    @Override
    public int getChannel() {
        return channel;
    }
}