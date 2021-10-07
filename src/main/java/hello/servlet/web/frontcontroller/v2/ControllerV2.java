package hello.servlet.web.frontcontroller.v2;

import hello.servlet.web.frontcontroller.MyView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ControllerV2 {

    /**
     * MyView를 반환하는 인터페이스 설계
     */
    MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

}
