package com.hw.lab1;
import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class MinNum {
    public Scanner sc = new Scanner(System.in);
    int[] nums;
    int min;
    public MinNum(){
        System.out.print("Enter an array`s length -> ");
        int length = sc.nextInt();
        nums = new int[length];
        System.out.print("Enter an array -> ");
        for (int i = 0; i < nums.length; i++){
            nums [i] = sc.nextInt();
        }
        setNums(nums);

        min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        setMin(min);
    }


    public int[] getNums(){return nums;}
    public void setNums(int[] nums){this.nums = nums;}
    public int getMin() {return min;}
    public void setMin(int min){this.min = min;}
}
