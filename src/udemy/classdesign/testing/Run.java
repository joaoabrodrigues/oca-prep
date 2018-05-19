package udemy.classdesign.testing;

public interface Run extends Walk {

    default int getSpeed(){
        return 10;
    }
}
