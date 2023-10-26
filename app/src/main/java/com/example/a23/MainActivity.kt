package com.example.a23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(num: Int): Int {
                var result = num.toLong()
                var index = 0
                while(true){
                    //확인
                    if(result==1L) return index
                    else if(index==500) return -1
                    //처리
                    if(result%2==0L) result /= 2
                    else result = result*3+1

                    index++

                }
            }
        }
        val a = Solution()
        a.solution(6)
        a.solution(16)
        a.solution(626331)
    }
}