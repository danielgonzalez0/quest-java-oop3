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
        if (this.isFlying()) {
            System.out.println(this.getName() + " is already flying.");
        } else {
            System.out.println(this.getName() + " takes off in the sky.");
            this.flying = true;
        }

    }

    ;

    @Override
    public int ascend(int alt) {
        if (isFlying()) {
            this.altitude += alt;
            System.out.println(this.getName() + "flies upward, altitude: " + this.getAltitude());
        }
        return this.altitude;
    }

    ;

    @Override
    public int descend(int alt) {
        int newAltitude = this.altitude - alt;
        if (newAltitude < 1) {
            System.out.println(this.getName() + " can't descend " + newAltitude + ". he's going to crash ");
        } else {
            this.altitude = newAltitude;
            System.out.println(this.getName() + " flies downward, altitude: " + this.getAltitude());
        }
        return alt;
    }

    ;

    @Override
    public void glide() {
        if (isFlying()) {
            System.out.println(this.getName() + " glides into the air.");
        }
    }

    ;

    @Override
    public void land() {
        if (this.altitude > 0 && this.altitude <= 5) {
            this.flying = false;
            System.out.println(this.getName() + " lands on the ground");
        } else {
            System.out.println(this.getName() + " is too high, it can't land.");
        }
    }

    ;
}
