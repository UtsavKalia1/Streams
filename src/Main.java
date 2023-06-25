public class Main {
    public static void main(String[] args) {
    Work w = new Work();

    //this is how it is done if methos is
        /non static
    Utility u = new Utility();
    w.doWork(u::nameUtil);

 //   w.doWork(Utility::nameUtil);
// this works if method is static
    // this is called method reference
    }
}