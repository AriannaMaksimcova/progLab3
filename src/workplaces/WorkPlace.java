package workplaces;

import java.util.Objects;

public abstract class WorkPlace{
    //<T>
    private String name;
    public WorkPlace(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkPlace workPlace = (WorkPlace) o;
        return Objects.equals(name, workPlace.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    //    T boss;
//    T[] workers;
//
//    public WorkPlace(String name, T boss, T[] workers) {
//        this.name = name;
//        this.boss = boss;
//        this.workers = workers;
//    }
}
