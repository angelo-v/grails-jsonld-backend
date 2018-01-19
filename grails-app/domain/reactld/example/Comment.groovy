package reactld.example

class Comment {

    Article article

    Commenter commenter
    String text

    static constraints = {
    }

    static embedded = ['commenter']
}

class Commenter {
    String name
    String email
}