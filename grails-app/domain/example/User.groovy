package example

class User {

    String name
    Boolean enabled
    Boolean isAdmin

    static mapping = {
        table 'app_user'
    }
}