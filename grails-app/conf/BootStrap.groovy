import example.User
import example.Sport
import example.UserSport

class BootStrap {

    def init = { servletContext ->
        this.loadData()
    }

    def destroy = {
    }

    private void loadData() {
        def u1 = new User(name: 'user1', enabled: true, isAdmin: false).save(failOnError: true)
        def s1 = new Sport(name: 'ski').save(failOnError: true)
        def us1 = new UserSport(user: u1, sport: s1, trainingPlace: 'my place').save(failOnError: true)

        def u2 = new User(name: 'user2', enabled: true, isAdmin: true).save(failOnError: true)
        def u3 = new User(name: 'user3', enabled: false, isAdmin: false).save(failOnError: true)
        def u4 = new User(name: 'user4', enabled: false, isAdmin: true).save(failOnError: true)
    }
}
