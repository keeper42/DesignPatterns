package org.example.pipeline;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/17
 */
public class Handler3 extends Handler {
    @Override
    public void HandleRequest(Integer request) {
        if (request == null) {
            return;
        }
        if (request >= 20) {
            System.out.println(request);
        } else {
            System.out.println("end");
        }
    }
}
