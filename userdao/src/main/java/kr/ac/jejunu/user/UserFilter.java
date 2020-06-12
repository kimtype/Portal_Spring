package kr.ac.jejunu.user;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


@WebFilter(urlPatterns = "*")
public class UserFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    System.out.println("xxxxxxxxxxxx filter init xxxxxxxxxxxxx");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("xxxxxxxxxxxxxxxxxxx fliter before xxxxxxxxxxxxxxxxxxxxxxx");
        chain.doFilter(request, response);
        System.out.println("xxxxxxxxxxxxxxxxxxx filter after xxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Override
    public void destroy() {
        System.out.println("xxxxxxxxxxxx filter destroy xxxxxxxxxxxxx");
    }
}
