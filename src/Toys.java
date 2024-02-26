package src;

public class Toys implements Comparable {
    String id;
    String name;
    int dischargeFrequency;

    public Toys(String id,  int dischargeFrequency,String name) {
        this.id = id;
        this.name = name;
        this.dischargeFrequency = dischargeFrequency;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s; \n",id,dischargeFrequency,name);
    }

    public String getId() {
        return id + "\n" ;
    }

    public int getDischargeFrequency() {
        return dischargeFrequency;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
