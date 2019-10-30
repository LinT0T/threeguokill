package role;

public abstract  class  aiAndPerson {
    public int [] handPai = new int[]{0,0,0,0,0,0,0};
    public int blood = 4;
    abstract void chuPai(int n);
    abstract public void chouKa(int n) throws InterruptedException;
    public int setStartHandPaiOfPlayer() {
        int n = 0;
        n = (int) (Math.random()*7);
        return n;
    }

}
