package com.example.ex2241

import android.app.Service
import android.app.job.JobParameters
import android.app.job.JobService
import android.content.Intent
import android.os.IBinder
import android.util.Log

class MyService : JobService() {

    override fun onCreate() {
        super.onCreate()
        Log.d("jobservice", "My Service onCreate()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("jobservice", "My Service onDestroy()")
    }

    override fun onStartJob(p0: JobParameters?): Boolean {
        Log.d("jobservice", "My Service onStartJob()")
        return false
    }

    override fun onStopJob(p0: JobParameters?): Boolean {
        Log.d("jobservice", "My Service onStopJob()")
        return false
    }
}