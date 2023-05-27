package done.array;

import java.lang.*;
import java.util.Arrays;

import helper.ArrayHelper;

public class _238_Product_of_Array_Except_Self {
    public static void main(String[] args) {
        int[] integers1 = new int[]{1, 2, 3, 4};
        int[] integers2 = new int[]{-1, 1, 0, -3, 3};

        System.out.println("integers1 : " + ArrayHelper.convertArrayOfIntegerToFlatString(productExceptSelf(integers1)));
        System.out.println("integers2 : " + ArrayHelper.convertArrayOfIntegerToFlatString(productExceptSelf(integers2)));
    }

    private static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        res[0] = 1;
        for (int i=1; i<len; i++)
            res[i] = res[i-1] * nums[i-1];

        int right = 1;
        for (int i=len-1; i>=0; i--) {
            res[i] = right * res[i];
            right = right * nums[i];
        }
        return res;
    }
}
