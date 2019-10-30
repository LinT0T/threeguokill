package role;

public class computer extends aiAndPerson {
    private int [] handPai = new int[]{0, 0, 0, 0, 0, 0, 0};
    private int sum;
    private int blood = 4;
    private String name = "电脑";

    public String getName() {
        return name;
    }

    public int[] getHandPai() {
        return handPai;
    }

    public void setHandPai(int[] handPai) {
        this.handPai = handPai;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getSum() {
        return sum;
    }

    public int getBlood() {
        return blood;
    }

    public void deBug(int n, int x){
        if (n == 1) if (x == 0) {
            System.out.println("电脑cpu100°C了，发量-1万");
            this.blood -= 1;
        }
        else {
            System.out.println("电脑把Bug都给宁de了，发量未减少");
            this.handPai[1] -= 1;
        }
    }
    public void chuPai(int n) {
        if (n == 1) {this.handPai[0] -= 1;this.sum -= 1;} //杀
        if (n == 2) {this.handPai[1] -= 1;this.sum -= 1;}  //闪
        if (n == 3) {this.handPai[2] -= 1;this.sum -= 1;} // 桃
        if (n == 4) this.handPai[3] -= 1;  //顺手牵羊
        if (n == 5) {this.handPai[4] -= 1;this.sum -= 1;} // 过河拆桥
        if (n == 6) {this.handPai[5] -= 1;this.sum -= 1;} // 无中生有
        if (n == 7) {this.handPai[6] -= 1;this.sum -= 1;} // 无懈可击
    }

    public void chouKa(int n) throws InterruptedException {
        this.handPai[n] += 1;
        this.sum += 1;
    }
    public void cgameOver(int blood){
        if (blood == 0) System.out.println("赢了嗷！");
    }
}
