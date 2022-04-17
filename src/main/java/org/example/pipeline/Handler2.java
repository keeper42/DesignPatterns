package org.example.pipeline;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/17
 */
public class Handler2 extends Handler {
    @Override
    public void HandleRequest(Integer request) {
        if (request == null) {
            return;
        }
        if (request >= 10 && request < 20) {
            System.out.println(request);
        } else {
            successor.HandleRequest(request);
        }
    }
}
