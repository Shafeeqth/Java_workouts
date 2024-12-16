package Oops;

interface Human {
    String planet = "Earth"; // By default final static 
    final static String interfaceName = "Human"; 
    void walk();
    void talk();

}

interface Indian extends Human {

    void talkHindi();
    void playCricker();

}

interface Malayali extends Indian {
    void talkMalayalam();
    void palyFootball();
}


class Person implements Malayali {

    @Override
    public void talkHindi() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'talkHindi'");
    }

    @Override
    public void playCricker() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'playCricker'");
    }

    @Override
    public void walk() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'walk'");
    }

    @Override
    public void talk() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'talk'");
    }

    @Override
    public void talkMalayalam() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'talkMalayalam'");
    }

    @Override
    public void palyFootball() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'palyFootball'");
    }
    
}





public class InterfacesDemo {

    
}