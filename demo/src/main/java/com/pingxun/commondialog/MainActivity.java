package com.pingxun.commondialog;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import com.pingxun.library.commondialog.CommomDialog;
import com.zyao89.view.zloading.ZLoadingDialog;
import com.zyao89.view.zloading.Z_TYPE;

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
                    startActivity(new Intent(MainActivity.this,SampleActivity.class));
                }else{
                    Toast.makeText(this,"点击了取消",Toast.LENGTH_SHORT).show();
                }
            }).setTitle("提示").show();
        });
        Button buttonPanel2=(Button) findViewById(R.id.buttonPanel2);
        buttonPanel2.setOnClickListener(view -> {
            new ZLoadingDialog(MainActivity.this).setLoadingBuilder(Z_TYPE.STAR_LOADING)//设置类型
                        .setLoadingColor(Color.BLACK)//颜色
                        .setHintText("定位中...")
                        .setCancelable(false)
                        .setHintTextSize(16) // 设置字体大小 dp
                        .setHintTextColor(Color.GRAY).show();
        });
    }
}
