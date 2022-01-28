package com.example.ex2331

import android.Manifest
import android.content.pm.PackageManager
import android.location.Location
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.api.GoogleApiClient
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.tasks.OnSuccessListener

class MainActivity : AppCompatActivity() {

    lateinit var resultView: TextView
    lateinit var providerClient: FusedLocationProviderClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultView = findViewById(R.id.resultView)

        val apiClient: GoogleApiClient = GoogleApiClient.Builder(this)
            .addApi(LocationServices.API)
            .addConnectionCallbacks(connectionCallback)
            .addOnConnectionFailedListener(onConnectionFailedCallback)
            .build()

        providerClient = LocationServices.getFusedLocationProviderClient(this)

        // 퍼미션 런처
        val requestPermissionLauncher = registerForActivityResult(
            ActivityResultContracts.RequestPermission()
        ) { isGranted ->
            if (isGranted) {
                apiClient.connect()
            } else {
                Toast.makeText(this, "permission denied2", Toast.LENGTH_SHORT).show()
            }
        }

        // 퍼미션 상태 확인
        val status= ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION")
        if(status == PackageManager.PERMISSION_GRANTED){
            apiClient.connect()
        }else {
            requestPermissionLauncher.launch(Manifest.permission.ACCESS_FINE_LOCATION)
        }

    }

    val connectionCallback=object: GoogleApiClient.ConnectionCallbacks {
        override fun onConnected(p0: Bundle?) {
            providerClient.getLastLocation().addOnSuccessListener(
                this@MainActivity,
                object : OnSuccessListener<Location> {
                    override fun onSuccess(location: Location?) {
                        val latitude = location?.latitude
                        val longitude = location?.longitude
                        resultView.text = "$latitude, $longitude"
                    }
                })

        }

        override fun onConnectionSuspended(p0: Int) {
            //위치정보 제공자가 어느순간 사용 불가능 상황이 될때
        }
    }
    val onConnectionFailedCallback = object : GoogleApiClient.OnConnectionFailedListener {
        override fun onConnectionFailed(p0: ConnectionResult) {
            //가용할 위치 제공자가 없는 경우
        }
    }


}