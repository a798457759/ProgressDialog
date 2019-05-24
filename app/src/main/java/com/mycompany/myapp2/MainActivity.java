package com.mycompany.myapp2;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class MainActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ProgressDialog.show(this, "标题", "内容");
        final ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
        progressDialog.setTitle("标题");
        progressDialog.setMessage("提示信息");
        progressDialog.setIcon(R.mipmap.ic_launcher);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setCancelable(false); // 能够返回
        progressDialog.setCanceledOnTouchOutside(false); // 点击外部返回
        progressDialog.setMax(100);
        progressDialog.incrementProgressBy(50);
        //progressDialog.setIndeterminate(true);
        progressDialog.setButton(ProgressDialog.BUTTON_NEGATIVE, "取消", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    progressDialog.dismiss();
                }
            });
            
            
        progressDialog.show();
        
    }

}
