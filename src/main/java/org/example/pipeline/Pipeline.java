package org.example.pipeline;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/17
 */
public class Pipeline {

    public static void main(String[] args) {
        Handler h1 = new Handler1();
        Handler h2 = new Handler2();
        Handler h3 = new Handler3();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        int[] requests = {2,3,3,4,5,6,8,8,19,9,9,3,56,46,765,47,6,86,9,7,432,5,436,4,57654,20,-1} ;
        for (int req :requests) {
            h1.HandleRequest(req);
        }

    }

}
