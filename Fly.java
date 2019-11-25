public interface Fly {

    void takeOff();
    // returns nothing

    int ascend(int meters);
    // returns an integer

    int descend(int meters);
    // returns an integer

    void land();
    // returns nothing

    default void glide () {
      System.out.println ("glides into the air");
    }
}
