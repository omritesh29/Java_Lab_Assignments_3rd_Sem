class Movie {
    String title;
    String director;
    String actor;
    String review;

    Movie(String t, String d, String a) {
        title = t;
        director = d;
        actor = a;
    }

    void addReview(String r) {
        review = r;
    }

    void display() {
        System.out.println("Movie Details:");
        System.out.println("Title : " + title);
        System.out.println("Director : " + director);
        System.out.println("Actor : " + actor);
        System.out.println("Review : " + review);
    }

    public static void main(String args[]) {
        Movie m = new Movie("Gorilla", "Prakash", "Sar");
        m.addReview("This movie is blockbuster");
        m.display();
    }
}