public class Human {

    String infos[] = new String[5]; // job, name, origin, gender, hobby
    private byte age;
    int wheight;
    int height;
    static int legs;
    static { // called only once
        legs = 2;
    }

    Human(String job, byte age, String name, String origin, String gender, String hobby, int wheight, int height) {
        infos[0] = job;
        infos[1] = name;
        infos[2] = origin;
        infos[3] = gender;
        infos[5] = hobby;
        this.age = age;
        this.wheight = wheight;
        this.height = height;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    

    
}
