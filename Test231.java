package com.example.test;

public class Test231 {
    public boolean isPowerOfTwo(int n) {
        if(n==0)return false;
        while(n!=0)
        {
            if((n&1)==1&&(n>>>1)!=0)return false;
            n=n>>1;
        }
        return true;
    }
}
