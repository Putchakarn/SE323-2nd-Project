package cbsd.lab11.controller.security;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 * User: Dto
 * Date: 2/11/13
 * Time: 12:00 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/auth")
public class LoginLogoutController {



    /**
     * Handles and retrieves the login JSP page
     *
     * @return the name of the JSP page
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLoginPage(@RequestParam(value="error", required=false) boolean error,
                               ModelMap model) {

        // Add an error message to the model if login is unsuccessful
        // The 'error' parameter is set to true based on the when the authentication has failed.
        // We declared this under the authentication-failure-url attribute inside the spring-security.xml
  /* See below:
   <form-login
    login-page="/auth/login"
    authentication-failure-url="/auth/login?error=true"
    default-target-url="/lecturer/list"/>*/
        if (error == true) {
            // Assign an error message
            model.put("error", "You have entered an invalid username or password!");
        } else {
            model.put("error", "");
        }

        // This will resolve to /WEB-INF/view/security/login.jsp
        return "security/login";
    }

    /**
     * Handles and retrieves the denied JSP page. This is shown whenever a regular user
     * tries to access an admin only page.
     *
     * @return the name of the JSP page
     */
    @RequestMapping(value = "/denied", method = RequestMethod.GET)
    public String getDeniedPage() {


        // This will resolve to /WEB-INF/view/security/deniedpage.jsp
        return "security/deniedpage";
    }
}


