package org.example.pipeline;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/17
 */
public abstract class Handler {

    // 后继者
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void HandleRequest(Integer request);

}


