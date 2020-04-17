package kr.ac.jejunu.user;

public class DaoFactory {
    public UserDao getUserDao() {
        return new UserDao(new JeJuConnectionMaker());
    }
    private JeJuConnectionMaker getConnectionMaker(){
        return new JeJuConnectionMaker();
    }
}
