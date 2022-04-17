package org.example.bridge;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/17
 */
public class GenericRemote extends RemoteControl {
    public GenericRemote(TVFactory tvFactory) {
        super(tvFactory);
    }
    public void nextChannel() {
        int channel = this.getChannel();
        this.setChannel(channel+1);
    }
    public void prevChannel() {
        int channel = this.getChannel();
        this.setChannel(channel-1);
    }
}
