package org.example.bridge;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/17
 */
public class SpecialRemote extends RemoteControl {
    public SpecialRemote(TVFactory tvFactory) {
        super(tvFactory);
    }
    public void up() {
        int channel = this.getChannel();
        this.setChannel(channel+1);
    }
    public void down() {
        int channel = this.getChannel();
        this.setChannel(channel-1);
    }
}