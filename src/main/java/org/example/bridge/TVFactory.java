package org.example.bridge;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/17
 */
public class TVFactory {
    public TV getTV(String type) throws Exception {
        if (type.equals("LG")) {
            return new LG();
        } else if (type.equals("Sony")) {
            return new Sony();
        } else {
            throw new Exception("Invalid TV Type");
        }
    }
}
