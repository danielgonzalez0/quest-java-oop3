public class Eagle extends Bird implements Fly {

    //attributs
    private boolean flying;
    private int altitude;

    //constructors
    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    //getters and setters

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    public void setFlying(boolean flying) {
        this.flying = flying;
    }
    public void setAltitude(int altitude) {
        this.altitude = altitude;
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
            setFlying(true);
        }
    }

    ;

    @Override
    public int ascend(int alt) {
        if (isFlying()) {
            setAltitude(this.getAltitude() + alt);
            System.out.println(this.getName() + "flies upward, altitude: " + this.getAltitude());
        }
        return this.getAltitude();
    }

    ;

    @Override
    public int descend(int alt) {
        int newAltitude = this.getAltitude() - alt;
        if (newAltitude < 1) {
            System.out.println(this.getName() + " can't descend " + newAltitude + ". he's going to crash ");
        } else {
            setAltitude(newAltitude);
            System.out.println(this.getName() + " flies downward, altitude: " + this.getAltitude());
        }
        return this.getAltitude();
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
        if (this.getAltitude() > 0 && this.getAltitude() <= 5) {
            setFlying(false);
            System.out.println(this.getName() + " lands on the ground");
        } else {
            System.out.println(this.getName() + " is too high, it can't land.");
        }
    }

    ;
}
