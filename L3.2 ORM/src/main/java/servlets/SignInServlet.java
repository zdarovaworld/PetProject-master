package servlets;

import accounts.AccountService;
import accounts.UserProfile;
import dbService.DBException;
import dbService.DBService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SignInServlet extends HttpServlet {
    private final DBService dbService;

    public SignInServlet(DBService dbService) {
        this.dbService = dbService;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        if (login == null) {
            resp.setContentType("text/html;charset=utf-8");
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }

        UserProfile profile = null;
        try {
            profile = dbService.getUserByLogin(login);
        } catch (DBException e) {
            e.printStackTrace();
        }
        if (profile == null) {
            resp.setContentType("text/html;charset=utf-8");
            resp.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            resp.getWriter().println("Unauthorized");
            return;
        }

        if (password.equals(profile.getPassword()))
        //accountService.addSession(req.getSession().getId(), profile);
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println("Authorized: " + login);
        resp.setStatus(HttpServletResponse.SC_OK);
    }
}
