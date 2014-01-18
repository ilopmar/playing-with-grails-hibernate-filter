package example

class User {

    String name
    Boolean enabled
    Boolean isAdmin

    static mapping = {
        table 'app_user'
    }

    static hibernateFilters = {
        nonAdminFilter condition: 'is_admin=0', default: true
        //onlyAdminsFilter condition: 'is_admin=1', default: false
    }
}