package com.github.anhTom2000.leetcode.easy;

import java.util.Arrays;

/**
 * @Description : TODO   leetcode.383 �����
 * @Author : Weleness
 * @Date : 2020/05/01
 */
public class RansomLetter {
    /*
        subject:
            ����һ������� (ransom) �ַ�����һ����־(magazine)�ַ������жϵ�һ���ַ��� ransom �ܲ����ɵڶ����ַ���              magazines ������ַ����ɡ�������Թ��ɣ����� true �����򷵻� false��

            (��Ŀ˵����Ϊ�˲���¶������ּ���Ҫ����־������������Ҫ����ĸ����ɵ����������˼����־�ַ����е�ÿ���ַ�ֻ����������ַ�����ʹ��һ�Ρ�

            ע�⣺
                ����Լ��������ַ�����ֻ����Сд��ĸ��
                canConstruct("a", "b") -> false
                canConstruct("aa", "ab") -> false
                canConstruct("aa", "aab") -> true

     * */
    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            // �߽������ж�
            if(ransomNote.length() > magazine.length()) return false;
            // �������Ҫ�����ж�ransom�е��ַ��Ƿ��ܱ�magazine�е��ַ����ɣ�����תΪ�ַ�����
            char[] ran = ransomNote.toCharArray();
            char[] ma = magazine.toCharArray();
            // ���ַ������������
            Arrays.sort(ran);
            Arrays.sort(ma);
            // ����˫ָ�룬����ͬʱ���б��������Ч�ʡ�
            int left =  0;
            int right = 0;
            // ��֤������ʱ�򲻻�Խ��
            while(left < ran.length && right< ma.length){
                // ��ran[left]λ�õ��ַ���ma[right]λ�õ��ַ���rightָ���Ҫ����ƶ���Ѱ�����������ַ�
                if(ran[left] > ma[right]) right++;
                /*
                    ���磺`              left = 0,right = 0
                        ran : [a,a,b]
                        ma  : [b]

                        ran[left] < ma[right]
                * */
                else if(ran[left] < ma[right] ) return false;
                // ������Ͼ�һ������ƶ�
                else {
                    left++;
                    right++;
                }
            }
            // �ж��Ƿ񶼷������������leftָ�����ran����ĳ��ȣ���ôransom�е��ַ����ܱ�magazine�е��ַ�����
            return left == ran.length;
        }
    }
}
