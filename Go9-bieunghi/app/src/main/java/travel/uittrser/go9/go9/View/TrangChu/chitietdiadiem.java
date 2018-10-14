package travel.uittrser.go9.go9.View.TrangChu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import travel.uittrser.go9.go9.R;

public class chitietdiadiem extends AppCompatActivity {
    public ImageButton btn_vitri;
    public ImageButton btn_phanhoi;
    public ImageButton btn_timkiem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chitietdiadiem);
        btn_vitri = (ImageButton) findViewById(R.id.vi_tri);
        btn_vitri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(chitietdiadiem.this, vitri.class);
                startActivity(in);
            }
        });

        btn_phanhoi = (ImageButton) findViewById(R.id.phan_hoi);
        btn_phanhoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(chitietdiadiem.this, phanhoi.class);
                startActivity(in);
            }
        });
        btn_timkiem = (ImageButton) findViewById(R.id.tim_kiem);
        btn_timkiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(chitietdiadiem.this, TrangChuActivity.class);
                startActivity(in);
            }
        });
    }


}
