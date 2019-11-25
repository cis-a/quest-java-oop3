public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf(this.getName() + " takes off!%n");
        }
    }
    @Override
    public int ascend(int meters) {
        if (this.flying) {
          this.altitude = Math.min(this.altitude + meters, 3000);
            System.out.printf("%s flies higher into the sky, altitude : %d%n", this.getName(), this.altitude);
            }
        return (altitude);
    }
    @Override
    public int descend(int meters) {
        if (this.flying) {
          this.altitude = Math.max (this.altitude - meters, 0);
            System.out.printf("%s flies closer to the ground, altitude : %d%n", this.getName(), this.altitude);
            }
        return (altitude);
    }
    /**
     * get down to the ground, must be on surface
     */
    @Override
    public void land() {
        if (this.flying && this.altitude == 0) {
            System.out.printf("%s settles gracefully on the ground.%n", this.getName());
        } else {
            System.out.printf("%s is too high, it can't land.%n", this.getName());
        }
    }

}
