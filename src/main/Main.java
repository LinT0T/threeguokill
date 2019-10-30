//规则：就是三国杀啦，bug就是杀，debug就是闪，生发剂就是桃，复制代码是顺手牵羊
package main;

import pai.Pai;
import role.Player;
import role.Player;
import role.computer;

import java.util.Scanner;

public class Main   {
    public static void main(String[] args)throws InterruptedException {
        int i,sumPai,chooseHero,csum,cblood = 0;
        int[] cPai;
        control ctrl = new control();
        Player you = new Player();
        computer computer = new computer();
        Pai mainPai = new Pai();
        cPai = new int[]{0, 0, 0, 0, 0, 0, 0};
        Scanner in = new Scanner(System.in);
        ctrl.begin();
        chooseHero = in.nextInt();
        you.setHeros(chooseHero);
        int[] a = new int[7];
        int[] b = new int[7];
        for (i = 0; i < 4; i++) {
            a[i] = you.setStartHandPaiOfPlayer();
            b[i] = you.setStartHandPaiOfPlayer();
            System.out.println(b[i]);
        }
        cPai = computer.getHandPai();
        for (i = 0; i < 4; i++) {
            you.handPai[a[i]] += 1;     //得到你的初始牌组
            cPai[b[i]] += 1;            //得到电脑的初始牌组
        }
        computer.setHandPai(cPai);
        sumPai = mainPai.getSum();           //得到牌堆总数
        you.sum = 4;        //得到牌数
        computer.setSum(4);
        csum = computer.getSum();
        cblood = computer.getBlood();
        ctrl.key(computer,you,mainPai,ctrl,in,cblood,sumPai,csum,cPai);
    }
        }

