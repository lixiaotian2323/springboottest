package com.example.common.util;


/**
 * @used 冒泡排序
 * @author lixiaotian
 * @since 2021/08/23 14:27
 */

public class maoPaoUtil {
    public static void main(String[] args) {
        int[] list = {3,4,1,5,2};
        int temp = 0; // 开辟一个临时空间, 存放交换的中间值
        // 要遍历的次数
        for (int i = 0; i < list.length-1; i++) {
            for (int j = 0; j < list.length-1-i; j++) {
                if (list[j] > list[j+1]) {
                    temp = list[j+1];
                    list[j+1] = list[j];
                    list[j] = temp;
                }
            }
            System.out.format("第 %d 遍最终结果：", i+1);
            for(int count:list) {
                System.out.print(count);
            }
            System.out.println("\n#########################");
        }
}

}
