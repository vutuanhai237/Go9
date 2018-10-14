package travel.uittrser.go9.go9.View.ManHinhKhoiDong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import travel.uittrser.go9.go9.R;
import travel.uittrser.go9.go9.View.TrangChu.Login;
import travel.uittrser.go9.go9.View.TrangChu.TrangChuActivity;

public class ManHinhKhoiDong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_khoi_dong);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(1500);
                }
                catch (Exception e)
                {

                }
                finally {
                    Intent iTrangChu = new Intent(ManHinhKhoiDong.this,Login.class);
                    startActivity(iTrangChu);
                    finish();
                }
            }
        });
        thread.start();
    }
}
