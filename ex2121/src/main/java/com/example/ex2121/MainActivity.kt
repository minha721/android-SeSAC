package com.example.ex2121

import android.app.NotificationChannel
import android.app.NotificationManager
import android.graphics.Color
import android.media.AudioAttributes
import android.media.RingtoneManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.NotificationCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val manager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
            val builder: NotificationCompat.Builder

            // 채널과 빌더 작성
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
                val channelId = "one-channel"
                val channelName = "My One Channel"
                val channel = NotificationChannel(
                    channelId,
                    channelName,
                    NotificationManager.IMPORTANCE_HIGH
                )

                // channel에 포함되어 있는 notification이 떴을 때 환경설정에 나오는 설명
                channel.description = "My Channel One Description"
                // Badge 아이콘에 notification 정보를 출력할건지
                channel.setShowBadge(true)
                // channel에 포함되어 있는 notification이 떴을 때 시스템에 등록된 음원이 출력되도록 하는 설정
                val uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
                val audio = AudioAttributes.Builder()
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                        .setUsage(AudioAttributes.USAGE_ALARM)
                        .build()
                // 음원 관련 정보 설정
                channel.setSound(uri, audio)
                channel.enableLights(true)
                channel.lightColor = Color.RED
                channel.enableVibration(true)
                channel.vibrationPattern = longArrayOf(100, 200, 100, 200)

                manager.createNotificationChannel(channel)

                builder = NotificationCompat.Builder(this, channelId)
            }else {
                builder = NotificationCompat.Builder(this)
            }

            builder.setSmallIcon(android.R.drawable.ic_notification_overlay)
            builder.setWhen(System.currentTimeMillis())
            builder.setContentTitle("Title")
            builder.setContentText("message")

            // notification 띄우기
            manager.notify(1, builder.build())
        }
    }
}