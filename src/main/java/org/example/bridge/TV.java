package org.example.bridge;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/17
 */
public abstract class TV {
    public abstract void on();
    public abstract void off();
    public abstract void tuneChannel(int channel);
    public abstract int getChannel();
}
