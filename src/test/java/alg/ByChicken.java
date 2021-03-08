package alg;

/**
 * 买小鸡
 *      公鸡2元    母鸡3元    小鸡0.3
 * 100元 ，买100只鸡
 *
 * 思路：
 *     1、 规定全买一直鸡 如：全买公鸡（三种选择，三选一）
 *
 *     2、 少买一只公鸡，买只其他鸡（买母鸡，或小鸡 两种选择，二选一）
 *                            此时再规定买一直鸡：如：买母鸡
 *                            之后再少买一只母鸡，买其他鸡（买小鸡，一选一）
 *     3、 再少买一只公鸡，买只其他鸡，重复2的步骤
 *     4、公鸡直到不买，最后重复步骤2结束
 *
 */

public class ByChicken {

    private static long num = 0;

    public static void main(String[] args) {
        //买公鸡的数量
        int cock;
        //买母鸡的数量
        int hen;
        //买小鸡的数量
        int chicken;

        //假设全部购买公鸡
        cock = 100/2;

        for (; cock >= 0 ; cock--) {
            //买母鸡的数量
            hen = 100-cock;
            for (; hen >= 0 ; hen--) {
                //买小鸡的数量
                chicken = 100-cock-hen;
                for (; chicken >= 0 ; chicken--) {
                    check(cock,hen,chicken);
                }
            }
        }
        System.out.println("\n\n一共有方法："+num);
    }

    /**
     * 此方法用于校验是否符合
     */
    private static void check(int cock,int hen,int chicken){
        if (cock+hen+chicken==100&&(cock*2+hen*3+chicken*0.3)<=100){
            System.out.println("公鸡："+cock+"\t\t母鸡："+hen+"\t\t小鸡："+chicken);
            num++;
        }
    }
}
