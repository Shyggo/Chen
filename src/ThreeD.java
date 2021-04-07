import java.util.*;
import java.util.Scanner;
class TreeDLottery{
    protected int[] winNumber;
    TreeDLottery(){;}
    TreeDLottery(int[] winNumber){
        this.winNumber=winNumber;
    }
    public int[] getWinNumber() {
        return winNumber;
    }
    int getWins(int[] userNumber){
        //在此实现彩票金额返回
        return 0;
    }
}
class single extends TreeDLottery{
    single(int[] winNumber){
       super(winNumber);
    }
    int getWins(int[] userNumber){
        if(winNumber[0]==userNumber[0]&&winNumber[1]==userNumber[1]&&winNumber[2]==userNumber[2])  return 1040;
        return 0;
    }
}
class group extends TreeDLottery{
    group(int[] winNumber){
        super(winNumber);
    }
    int getWins(int[] userNumber){
        int flag=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(winNumber[i]==userNumber[j]){
                    flag++;
                    break;
                }
            }
            for(int j=0;j<3;j++){
                if(winNumber[j]==userNumber[i]){
                    flag++;
                    break;
                }
            }
        }
        if(flag==6){
            if(winNumber[0]==winNumber[1]||winNumber[0]==winNumber[2]||winNumber[1]==winNumber[2]) return 346;
            else return 173;
        }
        return 0;
    }
}
class oned extends TreeDLottery {
    oned(int[] winNumber) {
        super(winNumber);
    }
    int getWins(int[] userNumber) {
    if(winNumber[0]+48==userNumber[0]||winNumber[1]+48==userNumber[1]||winNumber[2]+48==userNumber[2]) return 10;
    return 0;
    }
}
class guess1d extends TreeDLottery {
    guess1d(int[] winNumber) {
        super(winNumber);
    }
    int getWins(int userNumber){
        int flag=0;
        for(int i=0;i<3;i++){
            if(winNumber[i]==userNumber) flag++;
        }
        if(flag==1) return 2;
        else if(flag==2) return 12;
        else if(flag==3) return 230;
        return 0;
    }
}
class towd extends TreeDLottery{
    towd(int[] winNumber) {
        super(winNumber);
    }
    int getWins(int[] userNumber){
        int flag=0;
        for(int i=0;i<3;i++){
            if(winNumber[i]+48==userNumber[i]) flag++;
        }
        if(flag>=2) return 104;
        return 0;
    }
}
class general extends TreeDLottery{
    general(int[] winNumber) {
        super(winNumber);
    }
    int getWins(int[] userNumber){
        int flag=0;
        for(int i=0;i<3;i++){
            if(winNumber[i]==userNumber[i]) flag++;
        }
        if(flag==3) return 470;
        else if(flag==2) return 21;
        return 0;
    }
}
class pckage extends TreeDLottery{
    pckage(int[] winNumber) {
        super(winNumber);
    }
    int getWins(int[] userNumber){
        int flag=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(winNumber[i]==userNumber[j]){
                    flag++;
                    break;
                }
            }
            for(int j=0;j<3;j++){
                if(winNumber[j]==userNumber[i]){
                    flag++;
                    break;
                }
            }
        }
        if(flag==6){
            if(winNumber[0]==userNumber[0]&&winNumber[1]==userNumber[1]&&winNumber[2]==userNumber[2]){
                if(winNumber[0]==winNumber[1]||winNumber[0]==winNumber[2]||winNumber[1]==winNumber[2]) return 693;
                else return 606;
            }
            else{
                if(winNumber[0]==winNumber[1]||winNumber[0]==winNumber[2]||winNumber[1]==winNumber[2]) return 173;
                else return 86;
            }
        }
        return 0;
    }
}
class sum extends TreeDLottery {
    sum(int[] winNumber) {
        super(winNumber);
    }
    int getWins(int userNumber){
        if(winNumber[0]+winNumber[1]+winNumber[2]==userNumber){
            if(userNumber==0||userNumber==27) return 1040;
            else if(userNumber==1||userNumber==26) return 345;
            else if(userNumber==2||userNumber==25) return 172;
            else if(userNumber==3||userNumber==24) return 104;
            else if(userNumber==4||userNumber==23) return 69;
            else if(userNumber==5||userNumber==22) return 49;
            else if(userNumber==6||userNumber==21) return 37;
            else if(userNumber==7||userNumber==20) return 29;
            else if(userNumber==8||userNumber==19) return 23;
            else if(userNumber==9||userNumber==18) return 19;
            else if(userNumber==10||userNumber==17) return 16;
            else if(userNumber==11||userNumber==16) return 15;
            else if(userNumber==12||userNumber==15) return 15;
            else if(userNumber==13||userNumber==14) return 14;
        }
        return 0;
    }
}
class tractor extends TreeDLottery{
    tractor(int[] winNumber) {
        super(winNumber);
    }
    int getWins(){
        if(winNumber[1]-winNumber[0]==1&&winNumber[2]-winNumber[1]==1) return 65;
        else if(winNumber[1]-winNumber[0]==-1&&winNumber[2]-winNumber[1]==-1) return 65;
        return 0;
    }
}
public class ThreeD {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int[] win=new int[3];
            int[] use=new int[3];
            int n,useN,wn=0;
            String tem;
            while(true) {
                System.out.println("请输入投注方式");
                System.out.println("单选：SingleChoose 组选：GroupChoose 1D：OneDChoose");
                System.out.println("猜1D：GuessOneD 2D：TwoDChoose 合数：SumChoose 退出：Exit");
                win[2]=(int)(Math.random()*10);
                win[1]=(int)(Math.random()*10);
                win[0]=(int)(Math.random()*10);
                String t = scan.next();
                switch (t) {
                    case "SingleChoose":
                        System.out.println("中奖号为："+win[0]+" "+win[1]+" "+win[2]);
                        while(true) {
                        System.out.println("请输入0-999之间的整数");
                        useN = scan.nextInt();
                        if(useN<1000&&useN>=0) break;
                        else System.out.println("请输入正确的投注内容");
                        }
                        use[2] = useN % 10;
                        use[1] = useN % 100 / 10;
                        use[0] = useN / 100;
                        single sin = new single(win);
                        wn = sin.getWins(use);
                        break;
                    case "GroupChoose":
                        System.out.println("中奖号为："+win[0]+" "+win[1]+" "+win[2]);
                        while(true) {
                        System.out.println("请输入0-999之间的整数");
                        useN = scan.nextInt();
                        if(useN<1000&&useN>=0) break;
                        else System.out.println("请输入正确的投注内容");
                        }
                        use[2] = useN % 10;
                        use[1] = useN % 100 / 10;
                        use[0] = useN / 100;
                        group gro = new group(win);
                        wn = gro.getWins(use);
                        break;
                    case "OneDChoose":
                        System.out.println("中奖号为："+win[0]+" "+win[1]+" "+win[2]);
                        while(true){
                        System.out.println("请输入确定位置的一个数字，其他位输入*，例如，如果确定个位数为2，请输入**2");
                        tem = scan.next();
                        use[0] = tem.charAt(0);
                        use[1] = tem.charAt(1);
                        use[2] = tem.charAt(2);
                        if(tem.length()==3){
                            int flag1=0,flag2=0;
                            for(int i=0;i<3;i++) {
                                if(use[i]==42) flag1++;
                                else if(use[i]>=48&&use[i]<58) flag2++;
                            }
                            if(flag1==2&&flag2==1) break;
                            else System.out.println("请输入正确的投注内容");
                        }
                        else System.out.println("请输入正确的投注内容");
                        }
                        oned one = new oned(win);
                        wn = one.getWins(use);
                        break;
                    case "GuessOneD":
                        System.out.println("中奖号为："+win[0]+" "+win[1]+" "+win[2]);
                        while(true) {
                            System.out.println("请输入0-9之间的整数");
                            useN = scan.nextInt();
                            if(useN<9&&useN>=0) break;
                            else System.out.println("请输入正确的投注内容");
                        }
                        guess1d gue = new guess1d(win);
                        wn = gue.getWins(useN);
                        break;
                    case "TwoDChoose":
                        System.out.println("中奖号为："+win[0]+" "+win[1]+" "+win[2]);
                        while(true){
                            System.out.println("请输入确定位置的两个数字，其他位输入*");
                            tem = scan.next();
                            use[0] = tem.charAt(0);
                            use[1] = tem.charAt(1);
                            use[2] = tem.charAt(2);
                            if(tem.length()==3){
                                int flag1=0,flag2=0;
                                for(int i=0;i<3;i++) {
                                    if(use[i]=='*') flag1++;
                                    else if(use[i]>=48&&use[i]<58) flag2++;
                                }
                                if(flag1==1&&flag2==2) break;
                                else System.out.println("请输入正确的投注内容");
                            }
                            else System.out.println("请输入正确的投注内容");
                        }
                        towd tow = new towd(win);
                        wn = tow.getWins(use);
                        break;
                    case "General":
                        useN = scan.nextInt();
                        use[2] = useN % 10;
                        use[1] = useN % 100 / 10;
                        use[0] = useN / 100;
                        general gen = new general(win);
                        wn = gen.getWins(use);
                        break;
                    case "Package":
                        useN = scan.nextInt();
                        use[2] = useN % 10;
                        use[1] = useN % 100 / 10;
                        use[0] = useN / 100;
                        pckage pac = new pckage(win);
                        wn = pac.getWins(use);
                        break;
                    case "SumChoose":
                        System.out.println("中奖号为："+win[0]+" "+win[1]+" "+win[2]);
                        while(true) {
                            System.out.println("请输入0-27之间的整数");
                            useN = scan.nextInt();
                            if(useN<=27&&useN>=0) break;
                            else System.out.println("请输入正确的投注内容");
                        }
                        sum sm = new sum(win);
                        wn = sm.getWins(useN);
                        break;
                    case "Tractor":
                        tractor tra = new tractor(win);
                        wn = tra.getWins();
                        break;
                    case "Exit":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("您输入的投注方式不存在，请重新输入");
                        continue;
                }
                System.out.println("您获得的奖金为"+wn);
            }
        }
}
