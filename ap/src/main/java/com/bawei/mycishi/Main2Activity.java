package com.bawei.mycishi;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

public class Main2Activity extends AppCompatActivity {

    private SimpleDraweeView sdv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        sdv = (SimpleDraweeView) findViewById(R.id.sim_fre);

        Uri uri =  Uri.parse("http://img.huofar.com/data/jiankangrenwu/shizi.gif");
//        sdv.setImageURI(uri);

        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setUri(uri)
                .setAutoPlayAnimations(true)
                //.setAutoPlayAnimations(true)
                //设置uri,加载本地的gif资源
                .setUri(Uri.parse("res://"+getPackageName()+"/"+R.mipmap.ic_launcher_round))//设置uri
                .build();
        sdv.setController(controller);


    }
}
