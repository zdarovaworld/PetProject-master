package accounts;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.HashMap;
import java.util.Map;

public class AccountService {

    private Session session;

    public AccountService(Session session) {
        this.session = session;
    }

    public UserProfile getById(Long id) {
        return (UserProfile) session.get(UserProfile.class, id);
    }

    public Long getUserIdByLogin(String login) {
        Criteria criteria = session.createCriteria(UserProfile.class);
        return ((UserProfile) criteria.add(Restrictions.eq("login", login)).uniqueResult()).getId();
    }

    public Long insertUser(String login, String password) {
        return (Long) session.save(new UserProfile(login, password));
    }

    public Long insertUser(String login) {
        return (Long) session.save(new UserProfile(login));
    }
}
