package role;

import java.util.Random;

public class Player extends aiAndPerson{
     public int heros;

     public int sum ;



    public void setHandPai(int[] handPai) {
        this.handPai = handPai;
    }
    public void changeHandPai(int n) {
       // this.handPai[n] += 1;
    }

    public void setHeros(int heros) {
        this.heros = heros;
    }
    public void chuPai(int n) {
        if (n == 1) {this.handPai[0] -= 1;this.sum -= 1;}
        if (n == 2) {this.handPai[1] -= 1;this.sum -= 1;}
        if (n == 3) {this.handPai[2] -= 1;this.sum -= 1;}
        if (n == 4) this.handPai[3] -= 1;
        if (n == 5) {this.handPai[4] -= 1;this.sum -= 1;}
        if (n == 6) {this.handPai[5] -= 1;this.sum -= 1;}
        if (n == 7) {this.handPai[6] -= 1;this.sum -= 1;}
    }
    public int skillhl(int x) throws InterruptedException {
        int k = 2;
        if (x == 1){System.out.println("发动技能，抽卡+1");
            k = 3;}
        Thread.sleep(1000);
        return k;
    }

    public int skillll(int x){
        int k = 2;
        if (x == 2){System.out.println("发动技能，抽卡-1");
            k = 1;}
        return k;
    }
    public int skillqq(int x){
        int k = 2;
        if (x == 3) {
            System.out.println("发动技能，电脑被禁言了");
            k = 1;
        }

        return k;
    }

    public void deBugFair(){
            System.out.println("干欸，今晚又要熬夜debug，发量-1万");
            this.blood -= 1;
        }
    public void chouKa(int n) throws InterruptedException {
        System.out.println("抽了张" + (n+1));Thread.sleep(500);
        this.handPai[n] += 1;
        this.sum += 1;
    }
    public void ygameOver(int blood){
        if (blood == 0) System.out.println("这都能输？");
    }
}
