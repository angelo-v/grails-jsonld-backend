package reactld.example

class AuthorsController {

    def show(String username) {
        return Author.findByUsername(username)
    }
}
