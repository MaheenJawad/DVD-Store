// Parent class
class MovieDVD {
    protected int id;
    protected String title;
    protected String rating;

    public MovieDVD() {}

    public MovieDVD(int id, String title, String rating) {
        this.id = id;
        this.title = title;
        this.rating = rating;
    }

    public double computeFine(int totalMovie, int days) {
        return 0;
    }
}

//Action movies
class ActionDVD extends MovieDVD {
    private static final double LATE_FEE = 4.0;

    public ActionDVD(int id, String title, String rating) {
        super(id, title, rating);
    }

    @Override
    public double computeFine(int totalMovie, int days) {
        return LATE_FEE * totalMovie * days;
    }
}

//Comedy movies
class ComedyDVD extends MovieDVD {
    private static final double LATE_FEE = 6.0;

    public ComedyDVD(int id, String title, String rating) {
        super(id, title, rating);
    }

    @Override
    public double computeFine(int totalMovie, int days) {
        return LATE_FEE * totalMovie * days;
    }
}

//Horror movies
class HorrorDVD extends MovieDVD {
    private static final double LATE_FEE = 7.0;

    public HorrorDVD(int id, String title, String rating) {
        super(id, title, rating);
    }

    @Override
    public double computeFine(int totalMovie, int days) {
        return LATE_FEE * totalMovie * days;
    }
}