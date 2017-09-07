package com.pingxun.commondialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import com.pingxun.library.commondialog.CommomDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonPanel=(Button) findViewById(R.id.buttonPanel);
        buttonPanel.setOnClickListener(view -> {
            new CommomDialog(this, com.pingxun.library.R.style.dialog, "对话框测试", (dialog, confirm) -> {
                if(confirm){
                    Toast.makeText(this,"点击了确定",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this,"点击了取消",Toast.LENGTH_SHORT).show();
                }
            }).setTitle("提示").show();
        });
    }
}
