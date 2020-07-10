package com.github.anhTom2000.algorithm.collisionPointer;

import java.util.Arrays;

/**
 * @Description : TODO
 * @Author : Weleness
 * @Date : 2020/05/02
 */
public class MoveZero {
    private static int[] nums = {0, 1, 0, 3, 12};

    public static void main(String[] args) {
        /*
            subject:
                ����һ������ nums����дһ������������ 0 �ƶ��������ĩβ��ͬʱ���ַ���Ԫ�ص����˳��
                ʾ��:

                    ����: [0,1,0,3,12]
                    ���: [1,3,12,0,0]
                    ˵��:

                    ������ԭ�����ϲ��������ܿ�����������顣
                    �������ٲ���������
        * */
        moveZeroes();
        System.out.println(Arrays.toString(nums));
    }

    /*
        ����˼·��
        �����з�0Ԫ�أ���˳��������ǰ��Ԫ�ظ�ֵ��ʣ��λ�õ�Ԫ�ظ�0���ɡ�

        ��һ�飺iָ�����һλ����jָ��λ���Ϸ�0Ԫ�ظ�ֵ��iָ��λ���ϵ�0��jָ�����
        �ڶ��飺����jָ��λ���ϵ�Ԫ����0������������������iָ�벻����jָ�����
        �����飺jָ��λ���ϵ�Ԫ����3������������iָ�����һλ�� ��jָ��λ���Ϸ�0Ԫ�ظ�ֵ��iָ��λ���ϵ�1��jָ�����
        ���ı飺jָ��λ���ϵ�Ԫ����12������������iָ�����һλ�� ��jָ��λ���Ϸ�0Ԫ�ظ�ֵ��iָ��λ���ϵ�0��jָ�����
        �����: ѭ�����������㣬�˳�ѭ����Ȼ���i+1λ��ʼ�����θ�ֵΪ0
            ����
    */
    public static void moveZeroes() {
        int len = nums.length;
        int i = -1;
        int j = 0;
        while (j <= len - 1) {
            if (nums[j] != 0) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        for (int k = i + 1; k < len; k++) {
            nums[k] = 0;
        }
    }
}
