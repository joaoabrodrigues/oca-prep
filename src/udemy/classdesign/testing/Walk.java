package udemy.classdesign.testing;

public interface Walk {

    default int getSpeed(){
        return 5;
    }
}
