package kr.ac.jejunu.user;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class UserRequestListner implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx request destroy xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx request init xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }
}
