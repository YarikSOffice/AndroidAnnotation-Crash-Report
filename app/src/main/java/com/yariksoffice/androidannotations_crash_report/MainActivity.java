package com.yariksoffice.androidannotations_crash_report;

import android.Manifest;

import androidx.appcompat.app.AppCompatActivity;


import org.androidannotations.annotations.EActivity;

import permissions.dispatcher.NeedsPermission;
import permissions.dispatcher.RuntimePermissions;

@EActivity(R.layout.activity_main)
@RuntimePermissions
public class MainActivity extends AppCompatActivity {

    @NeedsPermission(Manifest.permission.CAMERA)
    void startCamera() {
    }
}
